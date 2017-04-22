/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jk.com.healthsoftproject.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.com.healthsoftproject.dao.PatientDAO;
import jk.com.healthsoftproject.model.Patient;
import jk.com.healthsoftproject.service.PatientService;


@Service
public class PatientServiceImpl implements PatientService{
    
    @Autowired
    PatientDAO patientDAO;

    @Override
    public List<Patient> list() {
        return patientDAO.list();
    }

    @Override
    public Patient getPatientByID(int id) {
        return patientDAO.getPatientByID(id);
    }

    @Override
    public void saveOrUpdate(Patient patient) {
        patientDAO.saveOrUpdate(patient);
    }

    @Override
    public void deletePatient(int id) {
        patientDAO.deletePatient(id);
    }
    
}
