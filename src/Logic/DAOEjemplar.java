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
public class DAOEjemplar extends clsEjemplar{
    Functions conexion;
    
    public DAOEjemplar() {
        this.conexion = new Functions();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO ejemplar VALUES (default, '" + getLib_id() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE ejemplar SET (lib_id = '" + getLib_id() + "') WHERE ejem_id = '" + getEjem_id() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
