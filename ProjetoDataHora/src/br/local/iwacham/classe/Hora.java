package br.local.iwacham.classe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hora {
	
	//Defino um array para gravar os valores separados
	private int horaSeparada[] = new int[3];
	Date ndata = new Date();
	SimpleDateFormat sData = new SimpleDateFormat("HH:mm:ss");
	
		public void adicionaSegundos(int valor){
			String cData = sData.format(ndata);
			System.out.println("Hora Original: " + cData);
			
			
			//Removo characteres especiais
			cData = cData.replaceAll(":", "");
			
			// Hora
			horaSeparada[0] = Integer.valueOf(cData.substring(0, 2));

			// Minutos
			horaSeparada[1] = Integer.valueOf(cData.substring(2, 4));

			// Segundos
			horaSeparada[2] = Integer.valueOf(cData.substring(4, 6));
			
			
			
			
			//TODO
			//Condição que limita o valor de segundos e minutos para 59 e Hora para 24
			
			
			
			//Adiciona o valor passado aos Segundos
			horaSeparada[2] = horaSeparada[2] + valor;
			
			//Condição para aumentar minutos
			if(horaSeparada[2] == 59){
				horaSeparada[1]++;
			}
			
			//Condição para aumentar a Hora
			if(horaSeparada[1] == 59 && horaSeparada[2] == 59){
				horaSeparada[0]++;
			}
			
			//Montando a nova hora
			cData = String.valueOf(horaSeparada[0] + ":" + horaSeparada[1] + ":" + horaSeparada[2]);
			System.out.println("Novo Horario: " + cData);
		}
}
