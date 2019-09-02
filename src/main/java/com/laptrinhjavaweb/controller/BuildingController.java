package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.IBuildingservice;
import com.laptrinhjavaweb.service.impl.BuildingServiceImpl;

public class BuildingController {

	public static void main(String[] args) {
		IBuildingservice buildingservice = new BuildingServiceImpl();
		List<BuildingDTO> buildingDTOs = buildingservice.findAll();
		for (BuildingDTO item : buildingDTOs) {
			System.out.println("Name: " + item.getName() + "   " + "District:" + item.getDistrict() + "   " + "Street"
					+ item.getStreet());

//		 IBuildingservice buildingservice=new BuildingServiceImpl();
//		 try {
//			buildingservice.testException();
//		} catch (BuildingCustomException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		
		}
	}
}
