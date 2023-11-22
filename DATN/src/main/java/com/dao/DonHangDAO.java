package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Admin;
import com.entity.DonHang;

public interface DonHangDAO extends JpaRepository<DonHang, String>{

}
