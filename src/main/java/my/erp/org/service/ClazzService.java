package my.erp.org.service;

import java.util.List;
import java.util.Map;

import my.erp.org.vo.ClazzVo;

public interface ClazzService {
	
	/**
	 * 查找所有班级
	 * @createTime: 2019/11/15 16:53:08
	 * @author: wu.kaibin
	 */
	List<ClazzVo> queryClazz(ClazzVo vo);

	/**
	 * 新增班级
	 * @createTime: 2019/11/15 16:53:08
	 * @author: wu.kaibin
	 */
	int addClazz(ClazzVo vo);
	
	/**
	 * 通过id查看班级信息
	 * @createTime: 2019/11/15 16:53:08
	 * @author: wu.kaibin
	 */
	ClazzVo findClazzById(Long id);
	
	/**
	 * 通过id修改班级
	 * @createTime: 2019/11/15 16:53:08
	 * @author: wu.kaibin
	 */
	int updateClazzById(ClazzVo vo);
	
	/**
	 * 通过id软删除班级信息
	 * @createTime: 2019/11/15 16:53:08
	 * @author: wu.kaibin
	 */
	int delClazzById(Long id);

	/**
	 * 获取班级下拉框
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	List<Map<String, Object>> getClazzItem(Long id);
	
}
