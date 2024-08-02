package com.gopal.simpleWebApp.models;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data // lombok will create getter-setter
@AllArgsConstructor // cause lombok will create constructor
public class Product {

    private int prodId;
    private String prodName;
    private int prodPrice;

    public Product() {
    }

    // public Product(int prodId, String prodName, int prodPrice) {
    //     this.prodId = prodId;
    //     this.prodName = prodName;
    //     this.prodPrice = prodPrice;
    // }

    // public int getProdId() {
    //     return prodId;
    // }
    // public void setProdId(int prodId) {
    //     this.prodId = prodId;
    // }
    // public String getProdName() {
    //     return prodName;
    // }
    // public void setProdName(String prodName) {
    //     this.prodName = prodName;
    // }
    // public int getProdPrice() {
    //     return prodPrice;
    // }
    // public void setProdPrice(int prodPrice) {
    //     this.prodPrice = prodPrice;
    // }

}
