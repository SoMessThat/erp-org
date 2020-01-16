package my.erp.org.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.erp.org.api.SchemeApi;
import my.erp.org.service.SchemeService;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.PageVo;
import my.erp.org.vo.SchemeVo;
import my.erp.org.vo.UserVo;

@RestController
public class SchemeController implements SchemeApi {

	@Autowired
	SchemeService schemeService;

	@Override
	public PageVo<SchemeVo> queryScheme(@RequestBody SchemeVo vo, HttpServletRequest req){
		UserVo user = (UserVo) req.getSession().getAttribute("UserSession");
		if (ObjectUtils.isEmpty(user)) {
			return null;
		}
		String roleName = user.getRole().get("name").toString();
		if ("游客".equals(user.getRole().get("name")) || "ALL".equals(vo.getStatus())) {
			vo.setStatus("ENABLED");
		} else if ("干事".equals(roleName)) {
			vo.setCreatorId(user.getId());
		} else if ("社长".equals(roleName) || "副社长".equals(roleName)) {
			vo.setDepartmentId(user.getDepartmentId());
		}
		List<SchemeVo> list = schemeService.queryScheme(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public int addScheme(@RequestBody SchemeVo vo, HttpServletRequest req){
		UserVo user = (UserVo) req.getSession().getAttribute("UserSession");
		if (ObjectUtils.isEmpty(user)) {
			return -1;
		}
		vo.setCreatorId(user.getId());
		vo.setCreatorName(user.getUsername());
		vo.setDepartmentId(user.getDepartmentId());
		vo.setDepartmentName(user.getDepartment().getName());
		//控制回车符
		try {
			vo.setDescription(vo.getDescription().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Description pointer exception");
		}
		try {
			vo.setTheme(vo.getTheme().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Theme pointer exception");
		}
		try {
			vo.setGoal(vo.getGoal().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Goal pointer exception");
		}
		try {
			vo.setPlace(vo.getPlace().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Place pointer exception");
		}
		try {
			vo.setPerson(vo.getPerson().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Person pointer exception");
		}
		try {
			vo.setForm(vo.getForm().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Form pointer exception");
		}
		try {
			vo.setArrangements(vo.getArrangements().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Arrangements pointer exception");
		}
		try {
			vo.setFlow(vo.getFlow().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Flow pointer exception");
		}
		try {
			vo.setContent(vo.getContent().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Content pointer exception");
		}
		try {
			vo.setBudget(vo.getBudget().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Budget pointer exception");
		}
		try {	
			vo.setAward(vo.getAward().replace("\n", "<br/>"));
		} catch (NullPointerException e) {
			System.err.println("Award pointer exception");
		}
		return schemeService.addScheme(vo);
	}

	@Override
	public SchemeVo findSchemeById(@RequestParam("id") Long id){
		return schemeService.findSchemeById(id);
	}

	@Override
	public int updateSchemeById(@RequestBody SchemeVo vo){
		return schemeService.updateSchemeById(vo);
	}

	@Override
	public int delSchemeById(@RequestParam("id") Long id){
		return schemeService.delSchemeById(id);
	}

}
