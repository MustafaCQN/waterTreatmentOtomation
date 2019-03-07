package com.suaritma.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bakimlar")
public class Bakim {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id=10;
	
	@Column(name="bakim1")
	private String bakim1;
	
	@Column(name="bakim2")
	private String bakim2;
	
	@Column(name="bakim3")
	private String bakim3;
	
	@Column(name="bakim4")
	private String bakim4;
	
	@Column(name="bakim5")
	private String bakim5;
	
	@Column(name="bakim6")
	private String bakim6;
	
	@Column(name="bakim7")
	private String bakim7;
	
	@Column(name="bakim8")
	private String bakim8;
	
	@Column(name="bakim9")
	private String bakim9;
	
	@Column(name="bakim10")
	private String bakim10;
	
	@Column(name="bakim11")
	private String bakim11;
	
	@Column(name="bakim12")
	private String bakim12;
	
	@Column(name="bakim13")
	private String bakim13;
	
	@Column(name="bakim14")
	private String bakim14;
	
	@Column(name="bakim15")
	private String bakim15;
	
	@Column(name="bakim16")
	private String bakim16;
	
	@Column(name="bakim17")
	private String bakim17;
	
	@Column(name="bakim18")
	private String bakim18;
	
	@Column(name="bakim19")
	private String bakim19;
	
	@Column(name="bakim20")
	private String bakim20;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBakim1() {
		return bakim1;
	}

	public void setBakim1(String bakim1) {
		this.bakim1 = bakim1;
	}

	public String getBakim2() {
		return bakim2;
	}

	public void setBakim2(String bakim2) {
		this.bakim2 = bakim2;
	}

	public String getBakim3() {
		return bakim3;
	}

	public void setBakim3(String bakim3) {
		this.bakim3 = bakim3;
	}

	public String getBakim4() {
		return bakim4;
	}

	public void setBakim4(String bakim4) {
		this.bakim4 = bakim4;
	}

	public String getBakim5() {
		return bakim5;
	}

	public void setBakim5(String bakim5) {
		this.bakim5 = bakim5;
	}

	public String getBakim6() {
		return bakim6;
	}

	public void setBakim6(String bakim6) {
		this.bakim6 = bakim6;
	}

	public String getBakim7() {
		return bakim7;
	}

	public void setBakim7(String bakim7) {
		this.bakim7 = bakim7;
	}

	public String getBakim8() {
		return bakim8;
	}

	public void setBakim8(String bakim8) {
		this.bakim8 = bakim8;
	}

	public String getBakim9() {
		return bakim9;
	}

	public void setBakim9(String bakim9) {
		this.bakim9 = bakim9;
	}

	public String getBakim10() {
		return bakim10;
	}

	public void setBakim10(String bakim10) {
		this.bakim10 = bakim10;
	}

	public String getBakim11() {
		return bakim11;
	}

	public void setBakim11(String bakim11) {
		this.bakim11 = bakim11;
	}

	public String getBakim12() {
		return bakim12;
	}

	public void setBakim12(String bakim12) {
		this.bakim12 = bakim12;
	}

	public String getBakim13() {
		return bakim13;
	}

	public void setBakim13(String bakim13) {
		this.bakim13 = bakim13;
	}

	public String getBakim14() {
		return bakim14;
	}

	public void setBakim14(String bakim14) {
		this.bakim14 = bakim14;
	}

	public String getBakim15() {
		return bakim15;
	}

	public void setBakim15(String bakim15) {
		this.bakim15 = bakim15;
	}

	public String getBakim16() {
		return bakim16;
	}

	public void setBakim16(String bakim16) {
		this.bakim16 = bakim16;
	}

	public String getBakim17() {
		return bakim17;
	}

	public void setBakim17(String bakim17) {
		this.bakim17 = bakim17;
	}

	public String getBakim18() {
		return bakim18;
	}

	public void setBakim18(String bakim18) {
		this.bakim18 = bakim18;
	}

	public String getBakim19() {
		return bakim19;
	}

	public void setBakim19(String bakim19) {
		this.bakim19 = bakim19;
	}

	public String getBakim20() {
		return bakim20;
	}

	public void setBakim20(String bakim20) {
		this.bakim20 = bakim20;
	}
	
	

	@Override
	public String toString() {
		return "Bakim [id=" + id + ", bakim1=" + bakim1 + ", bakim2=" + bakim2 + ", bakim3=" + bakim3 + ", bakim4="
				+ bakim4 + ", bakim5=" + bakim5 + ", bakim6=" + bakim6 + ", bakim7=" + bakim7 + ", bakim8=" + bakim8
				+ ", bakim9=" + bakim9 + ", bakim10=" + bakim10 + ", bakim11=" + bakim11 + ", bakim12=" + bakim12
				+ ", bakim13=" + bakim13 + ", bakim14=" + bakim14 + ", bakim15=" + bakim15 + ", bakim16=" + bakim16
				+ ", bakim17=" + bakim17 + ", bakim18=" + bakim18 + ", bakim19=" + bakim19 + ", bakim20=" + bakim20
				+ "]";
	}
	
	public String [] toStringArray(){
		
		String [] dizi = new String [20];
		
		dizi[0] = bakim1;
		dizi[1] = bakim2;
		dizi[2] = bakim3;
		dizi[3] = bakim4;
		dizi[4] = bakim5;
		dizi[5] = bakim6;
		dizi[6] = bakim7;
		dizi[7] = bakim8;
		dizi[8] = bakim9;
		dizi[9] = bakim10;
		dizi[10] = bakim11;
		dizi[11] = bakim12;
		dizi[12] = bakim13;
		dizi[13] = bakim14;
		dizi[14] = bakim15;
		dizi[15] = bakim16;
		dizi[16] = bakim17;
		dizi[17] = bakim18;
		dizi[18] = bakim19;
		dizi[19] = bakim20;
		
		return dizi;
	}
	
	public String [] urunListesi() {
		String [] dizi = {"-","40'lık Tank" , "1 Micron" , "5 Micron" , "Adaptör" , "Blok Carbon" , "Carbon" , "Mineral Filtre"
				,"Musluk" , "Sebil Musluk" , "Selement" , "Su Sebili" , "Tatlandırıcı" , "Mebran" , "Hat Alma Vanası" , "Tank Vanası", "Motor"};
		
		return dizi;
	}
	
	public void arrayToBakim(String [] dizi) {
		bakim1 = dizi[0];
		bakim2 = dizi[1];
		bakim3 = dizi[2];
		bakim4 = dizi[3];
		bakim5 = dizi[4];
		bakim6 = dizi[5];
		bakim7 = dizi[6];
		bakim8 = dizi[7];
		bakim9 = dizi[8];
		bakim10 = dizi[9];
		bakim11 = dizi[10];
		bakim12 = dizi[11];
		bakim13 = dizi[12];
		bakim14 = dizi[13];
		bakim15 = dizi[14];
		bakim16 = dizi[15];
		bakim17 = dizi[16];
		bakim18 = dizi[17];
		bakim19 = dizi[18];
		bakim20 = dizi[19];
	}
	
	
}
