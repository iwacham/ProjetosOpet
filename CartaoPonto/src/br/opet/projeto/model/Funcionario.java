package br.opet.projeto.model;

import java.util.Date;

public class Funcionario extends Pessoa {
	private int id;
	private String cargo;
	private String enderecoCompleto;

	public Funcionario(String nome, Date dtNiver, long cpf, int telefone, int id, String cargo, String enderecoCompleto) {
		super(nome, dtNiver, cpf, telefone);
		this.id = id;
		this.cargo = cargo;
		this.enderecoCompleto = enderecoCompleto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

}
