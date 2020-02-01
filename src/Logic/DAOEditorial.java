/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Functions.Functions;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryyv
 */
public class DAOEditorial extends clsEditorial{
    Functions conexion;
    
    public DAOEditorial() {
        this.conexion = new Functions();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO editorial VALUES (default, '" + getNombre() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UDPDATE editorial SET (nombre = '" + getNombre() + "') WHERE edit_id = '" + getEdit_id() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar() {
        String sql = "SELECT edit_id + 1 FROM editorial ORDER BY edit_id DESC LIMIT 1";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Dato no existe");
        } else {
            try {
                if (rs.next()) {
                    return rs.getString(1);
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}
