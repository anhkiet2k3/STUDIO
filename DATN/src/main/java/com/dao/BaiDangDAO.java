package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Admin;
import com.entity.BaiDang;

public interface BaiDangDAO extends JpaRepository<BaiDang, String>{

}
