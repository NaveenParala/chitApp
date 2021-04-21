package com.app.chitfund.chitFundApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.chitfund.chitFundApp.model.ChitEntity;

public interface SubscriberRepository extends JpaRepository<ChitEntity, Integer> {

	
}
