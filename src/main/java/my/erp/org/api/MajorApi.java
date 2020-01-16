package my.erp.org.api;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import my.erp.org.util.PageVo;
import my.erp.org.vo.MajorVo;

@RequestMapping("/major")
public interface MajorApi {
	
	/**
	 * 查找所有专业
	 * @createTime: 2019/11/15 16:54:49
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryMajor")
	PageVo<MajorVo> queryMajor(@RequestBody MajorVo vo);

	/**
	 * 新增专业
	 * @createTime: 2019/11/15 16:54:49
	 * @author: wu.kaibin
	 */
	@RequestMapping("/addMajor")
	int addMajor(@RequestBody MajorVo vo);
	
	/**
	 * 通过id查看专业信息
	 * @createTime: 2019/11/15 16:54:49
	 * @author: wu.kaibin
	 */
	@RequestMapping("/findMajorById")
	MajorVo findMajorById(@RequestParam("id") Long id);
	
	/**
	 * 通过id修改专业
	 * @createTime: 2019/11/15 16:54:49
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateMajorById")
	int updateMajorById(@RequestBody MajorVo vo);
	
	/**
	 * 通过id软删除专业信息
	 * @createTime: 2019/11/15 16:54:49
	 * @author: wu.kaibin
	 */
	@RequestMapping("/delMajorById")
	int delMajorById(@RequestParam("id") Long id);
	
	/**
	 * 获取专业下拉框
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	@RequestMapping("/getMajorItem")
	List<Map<String,Object>> getMajorItem(@RequestParam("id") Long id);
}
