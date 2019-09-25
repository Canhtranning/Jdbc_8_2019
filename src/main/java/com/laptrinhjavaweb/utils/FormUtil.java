package com.laptrinhjavaweb.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class FormUtil {
	public static <T> T toModel(Class<T> zclazz, HttpServletRequest request) {
		T object = null;
		try {
			object = zclazz.newInstance();
			//dua vao key va map dung theo key cua no
			BeanUtils.populate(object, request.getParameterMap());
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return object;
	}
}
