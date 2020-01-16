package my.erp.org.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import my.erp.org.domain.ApplyDepartment;
import my.erp.org.domain.Department;
import my.erp.org.domain.Ref;
import my.erp.org.domain.Student;
import my.erp.org.domain.User;
import my.erp.org.mapper.ApplyDepartmentMapper;
import my.erp.org.mapper.DepartmentMapper;
import my.erp.org.mapper.StudentMapper;
import my.erp.org.mapper.UserMapper;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.MD5;
import my.erp.org.util.ResponseVo;
import my.erp.org.vo.DepartmentVo;
import my.erp.org.vo.PowerDTO;
import my.erp.org.vo.StudentVo;
import my.erp.org.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	ApplyDepartmentMapper applyDepartmentMapper;
	
	@Override
	public List<UserVo> queryUser(UserVo vo){
		vo.setState("ENABLED");
		return userMapper.queryUser(vo);
	}

	@Override
	public ResponseVo<UserVo> addUser(UserVo vo){
		ResponseVo<UserVo> res = new ResponseVo<UserVo>(); 
		
		//判断是否存在该学生
		StudentVo studentVo = new StudentVo();
		studentVo.setCode(vo.getCode());
		List<StudentVo> stus = studentMapper.queryStudent(studentVo );
		if (stus.isEmpty()) {
			res.setMsg("学号错误！");
			return res;
		}

		//判断账号是否唯一
		UserVo param = new UserVo();
		param.setAccount(vo.getAccount());
		if(!userMapper.queryUser(param).isEmpty()) {
			res.setMsg("账号已存在！");
			return res;
		}
		
		//新建用户
		User po = BeanUtil.copy(vo, User.class);
		if (ObjectUtils.isEmpty(vo.getUsername())) {
			po.setUsername(po.getAccount());
		}
		po.setStudentId(stus.get(0).getId());
		po.setState("ENABLED");
		po.setCreatTime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		po.setPassword(MD5.MD5Encode(vo.getPassword()));
		userMapper.insertSelective(po);
		
		//初始为游客
		Ref ref = new Ref();
		ref.setUserId(po.getId());
		ref.setTip("游客");
		int num = userMapper.addRole(ref);
		
		if (num > 0) {
			res.setStatus(200);
			res.setResult("SUCCESS");
			res.setMsg("成功");
		}
		return res;
	}
	
	@Override
	public UserVo findUserById(Long id){
		User po = userMapper.selectByPrimaryKey(id);
		po.setPassword("");
		UserVo user = BeanUtil.copy(po, UserVo.class);
		if (!ObjectUtils.isEmpty(user.getStudentId())) {
			Student res = studentMapper.selectByPrimaryKey(user.getStudentId());
			user.setStudent(res);
		}
		return user;
	}
	
	@Override
	public int updateUserById(UserVo vo){
		User po = BeanUtil.copy(vo, User.class);
		return userMapper.updateByPrimaryKeySelective(po);
	}
	
	@Override
	public int delUserById(Long id){
		User po = new User();
		po.setId(id);
		po.setState("DISABLED");
		return userMapper.updateByPrimaryKeySelective(po);
	}

	@Override
	public ResponseVo<UserVo> login(UserVo user) {
		String userpwd = MD5.MD5Encode(user.getPassword());
		user.setPassword(userpwd);
		UserVo res = userMapper.selectUser(user);
		ResponseVo<UserVo> response = new ResponseVo<UserVo>();
		response.setStatus(400);
		response.setResult("ERROR");
		if (!ObjectUtils.isEmpty(res)) {			
			if (!ObjectUtils.isEmpty(res.getDepartmentId())) {
				DepartmentVo dept = departmentMapper.selectByPrimaryKey(res.getDepartmentId());
				res.setDepartment(BeanUtil.copy(dept, Department.class));
			}
			Map<String, Object> map = userMapper.getRole(res.getId());
			res.setRole(map);
			res.setPassword("");
			response.setResult("SUCCESS");
			response.setStatus(200);
			response.setData(res);
		}
		return response;
	}

	@Override
	public List<PowerDTO> queryMenu(Map<String, String> map) {
		return userMapper.selectPowerRootByUserID(map);
	}

	@Override
	public List<UserVo> queryEmployeesInfo(UserVo user) {
		user.setState("ENABLED");
		return userMapper.queryUser(user);
	}

	@Override
	public int dismiss(Long id) {
		//删除原有角色
		userMapper.delUserRole(id);
		//初始化为游客
		Ref ref = new Ref();
		ref.setUserId(id);
		ref.setTip("游客");
		userMapper.addRole(ref);
		//清空部门id
		return userMapper.dismiss(id);
	}

	@Override
	public int appoint1(Long id) {
		//将原社长变为普通干事
		userMapper.ToEmployee(id);
		//将该用户改成社长角色
		return userMapper.appoint1(id);
	}

	@Override
	public int appoint2(Long id) {
		//删除原有角色
		userMapper.delUserRole(id);
		//变更为副社长
		return userMapper.appoint2(id);
	}

	@Override
	public ResponseVo<UserVo> modifyPwd(Map<String, String> user) {
		ResponseVo<UserVo> result = new ResponseVo<UserVo>();
		UserVo param = new UserVo();
		param.setAccount(user.get("account"));
		param.setPassword(MD5.MD5Encode(user.get("oldPwd")));
		//判断密码是否正确
		UserVo res = userMapper.selectUser(param );
		if (ObjectUtils.isEmpty(res)) {
			result.setStatus(701);
			result.setMsg("密码错误，请重新修改！");
			result.setResult("ERROR");
			return result;
		}
		//正确修改密码
		param = new UserVo();
		param.setId(Long.parseLong(user.get("id")));
		param.setPassword(MD5.MD5Encode(user.get("newPwd")));
		int num = userMapper.updateByPrimaryKeySelective(BeanUtil.copy(param,	User.class));
		if (num > 0) {
			result.setResult("SUCCESS");
			result.setMsg("修改成功!");
			result.setStatus(200);
		} else {
			result.setResult("ERROR");
			result.setMsg("修改失败，请重试!");
			result.setStatus(702);
		}
		return result;
	}

	@Override
	public int joinDepartment(ApplyDepartment apply) {
		return applyDepartmentMapper.insertSelective(apply);
	}

	@Override
	public int agreeJoin(Long id) {
		ApplyDepartment apply = applyDepartmentMapper.selectByPrimaryKey(id);
		User user = new User();
		user = userMapper.selectByPrimaryKey(apply.getUserId());
		if (!ObjectUtils.isEmpty(user.getDepartmentId())) {
			applyDepartmentMapper.delApply(apply.getUserId());
			return -1;
		}
		//删除用户的所有申请
		applyDepartmentMapper.delApply(apply.getUserId());

		//删除用户角色
		userMapper.delUserRole(apply.getUserId());
		//初始化为干事
		Ref ref = new Ref();
		ref.setUserId(apply.getUserId());
		ref.setTip("干事");
		userMapper.addRole(ref);
		
		//修改用户部门信息
		user = new User();
		user.setId(apply.getUserId());
		user.setDepartmentId(apply.getDepartmentId());
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int refuseJoin(Long id) {
		return applyDepartmentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<UserVo> queryApplyUser(UserVo vo) {
		vo.setState("ENABLED");
		return userMapper.queryApplyUser(vo);
	}

	@Override
	public List<UserVo> queryCadre(UserVo vo) {
		return userMapper.queryCadre(vo);
	}
	
}
