package com.suaritma.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="musteri")
public class Musteri {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id=1;
	
	@Column(name="isim")
	private String isim;
	
	@Column(name="soy_isim")
	private String soyIsim;
	
	@Column(name="adres")
	private String adres;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="dogum_tarihi")
	private Date dogumTarihi;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="cihaz_alim_tarihi")
	private Date cihazAlimTarihi;
	
	@Column(name="cihaz_modeli")
	private String cihazModeli;
	
	@Column(name="tel_no")
	private String telNo;
	
	@JoinColumn(name="bakimlar_id")
	@OneToOne(cascade=CascadeType.ALL)
	private Bakim bakim;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Bakim getBakim() {
		return bakim;
	}

	public void setBakim(Bakim bakim) {
		this.bakim = bakim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	public Date getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public Date getCihazAlimTarihi() {
		return cihazAlimTarihi;
	}

	public void setCihazAlimTarihi(Date cihazAlimTarihi) {
		this.cihazAlimTarihi = cihazAlimTarihi;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}


	public String getCihazModeli() {
		return cihazModeli;
	}

	public void setCihazModeli(String cihazModeli) {
		this.cihazModeli = cihazModeli;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public String [] makinaListe() {
		String dizi [] = { "-","KRS34 Pompalý", "KRS34 Pompasýz", "KRS36 Pompalý", "KRS36 Pompasýz",
        		"KRS37 Pompalý","KRS37 Pompasýz","KRS38 Pompalý","KRS38 Pompasýz","KRS39 Pompalý","KRS39 Pompasýz",
        		"Alfa"};
		return dizi;
	}

	@Override
	public String toString() {
		return "Musteri [id=" + id + ", isim=" + isim + ", soyIsim=" + soyIsim + ", adres=" + adres + ", dogumTarihi="
				+ dogumTarihi + ", cihazAlimTarihi=" + cihazAlimTarihi + ", cihazModeli=" + cihazModeli + ", telNo="
				+ telNo + "]";
	}
	
	
	
	
}
