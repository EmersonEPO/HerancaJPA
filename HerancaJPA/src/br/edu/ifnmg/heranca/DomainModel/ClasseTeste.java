/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.heranca.DomainModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author emerson
 */
public class ClasseTeste {
    public static void main(String[] args){
        //Iniciar Gerente
        EntityManager manager;
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory("Persistencia");
        manager = factory.createEntityManager();
        
        //Criando uma nova transaçao
        EntityTransaction transacao = manager.getTransaction();
        
        //Teste Com subclasse aluno
       /*
        try{
            //Ininicando transação
            transacao.begin();
            
            Aluno a = new Aluno();
            a.setNome("Emerson Pereira");
            a.setRg(1); //Apenas teste
            a.setCpf(2); //Apenas teste
            a.setMatricula("IFNMG01");
            
            //Persistindo os dados
            manager.persist(a);
            
            //Se tudo ocorreu corretamente sera feito um commit na transação
            transacao.commit();
        }catch(Exception ex){
            transacao.rollback();
            System.out.printf("Erro na transação LINHA 27 - CLASSETESTE");    
        }
        */
        
        //Teste com subclasse Professor
       
         try{
            //Ininicando transação
            transacao.begin();
            
            Professor p = new Professor();
            p.setNome("Emerson Pereira");
            p.setRg(5); //Apenas teste
            p.setCpf(3); //Apenas teste
            p.setSiape("IF225B");
            p.setTitulacao("Tecnologia em Análise e Desenvolvimento de Sistemas");
            
            //Persistindo os dados
            manager.persist(p);
            
            //Se tudo ocorreu corretamente sera feito um commit na transação
            transacao.commit();
        }catch(Exception ex){
            transacao.rollback();
            System.out.printf("Erro na transação LINHA 51 - CLASSETESTE");    
        }
       
    }
    
}
