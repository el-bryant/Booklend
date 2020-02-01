/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Functions.Functions;

/**
 *
 * @author Bryyv
 */
public class DAOPersonal  extends clsPersonal{
    Functions conexion;
    
    public DAOPersonal() {
        this.conexion = new Functions();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO personal VALUES ('" + getPers_dni() + "', '" + getApellidos() + "', ' " + getNombres() + "', '" + getLogin() + "', '" + getPass() + "', " + getCarg_id() + ")";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE personal SET apellidos = '" + getApellidos() + "', nombres = '" + getNombres() + "', login = '" + getLogin() + "', pass = '" + getPass() + "', carg_id = " + getCarg_id() + " WHERE pers_dni = '" + getPers_dni() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eliminar() {
        String sql = "DELETE FROM personal WHERE pers_dni = '" + getPers_dni() + "'";
        if (conexion.eliminar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
