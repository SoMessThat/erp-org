package my.erp.org.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.erp.org.api.UserApi;
import my.erp.org.domain.ApplyDepartment;
import my.erp.org.service.StudentService;
import my.erp.org.service.UserService;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.PageVo;
import my.erp.org.util.ResponseVo;
import my.erp.org.vo.PowerDTO;
import my.erp.org.vo.StudentVo;
import my.erp.org.vo.UserVo;

@RestController
public class UserController implements UserApi {
	
	@Autowired
	UserService userService;
	@Autowired
	StudentService studentService;
	
	@Override
	public PageVo<UserVo> queryUser(@RequestBody UserVo vo){
		List<UserVo> list = userService.queryUser(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public ResponseVo<UserVo> addUser(@RequestBody UserVo vo){
		return userService.addUser(vo);
	}
	
	@Override
	public UserVo findUserById(@RequestParam("id") Long id){
		return userService.findUserById(id);
	}
	
	@Override
	public int updateUserById(@RequestBody UserVo vo){
		return userService.updateUserById(vo);
	}
	
	@Override
	public int delUserById(@RequestParam("id") Long id){
		return userService.delUserById(id);
	}

	@Override
	public ResponseVo<UserVo> Login(@RequestBody UserVo user, HttpServletRequest req) {
		ResponseVo<UserVo> result = userService.login(user);
		if (result.getStatus() == 200) {
			UserVo data = result.getData();
			req.getSession().setAttribute("UserSession", data);
		}
		return result;
	}

	@Override
	public ResponseVo<UserVo> logout(HttpServletRequest req) {
		req.getSession().removeAttribute("UserSession");
		ResponseVo<UserVo> result = new ResponseVo<UserVo>();
		result.setMsg("登出成功");
		return result;
	}
	
	@Override
	public List<PowerDTO> queryMenu(HttpServletRequest request){
		UserVo user = new UserVo();
		user = (UserVo) request.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user)) {
			return null;
		}
        Map<String, String> map = new HashMap<String, String>();
        map.put("userId", user.getId().toString());
        return userService.queryMenu(map);
	}

	@Override
	public PageVo<UserVo> queryEmployeesInfo(@RequestBody UserVo vo, HttpServletRequest request) {
		UserVo user = new UserVo();
		user = (UserVo) request.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user)) {
			return null;
		}
        vo.setDepartmentId(user.getDepartmentId());
		List<UserVo> list = userService.queryEmployeesInfo(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public ResponseVo<Object> dismiss(@RequestParam Long id) {
		ResponseVo<Object> result = new ResponseVo<Object>();
		int num = userService.dismiss(id);
		if (num > 0) {
			result.setResult("SUCCESS");
			result.setMsg("辞退成功!");
			result.setStatus(200);
		} else {
			result.setResult("ERRO");
			result.setMsg("辞退失败，请重试!");
			result.setStatus(700);
		}
		return result;
	}

	@Override
	public ResponseVo<Object> appoint1(@RequestParam Long id) {
		ResponseVo<Object> result = new ResponseVo<Object>();
		int num = userService.appoint1(id);
		if (num > 0) {
			result.setResult("SUCCESS");
			result.setMsg("任命成功!");
			result.setStatus(200);
		} else {
			result.setResult("ERROR");
			result.setMsg("任命失败，请重试!");
			result.setStatus(700);
		}
		return result;
	}

	@Override
	public ResponseVo<Object> appoint2(@RequestParam Long id) {
		ResponseVo<Object> result = new ResponseVo<Object>();
		int num = userService.appoint2(id);
		if (num > 0) {
			result.setResult("SUCCESS");
			result.setMsg("任命成功!");
			result.setStatus(200);
		} else {
			result.setResult("ERROR");
			result.setMsg("任命失败，请重试!");
			result.setStatus(700);
		}
		return result;
	}

	@Override
	public ResponseVo<UserVo> modifyPwd(@RequestBody Map<String, String> user, HttpServletRequest req) {
		UserVo user1 = new UserVo();
		user1 = (UserVo) req.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user1)) {
			return null;
		}
        user.put("account",user1.getAccount());
        user.put("id", user1.getId().toString());
        return userService.modifyPwd(user);
	}

	@Override
	public int joinDepartment(@RequestBody Map<String, String> obj, HttpServletRequest req) {
		UserVo user = new UserVo();
		user = (UserVo) req.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user)) {
			return -1;
		}
		ApplyDepartment apply = new ApplyDepartment();
		apply.setDepartmentId(Long.parseLong(obj.get("departmentId")));
		apply.setUserId(user.getId());
		apply.setCreateTime(new Date());
		apply.setStatus("ENABLED");
		return userService.joinDepartment(apply);
	}

	@Override
	public int agreeJoin(@RequestParam Long id) {
		return userService.agreeJoin(id);
	}

	@Override
	public int refuseJoin(@RequestParam Long id) {
		return userService.refuseJoin(id);
	}

	@Override
	public PageVo<UserVo> queryApplyUser(@RequestBody UserVo vo, HttpServletRequest req) {
		UserVo user1 = new UserVo();
		user1 = (UserVo) req.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user1)) {
			return null;
		}
        vo.setDepartmentId(user1.getDepartmentId());
		List<UserVo> list = userService.queryApplyUser(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public UserVo getMyInfo(HttpServletRequest request) {
		UserVo user = new UserVo();
		user = (UserVo) request.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user)) {
			return null;
		}
		return userService.findUserById(user.getId());
	}

	@Override
	public int updateMyInfo(@RequestBody UserVo vo, HttpServletRequest request) {
		UserVo user = new UserVo();
		user = (UserVo) request.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user)) {
			return -1;
		}
        vo.setId(user.getId());
        StudentVo stu = new StudentVo();
        if (!ObjectUtils.isEmpty(vo.getCode())) {
        	stu.setCode(vo.getCode());
        	List<StudentVo> stus = studentService.queryStudent(stu );
        	if (stus.size() > 0) {
				vo.setStudentId(stus.get(0).getId());
			} else {
				return -4;
			}
		}
		return userService.updateUserById(vo);
	}

	@Override
	public List<UserVo> queryCadre(@RequestBody UserVo vo, HttpServletRequest request) {
		if (ObjectUtils.isEmpty(vo.getDepartmentId())) {
			UserVo user = new UserVo();
			user = (UserVo) request.getSession().getAttribute("UserSession");
	        if (ObjectUtils.isEmpty(user)) {
				return null;
			}
	        vo.setDepartmentId(user.getDepartmentId());
		}
		return userService.queryCadre(vo);
	}
	
}
