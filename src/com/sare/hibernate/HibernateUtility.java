package com.sare.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.sare.entidades.ClientePF;
import com.sare.entidades.ClientePJ;
import com.sare.entidades.ContasAReceber;






public class HibernateUtility {

	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(ClientePF.class);
		configuration.addAnnotatedClass(ClientePJ.class);
		configuration.addAnnotatedClass(ContasAReceber.class);
		/*MAPEAMENTO DAS CLASS QUE USARAM O HIBERNATE*/
		
		/*
		configuration.addAnnotatedClass(ClientePF.class);
		configuration.addAnnotatedClass(ClientePJ.class);
		configuration.addAnnotatedClass(Funcionario.class);
		*/
	
		configuration.configure();
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = serviceRegistryBuilder
				.buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	}

	public static Session getSession() {
		Session session = sessionFactory.openSession();
		return session;
	}

}