package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaiKhoanController {

	@RequestMapping("/taikhoan/login")
	public String login() {
		return "taikhoan/login";
	}

	@RequestMapping("/taikhoan/register")
	public String register() {
		return "taikhoan/register";
	}

	@RequestMapping("/taikhoan/chinhsuathongtin")
	public String chinhsuatt() {
		return "taikhoan/chinhsuathongtin";
	}

	@RequestMapping("/taikhoan/doimatkhau")
	public String doimatkhau() {
		return "taikhoan/doimatkhau";
	}

	@RequestMapping("/taikhoan/quenmatkhau")
	public String quenmatkhau() {
		return "taikhoan/quenmatkhau";
	}

}
