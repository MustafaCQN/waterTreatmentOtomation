package com.suaritma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suaritma.dao.MusteriDAO;
import com.suaritma.entity.Musteri;

@Service
public class MusteriServiceImpl implements MusteriService{

	@Autowired
	private MusteriDAO musteriDAO;
	
	@Override
	@Transactional
	public List<Musteri> musterileriGetir() {
		return musteriDAO.musterileriGetir();
	}

	@Override
	@Transactional
	public Musteri musteriGetir(int theId) {
		return musteriDAO.musteriGetir(theId);
	}

	@Override
	@Transactional
	public List<Musteri> musteriAra(String aramaIsmi) {
		return musteriDAO.musteriAra(aramaIsmi);
	}

	@Override
	@Transactional
	public void musteriKaydet(Musteri theMusteri) {
		musteriDAO.musteriKaydet(theMusteri);		
	}

}
