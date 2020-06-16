package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AliquotaIva;

public interface AliquotaIvaService {

	public List<AliquotaIva> getAllAliquote();
	 
	public AliquotaIva getAliquotaById(Integer idAliquota);
	 
	public AliquotaIva saveOrUpdate(AliquotaIva oAliquota);
	 
	public void deleteAliquota(Integer idAliquota);
}
