/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ProductDAO;
import static dao.ProductDAO.returnProducts;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Product;
import view.ProductView;

/**
 *
 * @author luizanurnberg
 */
public class ProductController {

    private ProductView productView;

    public ProductController(ProductView productView) {
        this.productView = productView;
        savingButton();
    }

    // 2 - fazer método para salvar os produtos, validando os campos com try catch. Lembrando de pegar os gets dos campos feitos na classe ProductView
    //aqui também será instanciado
    public void saveProducts() {
        System.out.println("controller.ProductController.saveProducts()");
        try {
            String productName = productView.getProductName();
            String productPrice = productView.getProductPrice();
            String productStockAmount = productView.getProductStockAmount();
            exceptionMessage();
            ProductDAO.addProduct(new Product(productName, productPrice, productStockAmount));
            showAllProducts();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //vai definir a ação concreta do botão de salvar
    public void savingButton() {
        productView.setSavingButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                saveProducts();;
            }
        });
    }

    //tinha feito a validação dentro do metodo de salvar os produtos, mas como o campo sempre vem em branco, disparava 
    //no momento errado, criado método com a exceção, assim o método so da um catch se for salvo da forma errada
    public void exceptionMessage() throws Exception {
        if (productView.getProductName().equals("") || productView.getProductPrice().equals("") || productView.getProductStockAmount().equals("")) {
            throw new Exception("The fields are empty! You need to fill them");
        }
    }
    
    //mostra todos os produtos e pega o set do text area para habilitar o campo
    public void showAllProducts() {
        String t = "";
        List<Product> p = ProductDAO.returnProducts();
        for (Product pr : p) {
            t += pr.toString() + "\n";

        }
        productView.setTextArea(t);
    }

    //vai deixar a view visível rsrs
    public void showProductView() {
        this.productView.setVisible(true);
    }

}
