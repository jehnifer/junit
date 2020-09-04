package br.edu.ifg.junit.introduction;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

	private List<Lance> lances = new ArrayList<Lance>();
	private Lance maiorLance = null;
	
	public double calculaValorLance(double valorLance, double taxa) {
		return valorLance+(valorLance * taxa);
	}

	public void efetuaLance(Lance lance) {
		lances.add(lance);
		if(maiorLance == null) {
			maiorLance = lance;
		}else {
			if(maiorLance.getValor() < lance.getValor()) {
				maiorLance = lance;
			}
		}
	}

	public Lance ultimoLance() {
		return lances.get(lances.size()-1);
	}

	public Lance retornaMaiorLance() {
		if(maiorLance == null) {
			return new Lance("", 0.00);
		}
		return maiorLance;
	}
	

	
}
