package br.opet.projeto.homologacao;

import java.sql.SQLException;

import br.opet.projeto.controller.FuncionarioController;
import br.opet.projeto.model.Funcionario;

public class App {

	public static void main(String[] args) {
		FuncionarioController fc = new FuncionarioController();

		for (Funcionario func : fc.listarTodos()) {
			System.out.println(func.getNome());
		}

	}

}
