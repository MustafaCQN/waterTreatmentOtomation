package com.suaritma.gui;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class GirisEkrani extends javax.swing.JFrame {
	
	public int x,y;
	public Point point = null;
    
    public GirisEkrani() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kullaniciAdi = new javax.swing.JLabel();
        sifre = new javax.swing.JLabel();
        kullaniciAdiText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        giris = new javax.swing.JButton();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ustPanelMouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ustPanelMousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
            	ustPanelMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Key_50px.png"))); // NOI18N
        jLabel1.setText("GÝRÝÞ ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 270, -1));

        kullaniciAdi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kullaniciAdi.setText("KULLANICI ADI:");

        sifre.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        sifre.setText("ÞÝFRE :");

        kullaniciAdiText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        giris.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        giris.setText("GÝRÝÞ");
        giris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisMouseClicked(evt);
            }
        });

        cikis.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cikis.setText("ÇIKIÞ");
        cikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisMouseClicked(evt);
            }
        });
        
        sifreText.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == 10) {
					if(kullaniciAdiText.getText().equals("root") && String.valueOf(sifreText.getPassword()).equals("root")) {
			    		AnaSayfa a1 = new AnaSayfa();
			    		a1.setVisible(true);
			    		dispose();
			    	}else {
			    		JOptionPane.showMessageDialog(jPanel1, "Hatalý Kullanýcý Adý veya Þifre");
			    		kullaniciAdiText.setText("");
			    		sifreText.setText("");
			    		return;
			    	}
				}
				
			}
		});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sifreText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kullaniciAdiText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(giris)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cikis)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kullaniciAdi, kullaniciAdiText, sifre});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciAdiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sifre, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(sifreText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giris)
                    .addComponent(cikis))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {kullaniciAdi, kullaniciAdiText, sifre});

        pack();
    }// </editor-fold>                        

    private void girisMouseClicked(java.awt.event.MouseEvent evt) {    
    	if(kullaniciAdiText.getText().equals("root") && String.valueOf(sifreText.getPassword()).equals("root")) {
    		AnaSayfa a1 = new AnaSayfa();
    		a1.setVisible(true);
    		dispose();
    	}else {
    		JOptionPane.showMessageDialog(jPanel1, "Hatalý Kullanýcý Adý veya Þifre");
    		kullaniciAdiText.setText("");
    		sifreText.setText("");
    		return;
    	}
    	
    }    
    
    private void ustPanelMouseDragged(java.awt.event.MouseEvent evt) {                                      
    	Point nokta = evt.getLocationOnScreen();
    	this.setLocation(nokta.x - point.x , nokta.y - point.y);
      
    }     
    
    private void ustPanelMouseReleased(MouseEvent evt) {
    	point = null;
    }

    private void ustPanelMousePressed(java.awt.event.MouseEvent evt) {                                      
        point = evt.getPoint();
       
    }  

    private void cikisMouseClicked(java.awt.event.MouseEvent evt) {                                   
        dispose();
    }                                  

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cikis;
    private javax.swing.JButton giris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kullaniciAdi;
    private javax.swing.JTextField kullaniciAdiText;
    private javax.swing.JLabel sifre;
    private javax.swing.JPasswordField sifreText;
    // End of variables declaration                   
}
