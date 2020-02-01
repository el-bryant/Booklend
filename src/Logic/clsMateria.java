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
public class clsMateria {
    private int mat_id;
    private String nombre;

    public clsMateria() {
    }

    public clsMateria(int mat_id, String nombre) {
        this.mat_id = mat_id;
        this.nombre = nombre;
    }

    public int getMat_id() {
        return mat_id;
    }

    public void setMat_id(int mat_id) {
        this.mat_id = mat_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
