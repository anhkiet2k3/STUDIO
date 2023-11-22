package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDAO;
import com.dao.BaiDangDAO;
import com.service.AdminService;
import com.service.BaiDangService;

@Service
public class BaiDangServiceImpl implements BaiDangService{
	@Autowired
	BaiDangDAO dao;
	

}
