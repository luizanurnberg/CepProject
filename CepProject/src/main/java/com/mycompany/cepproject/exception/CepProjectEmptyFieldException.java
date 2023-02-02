/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepproject.exception;

/**
 *
 * @author luizanurnberg
 */
public class CepProjectEmptyFieldException extends Exception {

    public CepProjectEmptyFieldException() {
        super("O campo do CEP está vazio, para ter acesso ao serviço é necessário que ele seja preenchido");
    }
    
}
