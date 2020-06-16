package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AnnoContabile;

public interface AnnoContabileService {

	public List<AnnoContabile> getAllAnni();
	 
	public AnnoContabile getAnnoById(Integer idAnno);
	 
	public AnnoContabile saveOrUpdate(AnnoContabile oAnno);
	 
	public void deleteAnno(Integer idAnno);

}
