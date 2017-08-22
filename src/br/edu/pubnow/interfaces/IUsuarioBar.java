package br.edu.pubnow.interfaces;

import java.util.List;

import br.edu.pubnow.entidades.UsuarioBar;

public interface IUsuarioBar {
	
	void cadastrarUsuarioBar(UsuarioBar usuarioBar);
	void alterarUsuarioBar(UsuarioBar usuarioBar);
	void excluirUsuarioBar(int id);
	UsuarioBar consultarUsuarioBar(int id);
	List<UsuarioBar> listarUsuarioBar();

}
