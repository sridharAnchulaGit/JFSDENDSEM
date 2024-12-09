package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentManager {
	public String insertData(Student S)
	  {
	    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    Session session = factory.openSession();
	    
	    session.getTransaction().begin();
	    session.persist(S);         //Insert into Table "Student"
	    session.getTransaction().commit();
	    
	    session.close();
	    factory.close();
	    return "Data Inserted Successfully..";
	  }
}
