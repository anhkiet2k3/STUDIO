package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDAO;
import com.dao.DichVuDAO;
import com.service.AdminService;
import com.service.DichVuService;

@Service
public class DichVuServiceImpl implements DichVuService{
	@Autowired
	DichVuDAO dao;
	

}
