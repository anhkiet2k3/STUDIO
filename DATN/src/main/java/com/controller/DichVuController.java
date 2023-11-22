package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DichVuController {

	@RequestMapping("/dichvu/list")
	public String dichvu() {
		return "dichvu/list";
	}

	@RequestMapping("/dichvu/ctdichvu")
	public String ctdichvu() {
		return "dichvu/ctdichvu";
	}
}
