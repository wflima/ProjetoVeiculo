package br.com.modelo;

public class Veiculo {

	private Long id_veiculo;
	private String modelo_veiculo;
	private String placa_veiculo;
	private String marca_veiculo;
	private String ano_fabr_veiculo;

	public Veiculo() {
	}

	public Veiculo(Long id_veiculo, String modelo_veiculo, String placa_veiculo,
			String marca_veiculo, String ano_fabr_veiculo) {
		super();
		this.id_veiculo = id_veiculo;
		this.modelo_veiculo = modelo_veiculo;
		this.placa_veiculo = placa_veiculo;
		this.marca_veiculo = marca_veiculo;
		this.ano_fabr_veiculo = ano_fabr_veiculo;
	}

	public Long getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(Long id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public String getModelo_veiculo() {
		return modelo_veiculo;
	}

	public void setModelo_veiculo(String modelo_veiculo) {
		this.modelo_veiculo = modelo_veiculo;
	}

	public String getPlaca_veiculo() {
		return placa_veiculo;
	}

	public void setPlaca_veiculo(String placa_veiculo) {
		this.placa_veiculo = placa_veiculo;
	}

	public String getMarca_veiculo() {
		return marca_veiculo;
	}

	public void setMarca_veiculo(String marca_veiculo) {
		this.marca_veiculo = marca_veiculo;
	}

	public String getAno_fabr_veiculo() {
		return ano_fabr_veiculo;
	}

	public void setAno_fabr_veiculo(String ano_fabr_veiculo) {
		this.ano_fabr_veiculo = ano_fabr_veiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((id_veiculo == null) ? 0 : id_veiculo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id_veiculo == null) {
			if (other.id_veiculo != null)
				return false;
		} else if (!id_veiculo.equals(other.id_veiculo))
			return false;
		return true;
	}



}
