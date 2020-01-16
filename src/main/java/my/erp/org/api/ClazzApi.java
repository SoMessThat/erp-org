package my.erp.org.api;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import my.erp.org.util.PageVo;
import my.erp.org.vo.ClazzVo;

@RequestMapping("/clazz")
public interface ClazzApi {
	
	/**
	 * 查找所有班级
	 * @createTime: 2019/11/15 16:52:31
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryClazz")
	PageVo<ClazzVo> queryClazz(@RequestBody(required = false) ClazzVo vo);

	/**
	 * 新增班级
	 * @createTime: 2019/11/15 16:52:31
	 * @author: wu.kaibin
	 */
	@RequestMapping("/addClazz")
	int addClazz(@RequestBody ClazzVo vo);
	
	/**
	 * 通过id查看班级信息
	 * @createTime: 2019/11/15 16:52:31
	 * @author: wu.kaibin
	 */
	@RequestMapping("/findClazzById")
	ClazzVo findClazzById(@RequestParam("id") Long id);
	
	/**
	 * 通过id修改班级
	 * @createTime: 2019/11/15 16:52:31
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateClazzById")
	int updateClazzById(@RequestBody ClazzVo vo);
	
	/**
	 * 通过id软删除班级信息
	 * @createTime: 2019/11/15 16:52:31
	 * @author: wu.kaibin
	 */
	@RequestMapping("/delClazzById")
	int delClazzById(@RequestParam("id") Long id);
	
	/**
	 * 获取班级下拉框
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	@RequestMapping("/getClazzItem")
	List<Map<String,Object>> getClazzItem(@RequestParam("id") Long id);
}
