package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class DescontoHandler {
	protected DescontoHandler proximo;

	public DescontoHandler(DescontoHandler proximo) {
		this.proximo = proximo;
	}
	
	/*
	 * Template
	 * Método que representa o processo de execução para aplicar o desconto
	 * Primeiro ele verificar se deve aplicar o desconto de acordo com a regra implementada na classe filha
	 * Se for verdadeiro ele aplica o desconto de acordo com a regra implementada na classe filha
	 * Se for falso ele chama a próxima classe filha para realizar o mesmo processamento
	 */
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicarDesconto(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}

	// Métodos que cada classe filha precisa implementar de acordo com a sua lógica
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicarDesconto(Orcamento orcamento);
}