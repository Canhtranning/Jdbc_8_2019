package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.IBuildingservice;
import com.laptrinhjavaweb.service.impl.BuildingService;

public class BuildingController {

	public static void main(String[] args) {
		int page=1;
		int limit=2;
		int offset=(page -1) * limit;
		
		IBuildingservice buildingservice = new BuildingService();
		List<BuildingDTO> buildingDTOs = buildingservice.findAll(null, null, offset,limit, offset, offset);
		for (BuildingDTO item : buildingDTOs) {
			System.out.println("ID: " + item.getId()
			+ "   " +"Name: " + item.getName() 
			+ "   " + "NumberOfBasement:" + item.getNumberOfBasement()
			+ "   " + "BuildingArea:"  + item.getBuildingArea()
			+ "   " + "District:" + item.getDistrict()
			+ "   " + "createddate:" + item.getCreatedDate()
			+ "   " + "Ward:" + item.getWard());	
		}
		
	}
}
