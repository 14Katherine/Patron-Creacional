/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patroncreacional;

import java.util.List;

/**
 *
 * @author jhons
 */
public class Project {
    private String nombre;
    private String empresa;
    private List<String> requisitos;
    private List<String> tecnologias;
    private int numEstudiantes;
    private String dificultad;

    public Project(String nombre, String empresa, List<String> requisitos, List<String> tecnologias, int numEstudiantes, String dificultad) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.requisitos = requisitos;
        this.tecnologias = tecnologias;
        this.numEstudiantes = numEstudiantes;
        this.dificultad = dificultad;
    }


    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", empresa='" + empresa + '\'' +
                ", requisitos=" + requisitos +
                ", tecnologias=" + tecnologias +
                ", numEstudiantes=" + numEstudiantes +
                ", dificultad='" + dificultad + '\'' +
                '}';
    }
}

