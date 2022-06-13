/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proxectoempregado;

/**
 *
 * @author Alex
 */
public class Empregado {

    private int id;
    private String nome;
    private String apelido1;
    private String apelido2;
    private double salario;

    public Empregado(int id, String nome, String apelido1, String apelido2, double salario) {
        this.id = id;
        this.nome = nome;
        this.apelido1 = apelido1;
        this.apelido2 = apelido2;
        this.salario = salario;
    }

    public double obtenerSalarioAnual(){
        return salario * 12;
    }
    
    public double incrementarSalario(int porcentaxe){
        return salario + (salario * porcentaxe);
    }
    
    
    
    
    public int getId() {
    return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getApelido1() {
    return apelido1;
    }
    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }
    
    public String getApelido2() {
        return apelido2;
    }
    public void setApelido2(String apelido2) {
        this.apelido2 = apelido2;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    
}
