package br.edu.infnet.library.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TodoDao {
	
	private static Map<Integer, Todo> repositorio = new HashMap<Integer, Todo>();
	private static int id = 1;

	static {
		repositorio.put(id++, new Todo(1, "Estudar rest", 1));
	}
	
	
	
	public void salvar(Todo todo){
		todo.setId(id++);
		repositorio.put(id, todo);
	}
	
	public List<Todo> getAll(){
		List<Todo> lista = new ArrayList<Todo>();
		for(Integer k : repositorio.keySet()){
			lista.add(repositorio.get(k));
		}
		return lista;
	}
	

}
