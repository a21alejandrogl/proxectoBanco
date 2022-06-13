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

    /**
     *
     */
    public Conta() {
    }

    /**
     *
     * @param saldo
     */
    public Conta(float saldo) {
        this.saldo = 1000;
    }
    
    /**
     *
     * @param valor
     * @return
     */
    public boolean retirar(float valor){
        return true;
    }
    
    /**
     *
     * @param valor
     */
    public void ingresar(float valor){
    }   

    /**
     *
     * @return
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public Persoa getTitular() {
        return titular;
    }

    /**
     *
     * @param titular
     */
    public void setTitular(Persoa titular) {
        this.titular = titular;
    }
    
    /**
     *
     * @return
     */
    public float inicializarSaldo(){
        return this.saldo=0.00f;
    }

}
