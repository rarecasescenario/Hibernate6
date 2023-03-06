package com.pawansoft.client;

import java.math.BigDecimal;

import org.hibernate.Session;

import com.pawansoft.model.User;
import com.pawansoft.util.HibernateUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientCode {

	private static final Logger log = LogManager.getLogger(ClientCode.class);
	
	public static void main(String[] args) {
		
		Session session;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			User user = new User();
			user.setUser_id(9);
			user.setName("Chokolate");
			user.setAge(40);
			user.setSalary(new BigDecimal("5400.20"));
			
			session.persist(user);
			log.info("User " + user.getName() + " persisted to the db.");
			
		} catch (Exception e) {
			log.error("ERROR: ", e);
		}
	}

}
