/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.cepproject;

import com.mycompany.cepproject.controller.CepProjectController;
import com.mycompany.cepproject.controller.CepProjectControllerLogin;
import com.mycompany.cepproject.view.CepProjectView;
import com.mycompany.cepproject.view.CepProjectViewLogin;

/**
 *
 * @author luizanurnberg
 */
public class CepProject {

    public static void main(String[] args) {
        CepProjectController cpCep = new CepProjectController(new CepProjectView());
        CepProjectControllerLogin cpLogin = new CepProjectControllerLogin(new CepProjectViewLogin(), cpCep);
        cpLogin.setLoginView();
        
    }
}
