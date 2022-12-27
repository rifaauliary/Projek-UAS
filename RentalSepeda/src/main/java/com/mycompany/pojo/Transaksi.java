/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

/**
 *
 * @author berka
 */
public class Transaksi {
    private String orderId;
    private String tanggalOrder;
    private Admin admin;
    private Customer customer;
    private Sepeda sepeda;
    private Integer jumlahSepeda;
    private String durasiSewa;

    public Transaksi() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTanggalOrder() {
        return tanggalOrder;
    }

    public void setTanggalOrder(String tanggalOrder) {
        this.tanggalOrder = tanggalOrder;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Sepeda getSepeda() {
        return sepeda;
    }

    public void setSepeda(Sepeda sepeda) {
        this.sepeda = sepeda;
    }

    public Integer getJumlahSepeda() {
        return jumlahSepeda;
    }

    public void setJumlahSepeda(Integer jumlahSepeda) {
        this.jumlahSepeda = jumlahSepeda;
    }

    public String getDurasiSewa() {
        return durasiSewa;
    }

    public void setDurasiSewa(String durasiSewa) {
        this.durasiSewa = durasiSewa;
    }
}
