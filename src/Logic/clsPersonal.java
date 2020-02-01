/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Bryyv
 */
public class clsPersonal {
    private String pers_dni;
    private String apellidos;
    private String nombres;
    private String login;
    private String pass;
    private int carg_id;

    public clsPersonal() {
    }

    public clsPersonal(String pers_dni, String apellidos, String nombres, String login, String pass, int carg_id) {
        this.pers_dni = pers_dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.login = login;
        this.pass = pass;
        this.carg_id = carg_id;
    }

    public String getPers_dni() {
        return pers_dni;
    }

    public void setPers_dni(String pers_dni) {
        this.pers_dni = pers_dni;
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

    public int getCarg_id() {
        return carg_id;
    }

    public void setCarg_id(int carg_id) {
        this.carg_id = carg_id;
    }
    
}
