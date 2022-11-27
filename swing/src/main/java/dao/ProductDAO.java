/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author luizanurnberg
 */
public class ProductDAO {

    private static List<Product> products = new ArrayList<>();

    public static void addProduct(Product p) {
        products.add(p);
    }

    public static List<Product> returnProducts() {
        return products;
    }

}
