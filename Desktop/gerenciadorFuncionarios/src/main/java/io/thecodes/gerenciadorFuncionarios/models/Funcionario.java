package io.thecodes.gerenciadorFuncionarios.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor 
public class Funcionario {
	
	@Id //javax.persistence.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;
    private String cargo;
    private BigDecimal salario;
   

    @Enumerated(EnumType.STRING)
    private FuncionarioSetor setor;

    
    public void setSetor(FuncionarioSetor setor) {
        this.setor = setor;
    }
   

}
