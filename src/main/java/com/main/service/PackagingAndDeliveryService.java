package com.main.service;

import org.springframework.stereotype.Service;

import com.main.dto.PackagingAndDeliveryDTO;

@Service
public interface PackagingAndDeliveryService {
	
	public PackagingAndDeliveryDTO calculatePackagingAndDeliveryCharge(String Type, Integer count);

}
