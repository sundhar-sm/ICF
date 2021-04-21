package com.oneapp.icf.assignment.config;
import java.util.Properties;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

	
		private String DIALECT="org.hibernate.dialect.PostgreSQL9Dialect";
	 
		private String SHOW_SQL="true";
	 
		private String HBM2DDL_AUTO="update";
	 
		private String PACKAGES_TO_SCAN="oneapp.icf.assignment.demo";
 
	@Bean
	public DataSource dataSource() {
		
		JSONObject obj = new JSONObject(System.getenv("VCAP_SERVICES"));
		JSONArray arr = obj.getJSONArray("postgresql-db");
		String dbname = arr.getJSONObject(0).getJSONObject("credentials").getString("dbname");
		String hostname = arr.getJSONObject(0).getJSONObject("credentials").getString("hostname");
		String port = arr.getJSONObject(0).getJSONObject("credentials").getString("port");
		String username = arr.getJSONObject(0).getJSONObject("credentials").getString("username");
		String password = arr.getJSONObject(0).getJSONObject("credentials").getString("password");
		
		String connection_url = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbname;
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setUrl(connection_url);
		 dataSource.setUsername(username);
		 dataSource.setPassword(password);
		 
		 try {
				System.err.println("HibernateConfiguration.dataSource()"+ dataSource.getConnection());
				 }catch(Exception e) {
					System.err.println("HibernateConfiguration.dataSource() "+e); 
					e.printStackTrace();
				 }
		 
		return dataSource;
	}
 
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
	
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(PACKAGES_TO_SCAN);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", DIALECT);
		hibernateProperties.put("hibernate.show_sql", SHOW_SQL);
		hibernateProperties.put("hibernate.hbm2ddl.auto", HBM2DDL_AUTO);
		sessionFactory.setHibernateProperties(hibernateProperties);
 
		return sessionFactory;
	}
 
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}	
}