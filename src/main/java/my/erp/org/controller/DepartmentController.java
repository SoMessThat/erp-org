package my.erp.org.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.erp.org.api.DepartmentApi;
import my.erp.org.service.DepartmentService;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.PageVo;
import my.erp.org.vo.DepartmentVo;
import my.erp.org.vo.UserVo;

@RestController
public class DepartmentController implements DepartmentApi {
	
	@Autowired
	DepartmentService departmentService;
	
	@Override
	public PageVo<DepartmentVo> queryDepartment(@RequestBody DepartmentVo vo){
		List<DepartmentVo> list = departmentService.queryDepartment(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public int addDepartment(@RequestBody DepartmentVo vo){
		return departmentService.addDepartment(vo);
	}
	
	@Override
	public DepartmentVo findDepartmentById(@RequestParam("id") Long id){
		return departmentService.findDepartmentById(id);
	}
	
	@Override
	public int updateDepartmentById(@RequestBody DepartmentVo vo){
		return departmentService.updateDepartmentById(vo);
	}
	
	@Override
	public int delDepartmentById(@RequestParam("id") Long id){
		return departmentService.delDepartmentById(id);
	}

	@Override
	public PageVo<DepartmentVo> queryApplyDepartment(@RequestBody DepartmentVo vo, HttpServletRequest request) {
		UserVo user = new UserVo();
		user = (UserVo) request.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user)) {
			return null;
		}
        vo.setUserId(user.getId());
		List<DepartmentVo> list = departmentService.queryApplyDepartment(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public DepartmentVo getMyDepartment(HttpServletRequest request) {
		UserVo user = new UserVo();
		user = (UserVo) request.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user)) {
			return null;
		}
		return departmentService.findDepartmentById(user.getDepartmentId());
	}

	@Override
	public int updateMyDepartment(@RequestBody DepartmentVo vo, HttpServletRequest request) {
		UserVo user = new UserVo();
		user = (UserVo) request.getSession().getAttribute("UserSession");
        if (ObjectUtils.isEmpty(user)) {
			return -1;
		}
        vo.setId(user.getDepartmentId());
        
      //控制回车符
  		try {
  			vo.setDroit(vo.getDroit().replace("\n", "<br/>"));
  		} catch (NullPointerException e) {
  			System.err.println("droit pointer exception");
  		}
  		try {
  			vo.setDuty(vo.getDuty().replace("\n", "<br/>"));
  		} catch (NullPointerException e) {
  			System.err.println("duty pointer exception");
  		}
  		try {
  			vo.setGeneralRules(vo.getGeneralRules().replace("\n", "<br/>"));
  		} catch (NullPointerException e) {
  			System.err.println("generalRules pointer exception");
  		}
  		try {
  			vo.setInfo(vo.getInfo().replace("\n", "<br/>"));
  		} catch (NullPointerException e) {
  			System.err.println("info pointer exception");
  		}
  		try {
  			vo.setObligation(vo.getObligation().replace("\n", "<br/>"));
  		} catch (NullPointerException e) {
  			System.err.println("obligation pointer exception");
  		}
  		try {
  			vo.setOther(vo.getOther().replace("\n", "<br/>"));
  		} catch (NullPointerException e) {
  			System.err.println("other pointer exception");
  		}
  		try {
  			vo.setPurpose(vo.getPurpose().replace("\n", "<br/>"));
  		} catch (NullPointerException e) {
  			System.err.println("purpose pointer exception");
  		}
  		try {
  			vo.setRequirement(vo.getRequirement().replace("\n", "<br/>"));
  		} catch (NullPointerException e) {
  			System.err.println("requirement pointer exception");
  		}
      		
		return departmentService.updateDepartmentById(vo);
	}
	
}
