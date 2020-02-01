/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryyv
 */
public class JIFPersonalEdit extends javax.swing.JInternalFrame {
JIFPersonalShow personalshow;
Functions.Functions cnn = new Functions.Functions();

    /**
     * Creates new form JIFPersonalEdit
     */
    public JIFPersonalEdit() {
        initComponents();
        cargarCargos();
    }
    
    private void cargarCargos() {
        try {
            String sql = "SELECT nombre FROM cargo ORDER BY carg_id";
            PreparedStatement ps = cnn.getCnn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cboCargo.addItem(rs.getString(1));
            }
        } catch (Exception e) {
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

        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtNombres = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboCargo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modificar datos de un colaborador");

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        txtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniFocusLost(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        jLabel7.setText("DNI");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel2.setText("Apellidos");

        btnGuardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel3.setText("Nombres");

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/volver.png"))); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoginFocusLost(evt);
            }
        });
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLoginKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel4.setText("Login");

        cboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", " " }));
        cboCargo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboCargoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel8.setText("Cargo");

        txtPassword.setEchoChar('\u2022');
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusGained
        txtDni.selectAll();
        txtDni.setBackground(Color.darkGray);
        txtDni.setForeground(Color.white);
    }//GEN-LAST:event_txtDniFocusGained

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        txtDni.setBackground(Color.white);
        txtDni.setForeground(Color.black);
    }//GEN-LAST:event_txtDniFocusLost

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtApellidos.requestFocus();
        }
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9' && evt.getKeyChar() != '\b' || txtDni.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusGained
        txtApellidos.selectAll();
        txtApellidos.setBackground(Color.darkGray);
        txtApellidos.setForeground(Color.white);
    }//GEN-LAST:event_txtApellidosFocusGained

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        txtApellidos.setBackground(Color.white);
        txtApellidos.setForeground(Color.black);
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNombres.requestFocus();
        }
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
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
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtDni.getText().equals("") || txtApellidos.getText().equals("") || txtNombres.getText().equals("") || txtLogin.getText().equals("") || txtPassword.getText().equals("") || cboCargo.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos '\n'", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            txtDni.selectAll();
            txtApellidos.setText("");
            txtNombres.setText("");
            txtLogin.setText("");
            txtPassword.setText("");
            cboCargo.setSelectedIndex(0);
            txtDni.requestFocus();
        }
        Logic.DAOPersonal obj = new Logic.DAOPersonal();
        obj.setPers_dni(txtDni.getText());
        obj.setApellidos(txtApellidos.getText());
        obj.setNombres(txtNombres.getText());
        obj.setLogin(txtLogin.getText());
        obj.setPass(txtPassword.getText());
        obj.setCarg_id(cboCargo.getSelectedIndex() - 1);
        if (obj.modificar() == true) {
            JOptionPane.showMessageDialog(rootPane, "Registros modificados satisfactoriamente");
            dispose();
            personalshow = new JIFPersonalShow();
            Main.dtpMain.add(personalshow);
            Dimension ds = Main.dtpMain.getSize();
            Dimension fs = personalshow.getSize();
            personalshow.setLocation((ds.width - fs.width) / 2, (ds.height - fs.height) / 2);
            personalshow.show();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se consiguió modificar");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusGained
        txtNombres.selectAll();
        txtNombres.setBackground(Color.darkGray);
        txtNombres.setForeground(Color.white);
    }//GEN-LAST:event_txtNombresFocusGained

    private void txtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusLost
        txtNombres.setBackground(Color.white);
        txtNombres.setForeground(Color.black);
    }//GEN-LAST:event_txtNombresFocusLost

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cboCargo.requestFocus();
        }
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
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
    }//GEN-LAST:event_txtNombresKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtDni.setText("");
        txtApellidos.setText("");
        txtNombres.setText("");
        txtLogin.setText("");
        txtPassword.setText("");
        txtDni.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginFocusGained
        txtLogin.selectAll();
        txtLogin.setBackground(Color.darkGray);
        txtLogin.setForeground(Color.white);
    }//GEN-LAST:event_txtLoginFocusGained

    private void txtLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginFocusLost
        txtLogin.setBackground(Color.white);
        txtLogin.setForeground(Color.black);
    }//GEN-LAST:event_txtLoginFocusLost

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtLoginKeyPressed

    private void txtLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyTyped
        char caracter = evt.getKeyChar();
        if (caracter != '\b' && (!Character.isLetter(caracter)) && caracter != KeyEvent.VK_SPACE || txtLogin.getText().length() >= 12) {
            evt.consume();
        } else {
            if (Character.isLowerCase(caracter)) {
                String cad = ("" + caracter ).toUpperCase();
                caracter = cad.charAt(0);
                evt.setKeyChar(caracter);
            }
        }
    }//GEN-LAST:event_txtLoginKeyTyped

    private void cboCargoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboCargoPopupMenuWillBecomeInvisible
        txtLogin.requestFocus();
    }//GEN-LAST:event_cboCargoPopupMenuWillBecomeInvisible

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        txtPassword.selectAll();
        txtPassword.setBackground(Color.darkGray);
        txtPassword.setForeground(Color.white);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        txtPassword.setBackground(Color.white);
        txtPassword.setForeground(Color.black);
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        if (txtPassword.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JTextField txtApellidos;
    public static javax.swing.JTextField txtDni;
    public static javax.swing.JTextField txtLogin;
    public static javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}