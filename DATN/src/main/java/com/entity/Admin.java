package com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="admin")
public class Admin implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String ten;
	String sdt;
	String gmail;
	String taikhoan;
	String matkhau;
	
	@JsonIgnore
	@OneToMany(mappedBy = "admin")
	List<SanPham> sanphams;
	
	@JsonIgnore
	@OneToMany(mappedBy = "admin")
	List<BaiDang> baidangs;

	@JsonIgnore
	@OneToMany(mappedBy = "admin")
	List<DichVu> dichvus;
}
