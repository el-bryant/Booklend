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
public class clsPrestamo {
    private int pres_id;
    private Date fprestamo;
    private Date fentrega;
    private String usu_dni;
    private String pers_dni;
    private Date fdevolucion;
    private int ejem_id;
    private String lib_id;
    private int detpres_id;

    public clsPrestamo() {
    }

    public clsPrestamo(int pres_id, Date fprestamo, Date fentrega, String usu_dni, String pers_dni, Date fdevolucion, int ejem_id, String lib_id, int detpres_id) {
        this.pres_id = pres_id;
        this.fprestamo = fprestamo;
        this.fentrega = fentrega;
        this.usu_dni = usu_dni;
        this.pers_dni = pers_dni;
        this.fdevolucion = fdevolucion;
        this.ejem_id = ejem_id;
        this.lib_id = lib_id;
        this.detpres_id = detpres_id;
    }

    public int getPres_id() {
        return pres_id;
    }

    public void setPres_id(int pres_id) {
        this.pres_id = pres_id;
    }

    public Date getFprestamo() {
        return fprestamo;
    }

    public void setFprestamo(Date fprestamo) {
        this.fprestamo = fprestamo;
    }

    public Date getFentrega() {
        return fentrega;
    }

    public void setFentrega(Date fentrega) {
        this.fentrega = fentrega;
    }

    public String getUsu_dni() {
        return usu_dni;
    }

    public void setUsu_dni(String usu_dni) {
        this.usu_dni = usu_dni;
    }

    public String getPers_dni() {
        return pers_dni;
    }

    public void setPers_dni(String pers_dni) {
        this.pers_dni = pers_dni;
    }

    public Date getFdevolucion() {
        return fdevolucion;
    }

    public void setFdevolucion(Date fdevolucion) {
        this.fdevolucion = fdevolucion;
    }

    public int getEjem_id() {
        return ejem_id;
    }

    public void setEjem_id(int ejem_id) {
        this.ejem_id = ejem_id;
    }

    public String getLib_id() {
        return lib_id;
    }

    public void setLib_id(String lib_id) {
        this.lib_id = lib_id;
    }

    public int getDetpres_id() {
        return detpres_id;
    }

    public void setDetpres_id(int detpres_id) {
        this.detpres_id = detpres_id;
    }
}
