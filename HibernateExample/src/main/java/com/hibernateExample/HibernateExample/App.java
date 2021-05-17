package com.hibernateExample.HibernateExample;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;





public class App 
{
    public static void main( String[] args )
    {
    	
      Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
    
       SessionFactory sf=con.buildSessionFactory();
      Session session=sf.openSession();
      
      
       session.beginTransaction(); 
       
 Query query = session.createQuery("from Employee where salary=500000");
 List<Employee> employee=query.list();
 
 for(Employee e : employee)
	 System.out.println(e);
 
     session.getTransaction().commit();
     
    }
}
