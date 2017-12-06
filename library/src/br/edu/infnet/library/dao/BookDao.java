package br.edu.infnet.library.dao;

import java.util.List;

import br.edu.infnet.library.model.*;

public class BookDao extends JpaDao<Book> {

	public BookDao() {
		super(Book.class);
	}

	public List<Book> findAll() {
		return em.createQuery("select b from Book b", Book.class).getResultList();
	}

}
