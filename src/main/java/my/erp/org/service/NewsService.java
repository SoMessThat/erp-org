package my.erp.org.service;

import java.util.List;

import my.erp.org.vo.NewsVo;

public interface NewsService {
	
	/**
	 * 查找所有新闻
	 * @createTime: 2019/12/27 11:33:44
	 * @author: wu.kaibin
	 */
	List<NewsVo> queryNews(NewsVo vo);

	/**
	 * 新增新闻
	 * @createTime: 2019/12/27 11:33:44
	 * @author: wu.kaibin
	 */
	int addNews(NewsVo vo);
	
	/**
	 * 通过id查看新闻信息
	 * @createTime: 2019/12/27 11:33:44
	 * @author: wu.kaibin
	 */
	NewsVo findNewsById(Long id);
	
	/**
	 * 通过id修改新闻
	 * @createTime: 2019/12/27 11:33:44
	 * @author: wu.kaibin
	 */
	int updateNewsById(NewsVo vo);
	
	/**
	 * 通过id软删除新闻信息
	 * @createTime: 2019/12/27 11:33:44
	 * @author: wu.kaibin
	 */
	int delNewsById(Long id);
	
}
