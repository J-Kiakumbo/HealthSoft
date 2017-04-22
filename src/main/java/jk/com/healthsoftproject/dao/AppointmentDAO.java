/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jk.com.healthsoftproject.dao;

import java.util.List;

import jk.com.healthsoftproject.model.Appointment;

public interface AppointmentDAO {
    
       public List<Appointment> list();
	
	public Appointment get(int id);
	
	public void saveOrUpdate(Appointment appointment);
	
	public void delete(int id);
    
}
