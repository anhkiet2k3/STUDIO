package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDAO;
import com.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminDAO dao;
	

}
