package io.thecodes.gerenciadorFuncionarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;
import io.thecodes.gerenciadorFuncionarios.models.Funcionario;
import io.thecodes.gerenciadorFuncionarios.models.FuncionarioSetor;
import io.thecodes.gerenciadorFuncionarios.repository.FuncionarioRepository;

@Controller
public class HomeController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@GetMapping("/home")
	    public String home(Model model) {
	    	List<Funcionario> funcionarios = funcionarioRepository.findAll();
	    	
	        model.addAttribute("funcionarios", funcionarios);
	        return "home";
	    }
	
	@GetMapping
    public String setor(@RequestParam String setor, Model model) {
    	FuncionarioSetor funcionarioSetor = FuncionarioSetor.valueOf(setor.toUpperCase());
        List<Funcionario> funcionarios = funcionarioRepository.findBySetor(funcionarioSetor);
       
        model.addAttribute("funcionarios", funcionarios);
        return "home";
    }
}
