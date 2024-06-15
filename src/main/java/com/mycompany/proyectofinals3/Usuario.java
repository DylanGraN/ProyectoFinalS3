/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinals3;

import java.util.ArrayList;

/**
 *
 * @author dylan
 */
public class Usuario {
    
    
public ArrayList<Curso> cursosU = new ArrayList<>();
    private String usuario;
    private String password;
    private String nombre;
    private String apellido;
 
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

    /**
     * @return the usutario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usutario the usutario to set
     */
    public void setUsuario(String usutario) {
        this.usuario = usutario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
