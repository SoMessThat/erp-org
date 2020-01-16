package my.erp.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.erp.org.domain.Student;
import my.erp.org.mapper.StudentMapper;
import my.erp.org.util.BeanUtil;
import my.erp.org.util.UUIDUtil;
import my.erp.org.vo.StudentVo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentMapper studentMapper;
	
	@Override
	public List<StudentVo> queryStudent(StudentVo vo){
		return studentMapper.queryStudent(vo);
	}

	@Override
	public int addStudent(StudentVo vo){
		Student po = BeanUtil.copy(vo, Student.class);
		po.setId(UUIDUtil.getNoLineSortUUID());
		po.setSchool("福建工程学校");
		return studentMapper.insertSelective(po);
	}
	
	@Override
	public StudentVo findStudentById(String id){
		Student po = studentMapper.selectByPrimaryKey(id);
		return BeanUtil.copy(po, StudentVo.class);
	}
	
	@Override
	public int updateStudentById(StudentVo vo){
		Student po = BeanUtil.copy(vo, Student.class);
		return studentMapper.updateByPrimaryKeySelective(po);
	}
	
	@Override
	public int delStudentById(String id){
		return studentMapper.deleteByPrimaryKey(id);
	}
	
}
