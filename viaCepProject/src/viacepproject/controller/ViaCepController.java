/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viacepproject.controller;

import viacepproject.view.ViaCepView;

/**
 *
 * @author luizanurnberg
 */
public class ViaCepController {
    
    private ViaCepView viaCepView;

    public ViaCepController(ViaCepView viaCepView) {
        this.viaCepView = viaCepView;
    }
    //Definirá as ações que serão executadas ao clicar no botão de Procurar
    public void lookButton(){
        try{
            String insertedCep = viaCepView.getCep();
            
        }catch(){
            
        }
    }
    
}
