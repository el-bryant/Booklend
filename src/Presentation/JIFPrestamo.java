/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryyv
 */
public class JIFPrestamo extends javax.swing.JInternalFrame {
    JIFPrestamoLibro prestamolibro;
    DefaultTableModel model;
        
    /**
     * Creates new form JIFPrestamo
     */
    public JIFPrestamo() {
        model = new DefaultTableModel(null, getColumnas());
        initComponents();
        ftfPrestamo.setText(fechaActual());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpPedido = new javax.swing.JTabbedPane();
        pnPedido = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNombresUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidosUser = new javax.swing.JTextField();
        txtDniUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDniPersonal = new javax.swing.JTextField();
        txtApellidosPersonal = new javax.swing.JTextField();
        txtNombresPersonal = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ftfPrestamo = new javax.swing.JFormattedTextField();
        btnAddBook = new javax.swing.JButton();
        jdcDevolucion = new com.toedter.calendar.JDateChooser();
        btnNext = new javax.swing.JButton();
        pnDetalle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPrestamo = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAnadirLibro = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar nuevo préstamo");

        tbpPedido.setFocusable(false);

        pnPedido.setFocusable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del usuario"));

        txtNombresUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombresUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresUserFocusLost(evt);
            }
        });
        txtNombresUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresUserKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Apellidos");

        txtApellidosUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosUserFocusLost(evt);
            }
        });
        txtApellidosUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosUserKeyTyped(evt);
            }
        });

        txtDniUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDniUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniUserFocusLost(evt);
            }
        });
        txtDniUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniUserKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("DNI");

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Nombres");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDniUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidosUser)
                    .addComponent(txtNombresUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDniUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidosUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombresUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado"));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("Nombres");

        txtDniPersonal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDniPersonalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniPersonalFocusLost(evt);
            }
        });
        txtDniPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniPersonalKeyPressed(evt);
            }
        });

        txtApellidosPersonal.setEditable(false);
        txtApellidosPersonal.setEnabled(false);

        txtNombresPersonal.setEditable(false);
        txtNombresPersonal.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDniPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidosPersonal)
                    .addComponent(txtNombresPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDniPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidosPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombresPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Préstamo"));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de préstamo");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de devolución");

        ftfPrestamo.setEditable(false);
        ftfPrestamo.setEnabled(false);

        btnAddBook.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/libro.png"))); // NOI18N
        btnAddBook.setText("Añadir libro al préstamo");
        btnAddBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftfPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jdcDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ftfPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jdcDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnNext.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/next.png"))); // NOI18N
        btnNext.setText("Siguiente");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPedidoLayout = new javax.swing.GroupLayout(pnPedido);
        pnPedido.setLayout(pnPedidoLayout);
        pnPedidoLayout.setHorizontalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPedidoLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(pnPedidoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnPedidoLayout.setVerticalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPedidoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPedidoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );

        tbpPedido.addTab("Préstamo", pnPedido);

        pnDetalle.setFocusable(false);

        tbPrestamo.setModel(model);
        tbPrestamo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbPrestamo.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbPrestamo);

        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar préstamo");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/aceptar.png"))); // NOI18N
        btnGuardar.setText("Registrar préstamo");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar libro");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAnadirLibro.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAnadirLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/libro.png"))); // NOI18N
        btnAnadirLibro.setText("Añadir libro");
        btnAnadirLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnadirLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDetalleLayout = new javax.swing.GroupLayout(pnDetalle);
        pnDetalle.setLayout(pnDetalleLayout);
        pnDetalleLayout.setHorizontalGroup(
            pnDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetalleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnadirLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        pnDetalleLayout.setVerticalGroup(
            pnDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetalleLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnadirLibro))
                .addGap(20, 20, 20))
        );

        tbpPedido.addTab("Detalle de préstamo", pnDetalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpPedido)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private String[] getColumnas() {
        String columna[] = new String[] {"Código", "Título", "Autor", "Editorial", "Materia"};
        return columna;
    }
    
    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }
    
    private void apellidos_nombres_user() {
        try {
            Logic.DAOPrestamo obj = new Logic.DAOPrestamo();
            obj.setUsu_dni(txtDniUser.getText());
            txtApellidosUser.setText(obj.buscar_apellidos_user());
            txtNombresUser.setText(obj.buscar_nombres_user());
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
        }
    }
    
    private void apellidos_nombres_personal() {
        try {
            Logic.DAOPrestamo obj = new Logic.DAOPrestamo();
            obj.setPers_dni(txtDniPersonal.getText());
            txtApellidosPersonal.setText(obj.buscar_apellidos_personal());
            txtNombresPersonal.setText(obj.buscar_nombres_personal());
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
        }
    }
    
    private void txtDniUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            apellidos_nombres_user();
            txtApellidosUser.requestFocus();
            txtApellidosUser.selectAll();
        }
    }//GEN-LAST:event_txtDniUserKeyPressed

    private void txtApellidosUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNombresUser.requestFocus();
        }
    }//GEN-LAST:event_txtApellidosUserKeyPressed

    private void txtNombresUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDniPersonal.requestFocus();
        }
    }//GEN-LAST:event_txtNombresUserKeyPressed

    private void txtDniUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniUserKeyTyped
        char caracter = evt.getKeyChar();
        if (caracter < '0' || caracter > '9' && caracter != '\b' || txtDniUser.getText().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniUserKeyTyped

    private void txtApellidosUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosUserKeyTyped
        char caracter = evt.getKeyChar();
        if (caracter != '\b' && (!Character.isLetter(caracter)) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        } else {
            if (Character.isLowerCase(caracter)) {
                String cad = ("" + caracter).toUpperCase();
                caracter = cad.charAt(0);
                evt.setKeyChar(caracter);
            }
        }
    }//GEN-LAST:event_txtApellidosUserKeyTyped

    private void txtNombresUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresUserKeyTyped
        char caracter = evt.getKeyChar();
        if (caracter != '\b' && (!Character.isLetter(caracter)) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        } else {
            if (Character.isLowerCase(caracter)) {
                String cad = ("" + caracter).toUpperCase();
                caracter = cad.charAt(0);
                evt.setKeyChar(caracter);
            }
        }
    }//GEN-LAST:event_txtNombresUserKeyTyped

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        tbpPedido.setSelectedIndex(1);
        btnAnadirLibro.requestFocus();
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtDniUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniUserFocusGained
        txtDniUser.setBackground(Color.darkGray);
        txtDniUser.setForeground(Color.white);
    }//GEN-LAST:event_txtDniUserFocusGained

    private void txtApellidosUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosUserFocusGained
        txtApellidosUser.setBackground(Color.darkGray);
        txtApellidosUser.setForeground(Color.white);
    }//GEN-LAST:event_txtApellidosUserFocusGained

    private void txtNombresUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresUserFocusGained
        txtNombresUser.setBackground(Color.darkGray);
        txtNombresUser.setForeground(Color.white);
    }//GEN-LAST:event_txtNombresUserFocusGained

    private void txtDniUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniUserFocusLost
        txtDniUser.setBackground(Color.white);
        txtDniUser.setForeground(Color.black);
    }//GEN-LAST:event_txtDniUserFocusLost

    private void txtApellidosUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosUserFocusLost
        txtApellidosUser.setBackground(Color.white);
        txtApellidosUser.setForeground(Color.black);
    }//GEN-LAST:event_txtApellidosUserFocusLost

    private void txtNombresUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresUserFocusLost
        txtNombresUser.setBackground(Color.white);
        txtNombresUser.setForeground(Color.black);
    }//GEN-LAST:event_txtNombresUserFocusLost

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        if (prestamolibro == null || prestamolibro.isClosed()){
            prestamolibro = new JIFPrestamoLibro();
            Main.dtpMain.add(prestamolibro);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = prestamolibro.getSize();
            prestamolibro.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            prestamolibro.show();
        }
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void btnAnadirLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirLibroActionPerformed
        if (prestamolibro == null || prestamolibro.isClosed()){
            prestamolibro = new JIFPrestamoLibro();
            Main.dtpMain.add(prestamolibro);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = prestamolibro.getSize();
            prestamolibro.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            prestamolibro.show();
        }
    }//GEN-LAST:event_btnAnadirLibroActionPerformed

    public static Date ParseFecha(String fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date nuevaFecha = sdf.parse(fecha);
        System.out.println(nuevaFecha);
        return nuevaFecha;
    }
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public String getFecha(JDateChooser jdc) {
        if (jdc.getDate() != null) {
            return formato.format(jdc.getDate());
        } else {
            return null;
        }
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            Logic.DAOPrestamo obj = new Logic.DAOPrestamo();
            obj.setFprestamo(ParseFecha(fechaActual()));
            obj.setFentrega(ParseFecha(getFecha(jdcDevolucion)));
            obj.setUsu_dni(txtDniUser.getText());
            obj.setPers_dni(txtDniPersonal.getText());
            if (obj.insertar_prestamo() == true) {
                System.out.println("Prestamo insertado");
            } else {
                System.out.println("No se insertó préstamo");
            }
            int lon = tbPrestamo.getRowCount();
            for (int i = 0; i < lon; i++) {
                obj.setLib_id(tbPrestamo.getValueAt(i, 0).toString());
                obj.setPres_id(Integer.parseInt(obj.consultar()));
                if (obj.insertar_dprestamo() == true) {
                    System.out.println("Detalle de préstamo insertado");
                } else {
                    System.out.println("No se insertó detalle");
                }
            }
            JOptionPane.showMessageDialog(null, "Préstamo registrado correctamente");
            dispose();
        } catch (ParseException ex) {
            Logger.getLogger(JIFPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtDniPersonalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniPersonalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            apellidos_nombres_personal();
            jdcDevolucion.requestFocus();
        }
    }//GEN-LAST:event_txtDniPersonalKeyPressed

    private void txtDniPersonalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniPersonalFocusGained
        txtDniPersonal.setBackground(Color.darkGray);
        txtDniPersonal.setForeground(Color.white);
    }//GEN-LAST:event_txtDniPersonalFocusGained

    private void txtDniPersonalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniPersonalFocusLost
        txtDniPersonal.setBackground(Color.white);
        txtDniPersonal.setForeground(Color.black);
    }//GEN-LAST:event_txtDniPersonalFocusLost

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) tbPrestamo.getModel();
        modelo.removeRow(tbPrestamo.getSelectedRow());
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAnadirLibro;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNext;
    private javax.swing.JFormattedTextField ftfPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcDevolucion;
    private javax.swing.JPanel pnDetalle;
    private javax.swing.JPanel pnPedido;
    public static javax.swing.JTable tbPrestamo;
    public static javax.swing.JTabbedPane tbpPedido;
    public static javax.swing.JTextField txtApellidosPersonal;
    private javax.swing.JTextField txtApellidosUser;
    public static javax.swing.JTextField txtDniPersonal;
    private javax.swing.JTextField txtDniUser;
    public static javax.swing.JTextField txtNombresPersonal;
    private javax.swing.JTextField txtNombresUser;
    // End of variables declaration//GEN-END:variables
}
