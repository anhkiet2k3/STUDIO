package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DonHangController {

	@RequestMapping("/donhang/list")
	public String donhang() {
		return "donhang/list";
	}
}
