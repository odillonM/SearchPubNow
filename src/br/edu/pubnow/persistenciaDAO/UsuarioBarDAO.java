package br.edu.pubnow.persistenciaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.pubnow.conexaoBanco.ConnectionFactory;
import br.edu.pubnow.entidades.UsuarioBar;

public class UsuarioBarDAO {
	
	private Connection conexao;
	
	public UsuarioBarDAO() throws SQLException {
		this.conexao = ConnectionFactory.getInstance().getConnection();
	}
	
	public UsuarioBar autenticacaoBar(UsuarioBar usuarioBar) {
		UsuarioBar usuBar = null;
			//String sql com os parametros de select para puxar do banco de dados
			String sql= "SELECT * FROM usuariobar WHERE login=? AND senha=?";
			
			//preparando para pegar os valores de login e senha que estão no banco
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql);
				stmt.setString(1, usuarioBar.getLogin());
				stmt.setString(2, usuarioBar.getSenha());
				//retorno da consulta em RESULTSET
				ResultSet resultado=stmt.executeQuery();
				// se tem o registro
				if(resultado.next()) {
					usuarioBar = new UsuarioBar();
					usuarioBar.setLogin(resultado.getString("login"));
					usuarioBar.setSenha(resultado.getString("senha"));
				}
				
			}catch(SQLException e) {
				System.out.println("erro SQL:"+e.getMessage());
			}
		return usuarioBar;
		
	}

}
