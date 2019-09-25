package com.laptrinhjavaweb.service.impl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.buider.BuildingSeachBuilder;
import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageable;
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
	public List<BuildingDTO> findAll(BuildingSeachBuilder fieldSeach, Pageable pageable) {
		// java 7
//		List<BuildingDTO> result=new ArrayList<BuildingDTO>();
//		List<BuildingEntity>buildingEntities=buildingRepository.findAll();
//		for (BuildingEntity item: buildingEntities) {
//			BuildingDTO buildingDTO=buildingConverter.convertToDTO(item);
//			result.add(buildingDTO);
//		}
//		return result;
		// java 8
		/*
		 * 
		}*/
		Map<String, Object>properties=convertToMapProperties(fieldSeach);
		List<BuildingEntity> buildingEntities=buildingRepository.findAll(properties,pageable);
		return buildingEntities.stream()
				.map(item -> buildingConverter.convertToDTO(item)).collect(Collectors.toList());
	}

	private Map<String, Object> convertToMapProperties(BuildingSeachBuilder fieldSeach) {
		Map<String, Object>properties=new HashMap<String, Object>();
		try {
			Field[] fields = BuildingSeachBuilder.class.getDeclaredFields();
			for (Field field : fields) {
				if (!field.getName().equals("buildingTypes")) {
					field.setAccessible(true);
					if (field.get(fieldSeach) instanceof String) {
						if (field.getName().equals("buildingArea")|| field.getName().equals("numberOfBasement")) {
							if (field.get(fieldSeach) !=null && StringUtils.isNotEmpty((String) field.get(fieldSeach))) {
								properties.put(field.getName().toLowerCase(), Integer.parseInt((String) field.get(fieldSeach)));
							}
						}else {
						properties.put(field.getName().toLowerCase(),field.get(fieldSeach));
						}
					}
				}
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*
		properties.put("name", fieldSeach.getName());
		properties.put("district", fieldSeach.getDistrict());
		properties.put("street", fieldSeach.getStreet());
		properties.put("ward", fieldSeach.getWard());
		if (StringUtils.isNotBlank(fieldSeach.getBuildingArea())) {
			properties.put("buildingArea", Integer.parseInt(fieldSeach.getBuildingArea()));
		}
		if (StringUtils.isNotBlank(fieldSeach.getNumberOfBasement())) {
			properties.put("numberOfBasement",fieldSeach.getNumberOfBasement());
			*/
		return properties;
	}


}
