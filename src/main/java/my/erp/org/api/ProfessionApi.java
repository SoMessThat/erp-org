package my.erp.org.api;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import my.erp.org.util.PageVo;
import my.erp.org.vo.ProfessionVo;

@RequestMapping("/profession")
public interface ProfessionApi {
	
	/**
	 * 查找所有院系
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryProfession")
	PageVo<ProfessionVo> queryProfession(@RequestBody ProfessionVo vo);

	/**
	 * 新增院系
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	@RequestMapping("/addProfession")
	int addProfession(@RequestBody ProfessionVo vo);
	
	/**
	 * 通过id查看院系信息
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	@RequestMapping("/findProfessionById")
	ProfessionVo findProfessionById(@RequestParam("id") Long id);
	
	/**
	 * 通过id修改院系
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateProfessionById")
	int updateProfessionById(@RequestBody ProfessionVo vo);
	
	/**
	 * 通过id软删除院系信息
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	@RequestMapping("/delProfessionById")
	int delProfessionById(@RequestParam("id") Long id);
	
	/**
	 * 获取院系下拉框
	 * @createTime: 2019/11/15 16:55:01
	 * @author: wu.kaibin
	 */
	@RequestMapping("/getProfessionItem")
	List<Map<String,Object>> getProfessionItem();
}
