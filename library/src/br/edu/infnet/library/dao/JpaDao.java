package br.edu.infnet.library.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class JpaDao<T> implements Dao<T> {


	@PersistenceContext(unitName="library")
	protected EntityManager em;
	
	
	@SuppressWarnings("rawtypes")
	private Class clazz;

	@SuppressWarnings("rawtypes")
	public JpaDao(Class clazz) {
		super();
		this.clazz = clazz;
	}

	@Override
	public void salvar(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(T entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T consultar(Integer id) {
		em.getTransaction().begin();
		T t = (T) em.find(clazz, id);
		em.getTransaction().commit();
		em.close();
		return t; 
	}

	@Override
	public void deletar(Integer id) {
		em.getTransaction().begin();
		em.remove(consultar(id));
		em.getTransaction().commit();
		em.close();
	}

}
