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
public enum ETurno {
    M("Manhã"),
    T("Tarde"),
    N("Noite");
    
    private final String turno;
    
    ETurno(String turno){
        this.turno = turno;
    }
    
    public String getTurno(){
        return this.turno;
    }
}
