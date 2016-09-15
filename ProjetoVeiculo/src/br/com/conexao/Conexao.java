package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	public Connection conectarAoBancoDeDados() throws SQLException, ClassNotFoundException {

		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5433/w&d";
		String usaruario = "postgres";
		String senha = "wflima";
		Connection conexao = DriverManager.getConnection(url, usaruario, senha);

		return conexao;
	}
	
	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		try {
			conexao.conectarAoBancoDeDados();
			System.out.print("Conexão estabalecida com sucesso!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
