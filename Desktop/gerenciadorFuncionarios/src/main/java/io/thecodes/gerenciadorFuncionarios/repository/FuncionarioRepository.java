package io.thecodes.gerenciadorFuncionarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.thecodes.gerenciadorFuncionarios.models.Funcionario;
import io.thecodes.gerenciadorFuncionarios.models.FuncionarioSetor;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
	List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);

}
