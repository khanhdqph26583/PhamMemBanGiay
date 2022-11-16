/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group2.domainmodel;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "ChiTietSanPham")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSanPham {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "ThoiGianBH")
    private Integer thoiGianBH;

    @Column(name = "Gia")
    private BigDecimal gia;

    @Column(name = "TrangThai")
    private Integer trangThai;

    @OneToOne
    @JoinColumn(name = "IdSP", referencedColumnName = "Id")
    private SanPham sanPham;

    @OneToOne
    @JoinColumn(name = "IdSize", referencedColumnName = "Id")
    private Size size;

    @OneToOne
    @JoinColumn(name = "IdMauSac", referencedColumnName = "Id")
    private MauSac mauSac;

    @OneToOne
    @JoinColumn(name = "IdDongSP", referencedColumnName = "Id")
    private DongSP dongSP;

    @OneToOne
    @JoinColumn(name = "IdAnh", referencedColumnName = "Id")
    private Anh anh;

    @OneToOne
    @JoinColumn(name = "MaDanhMuc", referencedColumnName = "MaDanhMuc")
    private DanhMuc danhMuc;
}
