package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDAO;
import com.dao.DonHangDAO;
import com.service.AdminService;
import com.service.DonHangService;

@Service
public class DonHangServiceImpl implements DonHangService{
	@Autowired
	DonHangDAO dao;
	

}
