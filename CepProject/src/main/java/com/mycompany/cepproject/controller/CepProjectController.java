/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepproject.controller;

import com.mycompany.cepproject.view.CepProjectView;
import com.google.gson.Gson;
import com.mycompany.cepproject.model.CepProjectModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author luizanurnberg
 */
public class CepProjectController {

    private CepProjectView cepProjectView;
    private static String webService = "http://viacep.com.br/ws/";
    private static int successRequestCode = 200;

    public CepProjectController(CepProjectView cepProjetcView) {
        this.cepProjectView = cepProjetcView;
        activateSearchButton();
    }

    //Define as acões que serão executadas ao clicar no botão de Procurar
    public void searchingCep() {
        try {
            String insertedCep = cepProjectView.getCep();
            String callToUrl = webService + insertedCep + "/json";
            exceptionMessageBlankSpace();
            URL url = new URL(callToUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            if (connection.getResponseCode() != successRequestCode) {
                throw new Exception("Erro na requisição, verifique se o CEP inserido está correto");
            } else {
                BufferedReader response = new BufferedReader(new InputStreamReader((connection.getInputStream())));
                String jsonToString = convertJsonToString(response);
                Gson gson = new Gson();
                CepProjectModel adress = gson.fromJson(jsonToString, CepProjectModel.class);
                cepProjectView.setTextArea(adress.toString());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    //Ativa o botão de Procurar conforme as regras definidas acima
    public void activateSearchButton() {
        cepProjectView.setSearchbutton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchingCep();
            }
        });

    }

    //Converterá as respostas da request para String
    public String convertJsonToString(BufferedReader buffereReader) throws IOException {
        String response, jSonToString = "";
        while ((response = buffereReader.readLine()) != null) {
            jSonToString += response;
        }
        return jSonToString;
    }

    //Valida se o usuário inseriu o campo CEP em branco
    public void exceptionMessageBlankSpace() throws Exception {
        if (cepProjectView.getCep().isBlank() || cepProjectView.getCep().isEmpty()) {
            throw new Exception("O campo do CEP está vazio, para ter acesso ao serviço é necessário que ele seja preenchido");
        }
    }

    //Ao setar esse método no main, será possível ver a tela
    public void setView() {
        cepProjectView.setVisible(true);
    }

}
