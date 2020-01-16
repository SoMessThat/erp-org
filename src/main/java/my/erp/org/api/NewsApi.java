package my.erp.org.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import my.erp.org.util.PageVo;
import my.erp.org.vo.NewsVo;

@RequestMapping("/news")
public interface NewsApi {
	
	/**
	 * 查找所有新闻
	 * @createTime: 2019/12/27 11:33:11
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryNews")
	PageVo<NewsVo> queryNews(@RequestBody NewsVo vo);

	/**
	 * 新增新闻
	 * @createTime: 2019/12/27 11:33:11
	 * @author: wu.kaibin
	 */
	@RequestMapping("/addNews")
	int addNews(@RequestBody NewsVo vo);
	
	/**
	 * 通过id查看新闻信息
	 * @createTime: 2019/12/27 11:33:11
	 * @author: wu.kaibin
	 */
	@RequestMapping("/findNewsById")
	NewsVo findNewsById(@RequestParam("id") Long id);
	
	/**
	 * 通过id修改新闻
	 * @createTime: 2019/12/27 11:33:11
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateNewsById")
	int updateNewsById(@RequestBody NewsVo vo);
	
	/**
	 * 通过id软删除新闻信息
	 * @createTime: 2019/12/27 11:33:11
	 * @author: wu.kaibin
	 */
	@RequestMapping("/delNewsById")
	int delNewsById(@RequestParam("id") Long id);
	
}
