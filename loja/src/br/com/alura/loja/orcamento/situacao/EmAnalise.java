package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

/**
 * As classes filhas devem herdar a classe mãe e deve implementar somente os métodos que 
 * possibilita a transição de estado, por exemplo, se um orçamento está “Em análise” 
 * as possibilidades para ele será “Aprovar” ou “Reprovar
 * @author willian
 *
 */
public class EmAnalise extends SituacaoOrcamento{

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		System.out.println("Aplicando desconto de 5%");
		return orcamento.getValor().multiply(new BigDecimal("0.05")); 
	}
	
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
}
