/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proxectobanco;

/**
 *
 * @author Alex
 */
public class Conta {
    
    private Persoa titular;
    private String numero;
    private float saldo;

    public Conta() {
    }

    public Conta(float saldo) {
        this.saldo = 1000;
    }
    
    public boolean retirar(float valor){
        return true;
    }
    
     public void ingresar(float valor){
    }   

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public Persoa getTitular() {
        return titular;
    }
    public void setTitular(Persoa titular) {
        this.titular = titular;
    }

}
