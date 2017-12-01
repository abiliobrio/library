package br.edu.infnet.library.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public abstract class JpaDao<T> implements Dao<T> {

	@PersistenceContext(unitName="library")
	private EntityManager entityManager;
	
	public void salvar(T entity) {
		entityManager.persist(entity);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
