package my.erp.org.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.erp.org.domain.Profession;
import my.erp.org.mapper.ProfessionMapper;
import my.erp.org.util.BeanUtil;
import my.erp.org.vo.ProfessionVo;

@Service
public class ProfessionServiceImpl implements ProfessionService {
	
	@Autowired
	ProfessionMapper professionMapper;
	
	@Override
	public List<ProfessionVo> queryProfession(ProfessionVo vo){
		return professionMapper.queryProfession(vo);
	}

	@Override
	public int addProfession(ProfessionVo vo){
		Profession po = BeanUtil.copy(vo, Profession.class);
		return professionMapper.insertSelective(po);
	}
	
	@Override
	public ProfessionVo findProfessionById(Long id){
		Profession po = professionMapper.selectByPrimaryKey(id);
		return BeanUtil.copy(po, ProfessionVo.class);
	}
	
	@Override
	public int updateProfessionById(ProfessionVo vo){
		Profession po = BeanUtil.copy(vo, Profession.class);
		return professionMapper.updateByPrimaryKeySelective(po);
	}
	
	@Override
	public int delProfessionById(Long id){
		return professionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Map<String,Object>> getProfessionItem() {
		return professionMapper.getProfessionItem();
	}
	
}
