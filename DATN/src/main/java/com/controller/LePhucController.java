package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.SanPham;
import com.service.SanPhamService;
import com.dao.SanPhamDAO;
import com.entity.BinhLuan;
import com.entity.ChiTietDonHang;
import com.entity.Loai;
import com.entity.KhachHang;

import com.dao.BinhLuanDAO;
import com.dao.ChiTietDonHangDAO;
import com.dao.KhachHangDAO;
import com.dao.LoaiDAO;

@Controller
public class LePhucController {
	@Autowired
	ChiTietDonHangDAO ctdao;
	@Autowired
	KhachHangDAO khdao;
	@Autowired
	BinhLuanDAO bldao;
	@Autowired
	SanPhamDAO spdao;
	@Autowired
	SanPhamService sanphamservice;
	@Autowired
	LoaiDAO ldao;
	@RequestMapping("/lephuc/list")
		public String lephuc(Model model, @RequestParam("cid") Integer cid) {
			if(cid!=0) {
				List<SanPham> sps =spdao.findByIdsp(cid);
				model.addAttribute("sps", sps);
			}else {
		List<SanPham> sps = spdao.findAll();
		model.addAttribute("sps", sps);
			}
		List<Loai> l = ldao.findAll();
		model.addAttribute("l", l);
		return "lephuc/list";
	}

	@RequestMapping("/lephuc/ctlephuc/{id}")
	public String ctlephuc(Model model, @PathVariable("id") Integer id) {
		SanPham sp = sanphamservice.findById(id);
		model.addAttribute("sp",sp);
		List<BinhLuan> bl = bldao.findByIdbl(id);
		model.addAttribute("bl",bl);
		Loai clt = sp.getLoai();
		List<SanPham> cl = spdao.findByIdsp(clt.getId());
		model.addAttribute("cl",cl);
		List<ChiTietDonHang> ct = ctdao.findByIdsp();
		model.addAttribute("ct",ct);
		return "lephuc/ctlephuc";
	}
	@RequestMapping("/lephuc/binhluan/{id}")
	public String create(@PathVariable("id") Integer id,BinhLuan cmt) {
		
		KhachHang test= cmt.getKhachhang();
//		if(test == null) {
			test = khdao.findById(6).get();
//			SanPham sp =spdao.findById(id).get(); 
			cmt.setKhachhang(test);
//			cmt.setSanpham(sp);
//			bldao.save(cmt);
//		}else {
			bldao.save(cmt);
//		}
		
		return "redirect:/lephuc/ctlephuc/{id}";
	}
	
}