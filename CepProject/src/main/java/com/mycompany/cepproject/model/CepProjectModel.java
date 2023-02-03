/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepproject.model;

/**
 *
 * @author luizanurnberg
 */
public class CepProjectModel {

    //Variáveis nesse caso precisam estar em obrigatoriamente em Portugues
    private String localidade;
    private String bairro;
    private String logradouro;

    public String getDistrict() {
        return bairro;
    }

    public String getCity() {
        return localidade;
    }

    public String getStreet() {
        return logradouro;
    }

    @Override
    public String toString() {
        String printToString;
        if (this.localidade == null || this.bairro == null || this.logradouro == null) {
            printToString = "O site não possui informações sobre esse registro para realizar a consulta, insira um CEP válido!";
        } else {
            printToString = "Cidade: " + this.localidade + "\n" + "Bairro: " + this.bairro + "\n" + "Rua: " + this.logradouro;
        }
        return printToString;
    }

}
