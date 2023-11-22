package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.Admin;
import com.entity.ChiTietDonHang;


public interface ChiTietDonHangDAO extends JpaRepository<ChiTietDonHang, String>{
	
	@Query(value="SELECT TOP(3)* from CHITIETDONHANG WHERE soluong>0 ORDER BY idsanpham DESC",nativeQuery = true)
	List<ChiTietDonHang> findByIdsp();
}
