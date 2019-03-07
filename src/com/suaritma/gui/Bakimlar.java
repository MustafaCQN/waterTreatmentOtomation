package com.suaritma.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

import com.suaritma.entity.Bakim;
import com.suaritma.entity.Musteri;
import com.suaritma.entity.Urun;

public class Bakimlar extends javax.swing.JFrame {

	public Musteri musteri;
	public Bakim b1;
	public List tempBakim;
	public String sonuc;
	public int sonDeger;
	public String vtAy;
	public List tempBakimlar;
	public int x,y;
	public Point point = null;
	public boolean Duzenle = false;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public Date tarih;
    
    public Bakimlar() {
        initComponents();
    }
    public Bakimlar(Musteri musteri) {
    	this.musteri = musteri;
    	initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	
    	b1 = new Bakim();
    	

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kaydetButon = new javax.swing.JButton();
        geriButon = new javax.swing.JButton();
        duzenleButon = new javax.swing.JButton();
        silButon = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        bakimlarKayit = new javax.swing.JScrollPane();
        bakimlarTablo = new javax.swing.JTable();
        bakimTarih = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        isim = new javax.swing.JLabel(musteri.getIsim());
        telNo = new javax.swing.JLabel(musteri.getTelNo());
        cihazModeli = new javax.swing.JLabel(musteri.getCihazModeli());
        soyÝsim = new javax.swing.JLabel(musteri.getSoyIsim());
        /*System.out.println("musteri adres uzunluðu : " + musteri.getAdres().length());
        if(musteri.getAdres().length() > 70) {
        	System.out.println("if bloðu adres çok uzun");
        	adres = new javax.swing.JLabel("<html>" +musteri.getAdres().substring(0, 50) + "<br>" + musteri.getAdres().substring(50) + "</html>");
    	}else
    		adres = new javax.swing.JLabel(musteri.getAdres());*/
        adres = new javax.swing.JTextArea(musteri.getAdres());
        jLabel14 = new javax.swing.JLabel();

        adres.setBackground(new Color(240, 240, 240));
        adres.setEditable(false);
        adres.setFont(new java.awt.Font("SansSerif", 1, 12));
        adres.setLineWrap(true);
        adres.setPreferredSize(new Dimension(200,500));
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 500));
        
        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Box_48px_3.png"))); // NOI18N
        jLabel1.setText("BAKIMLAR SAYFASI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 320, 40));

        jLabelMin.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMin.setText("_");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMinMousePressed(evt);
            }
        });
        jPanel1.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, -1, -1));

        exit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jPanel1.addMouseListener(new MouseAdapter(){
        	public void mousePressed(MouseEvent evt) {
        		jPanel1MousePressed(evt);
        	}
        	
        	public void mouseReleased(MouseEvent evt) {
        		jPanel1MouseReleased(evt);
        	}
        	
        });
        
        jPanel1.addMouseMotionListener(new MouseMotionAdapter() {
        	public void mouseDragged(MouseEvent evt) {
        		jPanel1MouseDragged(evt);
        	}
		});
        
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("DEÐÝÞTÝRÝLEN PARÇALAR:");

        kaydetButon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kaydetButon.setText("KAYDET");
        
        kaydetButon.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent evt) {
        		kaydetButonMouseClicked(evt);
        	}
        });

        geriButon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        geriButon.setText("GERÝ");
        
        geriButon.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent evt){
        		geriButonMouseClicked(evt);
        	}
        });

        duzenleButon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        duzenleButon.setText("DÜZENLE");
        duzenleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duzenleButonActionPerformed(evt);
            }
        });

        silButon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        silButon.setText("SÝL");
        
        silButon.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent evt) {
        		silButonMouseClicked(evt);
        	}
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        bakimlarKayit.setMinimumSize(new java.awt.Dimension(200, 200));
        bakimlarKayit.setPreferredSize(new java.awt.Dimension(200, 200));

        bakimlarTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "BAKIMLAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bakimlarKayit.setViewportView(bakimlarTablo);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Conference_48px.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel4.setText("AD : ");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel5.setText("SOYAD : ");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel6.setText("TEL NO:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel7.setText("CÝHAZ MODELÝ :");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel8.setText("ADRES :");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setText("BAKIM TARÝHÝ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(geriButon)
                                .addGap(166, 166, 166)
                                .addComponent(duzenleButon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(silButon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kaydetButon))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bakimTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isim, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telNo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soyÝsim, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cihazModeli, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(bakimlarKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bakimlarKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(isim, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyÝsim, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telNo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cihazModeli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakimTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duzenleButon)
                    .addComponent(silButon)
                    .addComponent(geriButon)
                    .addComponent(kaydetButon))
                .addGap(52, 52, 52))
        );

        tabloOlustur();       
        
        pack();
    }// </editor-fold>   
    
    private void jPanel1MouseDragged(MouseEvent evt) {
    	Point nokta = evt.getLocationOnScreen();
    	this.setLocation(nokta.x - point.x , nokta.y - point.y);
    }
    
    private void jPanel1MouseReleased(MouseEvent evt) {
    	point = null;
    }
    
    private void jPanel1MousePressed(MouseEvent evt) {
    	point = evt.getPoint();
    }

    private void duzenleButonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	int satir = -1;
    	try {

        	satir = bakimlarTablo.getSelectedRow();
		} catch (Exception e) {
			satir = -1;
			System.out.println(e + "hatasý aldýk CATCH BLOÐU");
		}
    	if(satir != -1){
    		bakimDuzenle(satir);	
    	}
    }          
    
    private void bakimDuzenle(int satirDegeri) {
    	System.out.println(satirDegeri);
    	Bakim bakim = musteri.getBakim();
    	String [] bakimDizisi = bakim.toStringArray();
    	System.out.println(bakimDizisi[satirDegeri]);
    	String [] dizi =  bakimDizisi[satirDegeri].split("\\.");
    	
    	if(dizi[3].charAt(0) == '1') {
    		jComboBox1.setSelectedIndex(1);    		
    	}
    	else
    		jComboBox1.setSelectedIndex(0);
    	if(dizi[3].charAt(1) == '1') {
    		jComboBox2.setSelectedIndex(2);    		
    	}
    	else
    		jComboBox2.setSelectedIndex(0);
    	if(dizi[3].charAt(2) == '1') {
    		jComboBox3.setSelectedIndex(3);    		
    	}
    	else
    		jComboBox3.setSelectedIndex(0);
    	if(dizi[3].charAt(3) == '1') {
    		jComboBox4.setSelectedIndex(4);    		
    	}
    	else
    		jComboBox4.setSelectedIndex(0);
    	if(dizi[3].charAt(4) == '1') {
    		jComboBox5.setSelectedIndex(5);    		
    	}
    	else
    		jComboBox5.setSelectedIndex(0);
    	if(dizi[3].charAt(5) == '1') {
    		jComboBox6.setSelectedIndex(6);    		
    	}
    	else
    		jComboBox6.setSelectedIndex(0);
    	if(dizi[3].charAt(6) == '1') {
    		jComboBox7.setSelectedIndex(7);    		
    	}
    	else
    		jComboBox7.setSelectedIndex(0);
    	
    	try {
    		bakimTarih.setDate(new SimpleDateFormat("dd.MM.yyyy").parse(dizi[0] + "." + dizi[1] + "." + dizi[2]));
		} catch (ParseException e) {
			System.out.println("bakimTarih.setDate --> Hata aldýk " + e.getMessage());
		}
    	
    	Duzenle = true;
    	
    		
    	
    }
    
    private void silButonMouseClicked(MouseEvent evt) {
    	int satir = -1;
    	try {

        	satir = bakimlarTablo.getSelectedRow();
		} catch (Exception e) {
			satir = -1;
			System.out.println(e + "hatasý aldýk CATCH BLOÐU");
		}
    	if(satir != -1){
    		bakimSil(satir);	
    		dispose();
    	}
    	
    }
    
    private void bakimSil(int satirDegeri) {
    	// BÝTMEDÝ ! !! ! ! ! !!! ! ! !  ! 
    	
    	Bakim bakim = musteri.getBakim();
    	String [] bakimDizisi = bakim.toStringArray();
    	
    	Object[] options = {
    			"Tamam",
    			"Vazgeç"
    	};
    	int sonuc = JOptionPane.showOptionDialog(bakimlarTablo, "Silmek istediðinizden Eminmisiniz", "UYARI",
    			JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
    			null, options, options[0]);
    	
    	if(sonuc == 0) {
    		// bakýmý sil
    		SessionFactory factory = new Configuration()
    				.configure("hibernate.cfg.xml")
    				.addAnnotatedClass(Musteri.class)
    				.addAnnotatedClass(Bakim.class)
    				.buildSessionFactory();
    		
    		// silinen satýra silindi yazýyoruz veya diðer bakýmlarý bir üst satýra yolluyoruz
    		bakimDizisi[satirDegeri] = null;
    		
    		// burada eðer bakýmlar arasý açýldýysa kapatmak için bakýmlarýn yerini deðiþtiriyoruz
    		bakimDizisi = arayiKapat(bakimDizisi); 
    		
    		// düzenlenen bakýmlar dizisi bakým nesnesine yollandý böylece yapýlan deðiþiklik kaydedilmiþ oldu
    		bakim.arrayToBakim(bakimDizisi);

        	Session session = factory.getCurrentSession();
        	try {
        		session.beginTransaction();
        		
        		// yapýlan deðiþikliði veri tabanýna da kaydetmek için musteri nesnemizi guncelliyoruz
        		session.update(musteri);
        		
            	session.getTransaction().commit();
        		
        		System.out.println("Done !");
        		
        		// eðer anlýk bir tablo deðiþimi istiyorsan tablo güncelle fonksiyonunu yazmamýz gerekiyor
        		//tabloGuncelle();
    			
    		} finally {
    			session.close();
    			factory.close();
    		}
    	}
    	
    }
    
    private String [] arayiKapat(String [] dizi) {
    	String [] duzenliDizi = new String [20];
    	int i = 0;
    	for(String eleman : dizi) {
    		System.out.println("Eleman: " + eleman + "\t i: "+ i);
    		if(eleman == null) {
    			continue;
    		}
    		duzenliDizi[i] = eleman;
    		i++;
    	}
    	
    	return duzenliDizi;
    }
    
    private void kaydetButonMouseClicked(MouseEvent evt) {
    	System.out.println("kaydetButonMouseClicked");
    	sonDeger = 0;
    	// burada kaydet butonuna týklandýktan sonra gelen bilgileri veri tabanýna kaydedicez
    	// bilgiler belirli bir düzenle kaydedilicek
    	// tamamen sayý olacaklar ancak string biçimde veri tabanýna kaydedilip çekilicekler
    	// 0618201800101011101000101
    	// 06 = ay 18 = gün 2018 = yýl 0 = 1. bakým 0 = 2. bakým .... diye gidicek 
    	String seciliBakim1 = jComboBox1.getSelectedItem().toString();
    	String seciliBakim2 = jComboBox2.getSelectedItem().toString();
    	String seciliBakim3 = jComboBox3.getSelectedItem().toString();
    	String seciliBakim4 = jComboBox4.getSelectedItem().toString();
    	String seciliBakim5 = jComboBox5.getSelectedItem().toString();
    	String seciliBakim6 = jComboBox6.getSelectedItem().toString();
    	String seciliBakim7 = jComboBox7.getSelectedItem().toString();
    	String seciliBakim8 = jComboBox8.getSelectedItem().toString();
    	String sonCumle = "";
    	Date tarih;
    	try {
    		tarih = new Date(bakimTarih.getDate().getTime());
		} catch (NullPointerException e) {
			// null pointer exception
			tarih = null;
		}
    	// eðer tarih seçilmemiþse kapatmamýz gerekicek
    	if(tarih == null) {
    		// burada bir mesaj vericez ve ekraný ya kapatýcaz yada tekrar ayný yere geri dönücez
    		//dispose();
    		JOptionPane.showMessageDialog(bakimlarTablo, "Lütfen Geçerli Bir Tarih Giriniz.");
    		return;
    	}
    	
    	//System.out.println("toString tarih: "+tarih.toString().split(" "));
    	String [] dizi = tarih.toString().split(" ");
    	//System.out.println(dizi[0]); // hafta günü
    	//System.out.println(dizi[1]); // ay
    	//System.out.println(dizi[2]); // ay günü
    	//System.out.println(dizi[3]); // saat 
    	//System.out.println(dizi[4]); // zaman formatý
    	//System.out.println(dizi[5]); // yýl
    	//System.out.println("gettime tarih: "+tarih.getTime());
    	
    	String ay = ayOgren(dizi[1]);
    	String hafta = haftaOgren(dizi[0]);
    	
    	sonCumle += dizi[2] + " " + ay + " " + hafta + " " + dizi[5] + " ->";
    	
    	// burada seçili ürünlerin hangisi seçildiðini bulucaz ve ona göre yapýlan bakýmlarý belirliyeceðiz
    	if(!(seciliBakim1.equals("-"))) {
    		hangiUrun(seciliBakim1);
    	}
    	if(!(seciliBakim2.equals("-"))) {
    		hangiUrun(seciliBakim2);;
    	}
    	if(!(seciliBakim3.equals("-"))) {
    		hangiUrun(seciliBakim3);
    	}
    	if(!(seciliBakim4.equals("-"))) {
    		hangiUrun(seciliBakim4);
    	}
    	if(!(seciliBakim5.equals("-"))) {
    		hangiUrun(seciliBakim5);
    	}
    	if(!(seciliBakim6.equals("-"))) {
    		hangiUrun(seciliBakim6);
    	}
    	if(!(seciliBakim7.equals("-"))) {
    		hangiUrun(seciliBakim7);
    	}
    	if(!(seciliBakim8.equals("-"))) {
    		hangiUrun(seciliBakim8);
    	}
    	//System.out.println("sonDeger: "+ sonDeger);
    	
    	String binaryStringSonDeger = Integer.toBinaryString(sonDeger);
    	while(binaryStringSonDeger.length() < 16) {
    		binaryStringSonDeger = "0" + binaryStringSonDeger;
    	}
    	
    	String [] binaryDegerDizisi = binaryBakimToStringBakim(binaryStringSonDeger);
    	
    	sonCumle += " " + binaryDegerDizisi[0] + " " + binaryDegerDizisi[1] + " " + binaryDegerDizisi[2] + " " +
    			 binaryDegerDizisi[3] + " " + binaryDegerDizisi[4] + " " + binaryDegerDizisi[5] + " " +
    			binaryDegerDizisi[6] + " deðiþtirildi";
    	
    	//sonCumle += Integer.toString(sonDeger) + " deðiþtirildi";
    	
    	//System.out.println(sonCumle);
    	
    	/*String sonDegerSonHal = Integer.toString(sonDeger);
    	while(sonDegerSonHal.length() < 7) {
    		sonDegerSonHal = "0" + sonDegerSonHal;
    	}*/
    	
    	// burada bakým gerçekten yapýlmýþ mý diye kontrol edicez
    	if(!bakimIlkKontrol(binaryStringSonDeger)) {
    		// burada hata mesajý verip müþterinin geçerli bir tarih girmesini saðlayacaðýz
    		
    		JOptionPane.showMessageDialog(bakimlarTablo, "Lütfen Geçerli Bir Bakým Giriniz.");
    		return;
    		
    	}
    	
    	// bu deðer veritabanýna kaydedilicek
    	String veriTabani = dizi[2] + "." + vtAy + "." + dizi[5] + "." + binaryStringSonDeger;
    	
    	
    	
    	System.out.println(veriTabani);
    	
    	b1 = musteri.getBakim();
    	
    	System.out.println("Duzenle: " + Duzenle);
    	
    	if(Duzenle == true) {
    		duzenleButonKaydet(b1,veriTabani);
    		Duzenle = false;
    		dispose();
    		return;
    	}
    	
    	System.out.println(veriTabani);
    	
    	if(!stoktanDus(binaryStringSonDeger)) {
    		JOptionPane.showMessageDialog(bakimlarTablo, "Bakým Yapmak Istediðiniz Üründen hiç kalmamýþ\nveya "
    				+ "Stokda hiç bulunmuyor");
    		return;
    	}
    	
    	
    	bosBakimAra(b1, veriTabani);
    	
    	
    	veritabaniKaydet(b1);
    	
    	dispose();
    	
    	
    	// kaydet buton fonksiyonu sonu
    }
    
    private boolean bakimIlkKontrol(String deger) {
    	System.out.println("bakimIlkKontrol : " +  deger);
    	String [] dizi = deger.split("");
    	boolean sonuc = false;
    	for(String a : dizi) {
    		if(a.equals("1")) {
    			sonuc = true;
    		}
    	}
    	return sonuc;
    }
    
    private boolean stoktanDus(String deger) {
    	System.out.println("stoktanDus: " + deger);
    	boolean oldumu = false;
    	
    	// gelen bakým deðerlerini parçalayýp dizimize attýk
    	String [] dizi = deger.split("");
    	
    	// bakým deðerlerini tek tek 1 veya 0 mý diye kontrol edicez ve 
    	// 1 olan yerlerde o itemi stokdan düþücez
    	// ancak eðer stoktaki item sayýsý 0'ýn altýna düþerse hata vericez
    	// düþemezsiniz diyicez
    	for (int i = 0; i < 7; i++) {
    		if(dizi[i].equals("1")) {
        		// hangi deðer seçiliyse onun adýný yollayacaðýz
        		oldumu = stokDusVtIslemleri(jComboBox1.getModel().getElementAt(i+1));
        		if(!oldumu) {
        			return oldumu;
        		}
        	}
		}
    	return oldumu;
    }
    
    private boolean stokDusVtIslemleri(String item) {
    	// hata var itemleri tek tek yolladýðý için bir sonraki item 0 dan küçükse öncekilerin kayýtlarý silinmiyor
    	System.out.println("stokDusVtIslemleri : " + item);
    	
    	List u1 = null;
    	Urun urun = null;
    	
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Urun.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	try {
    		
    		session.beginTransaction();
    		
    		try {
    			u1 = session.createQuery("from Urun where urunAdi=:item").setParameter("item", item).list();
			} catch (Exception e) {
				// catch e geliyorsa o öðe veri tabanýnda yok bile demek
				System.out.println("hata" + e.getMessage());
				return false;
			}
    		
    		if(u1.iterator().hasNext()) {
    			urun = (Urun)u1.iterator().next();
    		}else {
    			// bitmedi burada da hata vericez
    			System.out.println("hata u1 in nexti yok");
    			return false;
    		}
    		
    		if(urun.getAdet() <= 0) {
    			// bitmedi
    			// burada hata mesajý vericez çünkü o itemden hiç kalmamýþ
    			urun.setAdet(0);
    			session.update(urun);
    			System.out.println("Üründen hiç Kalmamýþ");
    			return false;
    		}
    		
    		urun.setAdet(urun.getAdet() - 1);
    		
    		session.update(urun);
			
		} finally {
			session.getTransaction().commit();
			session.close();
			factory.close();
		}
    	
    	return true;
    		
    	
    }
    
    private void duzenleButonKaydet(Bakim b1 , String vtDegeri) {
    	System.out.println("duzenleButonKaydet");
    	int satir = -1;
    	try {

        	satir = bakimlarTablo.getSelectedRow();
		} catch (Exception e) {
			satir = -1;
			System.out.println(e + "hatasý aldýk CATCH BLOÐU");
		}
    	if(satir != -1){
    		
    		String [] bakimDizi = b1.toStringArray();
    		
    		if(!(bakimDizi[satir].equals(vtDegeri))) {
    			
    			bakimDizi[satir] = vtDegeri;
    			b1.arrayToBakim(bakimDizi);
    			veritabaniKaydet(b1);
    			
    		}
    		
    	}
    }
    
    private void bosBakimAra(Bakim b1 , String vtCumle) {
    	System.out.println("bosBakimAra");
    	//System.out.println(b1.getBakim1());
    	if(b1.getBakim1() == null) {
    		b1.setBakim1(vtCumle);
    		musteri.setBakim(b1);
    		System.out.println(musteri.getBakim().getBakim1());
    		System.out.println(b1.getBakim1());
    		return;
    	}else if(b1.getBakim2() == null) {
    		b1.setBakim2(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim3() == null) {
    		b1.setBakim3(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim4() == null) {
    		b1.setBakim4(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim5() == null) {
    		b1.setBakim5(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim6() == null) {
    		b1.setBakim6(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim7() == null) {
    		b1.setBakim7(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim8() == null) {
    		b1.setBakim8(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim9() == null) {
    		b1.setBakim9(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim10() == null) {
    		b1.setBakim10(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim11() == null) {
    		b1.setBakim11(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim12() == null) {
    		b1.setBakim12(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim13() == null) {
    		b1.setBakim13(vtCumle);
    		musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim14() == null) {
    		b1.setBakim14(vtCumle);musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim15() == null) {
    		b1.setBakim15(vtCumle);musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim16() == null) {
    		b1.setBakim16(vtCumle);musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim17() == null) {
    		b1.setBakim17(vtCumle);musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim18() == null) {
    		b1.setBakim18(vtCumle);musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim19() == null) {
    		b1.setBakim19(vtCumle);musteri.setBakim(b1);
    		return;
    	}else if(b1.getBakim20() == null) {
    		b1.setBakim20(vtCumle);musteri.setBakim(b1);
    		return;
    	}
    	// sonradan eklenecek (EÐER 20 TANE BAKIM KAYITLI ÝSE 1. BAKIM SÝLÝNÝP 21. BAKIM YAZILACAK)
    	
    }
    
    private void tabloOlustur() {
    	System.out.println("tabloOlustur");
    	
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Musteri.class)
				.addAnnotatedClass(Bakim.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	
    	try {
    		session.beginTransaction();
    		
    			tempBakimlar = session.createQuery("from Bakim b where b.id=:bakimId ").setParameter("bakimId", musteri.getBakim().getId()).list();
    			DefaultTableModel model = (DefaultTableModel) bakimlarTablo.getModel();
    			
    			Bakim b1 = session.get(Bakim.class , musteri.getBakim().getId());
    			
    			String [] dizi = b1.toStringArray();
    			
    			dizi = degerCozumleyici(dizi);
    			
    			System.out.println(dizi[0]);
    			
    			if(dizi == null)
    				return;
    			
    			for(String eleman : dizi) {
    				if(eleman == null)
    					continue;
    				model.addRow(new Object[] {
    					eleman
    				});
    			}
    			
    			bakimlarTablo.setModel(model);
    		
        	session.getTransaction().commit();
    		
    		System.out.println("Done !");
			
		} finally {
			session.close();
			factory.close();
		}
    	
    }
    
    private String [] degerCozumleyici(String [] dizi) {
    	System.out.println("degerCozumleyici");
    	String [] sonDizi;
    	String [] bakimDizisi;
    	String [] sonCumleDizisi = new String [20];
    	String tabloStringCumle;
    	int i =0;
    	if(dizi == null)
    		return null; 
    	for(String eleman : dizi) {
    		   	if(eleman == null)
    		   		continue;
    		System.out.println(eleman);
    		System.out.println(eleman.split("\\.").length);
    		sonDizi = eleman.split("\\."); 
    		
    		if(sonDizi[3] == "0000000") {
    			sonCumleDizisi[i] = " silindi ";
    			continue;
    		}
    		
    		bakimDizisi = sonDizi[3].split("(?!^)");
    		tabloStringCumle = bakimDizisiToTabloString(bakimDizisi);
    		sonCumleDizisi[i] = sonDizi[0] + "." + sonDizi[1] + "." + sonDizi[2] + "->" + tabloStringCumle; 
    		i++;
    	}
    	
    	return sonCumleDizisi;
    	
    }
    
    private String bakimDizisiToTabloString(String [] dizi) {
    	b1 = new Bakim();
    	System.out.println("bakimDizisiToTabloString");
    	String bakimDizisiCumlesi = "";
    	String [] urunListesi = b1.urunListesi();
    	System.out.println("Urun Listesi: "+urunListesi[1]);
				System.out.println("Dizi: "+dizi[1]);
    	for (int i = 0; i < dizi.length; i++) {
			if(dizi[i].equals("1")) {
				bakimDizisiCumlesi += urunListesi[i+1] + " - ";
			}
		}
    	
    	
    	/*if(dizi[0].equals("1")) {
    		bakimDizisiCumlesi += "Item 1 ";
    	}
    	if(dizi[1].equals("1")) {
    		bakimDizisiCumlesi += "Item 2 "; 
    	}
    	if(dizi[2].equals("1")) {
    		bakimDizisiCumlesi += "Item 3 ";
    	}
    	if(dizi[3].equals("1")) {
    		bakimDizisiCumlesi += "Item 4 ";
    	}
    	if(dizi[4].equals("1")) {
    		bakimDizisiCumlesi += "Item 5 ";
    	}
    	if(dizi[5].equals("1")) {
    		bakimDizisiCumlesi += "Item 6 "; 
    	}
    	if(dizi[6].equals("1")) {
    		bakimDizisiCumlesi += "Item 7 ";
    	}*/
    	
    	return bakimDizisiCumlesi + "deðiþtirildi." ;
    	
    }
    
    private void veritabaniKaydet(Bakim b1) {
    	System.out.println("veritabaniKaydet");
    	
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Bakim.class)
				.addAnnotatedClass(Musteri.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	try {
    		session.beginTransaction();
    		
    		session.update(musteri);
    		
    		System.out.println("Done !");
    		
    		session.getTransaction().commit();
			
		} finally {
			session.close();
			factory.close();
		}
    	
    }
    
    private String [] binaryBakimToStringBakim(String stringDeger) {
    	b1 = new Bakim();
    	System.out.println("binaryBakimToStringBakim : " + stringDeger);
    	String [] urunListesi = b1.urunListesi();
    	String [] dizi = new String [b1.urunListesi().length-1];
    	//String stringDeger = Integer.toString(deger);
    	
    	/*while(stringDeger.length() < 7) {
    		stringDeger = "0" + stringDeger;
    	}*/
    	
    	for (int i = 0; i < dizi.length; i++) {
			if (stringDeger.charAt(i) != '0') {
				dizi[i]	= urunListesi[i+1];
			}
    		
    		
		}
    	
    	/*if(stringDeger.charAt(0) != '0') {
    		dizi[0] = "Item 1";
    	}else
    		dizi[0] = "";
    	if(stringDeger.charAt(1) != '0') {
    		dizi[1] = "Item 2";
    	}else
    		dizi[1] = "";
    	if(stringDeger.charAt(2) != '0') {
    		dizi[2] = "Item 3";
    	}else
    		dizi[2] = "";
    	if(stringDeger.charAt(3) != '0') {
    		dizi[3] = "Item 4";
    	}else
    		dizi[3] = "";
    	if(stringDeger.charAt(4) != '0') {
    		dizi[4] = "Item 5";
    	}else
    		dizi[4] = "";
    	if(stringDeger.charAt(5) != '0') {
    		dizi[5] = "Item 6";
    	}else
    		dizi[5] = "";
    	if(stringDeger.charAt(6) != '0') {
    		dizi[6] = "Item 7";
    	}else
    		dizi[6] = "";*/
    	
    	return dizi;
    }
    
    private String haftaOgren(String deger) {
    	String sonuc = null;
    	if(deger.equals("Mon")) {
    		sonuc = "Pazartesi";
    	}else if(deger.equals("Tue")) {
    		sonuc = "Salý";
    	}else if(deger.equals("Wed")) {
    		sonuc = "Çarþamba";
    	}else if(deger.equals("Thu")) {
    		sonuc = "Perþembe";
    	}else if(deger.equals("Fri")) {
    		sonuc = "Cuma";
    	}else if(deger.equals("Sat")) {
    		sonuc = "Cumartesi";
    	}else if(deger.equals("Sun")) {
    		sonuc = "Pazar";
    	}
    	return sonuc;
    }
    
    private String ayOgren(String deger) {
    	String sonuc = null;
    	if(deger.equals("Jan")) {
    		sonuc = "Ocak";
    		vtAy = "01";
    	}else if(deger.equals("Feb")) {
    		sonuc = "Þubat";
    		vtAy = "02";
    	}else if(deger.equals("Mar")) {
    		sonuc = "Mart";
    		vtAy = "03";
    	}else if(deger.equals("Apr")) {
    		sonuc = "Nisan";
    		vtAy = "04";
    	}else if(deger.equals("May")) {
    		sonuc = "Mayýs";
    		vtAy = "05";
    	}else if(deger.equals("Jun")) {
    		sonuc = "Haziran";
    		vtAy = "06";
    	}else if(deger.equals("Jul")) {
    		sonuc = "Temmuz";
    		vtAy = "07";
    	}else if(deger.equals("Aug")) {
    		sonuc = "Aðustos";
    		vtAy = "08";
    	}else if(deger.equals("Sep")) {
    		sonuc = "Eylül";
    		vtAy = "09";
    	}else if(deger.equals("Oct")) {
    		sonuc = "Ekim";
    		vtAy = "10";
    	}else if(deger.equals("Nov")) {
    		sonuc = "Kasým";
    		vtAy = "11";
    	}else if(deger.equals("Dec")) {
    		sonuc = "Aralýk";
    		vtAy = "12";
    	}
    	return sonuc;
    }
    
    private void hangiUrun(String deger) {
    	b1 = new Bakim();
    	String [] urunler = b1.urunListesi();
    	String son = "";
    	System.out.println("hangiUrun : " + deger);
    	int bir=0;
    			//int iki=0,uc=0,dort=0,bes=0,alti=0,yedi=0;    	
    	for (String string : urunler) {
    		if(!(deger.equals("-")) && deger.equals(string)){
        		bir = 1;
        	}else
        		bir = 0;
    		son += bir;
		}
    	
    	//String son = bir + "" + iki + "" + uc + "" + dort + "" + bes + "" + alti + "" + yedi; 
    	// sondeger bizim tüm deðiþen parçalarý listelediðimiz yer olacak ör (1012101) gibi bir deðer alýcak
    	sonDeger += Integer.parseInt(son, 2);
    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }             
    
    private void geriButonMouseClicked(MouseEvent evt) {
    	dispose();
    }

    private void exitMousePressed(java.awt.event.MouseEvent evt) {                                  
    	dispose();
    }                                 

    private void jLabelMinMousePressed(java.awt.event.MouseEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }                                      

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bakimlar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    //private javax.swing.JLabel adres;
    private javax.swing.JTextArea adres;
    private com.toedter.calendar.JDateChooser bakimTarih;
    private javax.swing.JScrollPane bakimlarKayit;
    private javax.swing.JTable bakimlarTablo;
    private javax.swing.JLabel cihazModeli;
    private javax.swing.JButton duzenleButon;
    private javax.swing.JLabel exit;
    private javax.swing.JButton geriButon;
    private javax.swing.JLabel isim;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kaydetButon;
    private javax.swing.JButton silButon;
    private javax.swing.JLabel soyÝsim;
    private javax.swing.JLabel telNo;
    // End of variables declaration                   
}

