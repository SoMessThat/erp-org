package my.erp.org.service;

import java.util.List;
import java.util.Map;

import my.erp.org.vo.MajorVo;

public interface MajorService {
	
	/**
	 * 查找所有专业
	 * @createTime: 2019/11/15 16:53:21
	 * @author: wu.kaibin
	 */
	List<MajorVo> queryMajor(MajorVo vo);

	/**
	 * 新增专业
	 * @createTime: 2019/11/15 16:53:21
	 * @author: wu.kaibin
	 */
	int addMajor(MajorVo vo);
	
	/**
	 * 通过id查看专业信息
	 * @createTime: 2019/11/15 16:53:21
	 * @author: wu.kaibin
	 */
	MajorVo findMajorById(Long id);
	
	/**
	 * 通过id修改专业
	 * @createTime: 2019/11/15 16:53:21
	 * @author: wu.kaibin
	 */
	int updateMajorById(MajorVo vo);
	
	/**
	 * 通过id软删除专业信息
	 * @createTime: 2019/11/15 16:53:21
	 * @author: wu.kaibin
	 */
	int delMajorById(Long id);

	/**
	 * 获取专业下拉框
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 * @param id 
	 */
	List<Map<String, Object>> getMajorItem(Long id);
	
}
