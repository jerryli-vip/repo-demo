package com.pactera.web.controller;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pactera.web.exception.SampleException;
import com.pactera.web.model.Department;
import com.pactera.web.service.DepartmentService;

@Controller
public class DepartmentController {

	Logger log = Logger.getLogger(DepartmentController.class);

	@Autowired
	DepartmentService departmentService;

	@RequestMapping(value = "list")
	public ModelAndView sayHello() {
		final String METHOD_NAME = "list";
		log.debug(METHOD_NAME + " begin");

		ModelAndView mav = new ModelAndView("deptList");

		List<Department> deptList;
		try {
			deptList = departmentService.findAll();
			if (!CollectionUtils.isEmpty(deptList)) {
				mav.addObject("deptList", deptList);
			}
		} catch (SampleException e) {
			log.error(METHOD_NAME + " error occurred when get all departmens");
			e.printStackTrace();
		}

		log.debug(METHOD_NAME + " end");
		return mav;
	}
}
