package br.com.meg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.meg.model.Cliente;

public class DataBaseController {

	private Cliente cliente;
	private Connection con = null;

	public DataBaseController() {
		con = DataBaseConnect.getInstance().getConnection();
	}

	public void listar(List<Cliente> clientes) {
		String ZERO_9 = "00000000";
		String ZERO_4 = "0000";
		String ZERO_2 = "00";
		try {
			String sql = "select cgc_9, cgc_4, cgc_2, nome_cliente, fantasia_cliente, endereco_cliente, bairro, data_cad_cliente, cep_cliente from pedi_010";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				if (rs.getString("CGC_9").length() >= 9) {
					continue;

				} else {
					cliente = new Cliente();

					cliente.setNome_cliente(rs.getString("NOME_CLIENTE"));
					cliente.setFantasia_cliente(rs.getString("FANTASIA_CLIENTE"));
					cliente.setBairro(rs.getString("BAIRRO"));
					cliente.setEndereco_cliente(rs.getString("ENDERECO_CLIENTE"));
					cliente.setCep_cliente(rs.getInt("CEP_CLIENTE"));
					cliente.setData_cad_cliente(rs.getString("DATA_CAD_CLIENTE"));

					cliente.setCgc_9(ZERO_9.substring(rs.getString("CGC_9").length()) + rs.getString("CGC_9"));
					cliente.setCgc_4(ZERO_4.substring(rs.getString("CGC_4").length()) + rs.getString("CGC_4"));
					cliente.setCgc_2(ZERO_2.substring(rs.getString("CGC_2").length()) + rs.getString("CGC_2"));

					clientes.add(cliente);
				}

			}

		} catch (SQLException e) {
			System.out.println("\n\n##########################################");
			System.out.println("Erro ao carregar os dados!!!");
			System.out.println("##########################################\n\n");
			e.printStackTrace();
		}
	}

	public Cliente buscar(String cnpj) {
		Cliente cliente = new Cliente();
		List<Cliente> clientes = new ArrayList<Cliente>();
		listar(clientes);

		for (int i = 0; i < clientes.size(); i++) {

			String cgc = clientes.get(i).getCgc_9() + clientes.get(i).getCgc_4() + clientes.get(i).getCgc_2();

			if (cgc.equals(cnpj)) {
				cliente.setCgc_9(clientes.get(i).getCgc_9());
				cliente.setCgc_4(clientes.get(i).getCgc_4());
				cliente.setCgc_2(clientes.get(i).getCgc_2());
				cliente.setNome_cliente(clientes.get(i).getNome_cliente());
				cliente.setFantasia_cliente(clientes.get(i).getFantasia_cliente());
				cliente.setEndereco_cliente(clientes.get(i).getEndereco_cliente());
				cliente.setBairro(clientes.get(i).getBairro());
				cliente.setCep_cliente(clientes.get(i).getCep_cliente());
				cliente.setData_cad_cliente(clientes.get(i).getData_cad_cliente());

				break;
			}

		}

		return cliente;
	}

}
