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
public class SoftwareProjectBuilder extends ProjectBuilder {
    @Override
    public ProjectBuilder setNombre(String nombre) { this.nombre = nombre; return this; }
    @Override
    public ProjectBuilder setEmpresa(String empresa) { this.empresa = empresa; return this; }
    @Override
    public ProjectBuilder setRequisitos(List<String> requisitos) { this.requisitos = requisitos; return this; }
    @Override
    public ProjectBuilder setTecnologias(List<String> tecnologias) { this.tecnologias = tecnologias; return this; }
    @Override
    public ProjectBuilder setNumEstudiantes(int numEstudiantes) { this.numEstudiantes = numEstudiantes; return this; }
    public ProjectBuilder setDificultad() { this.dificultad = "Baja"; return this; }
    public Project build() { return new Project(nombre, empresa, requisitos, tecnologias, numEstudiantes, dificultad); }
}
