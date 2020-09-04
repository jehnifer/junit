package br.edu.ifg.junit.introduction.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ifg.junit.introduction.Lance;
import br.edu.ifg.junit.introduction.Leilao;

public class LeilaoTest {
	
	
	@Test
	public void deveCalcularValorLance() {
		Leilao leilao = new Leilao();
		double valor = leilao.calculaValorLance(5, 0.1);
		//retorno esperado é 5.5
		assertEquals(5.5, valor, 0);
	}
	
	@Test
	public void deveAdicionarNovoLance() {
		Leilao leilao = new Leilao();
		Lance lance = new Lance("Kenyo", 200.00);
		leilao.efetuaLance(lance);
		Lance ultimoLance = leilao.ultimoLance();
		assertEquals(lance, ultimoLance);
	}
	
	@Test
	public void deveRetornarMaiorLanceQuandoNenhumLanceForEfetuado() {
		Leilao leilao = new Leilao();
		
		Lance maiorLance = leilao.retornaMaiorLance();
		assertEquals(0.00, maiorLance.getValor(), 0);
	}
	
	@Test
	public void deveRetornarMaiorLanceQuandoApenasUmLanceForEfetuado() {
		Leilao leilao = new Leilao();
		Lance kenyo = new Lance("Kenyo", 200.00);
		
		leilao.efetuaLance(kenyo);
		
		Lance maiorLance = leilao.retornaMaiorLance();
		assertEquals(200.00, maiorLance.getValor(), 0);
	}
	
	@Test
	public void deveRetornarMaiorLanceQuandoApenasDoisLanceForEfetuado() {
		Leilao leilao = new Leilao();
		Lance kenyo = new Lance("Kenyo", 200.00);
		Lance vitor = new Lance("Vitor", 300.00);

		leilao.efetuaLance(kenyo);
		leilao.efetuaLance(vitor);
		
		Lance maiorLance = leilao.retornaMaiorLance();
		assertEquals(300.00, maiorLance.getValor(), 0);
	}
	
	@Test
	public void deveRetornarMaiorLanceQuandoApenasTresLanceForEfetuado() {
		Leilao leilao = new Leilao();
		Lance kenyo = new Lance("Kenyo", 200.00);
		Lance vitor = new Lance("Vitor", 300.00);
		Lance helena = new Lance("Helena", 400.00);
		leilao.efetuaLance(kenyo);
		leilao.efetuaLance(vitor);
		leilao.efetuaLance(helena);
		
		Lance maiorLance = leilao.retornaMaiorLance();
		assertEquals(400.00, maiorLance.getValor(), 0);
	}

}
