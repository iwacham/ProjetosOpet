package br.local.iwacham.classe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public void adicionaDia(int qtdDias) throws ParseException {
		int mesTemporario = 0;
		int dataSeparada[] = new int[3];
		int fevereiro = 0;
		Date ndata = new Date();
		SimpleDateFormat sData = new SimpleDateFormat("dd/MM/yyyy");
		
		//String cData = sData.format(sData.parse("30/04/2017"));
		String cData = sData.format(ndata);
		System.out.println(cData);

		// Remove todas as /
		cData = cData.replaceAll("/", "");

		// Dia
		dataSeparada[0] = Integer.valueOf(cData.substring(0, 2));

		// Mês
		dataSeparada[1] = Integer.valueOf(cData.substring(2, 4));

		// Ano
		dataSeparada[2] = Integer.valueOf(cData.substring(4, 8));

		// Meses com 31
		String[] mesesComTrintaUm = { "01", "03", "05", "07", "08", "10", "12" };

		// Meses com 30
		String[] mesesComTrinta = { "04", "06", "09", "11" };

		// Ano bisexto
		if(dataSeparada[2] % 4 == 0){
			fevereiro = 02;
			
			//Define o mês como bixesto
		}else{
			//Não é mês bixesto
		}

		// Condição para virada do ano
		if (dataSeparada[1] == 12 && dataSeparada[0] == 31) {
			dataSeparada[2]++;
		}

		// Condição para virada de mês

		// Laço para meses com 31 dias
		for (int x = 0; x <= 6; x++) {
			if (String.valueOf(dataSeparada[1]).equals(mesesComTrintaUm[x])) {
				mesTemporario = Integer.valueOf(mesesComTrintaUm[x]);
			}
		}

		// Laço para meses com 30 dias
		for (int x = 0; x <= 3; x++) {
			if (String.valueOf(dataSeparada[1]).equals(mesesComTrinta[x])) {
				mesTemporario = Integer.valueOf(mesesComTrinta[x]);
			}
		}

		//Condição para fevereiro
		if (dataSeparada[1] == fevereiro) {
			mesTemporario = fevereiro;
		}

		//Depois das verificações, adiciona o novo valor ao mês
		if (dataSeparada[0] == mesTemporario) {
			dataSeparada[1]++;
		}

		//Adiciona os dias desejados a data
		dataSeparada[0] = dataSeparada[0] + qtdDias;

		//Monta a nova data
		cData = String.valueOf(dataSeparada[0] + "/" + dataSeparada[1] + "/" + dataSeparada[2]);

		Date novaData = sData.parse(cData);
		cData = sData.format(novaData);
		
		//Imprimi a nova data
		System.out.println(cData);
	}

}
