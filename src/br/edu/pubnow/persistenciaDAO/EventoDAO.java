package br.edu.pubnow.persistenciaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.edu.pubnow.conexaoBanco.ConnectionFactory;
import br.edu.pubnow.entidades.EventoBar;
import br.edu.pubnow.interfaces.IEvento;

public class EventoDAO implements IEvento {
	
	private Connection conexao;
	
	public EventoDAO(){
		 
		this.conexao = new ConnectionFactory().getInstance().getConnection();
		
		
	}

	@Override
	public void cadastrarEvento(EventoBar evento) {
		
		String sql = "INSERT INTO eventobar"
					+"(nomeevento, dataevento, descricaoevento, valorevento)"
					+"values(?,?,?,?)";
		
		try{
			
			//prepara inserção
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			//preenche os valores
			stmt.setString(1, evento.getNomeevento());
			stmt.setString(2, evento.getDataevento()); 
			stmt.setString(3, evento.getDescricaoevento());
			stmt.setInt(4, evento.getValorevento());
			
			//executar inserts
			stmt.execute();
			stmt.close();
			
			System.out.println("EVENTO CRIADO COM SUCESSO");
			
		}catch (SQLException e) {
			
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
	}

	@Override
	public void alterarEvento(EventoBar evento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirEvento(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EventoBar consultarEvento(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EventoBar> listarEvento() {
		// TODO Auto-generated method stub
		return null;
	}

}
