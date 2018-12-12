package br.edu.ifms.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.edu.ifms.dao.LancamentoDAO;
import br.edu.ifms.model.LancamentoDTO;

@ManagedBean
public class ConsultaLancamentoBean implements Serializable {

	private List<String> lancamentos = new ArrayList<String>();
	private LancamentoDAO lancamentoDAO = new LancamentoDAO();
	
	@PostConstruct
	public void inicializar() {
		for (int i = 0; i < 20; i++) {
			lancamentos.add("");
		}
	}

	public List<LancamentoDTO> getLancamentos() {
		List<LancamentoDTO> lancamentosNovo = this.lancamentoDAO.getLancamentos();
		
		return lancamentosNovo;
	}
}