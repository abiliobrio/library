	package br.edu.infnet.library.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/todos")
public class TodoResource {
	
	private static TodoDao todoDao;
	
	public TodoResource() {
		todoDao = new TodoDao();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Todo> getTodos(){
		return todoDao.getAll();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Todo todo){
		todoDao.salvar(todo);
		return Response.status(Response.Status.CREATED).entity(todo).build();
	}
	

}
