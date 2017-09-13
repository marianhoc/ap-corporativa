/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import br.uff.dac.t1.controleprojetos.model.Aluno;
import br.uff.dac.t1.controleprojetos.model.ECurso;
import br.uff.dac.t1.controleprojetos.model.ETurno;
import br.uff.dac.t1.controleprojetos.model.Turma;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author felipe
 */
public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Turma turma = new Turma();
        List<Aluno> la = new ArrayList<>();
       
        
        aluno.setCpf("12345678911");
        aluno.setCr(8.0f);
        aluno.setCurso(ECurso.SI);
        aluno.setMatricula("115083000");
        aluno.setNome("Mariano Copes");
        
        turma.setCodigo("123");
        turma.setPeriodo("8");
        turma.setSala("205");
        turma.setTurno(ETurno.T);
        la.add(aluno);
        turma.setAlunos(la);
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetosPU");
        EntityManager em = emf.createEntityManager();
        
        
        EntityTransaction et = em.getTransaction();
        
        et.begin();
        em.persist(turma);
        em.persist(aluno);
        
        
        et.commit();
        
        em.close();
        emf.close();
    }
    
}
