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
public class DAOPrestamo extends clsPrestamo{
    Functions conexion;
    
    public DAOPrestamo() {
        this.conexion = new Functions();
    }
    
    public boolean insertar_devolucion() {
        String sql = "UPDATE detalle_prestamo SET fdevolucion = '" + getFdevolucion() + "' WHERE detalle_prestamo.detpres_id = '" + getDetpres_id() + "' AND lib_id = '" + getLib_id() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean insertar_prestamo() {
        String sql = "INSERT INTO prestamo VALUES (default, '" + getFprestamo() + "', '" + getFentrega() + "', '" + getUsu_dni() + "', '" + getPers_dni() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar_prestamo() {
        String sql = "UPDATE prestamo SET (fprestamo = '" + getFprestamo() + "', fentrega = '" + getFentrega() + "', pers_id = '" + getPers_dni() + "') WHERE pres_id = " + getPres_id() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean insertar_dprestamo() {
        String sql = "INSERT INTO detalle_prestamo(pres_id, lib_id) VALUES (" + getPres_id() + ", '" + getLib_id() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar(){
        String sql = "SELECT pres_id FROM prestamo ORDER BY pres_id DESC LIMIT 1";
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
    
    public String buscar_apellidos_user() {
        String sql = "SELECT apellidos FROM usuario WHERE usu_dni = '" + getUsu_dni() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Dato no existe");
        } else {
            try {
                if (rs.next())
                    return rs.getString(1);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    
    public String buscar_nombres_user() {
        String sql = "SELECT nombres FROM usuario WHERE usu_dni = '" + getUsu_dni() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Dato no existe");
        } else {
            try {
                if (rs.next())
                    return rs.getString(1);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    
    public String buscar_pres_id() {
        String sql = "SELECT pres_id FROM prestamo WHERE detpres_id = " + getDetpres_id();
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Dato no existe");
        } else {
            try {
                if (rs.next())
                    return rs.getString(1);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    
    public String buscar_apellidos_personal() {
        String sql = "SELECT apellidos FROM personal WHERE pers_dni = '" + getPers_dni() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Dato no existe");
        } else {
            try {
                if (rs.next())
                    return rs.getString(1);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    
    public String buscar_nombres_personal() {
        String sql = "SELECT nombres FROM personal WHERE pers_dni = '" + getPers_dni() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Dato no existe");
        } else {
            try {
                if (rs.next())
                    return rs.getString(1);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}
