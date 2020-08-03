package com.xc.justforjoy.controller;

import com.xc.justforjoy.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Controller
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		String hello = helloService.sayHello("tomacat..");
		return hello;
	}
	
	//WEB-INF/views/success.jsp
	@RequestMapping("/suc")
	public String success() {
		return "success";
	}
}
