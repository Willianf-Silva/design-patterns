package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

/**
 * As classes filhas devem herdar a classe m�e e deve implementar somente os m�todos que 
 * possibilita a transi��o de estado, por exemplo, se um or�amento est� �Em an�lise� 
 * as possibilidades para ele ser� �Aprovar� ou �Reprovar
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
