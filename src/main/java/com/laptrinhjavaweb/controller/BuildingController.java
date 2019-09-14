package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.IBuildingservice;
import com.laptrinhjavaweb.service.impl.BuildingService;

public class BuildingController {

	public static void main(String[] args) {
		IBuildingservice buildingservice = new BuildingService();
		List<BuildingDTO> buildingDTOs = buildingservice.findAll();
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
