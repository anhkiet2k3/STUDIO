package com.controllerAdmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Loai;
import com.entity.SanPham;
import com.service.SanPhamService;

@Controller
public class SanphamControllerAdmin {
@Autowired
SanPhamService sp;
@RequestMapping("/admin/editSanPham")
public String editsanpham(Model model) {
	SanPham sps = new SanPham();
	model.addAttribute("sps",sps);
	List<SanPham> spss = sp.findAll();
	model.addAttribute("spss",spss);
	return "admin/editSanPham";
}
}
