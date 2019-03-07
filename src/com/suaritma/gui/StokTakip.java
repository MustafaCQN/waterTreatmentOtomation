

package com.suaritma.gui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suaritma.entity.Musteri;
import com.suaritma.entity.Urun;

public class StokTakip extends javax.swing.JFrame {

	public List tempUrun;
	DefaultTableModel temizTabloModeli;
	
	public int x,y;
	public Point point = null;
    
    public StokTakip() {
        initComponents();
        tabloOlustur();
    }

  
    private void tabloOlustur() {
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Urun.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	
    	try {
    		session.beginTransaction();
    		
    		
    			tempUrun = session.createQuery("from Urun").list();
    			DefaultTableModel model = (DefaultTableModel) tablo.getModel();
    			
    			for(Iterator iter = tempUrun.iterator();iter.hasNext();) {
    				Urun urun = (Urun)iter.next();
    				model.addRow(new Object[] {
    						urun.getUrunAdi(),
    						urun.getAdet()
    				});
    			}
    			
    			tablo.setModel(model);
    			
    			//tabloModeli = model;
    		
        	session.getTransaction().commit();
    		
    		System.out.println("Done !");
			
		} finally {
			session.close();
			factory.close();
		}
	}
    
    public void tabloGuncelle() {
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Urun.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	try {
    		session.beginTransaction();
    		
    			((DefaultTableModel)tablo.getModel()).setRowCount(0);
    		
    			tempUrun = session.createQuery("from Urun").list();
    			DefaultTableModel guncelModel = (DefaultTableModel) tablo.getModel();
    			
    			for(Iterator iter = tempUrun.iterator();iter.hasNext();) {
    				Urun urun = (Urun)iter.next();
    				guncelModel.addRow(new Object[] {
    						urun.getUrunAdi(),
    						urun.getAdet()
    				});
    			}

    			tablo.setModel(guncelModel);
    			
    		
        	session.getTransaction().commit();
    		
    		System.out.println("Done !");
    			
    		}finally {
    			session.close();
    			factory.close();
			}
    	
    }


	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

		
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        stokTablosu = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        stokEkleButonu = new javax.swing.JButton();
        duzenleButonu = new javax.swing.JButton();
        silButonu = new javax.swing.JButton();
        geriButonu = new JButton();
        jLabelMin = new JLabel();
        exit = new JLabel();

        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(788, 475));

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Price_Tag_48px.png"))); // NOI18N
        jLabel1.setText("STOK TAKÝP");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 270, 40));
        
        jLabelMin.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMin.setText("_");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMinMousePressed(evt);
            }
        });
        jPanel1.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 20, 30));

        exit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));


        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ÝSÝM", "ADET"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stokTablosu.setViewportView(tablo);

        stokEkleButonu.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        stokEkleButonu.setText("STOK EKLE");
        stokEkleButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stokEkleButonuMouseClicked(evt);
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

        duzenleButonu.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        duzenleButonu.setText("DÜZENLE");
        duzenleButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                duzenleButonuMouseClicked(evt);
            }
        });
        duzenleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duzenleButonuActionPerformed(evt);
            }
        });

        silButonu.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        silButonu.setText("SÝL");
        silButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                silButonuMouseClicked(evt);
            }
        });
        geriButonu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        geriButonu.setText("GERÝ");
        geriButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriButonuMouseClicked(evt);
            }
        });
        geriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addComponent(stokTablosu)
            .addGroup(layout.createSequentialGroup()
                .addComponent(geriButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stokEkleButonu)
                .addGap(110, 110, 110)
                .addComponent(duzenleButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(silButonu)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {duzenleButonu, geriButonu});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stokTablosu, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokEkleButonu)
                    .addComponent(duzenleButonu)
                    .addComponent(silButonu)
                    .addComponent(geriButonu))
                .addGap(106, 106, 106))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {duzenleButonu, geriButonu});
        
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
    
    private void jLabelMinMousePressed(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }                                      

    private void exitMousePressed(java.awt.event.MouseEvent evt) {                                  
        dispose();
    }

	private void geriButonuMouseClicked(java.awt.event.MouseEvent evt) {
		// anan
	}
	
	private void geriButonuActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}
	
    private void duzenleButonuActionPerformed(java.awt.event.ActionEvent evt) {
    	int satir = -1;
    	try {

        	satir = tablo.getSelectedRow();
		} catch (Exception e) {
			satir = -1;
			System.out.println(e + "hatasý aldýk CATCH BLOÐU");
		}
    	if(satir != -1){
    		duzenleStok(satir);	
    	}
    }             
    
    private void duzenleStok(int satir) {
    	Urun u1 = (Urun)tempUrun.get(satir);
    	@SuppressWarnings("unused")
		StokDuzenle duzenle = new StokDuzenle(u1,this);
    	duzenle.setVisible(true);
    }

    private void stokEkleButonuMouseClicked(java.awt.event.MouseEvent evt) {                                            
        StokBilgiEkleme theStokEkle = new StokBilgiEkleme(this);
        theStokEkle.setVisible(true);
    }                                           

    private void duzenleButonuMouseClicked(java.awt.event.MouseEvent evt) {                                           
    	int satir = -1;
    	try {

        	satir = tablo.getSelectedRow();
		} catch (Exception e) {
			satir = -1;
			System.out.println(e + "hatasý aldýk CATCH BLOÐU");
		}
    	if(satir != -1){
    		urunDuzenle(satir);	
    	}
    }              
    
    private void urunDuzenle(int satirDegeri){
    	//Urun u1 = (Urun)tempUrun.get(satirDegeri);
    	//@SuppressWarnings("unused")
    	//( URUN DUZENLE SAYFASI YOK EKLENINCE DUZENLENECEK )
		//MusteriDuzenle duzenle = new MusteriDuzenle(u1);
    	//duzenle.setVisible(true);
    }

    private void silButonuMouseClicked(java.awt.event.MouseEvent evt) {                                       
    	int satir = -1;
    	try {

        	satir = tablo.getSelectedRow();
		} catch (Exception e) {
			satir = -1;
			System.out.println(e + "hatasý aldýk CATCH BLOÐU");
		}
    	if(satir != -1){
    		System.out.println("deðer: " + satir);
    		urunSil(satir);	
    	}
    }                
    
    public void urunSil(int satirDegeri){
    	Urun u1 = (Urun)tempUrun.get(satirDegeri);
    	Object[] options = {
    			"Tamam",
    			"Vazgeç"
    	};
    	//JOptionPane.showConfirmDialog(tablo,"Silmek Ýstediðinizden Eminmisiniz ?","UYARI",JOptionPane.);
    	int sonuc = JOptionPane.showOptionDialog(tablo, "Silmek istediðinizden Eminmisiniz", "UYARI",
    			JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
    			null, options, options[0]);
    	
    	if(sonuc == 0) {
    		// musteriyi sil
    		SessionFactory factory = new Configuration()
    				.configure("hibernate.cfg.xml")
    				.addAnnotatedClass(Urun.class)
    				.buildSessionFactory();

        	Session session = factory.getCurrentSession();
        	try {
        		session.beginTransaction();
        		
        		session.delete(u1);
        		
            	session.getTransaction().commit();
        		
        		System.out.println("Done !");
        		
        		tabloGuncelle();
    			
    		} finally {
    			session.close();
    			factory.close();
    		}
    	}
    }

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokTakip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton duzenleButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton silButonu;
    private javax.swing.JButton stokEkleButonu;
    private javax.swing.JScrollPane stokTablosu;
    private javax.swing.JTable tablo;
    private JButton geriButonu;
    private JLabel jLabelMin;
    private JLabel exit;
    // End of variables declaration                   
}

