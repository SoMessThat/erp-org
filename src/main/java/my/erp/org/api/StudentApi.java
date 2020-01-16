package my.erp.org.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import my.erp.org.util.PageVo;
import my.erp.org.vo.StudentVo;

@RequestMapping("/student")
public interface StudentApi {
	
	/**
	 * 查找所有学生
	 * @createTime: 2019/11/15 16:54:55
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryStudent")
	PageVo<StudentVo> queryStudent(@RequestBody StudentVo vo);

	/**
	 * 新增学生
	 * @createTime: 2019/11/15 16:54:55
	 * @author: wu.kaibin
	 */
	@RequestMapping("/addStudent")
	int addStudent(@RequestBody StudentVo vo);
	
	/**
	 * 通过id查看学生信息
	 * @createTime: 2019/11/15 16:54:55
	 * @author: wu.kaibin
	 */
	@RequestMapping("/findStudentById")
	StudentVo findStudentById(@RequestParam("id") String id);
	
	/**
	 * 通过id修改学生
	 * @createTime: 2019/11/15 16:54:55
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateStudentById")
	int updateStudentById(@RequestBody StudentVo vo);
	
	/**
	 * 通过id软删除学生信息
	 * @createTime: 2019/11/15 16:54:55
	 * @author: wu.kaibin
	 */
	@RequestMapping("/delStudentById")
	int delStudentById(@RequestParam("id") String id);
	
}
