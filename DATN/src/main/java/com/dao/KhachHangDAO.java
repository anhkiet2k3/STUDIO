package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Admin;
import com.entity.KhachHang;

public interface KhachHangDAO extends JpaRepository<KhachHang, Integer>{

}
