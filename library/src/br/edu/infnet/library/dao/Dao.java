package br.edu.infnet.library.dao;

public interface Dao<T> {

	void salvar(T entity);

	void alterar(T entity);

	T consultar(Integer id);
	
	void deletar(Integer id);

}
