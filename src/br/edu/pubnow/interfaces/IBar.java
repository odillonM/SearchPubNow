package br.edu.pubnow.interfaces;

import br.edu.pubnow.entidades.Bar;

public interface IBar {
	
	void cadastrarBar(Bar bar);
	void alterarBar(Bar bar);
	void excluirBar(int id);
	Bar consultarBar(int id);

}
