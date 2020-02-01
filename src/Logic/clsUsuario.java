/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Date;

/**
 *
 * @author Bryyv
 */
public class clsUsuario {
    private String usu_dni;
    private String apellidos;
    private String nombres;
    private Date fnacimiento;
    private String telefono;
    private String direccion;
    private String correo;
    private String login;
    private String pass;
    private int lector;

    public clsUsuario() {
    }

    public clsUsuario(String usu_dni, String apellidos, String nombres, Date fnacimiento, String telefono, String direccion, String correo, String login, String pass, int lector) {
        this.usu_dni = usu_dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.fnacimiento = fnacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.login = login;
        this.pass = pass;
        this.lector = lector;
    }

    public String getUsu_dni() {
        return usu_dni;
    }

    public void setUsu_dni(String usu_dni) {
        this.usu_dni = usu_dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getLector() {
        return lector;
    }

    public void setLector(int lector) {
        this.lector = lector;
    }
        
}
