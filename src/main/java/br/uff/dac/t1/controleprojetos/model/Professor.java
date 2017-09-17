/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.dac.t1.controleprojetos.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author felipe
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Professor extends Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String siape;

    @OneToMany(mappedBy = "professor")
    private Set<Titulacao> titulacoes;

    @OneToMany(mappedBy = "professor")
    private Set<Disciplina> disciplinas;

    @OneToMany(mappedBy = "professor")
    private Set<Projeto> projetos;

    public Professor() {

    }

    public Professor(String siape, Set<Titulacao> titulacoes, Set<Disciplina> disciplinas, Set<Projeto> projetos) {
        this.siape = siape;
        this.titulacoes = titulacoes;
        this.disciplinas = disciplinas;
        this.projetos = projetos;
    }

    public Set<Titulacao> getTitulacoes() {
        return titulacoes;
    }

    public void setTitulacoes(Set<Titulacao> titulacoes) {
        this.titulacoes = titulacoes;
    }

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Set<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(Set<Projeto> projetos) {
        this.projetos = projetos;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.siape);
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
        final Professor other = (Professor) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.siape, other.siape);
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", siape=" + siape + '}';
    }
    
}
