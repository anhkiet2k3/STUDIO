package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Admin;
import com.entity.DichVu;

public interface DichVuDAO extends JpaRepository<DichVu, String>{

}
