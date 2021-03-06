package br.edu.ifms.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import br.edu.ifms.dao.LancamentoDAO;
import br.edu.ifms.model.Lancamento;
import br.edu.ifms.model.LancamentoDTO;
import br.edu.ifms.model.Pessoa;
import br.edu.ifms.model.TipoLancamento;
import br.edu.ifms.service.GestaoPessoas;

@ManagedBean
@ViewScoped
public class CadastroLancamentoBean implements Serializable {
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private Lancamento lancamento = new Lancamento();
	private LancamentoDAO lancamentoDAO = new LancamentoDAO();
	
	@PostConstruct
	public void init() {
		GestaoPessoas gestaoPessoas = new GestaoPessoas();
		this.pessoas = gestaoPessoas.listarTodas();
	}
	
	public void lancamentoPagoModificado(ValueChangeEvent event) {
		this.lancamento.setPago((Boolean) event.getNewValue());
		this.lancamento.setDataPagamento(null);
		FacesContext.getCurrentInstance().renderResponse();
	}
	
	public void cadastrar() {
		System.out.println("Tipo: " + this.lancamento.getTipo());
		System.out.println("Pessoa: " + this.lancamento.getPessoa().getNome());
		System.out.println("Descrição: " + this.lancamento.getDescricao());
		System.out.println("Valor: " + this.lancamento.getValor());
		System.out.println("Data vencimento: " + this.lancamento.getDataVencimento());
		System.out.println("Conta paga: " + this.lancamento.isPago());
		System.out.println("Data pagamento: " + this.lancamento.getDataPagamento());
		
		LancamentoDTO lancamentoDTO = new LancamentoDTO(this.lancamento.getPessoa().getNome(), 
				this.lancamento.getDescricao(), this.lancamento.getValor(), this.lancamento.getDataVencimento(), 
				this.lancamento.getDataPagamento(), this.lancamento.isPago());
		
		this.lancamentoDAO.adicionar(lancamentoDTO);
		
		this.lancamento = new Lancamento();
		
		String msg = "Cadastro efetuado com sucesso!";
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
	}
	
	public TipoLancamento[] getTiposLancamentos() {
		return TipoLancamento.values();
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
}