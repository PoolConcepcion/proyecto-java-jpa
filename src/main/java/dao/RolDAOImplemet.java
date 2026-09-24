package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.rol;

public class RolDAOImplemet implements RolDAO {
	EntityManagerFactory fabric;
	EntityManager em;
	public RolDAOImplemet() {
		fabric = Persistence.createEntityManagerFactory("semana01");
		em =fabric.createEntityManager();
	}

	@Override
	public void create(rol rol) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.persist(rol);
			em.getTransaction().commit();
		}catch (NullPointerException e) {
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public void update(rol rol) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.merge(rol);
			em.getTransaction().commit();
		}catch (NullPointerException e) {
			em.getTransaction().rollback();
		}
		
	}
	

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.remove(id);
			em.getTransaction().commit();
		}catch (NullPointerException e) {
			em.getTransaction().rollback();
		}
		
	}
		

	@Override
	public rol find(int id) {
		return em.find(rol.class, id);
	}

	@Override
	public List<rol> findAll() {
		
		Query query = em.createNamedQuery("Rol.findAll");
		List<rol> lista;
		try {
			lista = query.getResultList();
			
		} catch(Exception e) {
			lista = null;
		}
		return lista;
	}

}
