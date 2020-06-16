package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AliquotaIva;
import com.example.demo.repository.AliquotaIvaRepository;

@Service
@Transactional
public class AliquotaIvaServiceImplementation implements AliquotaIvaService{

	@Autowired
	AliquotaIvaRepository alirep;
	
	@Override
	public List<AliquotaIva> getAllAliquote() {
		return (List<AliquotaIva>) alirep.findAll();
	}
	
	@Override
	public AliquotaIva getAliquotaById(Integer idAliquota) {
		return alirep.findById(idAliquota).get();
	}
	
	@Override
	public AliquotaIva saveOrUpdate(AliquotaIva oAliquota) {
		return alirep.save(oAliquota);
	}
	
	@Override
	public void deleteAliquota(Integer idAliquota) {
		alirep.deleteById(idAliquota);
	}
	
}
