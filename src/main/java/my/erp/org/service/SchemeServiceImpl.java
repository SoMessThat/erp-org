package my.erp.org.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.erp.org.domain.Scheme;
import my.erp.org.mapper.SchemeMapper;
import my.erp.org.util.BeanUtil;
import my.erp.org.vo.SchemeVo;

@Service
public class SchemeServiceImpl implements SchemeService {
	
	@Autowired
	SchemeMapper schemeMapper;
	
	@Override
	public List<SchemeVo> queryScheme(SchemeVo vo){
		return schemeMapper.queryScheme(vo);
	}

	@Override
	public int addScheme(SchemeVo vo){
		Scheme po = BeanUtil.copy(vo, Scheme.class);
		po.setStatus("APPLYING");
		po.setCreateTime(new Date());
		po.setUpdateTime(new Date());
		return schemeMapper.insertSelective(po);
	}
	
	@Override
	public SchemeVo findSchemeById(Long id){
		Scheme po = schemeMapper.selectByPrimaryKey(id);
		return BeanUtil.copy(po, SchemeVo.class);
	}
	
	@Override
	public int updateSchemeById(SchemeVo vo){
		Scheme po = BeanUtil.copy(vo, Scheme.class);
		po.setUpdateTime(new Date());
		return schemeMapper.updateByPrimaryKeySelective(po);
	}
	
	@Override
	public int delSchemeById(Long id){
		Scheme po = new Scheme();
		po.setId(id);
		po.setStatus("DISABLED");
		po.setUpdateTime(new Date());
		return schemeMapper.updateByPrimaryKeySelective(po);
	}
	
}
