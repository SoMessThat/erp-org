package my.erp.org.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import my.erp.org.util.PageVo;
import my.erp.org.vo.DepartmentVo;

@RequestMapping("/department")
public interface DepartmentApi {

	/**
	 * 查找所有社团
	 * @createTime: 2019/11/27 14:35:33
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryDepartment")
	PageVo<DepartmentVo> queryDepartment(@RequestBody DepartmentVo vo);

	/**
	 * 新增社团
	 * @createTime: 2019/11/27 14:35:33
	 * @author: wu.kaibin
	 */
	@RequestMapping("/addDepartment")
	int addDepartment(@RequestBody DepartmentVo vo);

	/**
	 * 通过id查看社团信息
	 * @createTime: 2019/11/27 14:35:33
	 * @author: wu.kaibin
	 */
	@RequestMapping("/findDepartmentById")
	DepartmentVo findDepartmentById(@RequestParam("id") Long id);

	/**
	 * 通过id修改社团
	 * @createTime: 2019/11/27 14:35:33
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateDepartmentById")
	int updateDepartmentById(@RequestBody DepartmentVo vo);

	/**
	 * 通过id软删除社团信息
	 * @createTime: 2019/11/27 14:35:33
	 * @author: wu.kaibin
	 */
	@RequestMapping("/delDepartmentById")
	int delDepartmentById(@RequestParam("id") Long id);

	/**
	 * 查找可申请社团
	 * @createTime: 2019/11/27 14:35:33
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryApplyDepartment")
	PageVo<DepartmentVo> queryApplyDepartment(@RequestBody DepartmentVo vo, HttpServletRequest request);
	
	/**
	 * 查看我的社团
	 * @createTime: 2019/11/27 14:35:33
	 * @author: wu.kaibin
	 */
	@RequestMapping("/getMyDepartment")
	DepartmentVo getMyDepartment(HttpServletRequest request);
	
	/**
	 * 社长修改社团
	 * @createTime: 2019/11/27 14:35:33
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateMyDepartment")
	int updateMyDepartment(@RequestBody DepartmentVo vo, HttpServletRequest request);
}
