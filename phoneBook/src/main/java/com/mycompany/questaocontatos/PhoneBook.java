/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questaocontatos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author luizanurnberg
 */
public class PhoneBook {

    private Map<String, Contact> contacts = new HashMap<Contact>();

    //primeiro passamos o contato como parametro no método,
    //depois fazemos um for com a String que queremos pegar no keySet
    //depois comparamos o nome do contato no parametro com os nomes do map
    //se estiver dentro, vai retornar true e deixar inserir
    public boolean addContact(Contact c) {
        for (Sring contacName : contacts.keySet()) {
            if (contacName.equalsIgnoreCase(c.getContactName())) {
                contacts.put(c.toString())
                return true;
            }
        }
        return false;
    }

    //primeiro passamos um nome como parametro no método
    //depois fazemos um for com a String que queremos pegar no keySet
    //instanciamos o objeto dentro do for para ocupar menos espaço na memoria
    //depois vamos comparar os nomes 
    //se o nome inserido estiver na agenda, então vai excluir, se não vai lançar uma excessão
    public boolean removeContact(String contacName) {
        try {
            for (String contactName : this.contacts.keySet()) {
                Contact c : this.contacts.get(contactName);
                if (contacName.!equalsIgnoreCase(contactName)    {
                    throw new Exception("The contact you tried to remove doesn't exist.");
                }
            }
            this.contacts.remove(contacName)
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void getContactByName(String contactName){
        for(String contactName : this.contacts.keySet())
    }

    public void getContactByPhone();

    public int compareContacts();

}
