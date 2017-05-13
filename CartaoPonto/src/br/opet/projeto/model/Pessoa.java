package br.opet.projeto.model;

import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date dtNiver;
	private long cpf;
	private int telefone;

	public Pessoa(String nome, Date dtNiver, long cpf, int telefone) {
		super();
		this.nome = nome;
		this.dtNiver = dtNiver;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtNiver() {
		return dtNiver;
	}

	public void setDtNiver(Date dtNiver) {
		this.dtNiver = dtNiver;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
