package com.example.demovn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private int _year;
    private Double price;
    private String url;

    public Product() {
    }

    public Product(String productName, int _year, Double price, String url) {
        this.productName = productName;
        this._year = _year;
        this.price = price;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getYear() {
        return _year;
    }

    public void setYear(int _year) {
        this._year = _year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", _year=" + _year +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}
