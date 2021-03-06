/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Functions.Reportes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryyv
 */
public class JIFMateriaShow extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    Functions.Functions cnn = new Functions.Functions();
    JIFMateriaAdd materiaadd;
    JIFMateriaEdit materiaedit;
    /**
     * Creates new form JIFMateriaShow
     */
    public JIFMateriaShow() {
        modelo = new DefaultTableModel(null, getColumnas());
        setFilas();
        initComponents();
    }
    
    private String[] getColumnas() {
        String columna[] = new String[] {"Código", "Nombre"};
        return columna;
    }
    
    private void setFilas() {
        try {
            String sql = "SELECT mat_id, nombre FROM materia ORDER BY mat_id";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Object datos[] = new Object[2];
            while (rs.next()) {
                for (int i = 0; i < 2; i++) {
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
        tbMateria = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Listar Materias");

        tbMateria.setAutoCreateRowSorter(true);
        tbMateria.setModel(modelo);
        tbMateria.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbMateria);

        btnNuevo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/agregar.png"))); // NOI18N
        btnNuevo.setText("Agregar");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
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

        btnModificar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imprimir.png"))); // NOI18N
        btnExportar.setText("PDF");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnExportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (materiaadd == null || materiaadd.isClosed()) {
            materiaadd = new JIFMateriaAdd();
            Main.dtpMain.add(materiaadd);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = materiaadd.getSize();
            materiaadd.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            materiaadd.show();
            dispose();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (materiaedit == null || materiaedit.isClosed()) {
            materiaedit = new JIFMateriaEdit();
            Main.dtpMain.add(materiaedit);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = materiaedit.getSize();
            materiaedit.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            materiaedit.show();
            int row = tbMateria.getSelectedRow();
            materiaedit.txtCode.setText(tbMateria.getValueAt(row, 0).toString());
            materiaedit.txtNombre.setText(tbMateria.getValueAt(row, 1).toString());
            dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        Reportes re = new Reportes();
        String dir_current = System.getProperty("user.dir");
        String ruta = dir_current + "/reporte/materias.jasper";
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("todos los archivos *.pdf", "pdf", "PDF"));
        int selection = fc.showSaveDialog(null);
        try {
            if (selection == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "Esto puede tardar unos minutos, espere por favor", "Estamos generando el reporte", JOptionPane.WARNING_MESSAGE);
                File JFC = fc.getSelectedFile();
                String PATH = JFC.getAbsolutePath();
                try (PrintWriter printwriter = new PrintWriter(JFC)) {
                    printwriter.print(ruta);
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                re.reportesPDF(ruta, PATH);
                if (!(PATH.endsWith(".pdf"))) {
                    File temp = new File (PATH + ".pdf");
                    JFC.renameTo(temp);
                }
                JOptionPane.showMessageDialog(null, "Documento exportado exitosamente", "Guardaro exitoso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMateria;
    // End of variables declaration//GEN-END:variables
}
