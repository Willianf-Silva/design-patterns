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
	 * Realiza o calculo necess�rio para esse desconto
	 */
	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	/**
	 * L�gica para aplicar esse tipo de desconto
	 */
	@Override
	public boolean deveAplicarDesconto(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	};
}
