/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testRepository;

import java.sql.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import jk.com.healthsoftproject.dao.PatientDAO;
import jk.com.healthsoftproject.model.Patient;



public class testPatienttest {
    
    @Autowired
    PatientDAO patientDao;
 
    

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
//     @Test
     public void getPatients() {
      Patient patient = new Patient();
      patient.setPatientno(19);
      patient.setName("Cassim");
      patient.setDob(new Date(20142309));
      patient.setAddress("33458 makhaza Cape Town 1184");
      patient.setPhoneno("078 202 0491");
      patientDao.saveOrUpdate(patient);
         Assert.assertNotNull(patient);
     }
}
