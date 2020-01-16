package my.erp.org.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.erp.org.domain.News;
import my.erp.org.mapper.NewsMapper;
import my.erp.org.util.BeanUtil;
import my.erp.org.vo.NewsVo;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	NewsMapper newsMapper;
	
	@Override
	public List<NewsVo> queryNews(NewsVo vo){
		vo.setStatus("ENABLED");
		return newsMapper.queryNews(vo);
	}

	@Override
	public int addNews(NewsVo vo){
		News po = BeanUtil.copy(vo, News.class);
		po.setStatus("ENABLED");
		po.setUpdateTime(new Date());
		return newsMapper.insertSelective(po);
	}
	
	@Override
	public NewsVo findNewsById(Long id){
		News po = newsMapper.selectByPrimaryKey(id);
		return BeanUtil.copy(po, NewsVo.class);
	}
	
	@Override
	public int updateNewsById(NewsVo vo){
		News po = BeanUtil.copy(vo, News.class);
		po.setUpdateTime(new Date());
		return newsMapper.updateByPrimaryKeySelective(po);
	}
	
	@Override
	public int delNewsById(Long id){
		News po = new News();
		po.setId(id);
		po.setStatus("DISABLED");
		po.setUpdateTime(new Date());
		return newsMapper.updateByPrimaryKeySelective(po);
	}
	
}
