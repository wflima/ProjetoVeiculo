package br.com.salvar.veculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.conexao.Conexao;
import br.com.modelo.Veiculo;

public class VeiculoDao {

	public void salvarVeiculo(Veiculo veiculo) throws ClassNotFoundException,
			SQLException {

		Conexao conexao = new Conexao();
		Connection con = conexao.conectarAoBancoDeDados();
		String sql = "INSERT INTO veiculo( modelo, placa_veiculo, marca_veiculo, ano_fabrica) "
				+ " VALUES ( ?, ?, ?, ?);";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, veiculo.getModelo_veiculo());
		ps.setString(2, veiculo.getPlaca_veiculo());
		ps.setString(3, veiculo.getMarca_veiculo());
		ps.setString(4, veiculo.getAno_fabr_veiculo());
		ps.executeUpdate();
		ps.close();
		con.close();
	}

	public void alterarVeiculo(Veiculo veiculo) throws ClassNotFoundException,
			SQLException {

		Conexao conexao = new Conexao();
		Connection con = conexao.conectarAoBancoDeDados();
		String sql = "UPDATE veiculo  SET  modelo=?, placa_veiculo=?, marca_veiculo=?,"
				+ " ano_fabrica=? WHERE id=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, veiculo.getModelo_veiculo());
		ps.setString(3, veiculo.getPlaca_veiculo());
		ps.setString(2, veiculo.getMarca_veiculo());
		ps.setString(4, veiculo.getAno_fabr_veiculo());
		ps.setLong(5, veiculo.getId_veiculo());
		ps.executeUpdate();
		ps.close();
		con.close();

	}

	public void removerVeiculo(Veiculo veiculo) throws ClassNotFoundException,
			SQLException {

		Conexao conexao = new Conexao();
		Connection con = conexao.conectarAoBancoDeDados();
		String sql = "DELETE FROM veiculo WHERE id=?;";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setLong(1, veiculo.getId_veiculo());
		ps.executeUpdate();
		ps.close();
		con.close();
	}
}
