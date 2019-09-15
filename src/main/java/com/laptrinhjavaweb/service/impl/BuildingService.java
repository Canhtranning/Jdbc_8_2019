package com.laptrinhjavaweb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingservice;

public class BuildingService implements IBuildingservice {
	private IBuildingRepository buildingRepository;
	private BuildingConverter buildingConverter;
	public BuildingService() {
		buildingRepository = (IBuildingRepository) new BuildingRepository();
		buildingConverter = new BuildingConverter();
	}	

	@Override
	public List<BuildingDTO> findAll(String name,String district,int buildingArea,int numberOfBasement,int offset,int limit) {
		// java 7
//		List<BuildingDTO> result=new ArrayList<BuildingDTO>();
//		List<BuildingEntity>buildingEntities=buildingRepository.findAll();
//		for (BuildingEntity item: buildingEntities) {
//			BuildingDTO buildingDTO=buildingConverter.convertToDTO(item);
//			result.add(buildingDTO);
//		}
//		return result;
		// java 8
		Map<String, Object>maps=new HashMap<String, Object>();
		return (List<BuildingDTO>) buildingRepository.findAll(maps,offset,limit).stream()
				.map(item -> buildingConverter.convertToDTO(item)).collect(Collectors.toList());
	}
}
