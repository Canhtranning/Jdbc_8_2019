package com.laptrinhjavaweb.repository.impl;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingRepository extends SimpleJpaRepository<BuildingEntity> implements IBuildingRepository {
//
//	@Override
//	public List<BuildingEntity> findAll(Map<String, Object> params, Pageable pageable) {
//		String name = (String) params.get("name");
//		String district = (String) params.get("district");
//		Integer buildingArea = (Integer) params.get("buildingArea");
//		Integer numberOfBasement = (Integer) params.get("numberOfBasement");

	//StringBuilder where=new StringBuilder(" ");
//		if (StringUtils.isNotBlank(name)) {
//			where.append("AND A.name LIKE '%"+name+"%' ");
//		}
//		if (StringUtils.isNotBlank(district)) {
//			where.append("AND A.district LIKE '%"+district+"%' ");
//		}
//		if (buildingArea != null) {
//			where.append("AND A.buildingarea="+buildingArea+" ");
//		}
//		if (numberOfBasement != null) {
//			where.append("AND A.numberofbasement="+numberOfBasement+" ");
//		}
		// StringBuilder where=new StringBuilder("AND A.name LIKE '%"+name+"%' AND
		// A.district LIKE '%"+district+"%'");
		// where.append(" and A.buildingarea="+buildingArea+" AND
		// A.numberofbasement="+numberOfBasement+"");
		

//		return this.findAll(params,pageable);
//	}

}
