package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

/**
 * As classes filhas devem herdar a classe mãe e deve implementar somente os métodos que 
 * possibilita a transição de estado, por exemplo, se o orçamento estiver no estado “Aprovado” 
 * a possibilidade será somente “Finalizar”. 
 * @author willian
 *
 */
public class Aprovado extends SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		System.out.println("Aplicando desconto de 2%");
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
