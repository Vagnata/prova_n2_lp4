package br.edu.ifms.dao;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifms.model.LancamentoDTO;

public class LancamentoDAO {
	private List<LancamentoDTO> listaLancamentos = new ArrayList<LancamentoDTO>();
	
	public void adicionar(LancamentoDTO lancamento) {
		listaLancamentos.add(lancamento);
		System.out.println("Adicionado na lista com sucesso!");
	}
	
	public void remove(LancamentoDTO lacamento) {
		listaLancamentos.remove(lacamento);
		System.out.println("Removido com sucesso!");
	}
	
	public List<LancamentoDTO> getLancamentos() {
		return listaLancamentos;
	}
}
