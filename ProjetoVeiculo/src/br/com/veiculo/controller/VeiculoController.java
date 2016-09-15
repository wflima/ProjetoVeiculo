package br.com.veiculo.controller;

import java.sql.SQLException;



import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.modelo.Veiculo;
import br.com.salvar.veculo.VeiculoDao;

@ManagedBean
@SessionScoped
public class VeiculoController {

	private Veiculo veiculo;
	private VeiculoDao dao;

	public VeiculoController() {
		veiculo = new Veiculo();
		dao = new VeiculoDao();

	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public VeiculoDao getDao() {
		return dao;
	}

	public void setDao(VeiculoDao dao) {
		this.dao = dao;
	}

	public void limparCampos() {
		veiculo = new Veiculo();
	}

	public String salvarVeiculo() {
		if (veiculo.getId_veiculo() != null && veiculo.getId_veiculo() > 0) {
			try {
				dao.alterarVeiculo(veiculo);
				FacesMessage mensagem = new FacesMessage(
						"Alteração realizada com Sucesso");
				FacesContext.getCurrentInstance().addMessage(null, mensagem);
				limparCampos();
			} catch (ClassNotFoundException e) {
				FacesMessage messagem = new FacesMessage(e.getMessage());
				FacesContext.getCurrentInstance().addMessage(null, messagem);
				e.printStackTrace();
			} catch (SQLException e) {
				FacesMessage messagem = new FacesMessage(e.getMessage());
				FacesContext.getCurrentInstance().addMessage(null, messagem);
				e.printStackTrace();
			}
		} else {
			try {
				dao.salvarVeiculo(veiculo);
				FacesMessage mensagem = new FacesMessage(
						"Inclusão realizada com Sucesso");
				FacesContext.getCurrentInstance().addMessage(null, mensagem);
				limparCampos();
			} catch (ClassNotFoundException e) {
				FacesMessage messagem = new FacesMessage(e.getMessage());
				FacesContext.getCurrentInstance().addMessage(null, messagem);
				e.printStackTrace();
			} catch (SQLException e) {
				FacesMessage messagem = new FacesMessage(e.getMessage());
				FacesContext.getCurrentInstance().addMessage(null, messagem);
				e.printStackTrace();
			}
		}
		return "Veiculos.xhtml";
	}

	public String removerVeiculo(Veiculo veiculo) {
		try {
			dao.removerVeiculo(veiculo);
			FacesMessage mensagem = new FacesMessage(
					"Exclusão realizada com Sucesso");
			FacesContext.getCurrentInstance().addMessage(null, mensagem);
			limparCampos();
		} catch (ClassNotFoundException e) {
			FacesMessage messagem = new FacesMessage(e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null, messagem);
			e.printStackTrace();
		} catch (SQLException e) {
			FacesMessage messagem = new FacesMessage(e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null, messagem);
			e.printStackTrace();
		}
		return "Veiculos.xhtml";
	}
	public String editarVeiculo(Veiculo veiculo){
		this.veiculo = veiculo;
		return "Veiculos.xhtml";
		
	}
	
}




