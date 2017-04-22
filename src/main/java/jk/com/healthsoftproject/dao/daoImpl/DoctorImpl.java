/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jk.com.healthsoftproject.dao.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import jk.com.healthsoftproject.dao.DoctorDAO;
import jk.com.healthsoftproject.model.Doctor;

public class DoctorImpl implements DoctorDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    public  DoctorImpl(){
        
    }
    
    public DoctorImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    @Transactional
    public List<Doctor> list() {
     @SuppressWarnings("unchecked")
     List<Doctor> listDoctor = sessionFactory.getCurrentSession()
             .createCriteria(Doctor.class)
             .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return listDoctor;
    }

    @Override
    public Doctor getDoctorByID(int id) {
        Session session = sessionFactory.openSession();
        Doctor doctor = (Doctor)session.load(Doctor.class,id);
        return doctor;
    }

    @Override
    public void saveOrUpdate(Doctor doctor) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(doctor);
        tx.commit();
    }

    @Override
    public void deletePatient(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Doctor doctor = (Doctor)session.load(Doctor.class,id);
        session.delete(doctor);
        tx.commit();
        session.close();
    }
    
}
