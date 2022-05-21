package com.nguyenvanphu.mobilestore.Model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Tự động generated
    private Integer ItemCode;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 2000)
    private String detail;

    @Column(nullable = false, length = 100)
    private String Cost;

    @Column(nullable = false, length = 100)
    private String manufacturer;

    @Column(nullable = false, length = 100)
    private String category;

    @Column(nullable = false, length = 100)
    private String avaibleUnits;

    public Product(Integer ItemCode, String name,String detail,String Cost,  String manufacturer,String category, String avaibleUnits) {
       this.ItemCode = ItemCode;
       this.name = name;
       this.detail = detail;
       this.Cost = Cost;
       this.manufacturer = manufacturer;
       this.category = category;
       this.avaibleUnits = avaibleUnits;
    }

    public Product() {

    }

    public Integer getItemCode() {
        return ItemCode;
    }

    public void setItemCode(Integer itemCode) {
        ItemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAvaibleUnits() {
        return avaibleUnits;
    }

    public void setAvaibleUnits(String avaibleUnits) {
        this.avaibleUnits = avaibleUnits;
    }

//  picture

}
