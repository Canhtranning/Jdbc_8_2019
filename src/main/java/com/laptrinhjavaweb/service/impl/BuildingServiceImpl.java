package com.laptrinhjavaweb.service.impl;
import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingRepositoryImpl;
import com.laptrinhjavaweb.service.IBuildingservice;

public class BuildingServiceImpl implements IBuildingservice {
private IBuildingRepository buildingRepository;
public BuildingServiceImpl() {
	buildingRepository=new BuildingRepositoryImpl();
}
	@Override
	public List<BuildingDTO> findAll() {
				return buildingRepository.findAll();
	}
//
//	@Override
//	public void testException() throws BuildingCustomException{
//		int a=0;
//		int b=1;
//	try {
//		System.out.println(b/a);
//	} catch (Exception e) {
//		throw new BuildingCustomException("loi cu phap khong chia cho 0");
//	}
//		
//	}
// 


}
