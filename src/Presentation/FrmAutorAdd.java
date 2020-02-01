/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryyv
 */
public class FrmAutorAdd extends javax.swing.JFrame {
    DefaultTableModel modelo;
    Functions.Functions cnn = new Functions.Functions();

    /**
     * Creates new form FrmAutorAdd
     */
    public FrmAutorAdd() {
        modelo = new DefaultTableModel(null, getColumnas());
        setFilas();
        initComponents();
        this.getContentPane().setBackground(Color.green);
    }
    
    private String[] getColumnas() {
        String columna[] = new String[] {"Código", "Apellidos", "Nombres", "Seudónimo"};
        return columna;
    }
    
    private void setFilas() {
        try {
            String sql = "SELECT TO_CHAR(aut_id, '00000'), apellidos, nombres, seudonimo FROM autor";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Object datos[] = new Object[4];
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
                    datos[i] = rs.getString(i + 1);
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
        tbAutores = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        tbAutores.setModel(modelo);
        tbAutores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbAutores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbAutores);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        JIFBookAdd.txtNombre.setEnabled(true);
        JIFBookAdd.btnAutores.setEnabled(true);
        JIFBookAdd.cboAutores.setEnabled(true);
        JIFBookAdd.cboEditorial.setEnabled(true);
        JIFBookAdd.txtIsbn.setEnabled(true);
        JIFBookAdd.btnPortada.setEnabled(true);
        JIFBookAdd.cboMateria.setEnabled(true);
        JIFBookAdd.txtLugar.setEnabled(true);
        JIFBookAdd.txtYear.setEnabled(true);
        JIFBookAdd.txtCantPags.setEnabled(true);
        JIFBookAdd.txtCode.setEnabled(true);
        JIFBookAdd.cboTipoLibro.setEnabled(true);
        JIFBookAdd.txaContenidos.setEnabled(true);
        JIFBookAdd.btnGuardar.setEnabled(true);
        JIFBookAdd.btnCancelar.setEnabled(true);
        JIFBookAdd.btnSalir.setEnabled(true);
        JIFBookAdd.cboEditorial.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        for (int i = 0; i < tbAutores.getSelectedRowCount(); i ++) {
            int row = tbAutores.getSelectedRow();
            String cod = tbAutores.getValueAt(row, 0).toString();
            String apellidos = tbAutores.getValueAt(row, 1).toString();
            String nombres = tbAutores.getValueAt(row, 2).toString();
            JIFBookAdd.cboAutores.addItem(cod + " - " + apellidos + ' ' + nombres);
        }
        this.hide();
        JIFBookAdd.txtNombre.setEnabled(true);
        JIFBookAdd.btnAutores.setEnabled(true);
        JIFBookAdd.cboAutores.setEnabled(true);
        JIFBookAdd.cboEditorial.setEnabled(true);
        JIFBookAdd.txtIsbn.setEnabled(true);
        JIFBookAdd.btnPortada.setEnabled(true);
        JIFBookAdd.cboMateria.setEnabled(true);
        JIFBookAdd.txtLugar.setEnabled(true);
        JIFBookAdd.txtYear.setEnabled(true);
        JIFBookAdd.txtCantPags.setEnabled(true);
        JIFBookAdd.txtCode.setEnabled(true);
        JIFBookAdd.cboTipoLibro.setEnabled(true);
        JIFBookAdd.txaContenidos.setEnabled(true);
        JIFBookAdd.btnGuardar.setEnabled(true);
        JIFBookAdd.btnCancelar.setEnabled(true);
        JIFBookAdd.btnSalir.setEnabled(true);
        JIFBookAdd.cboEditorial.requestFocus();
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAutorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAutorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAutorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAutorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAutorAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbAutores;
    // End of variables declaration//GEN-END:variables
}
