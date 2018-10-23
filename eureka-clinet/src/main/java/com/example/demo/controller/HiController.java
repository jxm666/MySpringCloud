package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Value("${server.port}")
	String port;
	@RequestMapping(value = "/hi")
	public String home(@RequestParam String name) {
		return "hi "+name+" i am forom port "+port;
	}
//	public String home() {
//		return "hi ";
//	}
}