/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.heranca.DomainModel;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author emerson
 */
@Entity
//Essa parte discriminará qual o tipo de subclasse será representada pelas informações do registro da classe Pessoa
@DiscriminatorValue("Aluno")
//Nome da tabela
@Table(name="Alunos")
public class Aluno extends Pessoa implements Serializable {
  
    //Aqui retido o Id já que ele estará na classe mãe dessa subclasse (No caso Pessoa)
    
    @Column(name="Matricula", length=10)
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + '}';
    }
    
}
