package com.controllerAdmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.BinhLuanDAO;
import com.dao.KhachHangDAO;
import com.dao.SanPhamDAO;
import com.entity.BinhLuan;
import com.entity.KhachHang;
import com.entity.Loai;
import com.entity.SanPham;
import com.service.BinhLuanService;

@Controller
public class BinhluanControllerAdmin {
	@Autowired
	SanPhamDAO spdao;
	@Autowired
	KhachHangDAO dao;
	@Autowired
	BinhLuanService bl;
	@RequestMapping("/admin/editBinhLuan")
	public String editBinhluan(Model model) {
		List<BinhLuan> b = bl.findAll();
		model.addAttribute("b",b);
		return "admin/editBinhluan";
	}
	@RequestMapping("/binhluan/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		bl.delete(id);
		return "redirect:/admin/editBinhLuan";
	}
	@RequestMapping("/binhluan/create")
	public String create(BinhLuan loai) {
		KhachHang test= loai.getKhachhang();
		test = dao.findById(6).get();
		SanPham sp =spdao.findById(1).get(); 
		loai.setKhachhang(test);
//		loai.setNoidung("dep");
//		loai.getNoidung();
		loai.setSanpham(sp);
		bl.create(loai);
		return "redirect:/admin/editBinhLuan";
	}
}
