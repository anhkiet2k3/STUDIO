package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDAO;
import com.dao.ChiTietDonHangDAO;
import com.service.AdminService;
import com.service.ChiTietDonHangService;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService{
	@Autowired
	ChiTietDonHangDAO dao;
	

}
