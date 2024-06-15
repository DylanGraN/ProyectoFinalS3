/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinals3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dylan
 */
public class Curso {
 public ArrayList<Usuario> usuarios = new ArrayList<>();
    int year;
    int mes;
    int dia;
    int yearf;
    int mesf;
    int diaf;
    int hora = 0;
    int horaf = 0;
    int minuto = 0;
    int segundo = 0;

    int id=1;
    String nombre;
    
    String seccion;
      String Catedratico;
    String fechai;
    String fechaf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    
    public String getCatedratico() {
        return Catedratico;
    }

    public void setCatedratico(String Catedratico) {
        this.Catedratico = Catedratico;
    }

}
