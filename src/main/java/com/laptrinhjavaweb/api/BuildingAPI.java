package com.laptrinhjavaweb.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.buider.BuildingSeachBuilder;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.service.IBuildingservice;
import com.laptrinhjavaweb.service.impl.BuildingService;
import com.laptrinhjavaweb.utils.FormUtil;
import com.laptrinhjavaweb.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-building"})
public class BuildingAPI extends HttpServlet {
	
	private static final long serialVersionUID = 7791882872114240785L;

	public IBuildingservice buildingservice=new BuildingService();
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("fmnfmf");
	}
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("sssss");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		BuildingDTO  building=FormUtil.toModel(BuildingDTO.class, request);
		//BuildingDTO building = HttpUtil.of(request.getReader()).toModel(BuildingDTO.class);
		BuildingSeachBuilder buildingSeachBuilder = new BuildingSeachBuilder.Builder().setName(building.getName())
				.setDistrict(building.getDistrict())
				.setBuildingArea(building.getBuildingArea())
				.setStreet(building.getStreet())
				.setWard(building.getWard())
				.setNumberOfBasement(building.getNumberOfBasement())
				.build();
		Pageable pageable = new PageRequest(building.getPage(), building.getLimit());
		List<BuildingDTO> buildings = buildingservice.findAll(buildingSeachBuilder, pageable);

		mapper.writeValue(response.getOutputStream(),buildings);
		System.out.println("ânnsnsns");
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("fmndddddfmf");
	}

}
