/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jk.com.healthsoftproject.config;

import java.util.Properties;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import jk.com.healthsoftproject.dao.AppointmentDAO;
import jk.com.healthsoftproject.dao.daoImpl.AppointmentImpl;
import jk.com.healthsoftproject.model.Appointment;
import jk.com.healthsoftproject.model.Doctor;
import jk.com.healthsoftproject.model.Patient;

/**
 * The application is 100% java code and XML free
 * the code implemented is used to register a spring Dispecher servlet
 * which is usually registered using web.xml
 
 */

@Configuration
@ComponentScan("olsps.com.healthsoftproject")
@EnableTransactionManagement
public class ApplicationConfigClass {
    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getviewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
        
    }
     @Bean(name = "dataSource")
    public DataSource getDataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
    	dataSource.setUrl("jdbc:derby://localhost:1527/medicalcenter");
    	dataSource.setUsername("yusufcassim");
        dataSource.setPassword("yusufcassim");
       	return dataSource;
    }
    private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
    	return properties;
    }
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
        
    	sessionBuilder.addProperties(getHibernateProperties());
    	sessionBuilder.addAnnotatedClasses(Appointment.class);
        sessionBuilder.addAnnotatedClasses(Doctor.class);
        sessionBuilder.addAnnotatedClass(Patient.class);        
    	return sessionBuilder.buildSessionFactory();
    }
    @Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
				sessionFactory);

		return transactionManager;
	}
    @Autowired
    @Bean(name = "appointmentDAO")
    public AppointmentDAO getAppointmentDAO(SessionFactory sessionFactory) {
    	return new AppointmentImpl(sessionFactory);
    }
}
