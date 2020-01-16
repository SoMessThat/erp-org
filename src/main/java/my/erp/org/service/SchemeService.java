package my.erp.org.service;

import java.util.List;

import my.erp.org.vo.SchemeVo;

public interface SchemeService {
	
	/**
	 * 查找所有活动策划
	 * @createTime: 2019/12/31 16:02:42
	 * @author: wu.kaibin
	 */
	List<SchemeVo> queryScheme(SchemeVo vo);

	/**
	 * 新增活动策划
	 * @createTime: 2019/12/31 16:02:42
	 * @author: wu.kaibin
	 */
	int addScheme(SchemeVo vo);
	
	/**
	 * 通过id查看活动策划信息
	 * @createTime: 2019/12/31 16:02:42
	 * @author: wu.kaibin
	 */
	SchemeVo findSchemeById(Long id);
	
	/**
	 * 通过id修改活动策划
	 * @createTime: 2019/12/31 16:02:42
	 * @author: wu.kaibin
	 */
	int updateSchemeById(SchemeVo vo);
	
	/**
	 * 通过id软删除活动策划信息
	 * @createTime: 2019/12/31 16:02:42
	 * @author: wu.kaibin
	 */
	int delSchemeById(Long id);
	
}
