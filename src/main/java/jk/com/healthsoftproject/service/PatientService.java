/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jk.com.healthsoftproject.service;

import java.util.List;

import jk.com.healthsoftproject.model.Patient;

public interface PatientService {
    
       public List<Patient> list();
	
	public Patient getPatientByID(int id);
	
	public void saveOrUpdate(Patient patient);
	
	public void deletePatient(int id);
    
    
    
}
