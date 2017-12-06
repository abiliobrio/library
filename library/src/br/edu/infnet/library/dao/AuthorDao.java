package br.edu.infnet.library.dao;

import java.util.List;

import br.edu.infnet.library.model.*;;

public class AuthorDao extends JpaDao<Author> {

	public AuthorDao() {
		super(Author.class);
	}
	
	public List<Author> findAll() {
		return em.createQuery("select a from Author a", Author.class).getResultList();
	}

}
