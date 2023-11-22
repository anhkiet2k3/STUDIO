package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDAO;
import com.dao.KhachHangDAO;
import com.service.AdminService;
import com.service.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService{
	@Autowired
	KhachHangDAO dao;
	

}
