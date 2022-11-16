/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group2.domainmodel;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "KhuyenMai")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class KhuyenMai {

    @Id
    @Column(name = "MaKM")
    private String maKM;

    @Column(name = "TenKM")
    private String tenKM;

    @Column(name = "SoTienGiam")
    private BigDecimal soTienGiam;

    @Column(name = "NgayBD")
    private Date ngayBD;

    @Column(name = "NgayKT")
    private Date ngayKT;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
