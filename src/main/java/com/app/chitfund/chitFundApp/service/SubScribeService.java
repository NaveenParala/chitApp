package com.app.chitfund.chitFundApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.app.chitfund.chitFundApp.model.ChitEntity;
import com.app.chitfund.chitFundApp.repo.ChitRepository;

@Service
public class SubScribeService {
	@Autowired
	private ChitRepository chitRepository;

	public ChitEntity  postChitEntity(ChitEntity entity) {

		return chitRepository.save(entity);
	}

	public ChitEntity getChitEntity(int id) {
		ChitEntity entity=null;
		Optional<ChitEntity>  optional=chitRepository.findById(id);
		if(optional.isPresent()) {
			entity=optional.get();
		}
		return entity;
	}


	public void deleteChitEntity(int id){

		ChitEntity entity=getChitEntity(id);
		int chitId=entity.getId();
		chitRepository.deleteById(chitId);
		
	}
}
