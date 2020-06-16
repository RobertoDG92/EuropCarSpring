package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Azienda;
import com.example.demo.repository.AziendaRepository;

@Service
@Transactional
public class AziendaServiceImplementation implements AziendaService{

	@Autowired
	AziendaRepository aziendarepo;

	@Override
	public List<Azienda> getAllAziende() {
		// TODO Auto-generated method stub
		return (List<Azienda>) aziendarepo.findAll();
	}

	@Override
	public Azienda getAziendaById(Integer idAzienda) {
		// TODO Auto-generated method stub
		return aziendarepo.findById(idAzienda).get();
	}

	@Override
	public Azienda saveOrUpdate(Azienda oAzienda) {
		// TODO Auto-generated method stub
		return aziendarepo.save(oAzienda);
	}

	@Override
	public void deleteAzienda(Integer idAzienda) {
		// TODO Auto-generated method stub
		aziendarepo.deleteById(idAzienda);
		
	}
	
}
