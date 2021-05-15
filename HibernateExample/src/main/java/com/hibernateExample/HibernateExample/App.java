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
    	
    	    Employee e = null;
      Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
    
       SessionFactory sf=con.buildSessionFactory();
      Session session=sf.openSession();
      
      
       session.beginTransaction(); 
       e=(Employee)session.get(Employee.class,1);
       System.out.println(e);
       session.getTransaction().commit();
       session.close();
       
       
       Session session1=sf.openSession();
       session1.beginTransaction();
       e=(Employee)session1.get(Employee.class,1);
       System.out.println(e);
      session1.getTransaction().commit();
      session1.close();
     
    }
}
