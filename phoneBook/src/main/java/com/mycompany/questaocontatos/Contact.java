/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questaocontatos;

/**
 *
 * @author luizanurnberg
 */
public class Contact {

    private String contactName;
    private String contactPhoneNumber;

    public Contact(String contactName, String contactPhoneNumber) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactPhoneNumber() {
        return this.contactPhoneNumber;
    }

    @Override
    public String toString() {
        return "Nome: " + this.contactName + " | Telefone: " + this.contactPhoneNumber;
    }

}
