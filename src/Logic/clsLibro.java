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
public class clsLibro {
    private String lib_id;
    private String titulo;
    private int cant_pags;
    private int year_pub;
    private String isbn;
    private String portada;
    private String lug_pub;
    private String contenidos;
    private String tipo_libro;
    private int edit_id;
    private String materia;
    private int aut_id;
    private int esc_id;

    public clsLibro() {
    }

    public clsLibro(String lib_id, String titulo, int cant_pags, int year_pub, String isbn, String portada, String lug_pub, String contenidos, String tipo_libro, int edit_id, String materia, int aut_id, int esc_id) {
        this.lib_id = lib_id;
        this.titulo = titulo;
        this.cant_pags = cant_pags;
        this.year_pub = year_pub;
        this.isbn = isbn;
        this.portada = portada;
        this.lug_pub = lug_pub;
        this.contenidos = contenidos;
        this.tipo_libro = tipo_libro;
        this.edit_id = edit_id;
        this.materia = materia;
        this.aut_id = aut_id;
        this.esc_id = esc_id;
    }

    public String getLib_id() {
        return lib_id;
    }

    public void setLib_id(String lib_id) {
        this.lib_id = lib_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCant_pags() {
        return cant_pags;
    }

    public void setCant_pags(int cant_pags) {
        this.cant_pags = cant_pags;
    }

    public int getYear_pub() {
        return year_pub;
    }

    public void setYear_pub(int year_pub) {
        this.year_pub = year_pub;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getLug_pub() {
        return lug_pub;
    }

    public void setLug_pub(String lug_pub) {
        this.lug_pub = lug_pub;
    }

    public String getContenidos() {
        return contenidos;
    }

    public void setContenidos(String contenidos) {
        this.contenidos = contenidos;
    }

    public String getTipo_libro() {
        return tipo_libro;
    }

    public void setTipo_libro(String tipo_libro) {
        this.tipo_libro = tipo_libro;
    }

    public int getEdit_id() {
        return edit_id;
    }

    public void setEdit_id(int edit_id) {
        this.edit_id = edit_id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
    }

    public int getEsc_id() {
        return esc_id;
    }

    public void setEsc_id(int esc_id) {
        this.esc_id = esc_id;
    }
    
}
