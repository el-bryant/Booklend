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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryyv
 */
public class JIFPersonalShow extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    Functions.Functions cnn = new Functions.Functions();
    JIFPersonalAdd personaladd;
    JIFPersonalEdit personaledit;
    JIFPersonalQuest personalquest;
    JIFPersonalShow personalshow;

    /**
     * Creates new form JIFPersonalShow
     */
    public JIFPersonalShow() {
        modelo = new DefaultTableModel(null, getColumnas());
        setFilas();
        initComponents();
    }
    
    private String[] getColumnas() {
        String columna[] = new String[] {"DNI", "Apellidos", "Nombres", "Usuario", "Cargo"};
        return columna;
    }
    
    private void setFilas() {
        try {
            String sql = "SELECT personal.pers_dni, personal.apellidos, personal.nombres, personal.login, cargo.nombre FROM personal, cargo WHERE personal.carg_id = cargo.carg_id";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Object datos[] = new Object[5];
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
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
        tbPersonal = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModiifcar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de colaboradores");
        setToolTipText("");

        tbPersonal.setModel(modelo);
        tbPersonal.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbPersonal);

        btnNuevo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/agregar.png"))); // NOI18N
        btnNuevo.setText("Agregar");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModiifcar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnModiifcar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/editar.png"))); // NOI18N
        btnModiifcar.setText("Modificar");
        btnModiifcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiifcarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/volver.png"))); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnModiifcar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModiifcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (personaladd == null || personaladd.isClosed()) {
            personaladd = new JIFPersonalAdd();
            Main.dtpMain.add(personaladd);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = personaladd.getSize();
            personaladd.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            personaladd.show();
            dispose();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModiifcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiifcarActionPerformed
        if (personaledit == null || personaledit.isClosed()) {
            personaledit = new JIFPersonalEdit();
            Main.dtpMain.add(personaledit);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = personaledit.getSize();
            personaledit.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            personaledit.show();
            int row = tbPersonal.getSelectedRow();
            personaledit.txtDni.setText(tbPersonal.getValueAt(row, 0).toString());
            personaledit.txtApellidos.setText(tbPersonal.getValueAt(row, 1).toString());
            personaledit.txtNombres.setText(tbPersonal.getValueAt(row, 2).toString());
            personaledit.txtLogin.setText(tbPersonal.getValueAt(row, 3).toString());
            personaledit.cboCargo.setSelectedItem(tbPersonal.getValueAt(row, 4).toString());
            dispose();
        }
    }//GEN-LAST:event_btnModiifcarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tbPersonal.getSelectedRows() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showConfirmDialog(rootPane, "Está seguro que desea eliminar el registro seleccionado?", "AVISO", JOptionPane.YES_NO_OPTION);
            int result = JOptionPane.YES_NO_OPTION;
            if (result == 0) {
                Logic.DAOPersonal obj = new Logic.DAOPersonal();
                obj.setPers_dni(tbPersonal.getValueAt(tbPersonal.getSelectedRow(), 0).toString());
                if (obj.eliminar() == true) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado satisfactoriamente");
                    modelo = new DefaultTableModel(null, getColumnas());
                    setFilas();
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModiifcar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbPersonal;
    // End of variables declaration//GEN-END:variables
}
