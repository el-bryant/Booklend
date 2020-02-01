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
public class clsAutor {
    private int aut_id;
    private String apellidos;
    private String nombres;
    private String seudonimo;

    public clsAutor() {
    }

    public clsAutor(int aut_id, String apellidos, String nombres, String seudonimo) {
        this.aut_id = aut_id;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.seudonimo = seudonimo;
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
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

    public String getSeudonimo() {
        return seudonimo;
    }

    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }
    
}
