package com.suaritma.service;

import java.util.List;

import com.suaritma.entity.Musteri;

public interface MusteriService {

	public List <Musteri> musterileriGetir();
	
	public Musteri musteriGetir(int theId);
	
	public List<Musteri> musteriAra(String aramaIsmi);
	
	public void musteriKaydet(Musteri theMusteri);
}
