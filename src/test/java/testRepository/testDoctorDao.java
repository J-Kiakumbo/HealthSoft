/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testRepository;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import javax.persistence.PersistenceContextType;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import jk.com.healthsoftproject.dao.DoctorDAO;
import jk.com.healthsoftproject.model.Appointment;
import jk.com.healthsoftproject.model.Doctor;
import jk.com.healthsoftproject.model.Patient;

public class testDoctorDao {
    
    @Autowired
    DoctorDAO doc;
    @Autowired
    SessionFactory session;
    
    public testDoctorDao() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    @SuppressWarnings({"unchecked", "deprecation"})
     public void createDoctor() {
        
         Doctor doctor = new Doctor();
         Appointment apo = new Appointment();
         Patient patient = new Patient();
         
        
     }
}
