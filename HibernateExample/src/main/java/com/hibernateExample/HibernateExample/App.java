package com.hibernateExample.HibernateExample;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class App 
{
    public static void main( String[] args )
    {
    	
    	    
      Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
    
       SessionFactory sf=con.buildSessionFactory();
      Session session=sf.openSession();
      
       session.beginTransaction();
      
  
  
      
      session.getTransaction().commit();
     
    }
}
