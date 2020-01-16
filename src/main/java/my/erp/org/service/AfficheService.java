package my.erp.org.service;

import java.util.List;

import my.erp.org.vo.AfficheVo;

public interface AfficheService {
	
	/**
	 * 查找所有公告
	 * @createTime: 2019/11/27 16:33:01
	 * @author: wu.kaibin
	 */
	List<AfficheVo> queryAffiche(AfficheVo vo);

	/**
	 * 新增公告
	 * @createTime: 2019/11/27 16:33:01
	 * @author: wu.kaibin
	 */
	int addAffiche(AfficheVo vo);
	
	/**
	 * 通过id查看公告信息
	 * @createTime: 2019/11/27 16:33:01
	 * @author: wu.kaibin
	 */
	AfficheVo findAfficheById(Long id);
	
	/**
	 * 通过id修改公告
	 * @createTime: 2019/11/27 16:33:01
	 * @author: wu.kaibin
	 */
	int updateAfficheById(AfficheVo vo);
	
	/**
	 * 通过id软删除公告信息
	 * @createTime: 2019/11/27 16:33:01
	 * @author: wu.kaibin
	 */
	int delAfficheById(Long id);
	
}
