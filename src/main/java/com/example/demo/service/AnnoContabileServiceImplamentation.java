package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnnoContabile;
import com.example.demo.repository.AnnoContabileRepository;

@Service
@Transactional
public class AnnoContabileServiceImplamentation implements AnnoContabileService{

	@Autowired
	AnnoContabileRepository annorep;
	
	@Override
	public List<AnnoContabile> getAllAnni() {
		// TODO Auto-generated method stub
		return (List<AnnoContabile>) annorep.findAll();
	}

	@Override
	public AnnoContabile getAnnoById(Integer idAnno) {
		// TODO Auto-generated method stub
		return annorep.findById(idAnno).get();
	}

	@Override
	public AnnoContabile saveOrUpdate(AnnoContabile oAnno) {
		// TODO Auto-generated method stub
		return annorep.save(oAnno);
	}

	@Override
	public void deleteAnno(Integer idAnno) {
		// TODO Auto-generated method stub
		annorep.deleteById(idAnno);
		
	}
}
