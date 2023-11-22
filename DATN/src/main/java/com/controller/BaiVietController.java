package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaiVietController {

	@RequestMapping("/baiviet/list")
	public String baiviet() {
		return "baiviet/list";
	}

	@RequestMapping("/baiviet/ctbaiviet")
	public String ctbaiviet() {
		return "baiviet/ctbaiviet";
	}
}
