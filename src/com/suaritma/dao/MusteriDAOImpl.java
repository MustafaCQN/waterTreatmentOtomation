package com.suaritma.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suaritma.entity.Musteri;

@Repository
public class MusteriDAOImpl implements MusteriDAO{
	// DAHA BÝTMEDÝ*********************************

	@Autowired
	private SessionFactory sessionFactory;
	
	// bu method sonucunda musteri listesi çekilecektir
	@Override
	public List<Musteri> musterileriGetir() {
		// TODO Auto-generated method stub
		return null;
	}

	// bu method sonucunda musteri çekilecektir
	@Override
	public Musteri musteriGetir(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	// bu method sonucunda musteri listesi çekilecektir
	@Override
	public List<Musteri> musteriAra(String aramaIsmi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void musteriKaydet(Musteri theMusteri) {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(theMusteri);
			currentSession.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
