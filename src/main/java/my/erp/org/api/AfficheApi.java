package my.erp.org.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import my.erp.org.util.PageVo;
import my.erp.org.vo.AfficheVo;

@RequestMapping("/affiche")
public interface AfficheApi {
	
	/**
	 * 查找所有公告
	 * @createTime: 2019/11/27 16:32:03
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryAffiche")
	PageVo<AfficheVo> queryAffiche(@RequestBody AfficheVo vo);

	/**
	 * 新增公告
	 * @createTime: 2019/11/27 16:32:03
	 * @author: wu.kaibin
	 */
	@RequestMapping("/addAffiche")
	int addAffiche(@RequestBody AfficheVo vo);
	
	/**
	 * 通过id查看公告信息
	 * @createTime: 2019/11/27 16:32:03
	 * @author: wu.kaibin
	 */
	@RequestMapping("/findAfficheById")
	AfficheVo findAfficheById(@RequestParam("id") Long id);
	
	/**
	 * 通过id修改公告
	 * @createTime: 2019/11/27 16:32:03
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateAfficheById")
	int updateAfficheById(@RequestBody AfficheVo vo);
	
	/**
	 * 通过id软删除公告信息
	 * @createTime: 2019/11/27 16:32:03
	 * @author: wu.kaibin
	 */
	@RequestMapping("/delAfficheById")
	int delAfficheById(@RequestParam("id") Long id);
	
}
