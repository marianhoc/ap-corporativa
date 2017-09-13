/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.dac.t1.controleprojetos.model;

/**
 *
 * @author felipe
 */
public enum ECurso {
    SI("Sistemas de Informação"),
    CC("Ciência da Computação"),
    TSC("Tecnologia em Sistemas de Computação");
    
    private final String nome;
    
    ECurso(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
