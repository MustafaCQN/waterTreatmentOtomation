


package com.suaritma.gui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.persistence.Query;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suaritma.entity.Bakim;
import com.suaritma.entity.Musteri;
import com.suaritma.entity.Urun;

public class StokBilgiEkleme extends javax.swing.JFrame {

	Bakim b1 = new Bakim();
	StokTakip stk;
	public int x,y;
	public Point point = null;
    
    public StokBilgiEkleme() {
        initComponents();
    }
    public StokBilgiEkleme(StokTakip stk1) {
        initComponents();
        stk = stk1;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        urun1 = new javax.swing.JComboBox<>();
        urun2 = new javax.swing.JComboBox<>();
        urun3 = new javax.swing.JComboBox<>();
        urun4 = new javax.swing.JComboBox<>();
        urun5 = new javax.swing.JComboBox<>();
        adet1 = new javax.swing.JTextField();
        adet2 = new javax.swing.JTextField();
        adet3 = new javax.swing.JTextField();
        adet4 = new javax.swing.JTextField();
        adet5 = new javax.swing.JTextField();
        kaydetButonu = new javax.swing.JButton();
        geri = new JButton();
        jLabelMin = new JLabel();
        exit = new JLabel();

        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(788, 475));

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Price_Tag_48px.png"))); // NOI18N
        jLabel1.setText("STOK BÝLGÝ EKLEME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ÜRÜN ADI");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADET");

        jLabel4.setText("1-");

        jLabel5.setText("2-");

        jLabel6.setText("3-");

        jLabel7.setText("4-");

        jLabel8.setText("5-");
        
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

        urun1.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));
        urun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun1ActionPerformed(evt);
            }
        });
        
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

        urun2.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        urun3.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        urun4.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        urun5.setModel(new javax.swing.DefaultComboBoxModel<>(b1.urunListesi()));

        kaydetButonu.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        kaydetButonu.setText("KAYDET");
        kaydetButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaydetButonuMouseClicked(evt);
            }
        });

       /* javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(urun1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urun2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urun3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urun4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urun5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adet1)
                    .addComponent(adet2)
                    .addComponent(adet3)
                    .addComponent(adet4)
                    .addComponent(adet5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kaydetButonu)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(urun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(urun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(urun3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(urun4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(urun5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(kaydetButonu)
                .addGap(152, 152, 152))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adet1, adet2, adet3, adet4, adet5});

        pack();*/
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(geri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kaydetButonu)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(urun1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urun2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urun3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urun4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urun5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adet1)
                    .addComponent(adet2)
                    .addComponent(adet3)
                    .addComponent(adet4)
                    .addComponent(adet5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {geri, kaydetButonu});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(urun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(urun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(urun3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(urun4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(urun5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adet5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaydetButonu)
                    .addComponent(geri))
                .addGap(169, 169, 169))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adet1, adet2, adet3, adet4, adet5});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {geri, kaydetButonu});

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
    
    private void urun1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }     
    
    private void geriActionPerformed(ActionEvent evt) {
    	dispose();
    }
    private void geriMouseClicked(MouseEvent evt) {
    	
    }
    
    private void jLabelMinMousePressed(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }                                      

    private void exitMousePressed(java.awt.event.MouseEvent evt) {                                  
        dispose();
    }

    private void kaydetButonuMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	String urunBir = urun1.getSelectedItem().toString();
    	String urunIki = urun2.getSelectedItem().toString();
    	String urunUc = urun3.getSelectedItem().toString();
    	String urunDort = urun4.getSelectedItem().toString();
    	String urunBes = urun5.getSelectedItem().toString();
    	
    	String adetBir = adet1.getText();
    	String adetIký = adet2.getText();
    	String adetUc = adet3.getText();
    	String adetDort = adet4.getText();
    	String adetBes = adet5.getText();
    	
    	adetBir = adet1.getText().equals("") ? "0" : adet1.getText();
    	adetIký = adet2.getText().equals("") ? "0" : adet2.getText();
    	adetUc = adet3.getText().equals("") ? "0" : adet3.getText();
    	adetDort = adet4.getText().equals("") ? "0" : adet4.getText();
    	adetBes = adet5.getText().equals("") ? "0" : adet5.getText();
    	
    	Urun urun1 = new Urun();
    	urun1.setUrunAdi(urunBir);
    	urun1.setAdet(Integer.parseInt(adetBir));
    	
    	Urun urun2 = new Urun();
    	urun2.setUrunAdi(urunIki);
    	urun2.setAdet(Integer.parseInt(adetIký));
    	
    	Urun urun3 = new Urun();
    	urun3.setUrunAdi(urunUc);
    	urun3.setAdet(Integer.parseInt(adetUc));
    	
    	Urun urun4 = new Urun();
    	urun4.setUrunAdi(urunDort);
    	urun4.setAdet(Integer.parseInt(adetDort));
    	
    	Urun urun5 = new Urun();
    	urun5.setUrunAdi(urunBes);
    	urun5.setAdet(Integer.parseInt(adetBes));
    		
    		
    		if(!(urun1.equals(null)) && !(urun1.getUrunAdi().equals("-"))) {
    			UrunOlusturGuncelle(urun1);
    		}
    		if(!(urun2.equals(null)) && !(urun2.getUrunAdi().equals("-"))) {
    			UrunOlusturGuncelle(urun2);
    		}
    		if(!(urun3.equals(null)) && !(urun3.getUrunAdi().equals("-"))) {
    			UrunOlusturGuncelle(urun3);
    		}
    		if(!(urun4.equals(null)) && !(urun4.getUrunAdi().equals("-"))) {
    			UrunOlusturGuncelle(urun4);
    		}
    		if(!(urun5.equals(null)) && !(urun5.getUrunAdi().equals("-"))) {
    			UrunOlusturGuncelle(urun5);
    		}
    		
    		JOptionPane.showMessageDialog(jPanel1, "Baþarýyla Eklendi !");
    		
    		stk.tabloGuncelle();
    		
    		dispose();
    	
    }
    
    public void kontrolEt() {
    	
    }
    
    public void UrunOlusturGuncelle(Urun urun) {
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Urun.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	
    	try {
    		session.beginTransaction();
    		Urun tempUrun = new Urun();
    		try {
    			Query query = session.createQuery("from Urun where urunAdi=:urunadi");
            	query.setParameter("urunadi", urun.getUrunAdi());
            	tempUrun = (Urun) query.getSingleResult();
			} catch (Exception NoResultException) {
				session.save(urun);
			}
    		
        	if(tempUrun != null) {
        		tempUrun.setAdet(tempUrun.getAdet() + urun.getAdet());
        	}
        	
        	session.getTransaction().commit();
    		
    		System.out.println("Done !");
			
		} finally {
			session.close();
			factory.close();
		}
    }

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokBilgiEkleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField adet1;
    private javax.swing.JTextField adet2;
    private javax.swing.JTextField adet3;
    private javax.swing.JTextField adet4;
    private javax.swing.JTextField adet5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kaydetButonu;
    private JButton geri;
    private javax.swing.JComboBox<String> urun1;
    private javax.swing.JComboBox<String> urun2;
    private javax.swing.JComboBox<String> urun3;
    private javax.swing.JComboBox<String> urun4;
    private javax.swing.JComboBox<String> urun5;
    private JLabel exit;
    private JLabel jLabelMin;
    // End of variables declaration                   
}
