package br.com.mudi.mudi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(HttpServletRequest httpServletRequest) {
		httpServletRequest.setAttribute("nome", "mundo");
		return "hello";
	}
}
