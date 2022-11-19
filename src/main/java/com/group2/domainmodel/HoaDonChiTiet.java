/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group2.domainmodel;

import java.math.BigDecimal;
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
@Table(name = "HoaDonChiTiet")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonChiTiet {

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "Gia")
    private BigDecimal gia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdChiTietSP", referencedColumnName = "Id")
    private ChiTietSanPham chiTietSanPham;

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHD", referencedColumnName = "MaHD")
    private HoaDon hoaDon;
}
