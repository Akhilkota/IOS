package org.akhil.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.mapping.dto.UserDetails;
import org.mapping.dto.Vehicle;

import java.util.List;

/**
 * Created by Akhil on 11/24/2016.
 */
public class HibernateDAO {

    public static SessionFactory factory = null;
    public static Session session = null;

    public static Session getConnection() {

        if (session != null && session.getSession().isOpen()) {
            return session;
        } else {
            factory = new Configuration().configure().buildSessionFactory();
            session = factory.openSession();
            session.beginTransaction();

            return session;
        }
    }

    public static int commitAndCloseDb(Object object) {

        session.getTransaction().commit();
        session.evict(object);
        session.close();

        factory.close();

        return 1;
    }

    public static int rollbackAndCloseDb() {

        session.getTransaction().rollback();
        session.close();

        factory.close();

        return 1;
    }

    public static int saveToDb(Object object) {
        HibernateDAO.getConnection();
        int primaryId = (Integer) session.save(object);
        HibernateDAO.commitAndCloseDb(object);
        return primaryId;
    }

    public static List<UserDetails> readFromDbAllRecords() {

        HibernateDAO.getConnection();
        Criteria c = session.createCriteria(UserDetails.class);
        List<UserDetails> userDetails = c.list();

        return userDetails;
    }

    public static UserDetails readFromDbByUserId(int id) {

        HibernateDAO.getConnection();
        String hql = "From UserDetails U where U.userId = " + id;

        Query query = session.createQuery(hql);
        UserDetails userDetails = (UserDetails) query.uniqueResult();
        // close connection
        return userDetails;
    }

    public static UserDetails readFromDbByUserName(String name) {

        HibernateDAO.getConnection();
        String hql = "From UserDetails where userName = '" + name + "'";

        Query query = session.createQuery(hql);
        UserDetails userDetails = (UserDetails) query.uniqueResult();

        return userDetails;
    }

    public static Vehicle readFromDbByVehicleId(int vehicleid) {

        HibernateDAO.getConnection();
        Criteria c = session.createCriteria(Vehicle.class);

        Criterion cr = Restrictions.eq("vehicleId", vehicleid);
        c.add(cr);

        Vehicle vehicle = (Vehicle) c.uniqueResult();
        //  HibernateDAO.closeConnections();
        return vehicle;
    }


    public static List<Vehicle> readFromDbByVehicleName(String vehicleName) {

        HibernateDAO.getConnection();
        Criteria c = session.createCriteria(Vehicle.class);

        Criterion cr = Restrictions.eq("vehicleName", vehicleName);
        c.add(cr);

        List<Vehicle> vehicle = c.list();
        //  HibernateDAO.closeConnections();
        return vehicle;
    }

    public static void closeConnections() {
        session.close();
        factory.close();

    }
}
