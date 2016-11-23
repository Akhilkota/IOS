package org.akhil.hibernate;

import java.util.Date;

import org.mapping.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapping.dto.Vehicle;

public class SavingToDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		
		user.setUserName(" User1");
		user.setInDate(new Date());
		
		Vehicle vehicle = new Vehicle();
		 vehicle.setVehicleName("Audi");
		 vehicle.setInDate(new Date());
		 
		 Vehicle vehicle1 = new Vehicle();
		 vehicle1.setVehicleName("BMW");
		 vehicle1.setInDate(new Date());
		 
		 user.getVehicle().add(vehicle);
		 user.getVehicle().add(vehicle1);
		 
		 System.out.println("============");
		 System.out.println("user " + user);
		 System.out.println("vehicle1 " + vehicle);
		 System.out.println("vehicle2 " + vehicle1);
		 
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 Session session = factory.openSession();
		 session.beginTransaction();
		 session.save(user);
		 session.save(vehicle);
		 session.getTransaction().commit();
		 session.close();
		 
factory.close();
	}

}
