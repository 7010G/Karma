package org.web;

import javax.annotation.Resource;

import org.service.impl.Services;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Control {

	@Resource
	private Services ser;
	
	@RequestMapping("select")
	@ResponseBody
	public void h1(Object t) {
		

	}
	
}
