/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataweb;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sw.Cliente;
import sw.Date;


public class Admin extends javax.swing.JFrame {
    int xMouse, yMouse;

 DefaultTableModel tabla2;
 
    public Admin() {
        initComponents();
        datos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaV1 = new javax.swing.JTable();
        n2 = new javax.swing.JLabel();
        crear = new javax.swing.JPanel();
        textbutom = new javax.swing.JLabel();
        j_telefono = new javax.swing.JTextField();
        j_nombre2 = new javax.swing.JTextField();
        j_direccion1 = new javax.swing.JTextField();
        j_correo = new javax.swing.JTextField();
        j_ultimacompra = new javax.swing.JTextField();
        j_fecha_nacimiento1 = new javax.swing.JTextField();
        j_saldo1 = new javax.swing.JTextField();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n6 = new javax.swing.JLabel();
        n7 = new javax.swing.JLabel();
        n8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(38, 50, 56));

        head.setBackground(new java.awt.Color(30, 185, 128));
        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(30, 185, 128));

        x.setBackground(new java.awt.Color(255, 255, 255));
        x.setFont(new java.awt.Font("Russo One", 0, 18)); // NOI18N
        x.setForeground(new java.awt.Color(0, 0, 0));
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("X");
        x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        x.setPreferredSize(new java.awt.Dimension(70, 43));
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane4.setBackground(new java.awt.Color(212, 225, 87));

        tablaV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaV1);

        n2.setBackground(new java.awt.Color(139, 195, 74));
        n2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n2.setForeground(new java.awt.Color(51, 255, 153));
        n2.setText("Nombre");

        crear.setBackground(new java.awt.Color(128, 203, 196));
        crear.setPreferredSize(new java.awt.Dimension(150, 55));
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
        });

        textbutom.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        textbutom.setForeground(new java.awt.Color(0, 77, 64));
        textbutom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textbutom.setText("AÑADIR");
        textbutom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textbutom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textbutomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textbutomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textbutomMouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearLayout = new javax.swing.GroupLayout(crear);
        crear.setLayout(crearLayout);
        crearLayout.setHorizontalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        crearLayout.setVerticalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        j_telefono.setBackground(new java.awt.Color(0, 137, 123));
        j_telefono.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        j_telefono.setForeground(new java.awt.Color(255, 255, 255));
        j_telefono.setBorder(null);
        j_telefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_telefonoMousePressed(evt);
            }
        });
        j_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_telefonoActionPerformed(evt);
            }
        });

        j_nombre2.setBackground(new java.awt.Color(0, 137, 123));
        j_nombre2.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        j_nombre2.setForeground(new java.awt.Color(255, 255, 255));
        j_nombre2.setBorder(null);
        j_nombre2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_nombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_nombre2MousePressed(evt);
            }
        });
        j_nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_nombre2ActionPerformed(evt);
            }
        });

        j_direccion1.setBackground(new java.awt.Color(0, 137, 123));
        j_direccion1.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        j_direccion1.setForeground(new java.awt.Color(255, 255, 255));
        j_direccion1.setBorder(null);
        j_direccion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_direccion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_direccion1MousePressed(evt);
            }
        });
        j_direccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_direccion1ActionPerformed(evt);
            }
        });

        j_correo.setBackground(new java.awt.Color(0, 137, 123));
        j_correo.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        j_correo.setForeground(new java.awt.Color(255, 255, 255));
        j_correo.setBorder(null);
        j_correo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_correoMousePressed(evt);
            }
        });
        j_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_correoActionPerformed(evt);
            }
        });

        j_ultimacompra.setBackground(new java.awt.Color(0, 137, 123));
        j_ultimacompra.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        j_ultimacompra.setForeground(new java.awt.Color(255, 255, 255));
        j_ultimacompra.setBorder(null);
        j_ultimacompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_ultimacompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_ultimacompraMousePressed(evt);
            }
        });
        j_ultimacompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_ultimacompraActionPerformed(evt);
            }
        });

        j_fecha_nacimiento1.setBackground(new java.awt.Color(0, 137, 123));
        j_fecha_nacimiento1.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        j_fecha_nacimiento1.setForeground(new java.awt.Color(255, 255, 255));
        j_fecha_nacimiento1.setBorder(null);
        j_fecha_nacimiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_fecha_nacimiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_fecha_nacimiento1MousePressed(evt);
            }
        });
        j_fecha_nacimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_fecha_nacimiento1ActionPerformed(evt);
            }
        });

        j_saldo1.setBackground(new java.awt.Color(0, 137, 123));
        j_saldo1.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        j_saldo1.setForeground(new java.awt.Color(255, 255, 255));
        j_saldo1.setBorder(null);
        j_saldo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_saldo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_saldo1MousePressed(evt);
            }
        });
        j_saldo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_saldo1ActionPerformed(evt);
            }
        });

        n3.setBackground(new java.awt.Color(139, 195, 74));
        n3.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n3.setForeground(new java.awt.Color(51, 255, 153));
        n3.setText("Direccion");

        n4.setBackground(new java.awt.Color(139, 195, 74));
        n4.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n4.setForeground(new java.awt.Color(51, 255, 153));
        n4.setText("Telefono");

        n5.setBackground(new java.awt.Color(139, 195, 74));
        n5.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n5.setForeground(new java.awt.Color(51, 255, 153));
        n5.setText("Correo");

        n6.setBackground(new java.awt.Color(139, 195, 74));
        n6.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n6.setForeground(new java.awt.Color(51, 255, 153));
        n6.setText("Fecha Nacimiento");

        n7.setBackground(new java.awt.Color(139, 195, 74));
        n7.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n7.setForeground(new java.awt.Color(51, 255, 153));
        n7.setText("Ultima Compra");

        n8.setBackground(new java.awt.Color(139, 195, 74));
        n8.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n8.setForeground(new java.awt.Color(51, 255, 153));
        n8.setText("Saldo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n3)
                            .addComponent(j_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n4))
                        .addGap(155, 155, 155))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j_ultimacompra, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j_fecha_nacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(j_saldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(n8))))
                            .addComponent(n7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2)
                    .addComponent(n3)
                    .addComponent(n4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n5)
                    .addComponent(n6)
                    .addComponent(n8))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_fecha_nacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_saldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n7)
                .addGap(3, 3, 3)
                .addComponent(j_ultimacompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        exit.setBackground(Color.red);
        exit.setForeground(Color.white);
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        exit.setBackground(new Color(30,185,128));
        exit.setForeground(Color.black);
    }//GEN-LAST:event_xMouseExited

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headMouseDragged

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void textbutomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseClicked

        if (  j_nombre2.getText().isEmpty() || j_direccion1.getText().isEmpty() || j_correo.getText().isEmpty() || j_telefono.getText().isEmpty()   || j_fecha_nacimiento1.getText().isEmpty() || j_saldo1.getText().isEmpty() || j_ultimacompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llena todos los campos");
        } else {
            enviar();

        }
    }//GEN-LAST:event_textbutomMouseClicked

    private void enviar(){
 
        
        ClientesRelacional vd = new ClientesRelacional();
        vd.insertarCliente(j_nombre2.getText(), j_direccion1.getText(), j_telefono.getText(), j_correo.getText(), j_fecha_nacimiento1.getText(), Double.parseDouble(j_saldo1.getText()), j_ultimacompra.getText());
  datos();
     }


    private void textbutomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseEntered

        crear.setBackground(new Color(178,223,219));
    }//GEN-LAST:event_textbutomMouseEntered

    private void textbutomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseExited

        crear.setBackground(new Color(128,203,196));
    }//GEN-LAST:event_textbutomMouseExited

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked

    }//GEN-LAST:event_crearMouseClicked

    private void j_telefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_telefonoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_telefonoMousePressed

    private void j_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_telefonoActionPerformed

    private void j_nombre2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_nombre2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nombre2MousePressed

    private void j_nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nombre2ActionPerformed

    private void j_direccion1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_direccion1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_direccion1MousePressed

    private void j_direccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_direccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_direccion1ActionPerformed

    private void j_correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_correoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_correoMousePressed

    private void j_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_correoActionPerformed

    private void j_ultimacompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ultimacompraMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_ultimacompraMousePressed

    private void j_ultimacompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_ultimacompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_ultimacompraActionPerformed

    private void j_fecha_nacimiento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_fecha_nacimiento1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_fecha_nacimiento1MousePressed

    private void j_fecha_nacimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_fecha_nacimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_fecha_nacimiento1ActionPerformed

    private void j_saldo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_saldo1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_saldo1MousePressed

    private void j_saldo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_saldo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_saldo1ActionPerformed

 private void datos() {

    String columnas[] = {"Codigo", "Nombre", "Direccion", "Telefono", "Correo", "Fecha Nacimiento", "Saldo", "Ultima Compra"};


    DefaultTableModel tabla2 = new DefaultTableModel(null, columnas);

    ClientesRelacional vd = new ClientesRelacional();
    List<sw.Cliente> listaClientes = vd.listarClientes();


    for (sw.Cliente dat : listaClientes) {
        Object ayuda[] = new Object[8]; 

        ayuda[0] = dat.getId();
        ayuda[1] = dat.getNombre();
        ayuda[2] = dat.getDireccion();
        ayuda[3] = dat.getTelefono();
        ayuda[4] = dat.getCorreo();
        ayuda[5] = dat.getFechaNacimiento();
        ayuda[6] = dat.getSaldo();
        ayuda[7] = dat.getUltimaCompra();

        tabla2.addRow(ayuda);
    }

    tablaV1.setModel(tabla2);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel crear;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel head;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField j_correo;
    private javax.swing.JTextField j_direccion1;
    private javax.swing.JTextField j_fecha_nacimiento1;
    private javax.swing.JTextField j_nombre2;
    private javax.swing.JTextField j_saldo1;
    private javax.swing.JTextField j_telefono;
    private javax.swing.JTextField j_ultimacompra;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n8;
    private javax.swing.JTable tablaV1;
    private javax.swing.JLabel textbutom;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
