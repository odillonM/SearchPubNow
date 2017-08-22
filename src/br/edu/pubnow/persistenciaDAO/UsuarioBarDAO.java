package br.edu.pubnow.persistenciaDAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.ConnectionFeatureNotAvailableException;

import br.edu.pubnow.conexaoBanco.ConnectionFactory;
import br.edu.pubnow.entidades.UsuarioBar;
import br.edu.pubnow.interfaces.IUsuarioBar;
import br.edu.pubnow.conexaoBanco.ConnectionFactory;

public class UsuarioBarDAO implements IUsuarioBar {
	
		private Connection conexao;
		
		
	
	public UsuarioBarDAO(){
		
		this.conexao = new ConnectionFactory().getInstance().getConnection();
		
		
	}
	
	@Override
	public void cadastrarUsuarioBar(UsuarioBar usuarioBar) {
		
		
		String sql=	   	"INSERT INTO usuariobar"+
						"(login, senha, nome)"+
						"values(?,?,?)";
		
		try{
			//prepara inserção
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			//preenche os valores
			stmt.setString(1, usuarioBar.getLogin());
			stmt.setString(2, usuarioBar.getSenha());
			stmt.setString(3, usuarioBar.getNome());
			
			//executar inserts
			stmt.execute();
			stmt.close();
			
			System.out.println("CADASTRO REALIZADO COM SUCESSO");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new RuntimeException();
		}
		
				
	}

	@Override
	public void alterarUsuarioBar(UsuarioBar usuarioBar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirUsuarioBar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsuarioBar consultarUsuarioBar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioBar> listarUsuarioBar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
		
	

}
