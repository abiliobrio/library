package br.edu.infnet.library.dao;

import br.edu.infnet.library.model.Book;

public interface Dao<T> {

	void salvar(T entity);

	void consultar(Book entity);

	
}
