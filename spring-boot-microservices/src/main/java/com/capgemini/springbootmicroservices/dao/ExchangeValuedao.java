package com.capgemini.springbootmicroservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.springbootmicroservices.entity.ExchangeValue;

public interface ExchangeValuedao extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
