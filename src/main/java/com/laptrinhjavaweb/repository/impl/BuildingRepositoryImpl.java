package com.laptrinhjavaweb.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingRepositoryImpl implements IBuildingRepository {
	@Override
	public List<BuildingDTO> findAll() {
		// TODO Auto-generated method stub
		List<BuildingDTO> results=new ArrayList<>();
		String sql="SELECT * FROM building";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection =EntityManagerFactory.getConnection();
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				BuildingDTO buildingDTO=new BuildingDTO();
				buildingDTO.setName(resultSet.getString("name"));
				buildingDTO.setDistrict(resultSet.getString("district"));
				buildingDTO.setStreet(resultSet.getString("street"));
				results.add(buildingDTO);
			}
			return results;
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				return null;
			}
		}
	}
}

