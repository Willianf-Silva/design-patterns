package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

/**
 * As classes filhas devem herdar a classe mãe e deve implementar somente os métodos que 
 * possibilita a transição de estado, por exemplo, se um orçamento está “Reprovado” 
 * a possibilidade para ele será somente “finalizar”
 * @author willian
 *
 */
public class Reprovado extends SituacaoOrcamento {
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
