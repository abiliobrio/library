package br.edu.infnet.library.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.infnet.library.model.Category;

@Path("/category")
public class CategoryResource {
	
	public CategoryResource() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCategory{
		String categoryName ;
		lista.add(new Category("Janete"));
		return lista;
	}	
}
