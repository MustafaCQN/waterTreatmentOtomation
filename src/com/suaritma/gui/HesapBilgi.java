package com.suaritma.gui;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

import com.suaritma.entity.Bakim;
import com.suaritma.entity.Hesap;
import com.suaritma.entity.Musteri;


public class HesapBilgi extends javax.swing.JFrame {

	public Hesap h1;
	public Hesap hesap;
	public List tempHesaplar;
	public float gunlukHesap = 0;
	public float toplamHesap = 0;
	public float gunlukNetHesap = 0;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public Date tarih = null;
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	public int x,y;
	public Point point = null;
    
    public HesapBilgi() {
    	tabloOlustur();
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        kaydetButonu = new javax.swing.JButton();
        geri = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ekle = new javax.swing.JTextField();
        silin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gunlukToplam = new javax.swing.JLabel(Float.toString(gunlukHesap));
        gunlukNetKazanc = new javax.swing.JLabel(Float.toString(gunlukNetHesap));
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        netKazanc = new javax.swing.JLabel(Float.toString(toplamHesap));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(788, 475));

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Money_Bag_48px_1.png"))); // NOI18N
        jLabel1.setText("HESAP BÝLGÝ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, 40));

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
        
        jLabelMin.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMin.setText("_");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMinMousePressed(evt);
            }
        });
        jPanel1.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 20, -1));

        exit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        kaydetButonu.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        kaydetButonu.setText("KAYDET");
        kaydetButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaydetButonuMouseClicked(evt);
            }
        });

        geri.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        geri.setText("GERÝ");
        geri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriMouseClicked(evt);
            }
        });
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("EKLE :");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("SÝL :");

        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });

        silin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silinActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("GÜNLÜK TOPLAM:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("GÜNLÜK NET KAZANÇ:");

        gunlukNetKazanc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("NET KAZANÇ:");

        netKazanc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(geri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kaydetButonu)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(silin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gunlukNetKazanc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(gunlukToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(netKazanc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(484, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {geri, kaydetButonu});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gunlukToplam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gunlukNetKazanc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(netKazanc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geri)
                    .addComponent(kaydetButonu))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(329, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(121, 121, 121)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {geri, kaydetButonu});

        pack();
    }// </editor-fold>   
    
    private void tabloOlustur() {
    	System.out.println("tabloOlustur");
    	
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Hesap.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	
    	try {
    		session.beginTransaction();
    		
    			tempHesaplar = session.createQuery("from Hesap b").list();
    			hesap = null;
    			
    			for (Iterator iter = tempHesaplar.iterator();iter.hasNext();) {
					hesap = (Hesap)iter.next();
					if(hesap == null) {
						continue;
					}
					else
						break;
				}
    			
    			if(hesap == null) {
    				System.out.println("HESAP YOK");
    				hesap = hesapOlustur();
    			}
    			
    			toplamHesap = hesap.getToplamKazanc();
    			tarih = hesap.getTarih();
    			
    			System.out.println("tarih : " + df.format(tarih) + "\n" + "new Date : " + df.format(new Date()));
    			
    			if(df.format(tarih).equals(df.format(new Date()))) {
    				gunlukHesap = hesap.getGunlukKazanc();
        			gunlukNetHesap = hesap.getGunlukNetKazanc();
    			}
    			
    		
    		System.out.println("Done !");
			
		} finally {
			session.getTransaction().commit();
			session.close();
			factory.close();
		}
    	
    	
    }
    
    private Hesap hesapOlustur() {
    	
    	Hesap h1 = new Hesap();
    	h1.setGunlukKazanc(0);
    	h1.setTarih(new Date());
    	h1.setToplamKazanc(0);
    	h1.setGunlukNetKazanc(0);
    	
    	return h1;
    	
    }

    private void kaydetButonuMouseClicked(java.awt.event.MouseEvent evt) { 
    	
    	if(!(ekle.getText().equals("")) || !(silin.getText().equals(""))) {
    		
    		if(silin.getText().equals("")) {
    			silin.setText("0");
    		}else if(ekle.getText().equals("")) {
    			ekle.setText("0");
    		}
    		
    		try {
    			gunlukNetHesap += Float.parseFloat(ekle.getText());
        		gunlukHesap += Float.parseFloat(ekle.getText()) - Float.parseFloat(silin.getText());	
        		toplamHesap += Float.parseFloat(ekle.getText()) - Float.parseFloat(silin.getText());
        		
        		System.out.println("parselar tamamlandý.");
        		
        		gunlukToplam.setText(""+gunlukHesap);
        		gunlukNetKazanc.setText(""+gunlukNetHesap);
        		netKazanc.setText(""+toplamHesap);
        		
    		}catch(Exception e) {
    			System.out.println("Error Parse lütfen doðru bir deðer giriniz : " + e.getMessage() );
    			return;
    		}
    	}
    	else {
    		System.out.println("Tüm Girdiler Boþ");
    		return;
    	}
    	
    	System.out.println("gunlukNetHesap : " + gunlukNetHesap);
    	System.out.println("gunlukHesap : " + gunlukHesap);
    	
    	vtHesapislemleri();
    	
    	ekle.setText("");
    	silin.setText("");
    	
    }                      
    
    private void vtHesapislemleri() {
    	
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Hesap.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	
    	try {
    		session.beginTransaction();
    			
    		hesap.setGunlukKazanc(gunlukHesap);
    		hesap.setGunlukNetKazanc(gunlukNetHesap);
    		hesap.setToplamKazanc(toplamHesap);
    		
    		session.saveOrUpdate(hesap);
    		
    		System.out.println("Done !");
    		
			session.getTransaction().commit();
			
		} finally {
			session.close();
			factory.close();
		}
    	
    }

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void geriMouseClicked(java.awt.event.MouseEvent evt) {                                  
    	dispose();
    }                                 

    private void exitMousePressed(java.awt.event.MouseEvent evt) {                                  
        dispose();
    }                                 

    private void jLabelMinMousePressed(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }      
    
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

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void silinActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     
                                      

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapBilgi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField ekle;
    private javax.swing.JLabel exit;
    private javax.swing.JButton geri;
    private javax.swing.JLabel gunlukNetKazanc;
    private javax.swing.JLabel gunlukToplam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kaydetButonu;
    private javax.swing.JLabel netKazanc;
    private javax.swing.JTextField silin;
    // End of variables declaration                   
}
