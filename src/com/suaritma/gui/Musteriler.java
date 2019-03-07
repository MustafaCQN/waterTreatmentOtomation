



package com.suaritma.gui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suaritma.entity.Bakim;
import com.suaritma.entity.Musteri;
import com.suaritma.entity.Urun;

//import sun.net.www.content.image.jpeg;

/*class tabloNumaralarý{
	Musteri musteri;
	int deger;
}*/

public class Musteriler extends javax.swing.JFrame {

    public List tempMusteri;
    public int x,y;
	public Point point = null;
	public SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    
    public Musteriler() {
        initComponents();
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    
    	
    	
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        musterilerTablosu = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        musteriEkleButon = new javax.swing.JButton();
        musteriDuzenleButon = new javax.swing.JButton();
        musteriSilButon = new javax.swing.JButton();
        musteriGeriButon = new javax.swing.JButton();
        arama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bakimYap = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
    
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(788, 475));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Conference_48px.png"))); // NOI18N
        jLabel1.setText("MÜÞTERÝLER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 270, 40));
        
        exit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, 30));

        min.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        min.setForeground(new java.awt.Color(240, 240, 240));
        min.setText("_");
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minMousePressed(evt);
            }
        });
        jPanel1.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 30, -1));

        tablo.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        tablo.setModel(new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "NO", "AD", "SOYAD", "DOÐUM TARÝHÝ", "TEL NO", "ADRES", "CÝHAZ ALIM TARÝHÝ", "CÝHAZ MODELÝ"
            }
        ) 
        {
            Class[] types = new Class [] {
                java.lang.Integer.class,java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        musteriGeriButon.setFont(new java.awt.Font("SansSerif", 1, 14));
        musteriGeriButon.setText("GERÝ");
        musteriGeriButon.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		dispose();
        	}
		});
        
        
        musterilerTablosu.setViewportView(tablo);

        musteriEkleButon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        musteriEkleButon.setText("MÜÞTERÝ EKLE");
        musteriEkleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriEkleButonMouseClicked(evt);
            }
        });
        musteriEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriEkleButonActionPerformed(evt);
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
        
        bakimYap.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        bakimYap.setText("BAKIM YAP");
        bakimYap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               // bakimYapMouseClicked(evt);
            }
        });
        bakimYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakimYapActionPerformed(evt);
            }
        });
        
        jPanel1.addMouseMotionListener(new MouseMotionAdapter() {
        	public void mouseDragged(MouseEvent evt) {
        		jPanel1MouseDragged(evt);
        	}
		});

        musteriDuzenleButon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        musteriDuzenleButon.setText("Düzenle");
        musteriDuzenleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriDuzenleButonMouseClicked(evt);
                tablo.repaint();
            }
        });
        musteriDuzenleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriDuzenleButonActionPerformed(evt);
            }
        });

        musteriSilButon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        musteriSilButon.setText("Sil");
        musteriSilButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriSilButonMouseClicked(evt);
            }
        });

        arama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	aramaActionPerformed(evt);
            }
        });
        arama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aramaKeyTyped(evt);
            }
        });

        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tablo.getModel());
        tablo.setRowSorter(rowSorter);
        arama.getDocument().addDocumentListener(new DocumentListener() {
		
			@Override
			public void removeUpdate(DocumentEvent e) {
				String ara = arama.getText();
				
				if(ara.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				}else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + ara));
			}
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				String ara = arama.getText();
				
				if(ara.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				}else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + ara));
				}
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				throw new UnsupportedOperationException("Daha Desteklenmemekte");
				
			}
		});

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Search_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(musterilerTablosu)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(musteriGeriButon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bakimYap, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(musteriDuzenleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(musteriSilButon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(musteriEkleButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(arama, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arama)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(musteriDuzenleButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(musteriSilButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(musteriEkleButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(musterilerTablosu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(musteriGeriButon, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(bakimYap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        
        tabloOlustur();

        pack();
    }// </editor-fold>      
    
    private void bakimYapActionPerformed(ActionEvent evt) {
    	int satir = -1;
    	try {

        	satir = tablo.convertRowIndexToModel(tablo.getSelectedRow());
		} catch (Exception e) {
			satir = -1;
			System.out.println(e + "hatasý aldýk CATCH BLOÐU");
		}
    	if(satir != -1){
    		musteriSec(satir, "bakimYap");
    	}
    }
    
    private void bakimYap(Musteri m1) {
    	//Musteri m1 = (Musteri)tempMusteri.get(satirDegeri);
    	@SuppressWarnings("unused")
		Bakimlar b1 = new Bakimlar(m1);
    	b1.setVisible(true);
    }

    private void musteriDuzenleButonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void musteriEkleButonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void aramaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void aramaKeyTyped(java.awt.event.KeyEvent evt) {
    	
        
    }                              

    private void musteriEkleButonMouseClicked(java.awt.event.MouseEvent evt) {                                              
       YeniMusteriKayit theYeniMusteriKayit = new YeniMusteriKayit(this);
       theYeniMusteriKayit.setVisible(true);
      
       
       
       
    }        
    
    private void exitMousePressed(java.awt.event.MouseEvent evt) {                                  
        dispose();
    }                                 

    private void minMousePressed(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }
    
    private void jPanel1MousePressed(MouseEvent evt) {
    	point = evt.getPoint();
    }
    private void jPanel1MouseDragged(MouseEvent evt) {
    	Point nokta = evt.getLocationOnScreen();
    	this.setLocation(nokta.x - point.x , nokta.y - point.y);
    }
    private void jPanel1MouseReleased(MouseEvent evt) {
    	point = null;
    }

    private void musteriDuzenleButonMouseClicked(java.awt.event.MouseEvent evt) {
    	int satir = -1;
    	try {

        	satir = tablo.convertRowIndexToModel(tablo.getSelectedRow());
		} catch (Exception e) {
			satir = -1;
			System.out.println(e + "hatasý aldýk CATCH BLOÐU");
		}
    	if(satir != -1){
    		musteriSec(satir , "duzenle");	
    	}
        
    }                                                

    private void musteriSilButonMouseClicked(java.awt.event.MouseEvent evt) {
    	int satir = -1;
    	try {
    		satir = tablo.convertRowIndexToModel(tablo.getSelectedRow());
    		System.out.println("Satýr Numarasý: " + satir);
    	}
    	catch (java.lang.ArrayIndexOutOfBoundsException e) {
    		satir = -1;
    		System.out.println("catch bloðuna girdik ");
		}
        if(satir != -1) {
        	musteriSec(satir,"sil");
        }
        
    }    
    
    public void musteriDuzenle(Musteri m1) {
    	@SuppressWarnings("unused")
		MusteriDuzenle duzenle = new MusteriDuzenle(m1,this);
    	duzenle.setVisible(true);
    	
    }
    
    public void musteriSec(int satirDegeri , String islem) {
    	int id = (int) tablo.getRowSorter().getModel().getValueAt(satirDegeri, 0);
    	System.out.println("Alýnan id deðeri: " + id);
    	Musteri m1;
    
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Musteri.class)
				.addAnnotatedClass(Bakim.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	try {
    		session.beginTransaction();
    		
    		m1 = session.get(Musteri.class,id);
    		
        	session.getTransaction().commit();
    		
    		System.out.println("Done !");
			
		} finally {
			session.close();
			factory.close();
		}
    	
    	
    	if(islem.equals("sil") && m1 != null) {
    		musteriSil(m1);
    	}else if(islem.equals("duzenle") && m1 != null){
    		musteriDuzenle(m1);
    	}else if(islem.equals("bakimYap") && m1 != null) {
    		bakimYap(m1);
    	}else{
    		System.out.println("HATAAAAAAAAAAAAA musteriSec");
    		return;
    	}
    	
    }
    
    public void musteriSil(Musteri m1) {
    	//Musteri m1 = (Musteri)tempMusteri.get(satirDegeri);
    	Object[] options = {
    			"Tamam",
    			"Vazgeç"
    	};
    	//JOptionPane.showConfirmDialog(tablo,"Silmek Ýstediðinizden Eminmisiniz ?","UYARI",JOptionPane.);
    	int sonuc = JOptionPane.showOptionDialog(tablo, "Silmek istediðinizden Eminmisiniz", "UYARI",
    			JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
    			null, options, options[0]);
    	
    	System.out.println(sonuc);
    	if(sonuc == 0) {
    		// musteriyi sil
    		SessionFactory factory = new Configuration()
    				.configure("hibernate.cfg.xml")
    				.addAnnotatedClass(Musteri.class)
    				.addAnnotatedClass(Bakim.class)
    				.buildSessionFactory();

        	Session session = factory.getCurrentSession();
        	try {
        		session.beginTransaction();
        		
        		session.delete(m1);
        		
            	session.getTransaction().commit();
        		
        		System.out.println("Done !");
        		
        		tabloGuncelle();
    			
    		} finally {
    			session.close();
    			factory.close();
    		}
    	}
    }
    
    
    public void tabloOlustur() {
    	
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Musteri.class)
				.addAnnotatedClass(Bakim.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	
    	try {
    		session.beginTransaction();
    		
    			tempMusteri = session.createQuery("from Musteri").list();
    			DefaultTableModel model = (DefaultTableModel) tablo.getModel();
    			for(Iterator iter = tempMusteri.iterator();iter.hasNext();) {
    				Musteri musteri = (Musteri)iter.next();
    				model.addRow(new Object[] {
    						musteri.getId(),
    						musteri.getIsim(),
    						musteri.getSoyIsim(),
    						sdf.format(musteri.getDogumTarihi()),
    						musteri.getTelNo(),
    						musteri.getAdres(),
    						sdf.format(musteri.getCihazAlimTarihi()),
    						musteri.getCihazModeli()
    				});
    			}
    			
    			tablo.setModel(model);
    		
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
				.addAnnotatedClass(Musteri.class)
				.addAnnotatedClass(Bakim.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	try {
    		session.beginTransaction();
    		
    			((DefaultTableModel)tablo.getModel()).setRowCount(0);
    		
    			tempMusteri = session.createQuery("from Musteri").list();
    			DefaultTableModel guncelModel = (DefaultTableModel) tablo.getModel();
    			
    			for(Iterator iter = tempMusteri.iterator();iter.hasNext();) {
    				Musteri musteri = (Musteri)iter.next();
    				guncelModel.addRow(new Object[] {
    						musteri.getId(),
    						musteri.getIsim(),
    						musteri.getSoyIsim(),
    						sdf.format(musteri.getDogumTarihi()),
    						musteri.getTelNo(),
    						musteri.getAdres(),
    						sdf.format(musteri.getCihazAlimTarihi()),
    						musteri.getCihazModeli()
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

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Musteriler().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField arama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton musteriDuzenleButon;
    private javax.swing.JButton musteriEkleButon;
    private javax.swing.JButton musteriSilButon;
    private javax.swing.JScrollPane musterilerTablosu;
    private javax.swing.JTable tablo;
    private javax.swing.JButton musteriGeriButon;
    private javax.swing.JButton bakimYap;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel min;
    // End of variables declaration                   
}


