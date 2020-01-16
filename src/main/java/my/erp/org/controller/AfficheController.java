package my.erp.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.erp.org.api.AfficheApi;
import my.erp.org.service.AfficheService;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.PageVo;
import my.erp.org.vo.AfficheVo;

@RestController
public class AfficheController implements AfficheApi {
	
	@Autowired
	AfficheService afficheService;
	
	@Override
	public PageVo<AfficheVo> queryAffiche(@RequestBody AfficheVo vo){
		List<AfficheVo> list = afficheService.queryAffiche(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public int addAffiche(@RequestBody AfficheVo vo){
		return afficheService.addAffiche(vo);
	}
	
	@Override
	public AfficheVo findAfficheById(@RequestParam("id") Long id){
		return afficheService.findAfficheById(id);
	}
	
	@Override
	public int updateAfficheById(@RequestBody AfficheVo vo){
		return afficheService.updateAfficheById(vo);
	}
	
	@Override
	public int delAfficheById(@RequestParam("id") Long id){
		return afficheService.delAfficheById(id);
	}
	
}
