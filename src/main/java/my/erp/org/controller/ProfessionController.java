package my.erp.org.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.erp.org.api.ProfessionApi;
import my.erp.org.service.ProfessionService;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.PageVo;
import my.erp.org.vo.ProfessionVo;

@RestController
public class ProfessionController implements ProfessionApi {
	
	@Autowired
	ProfessionService professionService;
	
	@Override
	public PageVo<ProfessionVo> queryProfession(@RequestBody ProfessionVo vo){
		List<ProfessionVo> list = professionService.queryProfession(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public int addProfession(@RequestBody ProfessionVo vo){
		return professionService.addProfession(vo);
	}
	
	@Override
	public ProfessionVo findProfessionById(@RequestParam("id") Long id){
		return professionService.findProfessionById(id);
	}
	
	@Override
	public int updateProfessionById(@RequestBody ProfessionVo vo){
		return professionService.updateProfessionById(vo);
	}
	
	@Override
	public int delProfessionById(@RequestParam("id") Long id){
		return professionService.delProfessionById(id);
	}

	@Override
	public List<Map<String,Object>> getProfessionItem() {
		return professionService.getProfessionItem();
	}
	
}
