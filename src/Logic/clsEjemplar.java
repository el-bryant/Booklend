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
public class clsEjemplar {
    private int ejem_id;
    private int lib_id;

    public clsEjemplar() {
    }

    public clsEjemplar(int ejem_id, int lib_id) {
        this.ejem_id = ejem_id;
        this.lib_id = lib_id;
    }

    public int getEjem_id() {
        return ejem_id;
    }

    public void setEjem_id(int ejem_id) {
        this.ejem_id = ejem_id;
    }

    public int getLib_id() {
        return lib_id;
    }

    public void setLib_id(int lib_id) {
        this.lib_id = lib_id;
    }
    
}
