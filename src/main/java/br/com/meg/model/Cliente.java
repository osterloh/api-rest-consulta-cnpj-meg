package br.com.meg.model;

public class Cliente {

	private long cgc_9;
	private long cgc_4;
	private long cgc_2;
	private String nome_cliente;
	private String fantasia_cliente;
	private String endereco_cliente;
	private String bairro;
	private String data_cad_cliente;
	private int cep_cliente;

	public Cliente() {

	}

	public long getCgc_9() {
		return cgc_9;
	}

	public void setCgc_9(long cgc_9) {
		this.cgc_9 = cgc_9;
	}

	public long getCgc_4() {
		return cgc_4;
	}

	public void setCgc_4(long cgc_4) {
		this.cgc_4 = cgc_4;
	}

	public long getCgc_2() {
		return cgc_2;
	}

	public void setCgc_2(long cgc_2) {
		this.cgc_2 = cgc_2;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getFantasia_cliente() {
		return fantasia_cliente;
	}

	public void setFantasia_cliente(String fantasia_cliente) {
		this.fantasia_cliente = fantasia_cliente;
	}

	public String getEndereco_cliente() {
		return endereco_cliente;
	}

	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getData_cad_cliente() {
		return data_cad_cliente;
	}

	public void setData_cad_cliente(String data_cad_cliente) {
		this.data_cad_cliente = data_cad_cliente;
	}

	public int getCep_cliente() {
		return cep_cliente;
	}

	public void setCep_cliente(int cep_cliente) {
		this.cep_cliente = cep_cliente;
	}

	@Override
	public String toString() {
		return "Cliente [cgc_9=" + cgc_9 + ", cgc_4=" + cgc_4 + ", cgc_2=" + cgc_2 + ", nome_cliente=" + nome_cliente
				+ ", fantasia_cliente=" + fantasia_cliente + ", endereco_cliente=" + endereco_cliente + ", bairro="
				+ bairro + ", data_cad_cliente=" + data_cad_cliente + ", cep_cliente=" + cep_cliente + "]";
	}

}
