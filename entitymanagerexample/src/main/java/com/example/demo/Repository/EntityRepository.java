package com.example.demo.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Contact;

@Repository
public class EntityRepository {
	
	//we can use autowired or persistence context
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Contact contact)
	{
		
		 entityManager.persist(contact);
	}
	@Transactional
	public List<Contact> findAll()
	{
		String psl="select c from Contact c";
		TypedQuery<Contact> query = entityManager.createQuery(psl,Contact.class);
		return query.getResultList();
	}
	
	
	 
	public Contact findById(int id)
	{
		return entityManager.find(Contact.class, id);
		
	}
	
	 public void update(Contact contact) 
	  { 
		  entityManager.merge(contact); 
	  }
	 @Transactional
	public void delete(int id)
	{
		Contact contact = entityManager.find(Contact.class, id);
		entityManager.remove(contact);
	}
}
