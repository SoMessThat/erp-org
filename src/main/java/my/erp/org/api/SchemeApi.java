package my.erp.org.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import my.erp.org.util.PageVo;
import my.erp.org.vo.SchemeVo;

@RequestMapping("/scheme")
public interface SchemeApi {
	
	/**
	 * 查找所有活动策划
	 * @createTime: 2019/12/31 16:02:00
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryScheme")
	PageVo<SchemeVo> queryScheme(@RequestBody SchemeVo vo, HttpServletRequest req);

	/**
	 * 新增活动策划
	 * @createTime: 2019/12/31 16:02:00
	 * @author: wu.kaibin
	 */
	@RequestMapping("/addScheme")
	int addScheme(@RequestBody SchemeVo vo, HttpServletRequest req);
	
	/**
	 * 通过id查看活动策划信息
	 * @createTime: 2019/12/31 16:02:00
	 * @author: wu.kaibin
	 */
	@RequestMapping("/findSchemeById")
	SchemeVo findSchemeById(@RequestParam("id") Long id);
	
	/**
	 * 通过id修改活动策划
	 * @createTime: 2019/12/31 16:02:00
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateSchemeById")
	int updateSchemeById(@RequestBody SchemeVo vo);
	
	/**
	 * 通过id软删除活动策划信息
	 * @createTime: 2019/12/31 16:02:00
	 * @author: wu.kaibin
	 */
	@RequestMapping("/delSchemeById")
	int delSchemeById(@RequestParam("id") Long id);
	
}
