package my.erp.org.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.erp.org.api.ClazzApi;
import my.erp.org.service.ClazzService;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.PageVo;
import my.erp.org.vo.ClazzVo;

@RestController
public class ClazzController implements ClazzApi {
	
	@Autowired
	ClazzService clazzService;
	
	@Override
	public PageVo<ClazzVo> queryClazz(@RequestBody(required = false) ClazzVo vo){
		List<ClazzVo> list = clazzService.queryClazz(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public int addClazz(@RequestBody ClazzVo vo){
		return clazzService.addClazz(vo);
	}
	
	@Override
	public ClazzVo findClazzById(@RequestParam("id") Long id){
		return clazzService.findClazzById(id);
	}
	
	@Override
	public int updateClazzById(@RequestBody ClazzVo vo){
		return clazzService.updateClazzById(vo);
	}
	
	@Override
	public int delClazzById(@RequestParam("id") Long id){
		return clazzService.delClazzById(id);
	}

	@Override
	public List<Map<String, Object>> getClazzItem(@RequestParam("id") Long id) {
		return clazzService.getClazzItem(id);
	}
	
}
