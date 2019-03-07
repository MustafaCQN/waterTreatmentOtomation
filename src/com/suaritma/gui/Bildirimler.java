package com.suaritma.gui;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suaritma.entity.Bakim;
import com.suaritma.entity.Musteri;

//import jdk.internal.org.objectweb.asm.tree.analysis.SourceInterpreter;

public class Bildirimler extends javax.swing.JFrame {

	public int x,y;
	public Point point = null;
    public Musteri musteri;
    public List tempMusteri;
    public ArrayList <Musteri> duzenliMusteriListesi;
    public Date buGun = new Date();
    public SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
	
    public Bildirimler() {
    	System.out.println(sdf.format(buGun));
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        tablo = new javax.swing.JScrollPane();
        bildirimTablo = new javax.swing.JTable();
        bakimYapButon = new javax.swing.JButton();
        geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Message_40px.png"))); // NOI18N
        jLabel1.setText("BÝLDÝRÝMLER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 40));

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

        bildirimTablo.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        bildirimTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "BÝLDÝRÝMLER "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo.setViewportView(bildirimTablo);

        bakimYapButon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bakimYapButon.setText("Bakým Yap");
        bakimYapButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	bakimYapButonMouseClicked(evt);
            }
        });

        geri.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        geri.setText("GERÝ");
        geri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriMouseClicked(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablo)
            .addGroup(layout.createSequentialGroup()
                .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bakimYapButon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bakimYapButon, geri});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(tablo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakimYapButon))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bakimYapButon, geri});
        
        tabloOlustur();

        pack();
    }// </editor-fold>       
    
    private void tabloOlustur() {
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Musteri.class)
				.addAnnotatedClass(Bakim.class)
				.buildSessionFactory();

    	Session session = factory.getCurrentSession();
    	
    	try {
    		session.beginTransaction();
    		
    			tempMusteri = session.createQuery("from Musteri").list();
    			
    			/*// BU FONKSÝYON SADECE 1 KERE KULLANILACAK (KULLANILDI 2018.05.15 - 19.08)
    			 * BU FONKSÝYON VERÝ TABANINDAKÝ NULL DEÐERLERÝ BOZULURSA DÜZENLENÝP KULLANILABÝLÝR
    			// sebebi tüm müþterilerin bakýmlarýna 1 satýr daha eklemek için
    			// 14.02.2018.0101101 iken 14.02.2018.0101101.1 olacak
    			for(Iterator i = tempMusteri.iterator();i.hasNext();) {
    				Musteri musteri = (Musteri)i.next();
    				Bakim bakim = musteri.getBakim();
    				String [] dizi = bakim.toStringArray();
    				for (int j = 0; j < dizi.length; j++) {
    					if(dizi[j].equals("null.1"))
    						dizi[j] = null;
					}
    				bakim.arrayToBakim(dizi);
    				musteri.setBakim(bakim);
    				session.save(musteri);
    			}*/
    			
    			/*BU FONKSÝYON SADECE 1 KERE KULLANILACAK (KULLANILDI 2018.05.15 - 21.57)
    			 * .1 leri sildik ve 16 tane ürün olduðu için artýk
    			 * 12.04.2016.0101011 iken 12.04.2016.01010110010111010 oldu
    			 * 
    			for (Iterator i = tempMusteri.iterator();i.hasNext();) {
					Musteri musteri = (Musteri)i.next();
					Bakim bakim = musteri.getBakim();
					String [] dizi = bakim.toStringArray();		
					String [] parcaliDizi = null;
					for (int j = 0; j < dizi.length; j++) {
						if(dizi[j] != null) {
							parcaliDizi = dizi[j].split("\\.");
						}else
							continue;
						if(parcaliDizi[3].length() < 8) {
							parcaliDizi[3] += "000000000";
						}
						dizi[j] = parcaliDizi[0] + "." + parcaliDizi[1] + "." + parcaliDizi[2] + "." + parcaliDizi[3];
					}
					bakim.arrayToBakim(dizi);
					musteri.setBakim(bakim);
					session.update(musteri);
				}*/
    			
    			
    			
    			DefaultTableModel model = (DefaultTableModel) bildirimTablo.getModel();
    			Musteri m1 = null;
    			
    			/*for(Iterator i = tempMusteri.iterator();i.hasNext();) {
    				Musteri musteri = (Musteri)i.next();
    				
    				try {
    					System.out.println(sdf.parse(musteri.get));
					} catch (Exception e) {
						System.out.println("parse exp" + e.getMessage());
					}
    				
    				
    			}*/
    			
    			duzenliMusteriListesi = new ArrayList<Musteri>();
    			int i =0;
    			for(Iterator iter = tempMusteri.iterator();iter.hasNext();) {
    				Musteri musteri = (Musteri)iter.next();    			
    				
    				try {
    					m1 = musteriTarihFormatlayicisi(musteri);
					} catch (Exception e) {
						System.out.println("musteri iteratoru" + e.getMessage());
					}
    				
    				
    				if(m1 != null) {
    					
    					duzenliMusteriListesi.add(m1);
    					
    					System.out.println(m1.getIsim() + " " + m1.getSoyIsim() + " " + m1.getTelNo() + " " + m1.getAdres());
    					
    					model.addRow(new Object[] {
    							(i+1)+"-) " + m1.getIsim() + " " + m1.getSoyIsim() + " " + m1.getTelNo() + " " + m1.getAdres()
    					});
    					
    					
    				}else {
    					System.out.println("Müþteri Null");
    					continue;
    				}
    				
    				i++;
    				
    			}
    			
    			
    			
    			/*for(Iterator iter = tempMusteri.iterator();iter.hasNext();) {
    				Musteri musteri = (Musteri)iter.next();
    				model.addRow(new Object[] {
    						musteri.getIsim(),
    						musteri.getSoyIsim(),
    						musteri.getDogumTarihi(),
    						musteri.getTelNo(),
    						musteri.getAdres(),
    						musteri.getCihazAlimTarihi(),
    						musteri.getCihazModeli()
    				});
    			}*/
    			
    			bildirimTablo.setModel(model);
    		
        	session.getTransaction().commit();
    		
    		System.out.println("Done !");
			
		} finally {
			session.close();
			factory.close();
		}
    }
    
    /*private Musteri sadeceFormat(Musteri musteri) {
    	Bakim bakim = musteri.getBakim();
    	String [] bakimDizi = bakim.toStringArray();
    	String [] cihazAlimTarihi = sdf.format(musteri.getCihazAlimTarihi()).split("\\.");
    	String [] parcaliDizi;
    	String d1,d2;
    	
    	int i = 0;
    	while(bakimDizi[i] != null) {
    		parcaliDizi = bakimDizi[i].split("\\.");
    		// 0 = gun , 1 = ay , 2 = yýl
    		
    		d1 = parcaliDizi[0] + "." + parcaliDizi[1] + "." + parcaliDizi[2];
    		
    	}
    	
    }
    */
    private Musteri musteriTarihFormatlayicisi(Musteri musteri) {
    	
    	Bakim bakim = musteri.getBakim();
    	String [] bakimDizi = bakim.toStringArray();
    	String [] cihazAlimTarihi = sdf.format(musteri.getCihazAlimTarihi()).split("\\.");
    	String [] parcaliDizi;
    	Date d1,d2,enBuyuk = null,d2EnBuyuk = null;
    	
    	//System.out.println("Musteri ad:"+musteri.getIsim());
    	
    	int i = 0;
    	while(bakimDizi[i] != null) {
    		
    		parcaliDizi = bakimDizi[i].split("\\.");
    		// dizinin 0. elemaný gün, 1. elemaný ay, 2. elemaný yýl
    		
    		//System.out.println("gun:"+parcaliDizi[0] + "ay:"+parcaliDizi[1] + "yýl:"+parcaliDizi[2]);
    		
    		try {
    			d1 = sdf.parse(parcaliDizi[2]+"."+ parcaliDizi[1] + "." + parcaliDizi[0]);
    			
    			d2 = sdf.parse(parcaliDizi[2]+"."+ (Integer.parseInt(parcaliDizi[1])+5) + "." + parcaliDizi[0]);
    			
    			//System.out.println("Tarih: " + sdf.format(d1));
    			
    			//System.out.println("6 Ay Sonrasý " + sdf.format(d2));
			} catch (Exception e) {
				System.out.println("Parse Exception Aldýk " + e.getMessage());
				return null;
			}
    		
    		
    		// i = 0 ken null pointer yememiz gerekiyor ancak i= 0 olduðu için direk 2. parametreye bakmadan
    		// if bloklarýnýn içine girecek
    		if(i==0 || d1.after(enBuyuk)) {
    			enBuyuk = d1;
    		}
    		if(i==0 || d2.after(d2EnBuyuk)) {
    			d2EnBuyuk = d2;
    		}
    		
    		//System.out.println("EnBüyük Tarih " + sdf.format(enBuyuk));
    		
    		
    		i++;
    	}
    	
    	// eðer kiþiye hiç bakým yapýlmadýysa cihazý aldýðý gün onun bakým zamanýný gösterir.
    	if(enBuyuk == null) {
    		//System.out.println(sdf.format(musteri.getCihazAlimTarihi()));
    		enBuyuk = dateParser(musteri.getCihazAlimTarihi());
    		d2EnBuyuk = altiAySonrasi(musteri.getCihazAlimTarihi());
    	}
    	
    	System.out.println(altiAySonrasi(enBuyuk)  + " vs " + sdf.format(buGun));
    	System.out.println(sdf.format(altiAySonrasi(enBuyuk))  + " vs " + buGun);
    	System.out.println(enBuyuk + " vs " + buGun);
    	if(sdf.format(altiAySonrasi(enBuyuk)).equals(sdf.format(buGun)) 
    			|| (altiAySonrasi(enBuyuk).before(buGun) && yediGun(altiAySonrasi(enBuyuk)).after(buGun))){
    		// burada 2 tarih karþýlaþtýrýlacak ve sonucunda eðer tarihler 
    		// eþit ise o nesneyi geri yollayýp tablomuza yazýcaz
    		return musteri;
    	}
    	else
    		return null;
    	
//    	altiAySonrasi(enBuyuk).before(buGun) && yediGun(altiAySonrasi(enBuyuk)).after(buGun)
    	
    }
    
    private Date yediGun (Date d1) {
    	String [] dizi = sdf.format(d1).split("\\.");
    	Date sonDate = null;
    	try {
			sonDate = sdf.parse((Integer.parseInt(dizi[0]) + 8) + "." + dizi[1] + "." + dizi[2]);
		} catch (Exception e) {
			System.out.println("parse EXCEPCPE" + e.getMessage());
		}
    	return sonDate;
    }
    
    private Date altiAySonrasi(Date d1) {
    	String [] dizi = sdf.format(d1).split("\\.");
    	Date sonDate = null;
    	try {
    		sonDate = sdf.parse(dizi[0] + "." + (Integer.parseInt(dizi[1]) + 5 ) + "." + dizi[2]);
		} catch (Exception e) {
			System.out.println("parse EXpp" + e.getMessage());
		}
    	
    	return sonDate;
    	
    }
    
    private Date dateParser(Date d1) {
    	String [] dizi = sdf.format(d1).split("\\.");
    	Date sonDate = null;
    	try {
    		sonDate = sdf.parse(dizi[0] + "." + Integer.parseInt(dizi[1]) + "." + dizi[2]);
		} catch (Exception e) {
			System.out.println("parse EXpp" + e.getMessage());
		}
    	
    	return sonDate;
    	
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

    private void bakimYapButonMouseClicked(java.awt.event.MouseEvent evt) {
    	// burasý yazýlacak daha bitmedi.
    	int satir = -1;
    	try {

        	satir = bildirimTablo.getSelectedRow();
		} catch (Exception e) {
			satir = -1;
			System.out.println(e + "hatasý aldýk CATCH BLOÐU");
		}
    	if(satir != -1){
    		bakimYap(satir);	
    	}
    	
    }          
    
    private void bakimYap(int satirDegeri) {
    	
    	Musteri m1 = (Musteri)duzenliMusteriListesi.get(satirDegeri);
    	@SuppressWarnings("unused")
    	Bakimlar b1 = new Bakimlar(m1);
    	b1.setVisible(true);
    	
    }

    private void geriMouseClicked(java.awt.event.MouseEvent evt) {
    	dispose();
    }                                 

    private void exitMousePressed(java.awt.event.MouseEvent evt) {                                  
        dispose();
    }                                 

    private void minMousePressed(java.awt.event.MouseEvent evt) {                                 
        this.setState(JFrame.ICONIFIED);
    }                                

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bildirimler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bakimYapButon;
    private javax.swing.JTable bildirimTablo;
    private javax.swing.JLabel exit;
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel min;
    private javax.swing.JScrollPane tablo;
    // End of variables declaration                   
}
