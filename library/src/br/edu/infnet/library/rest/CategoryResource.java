package br.edu.infnet.library.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.edu.infnet.library.dao.CategoryDao;
import br.edu.infnet.library.model.Category;


@Path("/category")
public class CategoryResource {

	private static CategoryDao categoryDao;
	
	public CategoryResource() {
		categoryDao = new CategoryDao();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Category> getAll(){
		return categoryDao.findAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response find(@PathParam("id") Integer id){
		Category category = categoryDao.consultar(id); 
		Status status = (category != null ? Response.Status.OK : Response.Status.NOT_FOUND);
        return Response.status(status).entity(category).build();
		
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Category category){
		categoryDao.salvar(category);
		return Response.status(Response.Status.CREATED).entity(category).build();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(Category category){
		categoryDao.alterar(category);
		return Response.status(Response.Status.OK).build();
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("id") Integer id){
		categoryDao.deletar(id);
		return Response.status(Response.Status.OK).build();
	}
	
}
