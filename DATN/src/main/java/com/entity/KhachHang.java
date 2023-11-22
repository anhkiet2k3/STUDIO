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
@Table(name="khachhang")
public class KhachHang implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String ten;
	Boolean gioitinh;
	String sdt;
	String diachi;
	String email;
	String taikhoan;
	String matkhau;
	
	@JsonIgnore
	@OneToMany(mappedBy = "khachhang")
	List<DonHang> donhangs;
	
	@JsonIgnore
	@OneToMany(mappedBy = "khachhang")
	List<BinhLuan> khachhangs;
	
}
