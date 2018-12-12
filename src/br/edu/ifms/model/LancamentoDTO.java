package br.edu.ifms.model;

import java.math.BigDecimal;
import java.util.Date;

public class LancamentoDTO {
	private String nomePessoa;
	private String descricaoLancamento;
	private BigDecimal valorLancamento;
	private Date vencimentoLancamento;
	private Date pagamentoLancamento;
	private boolean situacaoLancamento;

	public LancamentoDTO(String nomePessoa, String descricaoLancamento, BigDecimal valorLancamento,
			Date vencimentoLancamento, Date pagamentoLancamento, boolean situacaoLancamento) {
		super();
		this.nomePessoa = nomePessoa;
		this.descricaoLancamento = descricaoLancamento;
		this.valorLancamento = valorLancamento;
		this.vencimentoLancamento = vencimentoLancamento;
		this.pagamentoLancamento = pagamentoLancamento;
		this.situacaoLancamento = situacaoLancamento;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getDescricaoLancamento() {
		return descricaoLancamento;
	}

	public void setDescricaoLancamento(String descricaoLancamento) {
		this.descricaoLancamento = descricaoLancamento;
	}

	public BigDecimal getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(BigDecimal valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public Date getVencimentoLancamento() {
		return vencimentoLancamento;
	}

	public void setVencimentoLancamento(Date vencimentoLancamento) {
		this.vencimentoLancamento = vencimentoLancamento;
	}

	public Date getPagamentoLancamento() {
		return pagamentoLancamento;
	}

	public void setPagamentoLancamento(Date pagamentoLancamento) {
		this.pagamentoLancamento = pagamentoLancamento;
	}

	public boolean isSituacaoLancamento() {
		return situacaoLancamento;
	}

	public void setSituacaoLancamento(boolean situacaoLancamento) {
		this.situacaoLancamento = situacaoLancamento;
	}
}
