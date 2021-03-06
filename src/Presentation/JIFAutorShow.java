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
public class JIFAutorShow extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    Functions.Functions cnn = new Functions.Functions();
    JIFAutorAdd autoradd;
    JIFAutorEdit autoredit;

    /**
     * Creates new form JIFShowAutores
     */
    public JIFAutorShow(){
        modelo = new DefaultTableModel(null, getColumnas());
        setFilas();
        initComponents();
    }
    
    private String[] getColumnas() {
        String columna [] = new String[]{"Código", "Apellidos", "Nombres", "Seudónimo"};
        return columna;
    }
    
    private void setFilas() {
        try {
            String sql = "SELECT aut_id, apellidos, nombres, seudonimo FROM autor";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Object datos[] = new Object[4];
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
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
        TbAutores = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Autores");

        TbAutores.setAutoCreateRowSorter(true);
        TbAutores.setModel(modelo);
        TbAutores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TbAutores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TbAutores.setShowVerticalLines(true);
        TbAutores.getTableHeader().setReorderingAllowed(false);
        TbAutores.setUpdateSelectionOnSort(false);
        TbAutores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TbAutoresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TbAutoresFocusLost(evt);
            }
        });
        TbAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbAutoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbAutores);
        TbAutores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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
        btnExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (autoradd == null || autoradd.isClosed()) {
            autoradd = new JIFAutorAdd();
            Main.dtpMain.add(autoradd);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = autoradd.getSize();
            autoradd.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            autoradd.show();
            dispose();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (autoredit == null || autoredit.isClosed()) {
            autoredit = new JIFAutorEdit();
            Main.dtpMain.add(autoredit);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = autoredit.getSize();
            autoredit.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            autoredit.show();
            int row = TbAutores.getSelectedRow();
            autoredit.txtCodigo.setText(TbAutores.getValueAt(row, 0).toString());
            autoredit.txtApellidos.setText(TbAutores.getValueAt(row, 1).toString());
            autoredit.txtNombres.setText(TbAutores.getValueAt(row, 2).toString());
            autoredit.txtSeudonimo.setText(TbAutores.getValueAt(row, 3).toString());
            dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void TbAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbAutoresMouseClicked
    }//GEN-LAST:event_TbAutoresMouseClicked

    private void TbAutoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TbAutoresFocusGained
    }//GEN-LAST:event_TbAutoresFocusGained

    private void TbAutoresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TbAutoresFocusLost
    }//GEN-LAST:event_TbAutoresFocusLost

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        Reportes re = new Reportes();
        String dir_current = System.getProperty("user.dir");
        String ruta = dir_current + "/reporte/autores.jasper";
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("todos los archivos *.pdf", "pdf", "PDF"));
        int selection = fc.showSaveDialog(null);
        try {
            if (selection == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "Esto puede tardar unos segundos, espere por favor", "Estamos generando el reporte", JOptionPane.WARNING_MESSAGE);
                File JFC = fc.getSelectedFile();
                String PATH = JFC.getAbsolutePath();
                try (PrintWriter printwriter = new PrintWriter(JFC)) {
                    printwriter.print(ruta);
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                re.reportesPDF(ruta, PATH);
                if (!(PATH.endsWith(".pdf"))) {
                    File temp = new File(PATH + ".pdf");
                    JFC.renameTo(temp);
                }
                JOptionPane.showMessageDialog(null, "Documento exportado exitosamente", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TbAutores;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
