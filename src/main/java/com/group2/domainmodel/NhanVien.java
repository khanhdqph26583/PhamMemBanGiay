/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group2.domainmodel;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "NhanVien")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {

    @Id
    @Column(name = "MaNV")
    private String maNV;

    @Column(name = "TenNV")
    private String tenNV;
    @Column(name = "GioiTinh")
    private String gioiTinh;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @Column(name = "Email")
    private String email;

    @Column(name = "QueQuan")
    private String queQuan;
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @Column(name = "TaiKhoan")
    private String taiKhoan;
    @Column(name = "MatKhau")
    private String matKhau;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdChucVu", referencedColumnName = "Id")
    private ChucVu chucVu;

}
