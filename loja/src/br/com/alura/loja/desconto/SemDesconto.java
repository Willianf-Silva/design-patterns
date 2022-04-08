package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends DescontoHandler {

	/**
	 * Não recebe nada no construtor e passa null para a classe mae encerrar o fluxo
	 */
	public SemDesconto() {
		super(null);
	}

	/**
	 * Retorna zero informando que não existe desconto
	 */
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	};
}
