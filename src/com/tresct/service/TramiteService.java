package com.tresct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tresct.domain.Tramite;

@Service
public class TramiteService {
	
	@Autowired
	private TramiteService tramiteService;
	
	public void save(Tramite t) {
		tramiteService.save(t);
	}
	
	public void save(List<Tramite> listaTramites) {
		tramiteService.save(listaTramites);
	}
	
	public Tramite findOne(int id){
		return tramiteService.findOne(id);
	}
	
	public List<Tramite> findAll(){
		return (List<Tramite>) tramiteService.findAll();
	}
	
	public boolean exists(int id) {
		return tramiteService.exists(id);
	}
}
