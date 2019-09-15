package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.service.IUserservice;
import com.laptrinhjavaweb.service.impl.UserService;

public class UserController {
	public static void main(String[] args) {
		int page=1;
		int limit=2;
		int offset=(page -1) * limit;
		  IUserservice userservice = new UserService();
		System.out.println("ok ok");
		List<UserDTO> userDTOs = userservice.findAll(offset,limit);
		for(UserDTO item: userDTOs) {
			System.out.println("UserName: " + item.getUserName() 
			+ "   " + "Password:" + item.getPassWord());
		}
	}
}
