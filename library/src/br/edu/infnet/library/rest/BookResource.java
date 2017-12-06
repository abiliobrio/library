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

import br.edu.infnet.library.dao.BookDao;
import br.edu.infnet.library.model.Book;

@Path("/book")
public class BookResource {

	private static BookDao bookDao;
	
	public BookResource() {
		bookDao = new BookDao();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getAll(){
		return bookDao.findAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response find(@PathParam("id") Integer id){
		Book book = bookDao.consultar(id); 
		Status status = (book != null ? Response.Status.OK : Response.Status.NOT_FOUND);
        return Response.status(status).entity(book).build();
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Book book){
		bookDao.salvar(book);
		return Response.status(Response.Status.CREATED).entity(book).build();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(Book book){
		bookDao.alterar(book);
		return Response.status(Response.Status.OK).build();
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("id") Integer id){
		bookDao.deletar(id);
		return Response.status(Response.Status.OK).build();
	}
	
}
