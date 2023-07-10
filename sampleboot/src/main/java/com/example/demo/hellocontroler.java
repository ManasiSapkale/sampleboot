package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroler {
	
	@RequestMapping("/hello")

	public String sayhello() {
		return "<h1 style='color:red'>Hello guys welcome to spring boot</h1>";

}
}
