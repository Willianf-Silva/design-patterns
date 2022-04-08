package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends DescontoHandler{
	
	/**
	 * Recebe o proximo desconto e delega para a classe mae resolver
	 * @param proximo
	 */
	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(DescontoHandler proximo) {
		super(proximo);
	}

	/**
	 * Realiza o calculo necessário para esse desconto
	 * Se não for aplicado, ele chama o próximo desconto
	 */
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		return proximo.calcular(orcamento);
	};
}
