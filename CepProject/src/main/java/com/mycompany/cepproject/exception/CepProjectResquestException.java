/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepproject.exception;

/**
 *
 * @author luizanurnberg
 */
public class CepProjectResquestException extends Exception {

    public CepProjectResquestException() {
        super("Erro na requisição, verifique se o CEP inserido está correto");
    }

}
