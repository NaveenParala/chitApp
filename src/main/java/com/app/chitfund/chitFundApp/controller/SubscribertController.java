package com.app.chitfund.chitFundApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.chitfund.chitFundApp.model.ChitEntity;
import com.app.chitfund.chitFundApp.service.ChitService;

@RestController
@RequestMapping("/restapi")
public class SubscribertController {
	@Autowired
	private ChitService ChitService;

	@PostMapping("/post")
	public ChitEntity postResource(@RequestBody ChitEntity entity) {
		
		return ChitService.postChitEntity(entity);
		
	}
	
	@GetMapping("/get/{id}")
	public ChitEntity getOneChitEntity(@PathVariable("id") int id) {
		return ChitService.getChitEntity(id);
	}
}
