package com.example.demo.service;
import java.util.List;

import com.example.demo.model.AreaInvestimento;
public interface AreaInvestimentoService {

	public List<AreaInvestimento> getAllAreeInv();
	
	public AreaInvestimento getAreaInvById(Integer IdArea);
	
	public AreaInvestimento saveOrUpdate(AreaInvestimento oArea);
	
	public void deleteArea(Integer idArea);
}
