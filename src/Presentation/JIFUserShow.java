/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryyv
 */
public class JIFUserShow extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    Functions.Functions cnn = new Functions.Functions();
    JIFUserAdd useradd;
    JIFUserEdit useredit;
    
    /**
     * Creates new form JIFShowUser
     */
    public JIFUserShow() {
        modelo = new DefaultTableModel(null, getColumnas());
        setFilas();
        initComponents();
    }
    
    private String[] getColumnas() {
        String columna[] = new String[] {"DNI", "Apellidos", "Nombres", "Fecha de nacimiento", "Teléfono", "Dirección", "Correo", "Login"};
        return columna;
    }
    
    private void setFilas() {
        try {
            String sql = "SELECT usuario.usu_dni, usuario.apellidos, usuario.nombres, usuario.fnacimiento, usuario.telefono, usuario.direccion, usuario.correo, usuario.login FROM usuario";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Object datos[] = new Object [8];
            while (rs.next()) {
                for (int i = 0; i < 8; i++) {
                    datos[i] = rs.getObject(i + 1);
                }
                modelo.addRow(datos);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsers = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setForeground(new java.awt.Color(255, 255, 255));
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de Usuarios");
        setPreferredSize(new java.awt.Dimension(936, 347));

        tbUsers.setModel(modelo);
        tbUsers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbUsers);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnModificar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/volver.png"))); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/agregar.png"))); // NOI18N
        btnNuevo.setText("Agregar");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (useradd == null || useradd.isClosed()) {
            useradd = new JIFUserAdd();
            Main.dtpMain.add(useradd);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = useradd.getSize();
            useradd.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            useradd.show();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (useredit == null || useredit.isClosed()) {
            useredit = new JIFUserEdit();
            Main.dtpMain.add(useredit);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = useredit.getSize();
            useredit.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            useredit.show();
            useredit.txtDni.setText(tbUsers.getValueAt(tbUsers.getSelectedRow(), 0).toString());
            useredit.txtApellidos.setText(tbUsers.getValueAt(tbUsers.getSelectedRow(), 1).toString());
            useredit.txtNombres.setText(tbUsers.getValueAt(tbUsers.getSelectedRow(), 2).toString());
            useredit.txtFnacimiento.setText(tbUsers.getValueAt(tbUsers.getSelectedRow(), 3).toString());
            useredit.txtTelefono.setText(tbUsers.getValueAt(tbUsers.getSelectedRow(), 4).toString());
            useredit.txtAddress.setText(tbUsers.getValueAt(tbUsers.getSelectedRow(), 5).toString());
            useredit.txtCorreo.setText(tbUsers.getValueAt(tbUsers.getSelectedRow(), 6).toString());
            useredit.txtUser.setText(tbUsers.getValueAt(tbUsers.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUsers;
    // End of variables declaration//GEN-END:variables
}
