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
public class ProjectDirector {
    private ProjectBuilder builder;
    public void setBuilder(ProjectBuilder builder) { this.builder = builder; }
    public Project buildProject(String nombre, String empresa, List<String> requisitos, List<String> tecnologias, int numEstudiantes) {
        return builder.setNombre(nombre)
                .setEmpresa(empresa)
                .setRequisitos(requisitos)
                .setTecnologias(tecnologias)
                .setNumEstudiantes(numEstudiantes)
                .setDificultad()
                .build();
    }
}
