/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Functions.Functions;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryyv
 */
public class DAOLibro extends clsLibro {
    Functions conexion;
    
    public DAOLibro() {
        this.conexion = new Functions();
    }
    
    public boolean insertar_libro() {
        String sql = "INSERT INTO libro VALUES('" + getLib_id() + "', '" + getTitulo() + "', " + getCant_pags() + ", " + getYear_pub() + ", '" + getIsbn() + "', '" + getPortada() + "', '" + getLug_pub() + "', '" + getContenidos() + "', '" + getTipo_libro() + "', " + getEdit_id() + ", '" + getMateria() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar_libro() {
        String sql = "UPDATE libro SET titulo = '" + getTitulo() + "', cant_pags = '" + getCant_pags() + "', year_pub = '" + getYear_pub() + "', isbn = '" + getIsbn() + "', portada = '" + getPortada() + "', lug_pub = '" + getLug_pub() + "', contenidos = '" + getContenidos() + "', tipo_libro = '" + getTipo_libro() + "', edit_id = '" + getEdit_id() + "', materia = '" + getMateria() + "' WHERE libro.lib_id = '" + getLib_id() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar_titulo(){
        String sql = "SELECT titulo FROM libro WHERE lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_autor(){
        String sql = "SELECT apellidos || ' ' || nombres FROM autor, libro, escrito WHERE escrito.lib_id = libro.lib_id AND escrito.aut_id = autor.aut_id AND lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_editorial(){
        String sql = "SELECT nombre FROM editorial, libro WHERE editorial.edit_id = libro.edit_id AND libro.lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_isbn(){
        String sql = "SELECT isbn FROM libro WHERE libro.lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_portada(){
        String sql = "SELECT portada FROM libro WHERE libro.lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_materia(){
        String sql = "SELECT materia FROM libro WHERE libro.lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_lugar(){
        String sql = "SELECT lug_pub FROM libro WHERE libro.lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_year(){
        String sql = "SELECT year_pub FROM libro WHERE libro.lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_paginas(){
        String sql = "SELECT cant_pags FROM libro WHERE libro.lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_tipolibro(){
        String sql = "SELECT tipo_libro FROM libro WHERE libro.lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public String consultar_contenidos(){
        String sql = "SELECT contenidos FROM libro WHERE libro.lib_id = '" + getLib_id() + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null){
            JOptionPane.showMessageDialog(null, "Dato no existe");
        }else{
            try {
                if (rs.next())
                return rs.getString(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public boolean insertar_escrito() {
        String sql = "INSERT INTO escrito (lib_id, aut_id) VALUES ('" + getLib_id() + "', " + getAut_id() + ")";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar_escrito() {
        String sql = "UPDATE escrito SET (lib_id = '" + getLib_id() + "', aut_id = " + getAut_id() + ") WHERE escrito.esc_id = " + getEsc_id();
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
