package my.erp.org.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.erp.org.api.MajorApi;
import my.erp.org.service.MajorService;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.PageVo;
import my.erp.org.vo.MajorVo;

@RestController
public class MajorController implements MajorApi {
	
	@Autowired
	MajorService majorService;
	
	@Override
	public PageVo<MajorVo> queryMajor(@RequestBody MajorVo vo){
		List<MajorVo> list = majorService.queryMajor(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public int addMajor(@RequestBody MajorVo vo){
		return majorService.addMajor(vo);
	}
	
	@Override
	public MajorVo findMajorById(@RequestParam("id") Long id){
		return majorService.findMajorById(id);
	}
	
	@Override
	public int updateMajorById(@RequestBody MajorVo vo){
		return majorService.updateMajorById(vo);
	}
	
	@Override
	public int delMajorById(@RequestParam("id") Long id){
		return majorService.delMajorById(id);
	}

	@Override
	public List<Map<String, Object>> getMajorItem(@RequestParam("id") Long id) {
		return majorService.getMajorItem(id);
	}
	
}
