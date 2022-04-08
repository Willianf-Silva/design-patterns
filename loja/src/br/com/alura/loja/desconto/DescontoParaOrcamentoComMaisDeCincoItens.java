package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends DescontoHandler{
	
	/**
	 * Recebe o proximo desconto e delega para a classe mae resolver
	 * @param proximo
	 */
	public DescontoParaOrcamentoComMaisDeCincoItens(DescontoHandler proximo) {
		super(proximo);
	}

	/**
	 * Realiza o calculo necessário para esse desconto
	 * Se não for aplicado, ele chama o próximo desconto
	 */
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		return proximo.calcular(orcamento);
	};
}
