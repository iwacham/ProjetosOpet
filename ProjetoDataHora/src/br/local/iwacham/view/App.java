package br.local.iwacham.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.local.iwacham.classe.Data;
import br.local.iwacham.classe.Hora;

public class App {
	public static void main(String[] args) {
		Date ndata = new Date();
		SimpleDateFormat sData = new SimpleDateFormat("dd/MM/yyyy");
		String cData = sData.format(ndata);
		Data d = new Data();
		try {
			d.adicionaDia(10);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Hora hora = new Hora();
//		hora.adicionaSegundos(20);
	}
}
