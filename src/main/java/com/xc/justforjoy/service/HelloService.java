package com.xc.justforjoy.service;

import org.springframework.stereotype.Service;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Service
public class HelloService {

	public String sayHello(String name) {
		return "Hello,"+name;
	}
}
