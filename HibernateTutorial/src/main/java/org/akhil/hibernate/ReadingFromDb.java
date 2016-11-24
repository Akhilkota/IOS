package org.akhil.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapping.dto.UserDetails;

import java.util.List;

public class ReadingFromDb {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Criteria c = session.createCriteria(UserDetails.class);
        List<UserDetails> userDetails = c.list();
        for (UserDetails
                ud : userDetails) {
            System.out.println("userid " + ud.getUserId());
            System.out.println("userName " + ud.getUserName());
            //System.out.println(ud.getVehicle().forEach(action););
        }

        session.close();

        factory.close();

    }

}
