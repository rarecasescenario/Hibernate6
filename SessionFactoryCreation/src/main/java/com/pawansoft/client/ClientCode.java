package com.pawansoft.client;

import java.util.Properties;

import org.hibernate.Session;

import com.pawansoft.util.HibernateUtil;

public class ClientCode {

	public static void main(String[] args) {
		
		Session session;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			String result = session.createNativeQuery("select version()", String.class).getSingleResult(); 
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
