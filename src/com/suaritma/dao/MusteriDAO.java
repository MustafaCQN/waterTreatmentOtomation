package com.suaritma.dao;

import java.util.List;

import com.suaritma.entity.Musteri;

public interface MusteriDAO {

	List<Musteri> musterileriGetir();

	Musteri musteriGetir(int theId);

	List<Musteri> musteriAra(String aramaIsmi);

	void musteriKaydet(Musteri theMusteri);

}
