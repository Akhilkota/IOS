package org.akhil.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapping.dto.UserDetails;
import org.mapping.dto.Vehicle;

import java.util.*;

public class SavingToDb {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Vehicle vehicle1 = new Vehicle("Audi Q7", new Date());

        Vehicle vehicle2 = new Vehicle("BMW X6", new Date());

        Vehicle vehicle3 = new Vehicle("Audi Q5", new Date());

        Vehicle vehicle4 = new Vehicle("BMW X5", new Date());

        UserDetails user = new UserDetails();

        user.setUserName(" User1");
        user.setInDate(new Date());

        user.getVehicle().add(vehicle1);
        user.getVehicle().add(vehicle2);

        List<Vehicle> vehicleslist = new ArrayList<>();
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

        factory.close();
    }

}
