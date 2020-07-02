package br.com.meg.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.meg.dao.DataBaseController;
import br.com.meg.model.Cliente;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("clientes")
public class ControllerResource {
	
	private final DataBaseController repositorio = new DataBaseController();
	private List<Cliente> clientes = new ArrayList<Cliente>();

    
    @GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> get(){
		repositorio.listar(clientes);
		
		return clientes;
	}
    
    @GET
    @Path("{cnpj}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente getByCnpj(@PathParam("cnpj") String cnpj) {
    	return repositorio.buscar(cnpj);
    }

}
