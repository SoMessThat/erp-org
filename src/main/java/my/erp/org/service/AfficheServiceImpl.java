package my.erp.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.erp.org.domain.Affiche;
import my.erp.org.mapper.AfficheMapper;
import my.erp.org.util.BeanUtil;
import my.erp.org.vo.AfficheVo;

@Service
public class AfficheServiceImpl implements AfficheService {
	
	@Autowired
	AfficheMapper afficheMapper;
	
	@Override
	public List<AfficheVo> queryAffiche(AfficheVo vo){
		vo.setStatus("ENABLED");
		return afficheMapper.queryAffiche(vo);
	}

	@Override
	public int addAffiche(AfficheVo vo){
		Affiche po = BeanUtil.copy(vo, Affiche.class);
		po.setStatus("ENABLED");
		return afficheMapper.insertSelective(po);
	}
	
	@Override
	public AfficheVo findAfficheById(Long id){
		Affiche po = afficheMapper.selectByPrimaryKey(id);
		return BeanUtil.copy(po, AfficheVo.class);
	}
	
	@Override
	public int updateAfficheById(AfficheVo vo){
		Affiche po = BeanUtil.copy(vo, Affiche.class);
		return afficheMapper.updateByPrimaryKeySelective(po);
	}
	
	@Override
	public int delAfficheById(Long id){
		Affiche po = new Affiche();
		po.setId(id);
		po.setStatus("DISABLED");
		return afficheMapper.updateByPrimaryKeySelective(po);
	}
	
}
