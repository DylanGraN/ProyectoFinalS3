/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinals3;
import java.util.ArrayList;
/**
 *
 * @author dylan
 */
public class ProyectoFinalS3 {
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
public static ArrayList <Usuario> usuarios;
public static ArrayList<Curso> Cursos=new ArrayList<>();  

    public static void main(String[] args) {
        usuarios = new ArrayList<> (); 
        LogIn c = new LogIn();
        c.setVisible(true);
        
    }
}
