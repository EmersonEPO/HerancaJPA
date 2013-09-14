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
@DiscriminatorValue("Professor")
//Nome da tabela
@Table(name="Professores") 
public class Professor extends Pessoa implements Serializable {
  
    //Aqui retido o Id já que ele estará na classe mãe dessa subclasse (No caso Pessoa)
    
    @Column(name="Siape")
    private String siape;
    
    @Column(name="Titulacao")
    private String titulacao;

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.siape);
        hash = 53 * hash + Objects.hashCode(this.titulacao);
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
        final Professor other = (Professor) obj;
        if (!Objects.equals(this.siape, other.siape)) {
            return false;
        }
        if (!Objects.equals(this.titulacao, other.titulacao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Professor{" + "siape=" + siape + ", titulacao=" + titulacao + '}';
    }
}
