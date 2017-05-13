package br.opet.projeto.view;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.opet.projeto.controller.FuncionarioController;
import br.opet.projeto.model.Funcionario;

@ManagedBean(name = "cadastroFuncionario")
@SessionScoped
public class CadastroFuncionarioVB {
	private FuncionarioController funcionarioController;
	private Funcionario funcionario;
	private List<Funcionario> lista;
	private String user;
	private String pass;

	private String nome;
	private Date dtNiver;
	private long cpf;
	private int telefone;

	public void fazerCadastro() {
		funcionario = new Funcionario(nome, dtNiver, cpf, telefone, 0, "NDA", "NDA");
		funcionarioController.inserir(funcionario);
	}

	public void fazerLogin() {
		if (funcionarioController.fazerLogin(user, pass)) {
			System.out.println("Deu certo!");
		} else {
			System.out.println("Login deu errado!");
		}
	}

	public List<Funcionario> getLista() {

		this.lista = funcionarioController.listarTodos();

		return lista;
	}

	public void setLista(List<Funcionario> lista) {
		this.lista = lista;
	}

	public CadastroFuncionarioVB() {
		funcionarioController = new FuncionarioController();
	}

	public FuncionarioController getFuncionarioController() {
		return funcionarioController;
	}

	public void setFuncionarioController(FuncionarioController funcionarioController) {
		this.funcionarioController = funcionarioController;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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
