/*
 * @Autor = Tiago Henrique Iwamoto
 * @Email = ti.breakout@gmail.com
 * @Obs = Trabalho academico da Faculdade Opet
 * @Objetivo = Criar uma sequencia fibonacci utilizando conceitos de orientação a objetos
 */
package br.opet.tds162a.trabalho.fibonacci;

public class App {
	/*
	 * Inicio do programa
	 */
	public static void main(String[] args) {
		
		//Titulo do programa
		System.out.println(":::::::::::::::::: Programa Fibonacci ::::::::::::::::::\n\n");
		
		/**
		 * Faço o instanciamento da classe Calculo para criar um objeto baseado na classe Calculo
		 * Definindo um valor inicial utilizando o construtor criado na classe. 
		 */
		Calculo fb = new Calculo(0);
		
		/**
		 * Utilizando os metodos Getters eu imprimo na tela os valores gravados nos atributos
		 */
		System.out.println(":::::::::::::::::: Numero inicial = " + fb.getNumeroAtual() + " ::::::::::::::::::\n:::::::::::::::::: Próximo numero = " + fb.getProximoNumero() + " ::::::::::::::::::\n\n");
		
		/**
		 * Chamo o metodo calculaFibonacci e o mesmo me retorna a lista de valores gravados
		 */
		System.out.println("::::::" + fb.calculaFibonacci() + "::::::");
	}

}
