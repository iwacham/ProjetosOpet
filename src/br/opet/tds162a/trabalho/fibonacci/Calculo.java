/*
 * @Autor = Tiago Henrique Iwamoto
 * @Email = ti.breakout@gmail.com
 * @Obs = Trabalho academico da Faculdade Opet
 * @Objetivo = Criar uma sequencia fibonacci utilizando conceitos de orientação a objetos
 */
package br.opet.tds162a.trabalho.fibonacci;

import java.util.ArrayList;
import java.util.List;

//Inicio da Classe Calculo
public class Calculo {
	/*
	 * Defino os atributos que serão utilizados
	 */
	
	/**
	 * numeroAtual sera gravado o valor atual
	 */
	private int numeroAtual;
	
	/**
	 * proximoNumero vai gravar o proximo numero
	 */
	private int proximoNumero;
	
	/**
	 * numeroSuporte ira gravar o resultado da soma do proximoNumero + numeroAtual
	 */
	private int numeroSuporte;
	
	/**
	 * Crio um construtor vazio, em uma eventual necessidade de utilizar o mesmo sem passar parametros.
	 */
	public Calculo(){
		
	}
	
	/**
	 * Este construtor recebe 1 parametro que representa o inicio da sequencia fibonacci
	 * 
	 * @param numeroAtual recebe o parametro numeroAtual
	 * @param proximoNumero recebe o parametro numeroAtual e soma 1
	 */
	public Calculo(int numeroAtual){
		this.numeroAtual = numeroAtual;
		this.proximoNumero = numeroAtual + 1;
	}
	
	/*
	 * Inicio dos metodos Getters and Setters
	 */
	
	/**
	 * Getter do numeroAtual, faz o retorno do valor gravado no atributo numeroAtual
	 * @return
	 */
	public int getNumeroAtual() {
		return numeroAtual;
	}

	/**
	 * Setter do numeroAtual, faz a gravação do valor passado por parametro no atributo numeroAtual
	 * @param numeroAtual
	 */
	public void setNumeroAtual(int numeroAtual) {
		this.numeroAtual = numeroAtual;
	}

	/**
	 * Getter do proximoNumero, faz o retorno do valor gravado no atributo proximoNumero
	 * @return
	 */
	public int getProximoNumero() {
		return proximoNumero;
	}

	/**
	 * Setter do proximoNumero, faz a gravação do valor passado por parametro no atributo proximoNumero
	 * @param proximoNumero
	 */
	public void setProximoNumero(int proximoNumero) {
		this.proximoNumero = proximoNumero;
	}

	/**
	 * Getter do numeroSuporte, faz o retorno do valor gravado no atributo numeroSuporte
	 * @return
	 */
	public int getNumeroSuporte() {
		return numeroSuporte;
	}

	/**
	 * Setter do numeroSuporte, faz a gravação do valor passado por parametro no atributo numeroSuporte
	 * @param numeroSuporte
	 */
	public void setNumeroSuporte(int numeroSuporte) {
		this.numeroSuporte = numeroSuporte;
	}
	
	/*
	 * Inicio dos metodos da classe Calculo
	 */
	
	/**
	 * Metodo responsavel pelo calculo fibonacci
	 * Pega os valores gravados em numeroAtual e proximoNumero e soma
	 * e grava em numeroSuporte
	 * em seguida adiciona o valor de numeroSuporte na lista
	 * por fim gravo os novos valores nos atributos numeroAtual e proximoNumero
	 * @return
	 */
	public List<Integer> calculaFibonacci(){
		List<Integer> lista = new ArrayList<>();
		int valorLimite = 377;
		for(int i = 0; this.numeroSuporte < valorLimite; i++){
			this.numeroSuporte = this.proximoNumero + this.numeroAtual;
			lista.add(this.numeroSuporte);
			this.numeroAtual = this.proximoNumero;
			this.proximoNumero = this.numeroSuporte;
			
		}
		return lista;
	}
}
