/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group2.domainmodel;

import java.math.BigDecimal;
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
@Table(name = "HoaDon")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HoaDon {

    @Id
    @Column(name = "MaHD")
    private String maHD;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "TongTien")
    private BigDecimal tongTien;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "GHICHU")
    private String ghiChu;

    @Column(name = "TenKH")
    private String tenKH;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "MaKM", referencedColumnName = "MaKM")
    private KhuyenMai khuyenMai;
}
