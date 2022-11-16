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
@Table(name = "HoaDonTra")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonTra {

    @Id
    @Column(name = "MaHDT")
    private String maHDT;

    @Column(name = "NgayLapHD")
    private Date ngayTao;

    @Column(name = "TongTien")
    private BigDecimal tongTien;

    @Column(name = "LiDoTra")
    private String liDoTra;

    @Column(name = "MaHD")
    private String maHD;

    @Column(name = "MaNV")
    private String maNV;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV")
    private NhanVien nhanVien;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHD", referencedColumnName = "MaHD")
    private HoaDon hoaDon;
}
