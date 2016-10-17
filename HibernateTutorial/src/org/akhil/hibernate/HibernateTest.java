package org.akhil.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.akhil.dto.Address;
import org.akhil.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address = new Address();
		address.setCity("city");
		address.setState("State");
		address.setStreet("street");
		address.setZip("12345");
		
		Address officeAddress = new Address();
		officeAddress.setCity("officecity");
		officeAddress.setState("officeState");
		officeAddress.setStreet("officestreet");
		officeAddress.setZip("office12345");
		
		
		UserDetails user = new UserDetails();
		//user.setUserid(2);
		user.setUserName(" User1");
		user.getAddresses().add(officeAddress);
		user.getAddresses().add(address);
		user.setJoinedDate(new Date());
		user.setDescription(" User1 description");
		
		UserDetails user2 = new UserDetails();
		//user.setUserid(2);
		user2.setUserName(" User2");
		
		user2.setJoinedDate(new Date());
		user2.setDescription(" User2 description");
		
		

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
		
		
		/*
		user = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = session.get(UserDetails.class, 2);
		System.out.println(user.getUserName());
		*/
		
		sessionFactory.close();
	}

}
