package com.hibernateExample.HibernateExample;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
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
       
       SQLQuery query = session.createSQLQuery("select * from employee");
       query.addEntity(Employee.class);
       List<Employee> emplyees=query.list();
       for(Employee e : emplyees)
    	   System.out.println(e);
 
     session.getTransaction().commit();
     
    }
}
