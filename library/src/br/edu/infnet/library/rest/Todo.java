package br.edu.infnet.library.rest;

public class Todo {
	
	private Integer id;
	
	private String descricao;
	
	private Integer prioridade;

	public Todo() {
	}
	
	public Todo(int id, String descricao, int prioridade) {
		this.id = id;
		this.descricao = descricao;
		this.prioridade = prioridade;
	}
	

}
