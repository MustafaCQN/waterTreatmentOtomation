package com.suaritma.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="hesaplar")
public class Hesap {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="h_id")
	private int id;
	
	@Column(name="gunluk_kazanc")
	private float gunlukKazanc;
	
	@Column(name="gunluk_net_kazanc")
	private float gunlukNetKazanc;

	@Column(name="toplam_kazanc")
	private float toplamKazanc;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="tarih")
	private Date tarih;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public float getGunlukKazanc() {
		return gunlukKazanc;
	}

	public void setGunlukKazanc(float gunlukKazanc) {
		this.gunlukKazanc = gunlukKazanc;
	}

	public float getGunlukNetKazanc() {
		return gunlukNetKazanc;
	}

	public void setGunlukNetKazanc(float gunlukNetKazanc) {
		this.gunlukNetKazanc = gunlukNetKazanc;
	}

	public float getToplamKazanc() {
		return toplamKazanc;
	}

	public void setToplamKazanc(float toplamKazanc) {
		this.toplamKazanc = toplamKazanc;
	}

	

	
	
	
	
	
}
