package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

/**
 * As classes filhas devem herdar a classe m�e e deve implementar somente os m�todos que 
 * possibilita a transi��o de estado, por exemplo, se um or�amento est� �Reprovado� 
 * a possibilidade para ele ser� somente �finalizar�
 * @author willian
 *
 */
public class Reprovado extends SituacaoOrcamento {
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
