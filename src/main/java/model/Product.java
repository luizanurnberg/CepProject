/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luizanurnberg
 */
public class Product {
    
    protected String productName;
    protected String productPrice;
    protected String productStockAmount;
    protected int productCode;
    private static int currentproductCode = 1;

    public Product(String productName, String productPrice, String productStockAmount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStockAmount = productStockAmount;
        this.productCode = currentproductCode++;
    }

    @Override
    public String toString() {
        return productCode + " "+ productName + " " + productPrice + " " + productStockAmount;
    }
    
    
      
}
