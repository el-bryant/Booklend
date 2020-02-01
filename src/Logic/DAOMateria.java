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
public class DAOMateria extends clsMateria{
    Functions conexion;

    public DAOMateria() {
        this.conexion = new Functions();
    }    
    
    public boolean insertar() {
        String sql = "INSERT INTO materia VALUES (default, '" + getNombre() + "'";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE materia SET (nombre = '" + getNombre() + "') WHERE mat_id = '" + getMat_id() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar() {
        String sql = "SELECT mat_id FROM materia ORDER BY mat_id DESC LIMIT 1";
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
