package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Admin;

public interface AdminDAO extends JpaRepository<Admin, String>{

}
