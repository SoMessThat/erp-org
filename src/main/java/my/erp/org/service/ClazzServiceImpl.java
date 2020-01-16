package my.erp.org.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.erp.org.domain.Clazz;
import my.erp.org.mapper.ClazzMapper;
import my.erp.org.util.BeanUtil;
import my.erp.org.vo.ClazzVo;

@Service
public class ClazzServiceImpl implements ClazzService {
	
	@Autowired
	ClazzMapper clazzMapper;
	
	@Override
	public List<ClazzVo> queryClazz(ClazzVo vo){
		return clazzMapper.queryClazz(vo);
	}

	@Override
	public int addClazz(ClazzVo vo){
		Clazz po = BeanUtil.copy(vo, Clazz.class);
		return clazzMapper.insertSelective(po);
	}
	
	@Override
	public ClazzVo findClazzById(Long id){
		ClazzVo vo = new ClazzVo();
		vo.setId(id);
		List<ClazzVo> res = clazzMapper.queryClazz(vo);
		if (res.size() > 0) {
			return res.get(0);
		} else {
			return new ClazzVo();
		}
	}
	
	@Override
	public int updateClazzById(ClazzVo vo){
		Clazz po = BeanUtil.copy(vo, Clazz.class);
		return clazzMapper.updateByPrimaryKeySelective(po);
	}
	
	@Override
	public int delClazzById(Long id){
		return clazzMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Map<String, Object>> getClazzItem(Long id) {
		return clazzMapper.getClazzItem(id);
	}
	
}
