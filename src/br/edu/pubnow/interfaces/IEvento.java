package br.edu.pubnow.interfaces;

import java.util.List;

import br.edu.pubnow.entidades.EventoBar;

public interface IEvento {
	
	void cadastrarEvento(EventoBar evento);
	void alterarEvento(EventoBar evento);
	void excluirEvento(int id);
	EventoBar consultarEvento(int id);
	List<EventoBar> listarEvento();

}
