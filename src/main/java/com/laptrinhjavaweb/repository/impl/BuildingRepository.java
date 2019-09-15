package com.laptrinhjavaweb.repository.impl;

import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingRepository extends SimpleJpaRepository<BuildingEntity> implements IBuildingRepository {

	@Override
	public List<BuildingEntity> findAll(Map<String, Object> params, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
