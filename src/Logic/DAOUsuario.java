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
public class DAOUsuario extends clsUsuario{
    Functions conexion;
    
    public DAOUsuario() {
        this.conexion = new Functions();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO usuario VALUES ('" + getUsu_dni() + "', '" + getApellidos() + "', '" + getNombres() + "', '" + getFnacimiento() + "', '" + getTelefono() + "', '" + getDireccion() + "', '" + getCorreo() + "', '" + getLogin() + "', '" + getPass() + "', '" + getLector() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE usuario SET (apellidos = '" + getApellidos() + "', nombres = '" + getNombres() + "', fnacimiento = '" + getFnacimiento() + "', telefono = '" + getTelefono() + "', direccion = '" + getDireccion() + "', correo = '" + getCorreo() + "', login = '" + getLogin() + "', pass = '" + getPass() + "', lector = '" + getLector() + "') WHERE usu_dni = '" + getUsu_dni() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
