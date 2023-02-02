/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepproject.controller;

import com.mycompany.cepproject.exception.CepProjectEmptyFieldException;
import com.mycompany.cepproject.view.CepProjectViewSignUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author luizanurnberg
 */
public class CepProjectControllerSignUp {

    CepProjectController cepProjectControllerCepOnSignUp;
    CepProjectViewSignUp cepProjectViewSignUp;

    public CepProjectControllerSignUp(CepProjectController cepProjectControllerCepOnSignUp, CepProjectViewSignUp cepProjectViewSignUp) {
        this.cepProjectControllerCepOnSignUp = cepProjectControllerCepOnSignUp;
        this.cepProjectViewSignUp = cepProjectViewSignUp;
        activateSignUpButton();
    }

    //Ao setar esse método no main, será possível ver a tela
    public void setSignUpView() {
        cepProjectViewSignUp.setVisible(true);
    }

    //Define as acões que serão executadas ao clicar no botão de Cadastrar
    public void signUpButton() {
        try {
            validateSignUp();
            cepProjectControllerCepOnSignUp.setCepView();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(cepProjectViewSignUp, e);
        }
    }

    //Ativa o botão de Cadastrar conforme as regras definidas acima
    public void activateSignUpButton() {
        cepProjectViewSignUp.setSignUpButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signUpButton();
            }
        });
    }

    //Valida se o usuário inseriu o campo de email, nome ou senha em branco
    public void validateSignUp() throws CepProjectEmptyFieldException {
        if (cepProjectViewSignUp.getSignUpEmail().isBlank() || cepProjectViewSignUp.getSignUpName().isBlank() || cepProjectViewSignUp.getSignUpPassword().isBlank()) {
            throw new CepProjectEmptyFieldException();
        }
    }

}
