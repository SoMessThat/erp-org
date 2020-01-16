package my.erp.org.service;

import java.util.List;
import java.util.Map;

import my.erp.org.vo.ProfessionVo;

public interface ProfessionService {
	
	/**
	 * 查找所有院系
	 * @createTime: 2019/11/15 16:53:28
	 * @author: wu.kaibin
	 */
	List<ProfessionVo> queryProfession(ProfessionVo vo);

	/**
	 * 新增院系
	 * @createTime: 2019/11/15 16:53:28
	 * @author: wu.kaibin
	 */
	int addProfession(ProfessionVo vo);
	
	/**
	 * 通过id查看院系信息
	 * @createTime: 2019/11/15 16:53:28
	 * @author: wu.kaibin
	 */
	ProfessionVo findProfessionById(Long id);
	
	/**
	 * 通过id修改院系
	 * @createTime: 2019/11/15 16:53:28
	 * @author: wu.kaibin
	 */
	int updateProfessionById(ProfessionVo vo);
	
	/**
	 * 通过id删除院系信息
	 * @createTime: 2019/11/15 16:53:28
	 * @author: wu.kaibin
	 */
	int delProfessionById(Long id);

	/**
	 * 获取院系下拉框
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	List<Map<String,Object>> getProfessionItem();
	
}
