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
public class DAOAutor extends clsAutor{
    Functions conexion;
    
    public DAOAutor() {
        this.conexion = new Functions();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO autor VALUES (default, '" + getApellidos() + "', '" + getNombres() + "', '" + getSeudonimo() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE autor SET (apellidos = '" + getApellidos() + " nombres = '" + getNombres() + "', seudonimo = '" + getSeudonimo() + "') WHERE aut_id = '" + getAut_id() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar(){
        String sql = "SELECT aut_id + 1 FROM autor ORDER BY aut_id DESC LIMIT 1";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
}
