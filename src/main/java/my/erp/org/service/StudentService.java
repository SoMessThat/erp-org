package my.erp.org.service;

import java.util.List;

import my.erp.org.vo.StudentVo;

public interface StudentService {
	
	/**
	 * 查找所有学生
	 * @createTime: 2019/11/15 16:53:35
	 * @author: wu.kaibin
	 */
	List<StudentVo> queryStudent(StudentVo vo);

	/**
	 * 新增学生
	 * @createTime: 2019/11/15 16:53:35
	 * @author: wu.kaibin
	 */
	int addStudent(StudentVo vo);
	
	/**
	 * 通过id查看学生信息
	 * @createTime: 2019/11/15 16:53:35
	 * @author: wu.kaibin
	 */
	StudentVo findStudentById(String id);
	
	/**
	 * 通过id修改学生
	 * @createTime: 2019/11/15 16:53:35
	 * @author: wu.kaibin
	 */
	int updateStudentById(StudentVo vo);
	
	/**
	 * 通过id软删除学生信息
	 * @createTime: 2019/11/15 16:53:35
	 * @author: wu.kaibin
	 */
	int delStudentById(String id);
	
}
