/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jk.com.healthsoftproject.dao.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jk.com.healthsoftproject.dao.AppointmentDAO;
import jk.com.healthsoftproject.model.Appointment;

@Repository
public class AppointmentImpl implements AppointmentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public AppointmentImpl() {

    }

    public AppointmentImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Appointment> list() {
        @SuppressWarnings("unchecked")
        List<Appointment> appList = (List<Appointment>) sessionFactory.getCurrentSession()
                .createCriteria(Appointment.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return appList;
    }

    @Override
    public Appointment get(int id) {
        String quiry = "from Appointment where id=" + id;
        Query query = sessionFactory.getCurrentSession().createQuery(quiry);
        @SuppressWarnings("unchecked")
        List<Appointment> listapp = query.list();
        if (listapp != null && !listapp.isEmpty()) {
            return listapp.get(0);
        }
        return null;
    }

    @Override
    public void saveOrUpdate(Appointment appointment) {
       Session session = sessionFactory.openSession();
       Transaction tx = session.beginTransaction();
        
       
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
