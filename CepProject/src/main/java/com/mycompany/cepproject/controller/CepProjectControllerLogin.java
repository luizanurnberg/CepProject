/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepproject.controller;

import com.mycompany.cepproject.exception.CepProjectEmptyFieldException;
import com.mycompany.cepproject.view.CepProjectViewLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author luizanurnberg
 */
public class CepProjectControllerLogin {

    CepProjectViewLogin cepProjectViewLogin;
    CepProjectController cepProjectController;

    public CepProjectControllerLogin(CepProjectViewLogin cepProjectViewLogin, CepProjectController cepProjectController) {
        this.cepProjectViewLogin = cepProjectViewLogin;
        this.cepProjectController = cepProjectController;
        activateLoginButton();
    }

    //Define as acões que serão executadas ao clicar no botão de Entrar
    public void loginButton() {
        try {
            String emailLoginView = cepProjectViewLogin.getLoginEmail();
            String passwordView = cepProjectViewLogin.getLoginPassword();
            validateLogin();
            cepProjectController.setCepView();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(cepProjectViewLogin, e);
        }
    }

    //Ao setar esse método no main, será possível ver a tela
    public void setLoginView() {
        cepProjectViewLogin.setVisible(true);
    }

    //Ativa o botão de Entrar conforme as regras definidas acima
    public void activateLoginButton() {
        cepProjectViewLogin.setLoginButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginButton();
            }
        });
    }

    //Valida se o usuário inseriu o campo de senha ou e-mail em branco
    public void validateLogin() throws CepProjectEmptyFieldException {
        if (cepProjectViewLogin.getLoginEmail().isBlank() || cepProjectViewLogin.getLoginPassword().isBlank()) {
            throw new CepProjectEmptyFieldException();
        }
    }
}
