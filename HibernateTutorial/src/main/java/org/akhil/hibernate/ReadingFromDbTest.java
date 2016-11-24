package org.akhil.hibernate;

import org.mapping.dto.UserDetails;
import org.mapping.dto.Vehicle;

import java.util.List;

public class ReadingFromDbTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        try {


            UserDetails userDetails = HibernateDAO.readFromDbByUserId(3);
            System.out.println("Reading from db by user id = 3 " + userDetails.toString());
            HibernateDAO.closeConnections();

            UserDetails userDetails2 = HibernateDAO.readFromDbByUserName("User2");
            System.out.println("Reading from db by user name = " + userDetails2.getUserName() + " " + userDetails2.toString());
            HibernateDAO.closeConnections();
            Vehicle vehicle = HibernateDAO.readFromDbByVehicleId(1);
            System.out.println("Reading from db by vehicle id = 1 " + vehicle.toString());

            List<Vehicle> vehicleList = HibernateDAO.readFromDbByVehicleName("Audi Q5");
            System.out.println("Reading from db by vehicle name = Audi Q5 ");
            for (Vehicle vehicle1 : vehicleList
                    ) {
                System.out.println(vehicle1.toString());
            }

        } finally {
            HibernateDAO.closeConnections();
        }

       /*
         SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Criteria c = session.createCriteria(UserDetails.class);
        List<UserDetails> userDetails = c.list();
        for (UserDetails ud : userDetails) {
            System.out.println(userDetails.toString());
            Collection<Vehicle> vehicleList1  = ud.getVehicle();
            for (Vehicle vehicle1: vehicleList1 ) {
                System.out.println(vehicle1.toString());

            }
        }

        session.close();

        factory.close();
*/
    }

}
