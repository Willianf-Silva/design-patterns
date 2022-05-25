package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	private BigDecimal valor;
	private int quantidadeItens;
	private String situacao;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = BigDecimal.ZERO;		
		if (situacao.equals("EM ANALISE")) {
			valorDescontoExtra = new BigDecimal("0.05");
		}else if (situacao.equals("APROVADO")) {
			valorDescontoExtra = new BigDecimal("0.05");
		}
		
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao = "APROVAR";
	}
}