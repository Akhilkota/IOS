package org.akhil.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapping.dto.UserDetails;
import org.mapping.dto.Vehicle;

import java.util.*;

public class SavingToDbTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Vehicle vehicle1 = new Vehicle("Audi Q10", new Date());
        Vehicle vehicle2 = new Vehicle("BMW X10", new Date());

        List<Vehicle> vehicleslist1 = new ArrayList<Vehicle>();
        vehicleslist1.add(vehicle1);
        vehicleslist1.add(vehicle2);
        UserDetails user1 = new UserDetails("User11", vehicleslist1, new Date());

        System.out.println("User id created = "+ HibernateDAO.saveToDb(user1));

        List<Vehicle> vehicleslist2 = new ArrayList<Vehicle>();
        Vehicle vehicle3 = new Vehicle("Audi Q11", new Date());
        Vehicle vehicle4 = new Vehicle("BMW X11", new Date());

        vehicleslist2.add(vehicle3);
        vehicleslist2.add(vehicle4);
        UserDetails user2 = new UserDetails("User12", vehicleslist2, new Date());

        System.out.println("User id created = "+ HibernateDAO.saveToDb(user2));


/*
        Vehicle vehicle1 = new Vehicle("Audi Q7", new Date());

        Vehicle vehicle2 = new Vehicle("BMW X6", new Date());

        Vehicle vehicle3 = new Vehicle("Audi Q5", new Date());

        Vehicle vehicle4 = new Vehicle("BMW X5", new Date());

        UserDetails user = new UserDetails();

        user.setUserName(" User1");
        user.setInDate(new Date());

        user.getVehicle().add(vehicle1);
        user.getVehicle().add(vehicle2);

        List<Vehicle> vehicleslist = new ArrayList<Vehicle>();
        vehicleslist.add(vehicle3);
        vehicleslist.add(vehicle4);
        UserDetails user2 = new UserDetails("User2", vehicleslist, new Date());


        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(user);
        session.persist(user2);
        //session.save(vehicle);
        session.getTransaction().commit();
        session.close();

        factory.close();*/
    }

}
