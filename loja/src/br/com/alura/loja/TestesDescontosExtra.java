package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontosExtra {

	public static void main(String[] args) {
		testaAplicarDescontoETransitarEntreTodosEstados();
		testaOrdemEstadoInvalido();
	}

	/**
	 * M�todo para testar ordem de estado inv�lido, ou seja, ap�s aprova��o n�o � poss�vel reprovar
	 */
	private static void testaOrdemEstadoInvalido() {
		System.out.println("\nINICIANDO testaOrdemEstadoInvalido()");
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 5);
		orcamento.aprovar();
		orcamento.reprovar();
	}

	/**
	 * M�todo aplicando todos os descontos e passando por todos os estados
	 */
	private static void testaAplicarDescontoETransitarEntreTodosEstados() {
		System.out.println("\nINICIANDO testaAplicarDescontoETransitarEntreTodosEstados()");
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 5);
		System.out.println(orcamento.getSituacao());
		System.out.println(orcamento.getValor());
		orcamento.aplicarDescontoExtra();
		orcamento.aprovar();
		System.out.println(orcamento.getValor());
		System.out.println(orcamento.getSituacao());
		orcamento.aplicarDescontoExtra();
		System.out.println(orcamento.getValor());
		orcamento.finalizar();
		System.out.println(orcamento.getSituacao());
	}

}
