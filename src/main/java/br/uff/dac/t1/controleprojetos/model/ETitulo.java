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
public enum ETitulo {
    BACHAREL("Bacharel"),
    LICENCIADO("Licenciado"),
    TECNOLOGO("Tecnólogo"),
    ESPECIALISTA("Especialista"),    
    MESTRE("Mestre"),
    DOUTOR("Doutor");

    private final String titulo;
    
    ETitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }   
    
}
