package my.erp.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.erp.org.api.StudentApi;
import my.erp.org.service.StudentService;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.PageVo;
import my.erp.org.vo.StudentVo;

@RestController
public class StudentController implements StudentApi {
	
	@Autowired
	StudentService studentService;
	
	@Override
	public PageVo<StudentVo> queryStudent(@RequestBody StudentVo vo){
		List<StudentVo> list = studentService.queryStudent(vo);
		return BeanUtil.page(list);	
	}

	@Override
	public int addStudent(@RequestBody StudentVo vo){
		return studentService.addStudent(vo);
	}
	
	@Override
	public StudentVo findStudentById(@RequestParam("id") String id){
		return studentService.findStudentById(id);
	}
	
	@Override
	public int updateStudentById(@RequestBody StudentVo vo){
		return studentService.updateStudentById(vo);
	}
	
	@Override
	public int delStudentById(@RequestParam("id") String id){
		return studentService.delStudentById(id);
	}
	
}
