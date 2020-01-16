package my.erp.org.service;

import java.util.List;

import my.erp.org.vo.DepartmentVo;

public interface DepartmentService {
	
	/**
	 * 查找所有社团
	 * @createTime: 2019/11/27 14:36:27
	 * @author: wu.kaibin
	 */
	List<DepartmentVo> queryDepartment(DepartmentVo vo);

	/**
	 * 新增社团
	 * @createTime: 2019/11/27 14:36:27
	 * @author: wu.kaibin
	 */
	int addDepartment(DepartmentVo vo);
	
	/**
	 * 通过id查看社团信息
	 * @createTime: 2019/11/27 14:36:27
	 * @author: wu.kaibin
	 */
	DepartmentVo findDepartmentById(Long id);
	
	/**
	 * 通过id修改社团
	 * @createTime: 2019/11/27 14:36:27
	 * @author: wu.kaibin
	 */
	int updateDepartmentById(DepartmentVo vo);
	
	/**
	 * 通过id软删除社团信息
	 * @createTime: 2019/11/27 14:36:27
	 * @author: wu.kaibin
	 */
	int delDepartmentById(Long id);

	/**
	 * 查找可申请社团
	 * @createTime: 2019/11/27 14:35:33
	 * @author: wu.kaibin
	 */
	List<DepartmentVo> queryApplyDepartment(DepartmentVo vo);
	
}
