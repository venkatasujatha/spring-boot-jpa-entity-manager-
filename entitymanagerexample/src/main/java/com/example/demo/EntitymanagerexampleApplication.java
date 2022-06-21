package com.example.demo;

import java.security.PublicKey;
import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repository.EntityRepository;

@SpringBootApplication
public class EntitymanagerexampleApplication implements CommandLineRunner {
	@Autowired
	EntityRepository entityRepository;

	public static void main(String[] args) {
		SpringApplication.run(EntitymanagerexampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	System.out.println("hello");
	
		//save();
		findAll();
		//findById();
		//merge();
		//delete();
		
	}
	public void save()
	{
		Contact contact2=new Contact();
		contact2.setId(2);
		contact2.setName("suji");
		contact2.setEmail("sujatha@gmail.com");
		contact2.setContactno(98766688);
		
		 entityRepository.save(contact2);
	}
	
	public void findAll()
	{
		List<Contact> list = entityRepository.findAll();
		list.forEach(System.out::println);
		
	}
	
	
	public void findById()
	{
		int id=1;
		Contact finContact = entityRepository.findById(id);
		System.out.println(finContact);
		
	}
	
	
	  public void merge() 
	  { 
		  int id=1;
		  Contact finId = entityRepository.findById(id);
		  finId.setId(4);
		  finId.setEmail("tec@gmail.com");
		  finId.setName("tectoro");
		  finId.setContactno(7878888);
		  
		  System.out.println(finId);
	  
	  }
	 

	public void delete()
	{
		int id=2;
		entityRepository.delete(id);
		
	}
	
		
}
