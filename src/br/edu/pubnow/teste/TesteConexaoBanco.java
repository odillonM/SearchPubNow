package br.edu.pubnow.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.edu.pubnow.conexaoBanco.ConnectionFactory;

public class TesteConexaoBanco {

	public static void main(String[] args)throws SQLException {
		Connection conexao = ConnectionFactory.getInstance().getConnection();
		conexao.close();

	}

}
