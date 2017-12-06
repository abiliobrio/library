package br.edu.infnet.library.dao;

import java.util.List;

import br.edu.infnet.library.model.*;

public class CategoryDao extends JpaDao<Category> {

	public CategoryDao() {
		super(Category.class);
	}
	
	public List<Category> findAll() {
		return em.createQuery("select c from Category c", Category.class).getResultList();
	}
	
}
