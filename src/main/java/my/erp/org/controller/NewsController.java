package my.erp.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.erp.org.api.NewsApi;
import my.erp.org.service.NewsService;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.PageVo;
import my.erp.org.vo.NewsVo;

@RestController
public class NewsController implements NewsApi {
	
	@Autowired
	NewsService newsService;
	
	@Override
	public PageVo<NewsVo> queryNews(@RequestBody NewsVo vo){
		List<NewsVo> list = newsService.queryNews(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public int addNews(@RequestBody NewsVo vo){
		return newsService.addNews(vo);
	}
	
	@Override
	public NewsVo findNewsById(@RequestParam("id") Long id){
		return newsService.findNewsById(id);
	}
	
	@Override
	public int updateNewsById(@RequestBody NewsVo vo){
		return newsService.updateNewsById(vo);
	}
	
	@Override
	public int delNewsById(@RequestParam("id") Long id){
		return newsService.delNewsById(id);
	}
	
}
