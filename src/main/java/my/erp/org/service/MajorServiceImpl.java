package my.erp.org.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.erp.org.domain.Major;
import my.erp.org.mapper.MajorMapper;
import my.erp.org.util.BeanUtil;
import my.erp.org.vo.MajorVo;

@Service
public class MajorServiceImpl implements MajorService {
	
	@Autowired
	MajorMapper majorMapper;
	
	@Override
	public List<MajorVo> queryMajor(MajorVo vo){
		return majorMapper.queryMajor(vo);
	}

	@Override
	public int addMajor(MajorVo vo){
		Major po = BeanUtil.copy(vo, Major.class);
		return majorMapper.insertSelective(po);
	}
	
	@Override
	public MajorVo findMajorById(Long id){
		MajorVo vo = new MajorVo();
		vo.setId(id);
		List<MajorVo> res = majorMapper.queryMajor(vo);
		if (res.size() > 0) {
			return res.get(0);
		} else {
			return new MajorVo();
		}
	}
	
	@Override
	public int updateMajorById(MajorVo vo){
		Major po = BeanUtil.copy(vo, Major.class);
		return majorMapper.updateByPrimaryKeySelective(po);
	}
	
	@Override
	public int delMajorById(Long id){
		return majorMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Map<String, Object>> getMajorItem(Long id) {
		return majorMapper.getMajorItem(id);
	}
	
}
