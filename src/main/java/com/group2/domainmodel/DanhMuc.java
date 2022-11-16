/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group2.domainmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "DanhMuc")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DanhMuc {

    @Id
    @Column(name = "MaDanhMuc")
    private String maDanhMuc;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "MoTa")
    private String moTa;
}
