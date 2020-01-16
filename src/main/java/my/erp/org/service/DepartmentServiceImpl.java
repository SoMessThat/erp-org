package my.erp.org.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.erp.org.domain.Department;
import my.erp.org.mapper.DepartmentMapper;
import my.erp.org.util.BeanUtil;
import my.erp.org.vo.DepartmentVo;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Override
	public List<DepartmentVo> queryDepartment(DepartmentVo vo){
//		vo.setStatus("ENABLED");
		return departmentMapper.queryDepartment(vo);
	}

	@Override
	public int addDepartment(DepartmentVo vo){
		Department po = BeanUtil.copy(vo, Department.class);
		po.setStatus("APPLYING");
		po.setUpdateTime(new Date());
		po.setCreateTime(new Date());
		return departmentMapper.insertSelective(po);
	}
	
	@Override
	public DepartmentVo findDepartmentById(Long id){
		return departmentMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int updateDepartmentById(DepartmentVo vo){
		Department po = BeanUtil.copy(vo, Department.class);
		po.setUpdateTime(new Date());
		return departmentMapper.updateByPrimaryKeySelective(po);
	}
	
	@Override
	public int delDepartmentById(Long id){
		Department po = new Department();
		po.setId(id);
		po.setStatus("DISABLED");
		po.setUpdateTime(new Date());
		return departmentMapper.updateByPrimaryKeySelective(po);
	}

	@Override
	public List<DepartmentVo> queryApplyDepartment(DepartmentVo vo) {
		return departmentMapper.queryApplyDepartment(vo);
	}
	
}
