package com.suaritma.database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseOlustur {

	// burada farklý bilgisayarlardada düzgün çalýþmasý için gerekli db
	// oluþturma iþlemleri gerçekleþtirilecektir
	
	public void executeDBScripts() throws IOException,SQLException {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
    	Session session = factory.getCurrentSession();
    	session.beginTransaction();
		boolean isScriptExecuted = false;
		try {
		//BufferedReader in = new BufferedReader(new FileReader(aSQLScriptFilePath));
		//String str;
		//StringBuffer sb = new StringBuffer();
		/*while ((str = in.readLine()) != null) {
		sb.append(str + "\n ");
		}*/
		//in.close();
		//stmt.executeUpdate(sb.toString());
		//String [] komutlar = sb.toString().split(";");
		/*for (String s : komutlar) {
			Query query = session.createNativeQuery(s);
			query.executeUpdate();
		}*/
		/*
		Query query = session.createNativeQuery("CREATE USER IF NOT EXISTS 'newuser'@'localhost' IDENTIFIED BY 'password'");
		query.executeUpdate();
		
		query = session.createNativeQuery("GRANT ALL PRIVILEGES ON * . * TO 'newuser'@'localhost'");
		query.executeUpdate();
		
		query = session.createNativeQuery("FLUSH PRIVILEGES");
		query.executeUpdate();
			
		Query query = session.createNativeQuery("CREATE DATABASE IF NOT EXISTS `su_aritma`");
		query.executeUpdate();
		 */
		Query query = session.createNativeQuery("USE `su_aritma`");
		query.executeUpdate();
		
		/*query = session.createNativeQuery("DROP TABLE IF EXISTS `musteri`");
		query.executeUpdate();*/
		
		query = session.createNativeQuery("CREATE TABLE IF NOT EXISTS `musteri` (" + 
				"   `id` int(11) NOT NULL AUTO_INCREMENT," + 
				"   `isim` varchar(45) DEFAULT NULL," + 
				"   `soy_isim` varchar(45) DEFAULT NULL," + 
				"   `adres` varchar(45) DEFAULT NULL," + 
				"   `tel_no` varchar(45) DEFAULT NULL," + 
				"   `cihaz_modeli` varchar(45) DEFAULT NULL," + 
				"   `cihaz_alim_tarihi` datetime(6) DEFAULT NULL," + 
				"   `dogum_tarihi` datetime(6) DEFAULT NULL," + 
				"   PRIMARY KEY (`id`)" + 
				" ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8");
		query.executeUpdate();
		
		query = session.createNativeQuery("CREATE TABLE IF NOT EXISTS`urun` (" + 
				"   `id` int(11) NOT NULL AUTO_INCREMENT," + 
				"   `urun_adi` varchar(45) DEFAULT NULL," + 
				"   `adet` int(11) DEFAULT NULL," + 
				"   PRIMARY KEY (`id`)" + 
				" ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8");
		query.executeUpdate();
		
		isScriptExecuted = true;
		} catch (Exception e) {
		//System.err.println("Failed to Execute " + aSQLScriptFilePath +". The error is "+ e.getMessage());
			System.err.println("FAIL " + e.getMessage());
		} 
		finally {
			session.getTransaction().commit();
		}
		
		}
}
