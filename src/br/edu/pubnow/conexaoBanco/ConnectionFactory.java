package br.edu.pubnow.conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {
	
	private static volatile ConnectionFactory instancia;
	private Connection conexao;
	
	public ConnectionFactory(){
		
	}

	public Connection getConnection(){
		
		try{
			if(this.conexao==null){
				
				Class.forName("com.mysql.jdbc.Driver");
				conexao = DriverManager.getConnection("jdbc:mysql://localhost/pubnow","root","");
				
				System.out.println("Conexão Efetuada");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conexao;
	}
	
	public static ConnectionFactory getInstance(){
		
		if(instancia == null){
			synchronized (ConnectionFactory.class){
				if(instancia == null){
					instancia = new ConnectionFactory();
				}
			}
		}
		
		return instancia;
		
	
}
}