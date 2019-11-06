package com.lti.Hibernateeg.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration= new Configuration().configure();
    	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder()
    			.applySettings(configuration.getProperties());
    	SessionFactory factory=configuration.buildSessionFactory(builder.build());
    	Session session= factory.openSession();
    	Emp employee=new Emp();
    	employee.setEmpName("Kavi");
    	employee.setBranch("Chennai");
    	session.beginTransaction();
    	session.save(employee);
    	session.getTransaction().commit();

    }
}
