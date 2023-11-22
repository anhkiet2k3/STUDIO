package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.entity.Admin;
import com.entity.BinhLuan;
import com.entity.SanPham;

public interface SanPhamDAO extends JpaRepository<SanPham, Integer>{
//	@Query("SELECT p FROM sanpham p WHERE p.idloai.ten=?1")
//	List<SanPham> findByCategoryId(String cid);
	@Query(value="SELECT * FROM sanpham WHERE idloai=?1",nativeQuery = true)
	List<SanPham> findByIdsp(Integer id);
}
