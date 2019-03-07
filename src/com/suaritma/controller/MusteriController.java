package com.suaritma.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.suaritma.entity.Musteri;
import com.suaritma.service.MusteriService;

@Controller
public class MusteriController extends javax.swing.JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MusteriController() {
		// TODO Auto-generated constructor stub
	}
	public MusteriController(Musteri theMusteri) {
		musteriKaydet(theMusteri);
	}

	@Autowired
	private MusteriService musteriService;
	
	public void musteriListele() {
		// bunun gibi methodlar burada barýnacak
	}
	public void musteriKaydet(Musteri theMusteri) {
		musteriService.musteriKaydet(theMusteri);
	}
	
}
