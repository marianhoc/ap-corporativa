/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.dac.t1.controleprojetos.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author felipe
 */
@Entity
public class Aluno extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private ECurso curso;
    private float cr;
    private String matricula;
    
    
    @ManyToMany(cascade = ALL, targetEntity = Turma.class)
    @JoinTable(joinColumns = {@JoinColumn(name = "fk_aluno")}, inverseJoinColumns = {@JoinColumn(name="fk_turma")})
    private List<Turma> turmas;
    
    public Aluno() {
    }    

    public ECurso getCurso() {
        return curso;
    }

    public void setCurso(ECurso curso) {
        this.curso = curso;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", curso=" + curso + ", cr=" + cr + ", matricula=" + matricula + '}';
    }

    public List<Turma> getTurma() {
        return turmas;
    }

    public void setTurma(List<Turma> turma) {
        this.turmas = turma;
    }
  
}
