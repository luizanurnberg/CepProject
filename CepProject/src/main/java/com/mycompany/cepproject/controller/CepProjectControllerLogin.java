/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepproject.controller;

import com.mycompany.cepproject.exception.CepProjectEmptyFieldException;
import com.mycompany.cepproject.view.CepProjectViewLogin;
import com.mycompany.cepproject.view.CepProjectViewSignUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author luizanurnberg
 */
public class CepProjectControllerLogin {

    CepProjectViewLogin cepProjectViewLogin;
    CepProjectController cepProjectControllerCepOnLogin;
    CepProjectControllerSignUp cepProjectControllerSignUpOnLogin;

    public CepProjectControllerLogin(CepProjectViewLogin cepProjectViewLogin, CepProjectController cepProjectControllerCepOnLogin, CepProjectControllerSignUp cepProjectControllerSignUpOnLogin) {
        this.cepProjectViewLogin = cepProjectViewLogin;
        this.cepProjectControllerCepOnLogin = cepProjectControllerCepOnLogin;
        this.cepProjectControllerSignUpOnLogin = cepProjectControllerSignUpOnLogin;
        activateLoginButton();
        activateSignUpButtonOnLogin();
    }

    //Ao setar esse método, será possível visualizar a tela de login
    public void setLoginView() {
        cepProjectViewLogin.setVisible(true);
    }

    //Define as acões que serão executadas ao clicar no botão de Entrar
    public void loginButton() {
        try {
            validateLogin();
            cepProjectControllerCepOnLogin.setCepView();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(cepProjectViewLogin, e);
        }
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

    //Ativa o botão de Cadastre-se, trazendo automaticamente a tela de Cadastro
    public void activateSignUpButtonOnLogin() {
        cepProjectViewLogin.setSignUpButtonOnLogin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cepProjectControllerSignUpOnLogin.setSignUpView();
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
