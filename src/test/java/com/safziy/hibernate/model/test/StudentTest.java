package com.safziy.hibernate.model.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.safziy.hibernate.model.Student;

public class StudentTest {
	private Session session;
	private Transaction transaction;

	@Before
	public void openSession() {
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();

		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();

	}

	@After
	public void closeSession() {
		transaction.commit();
		session.close();
	}

	@Test
	public void testSaveStudent() {
		Student student = new Student(1,"mary","sale",new Date().getTime());
		session.save(student);
	}
}
