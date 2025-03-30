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
abstract class ProjectBuilder {
    protected String nombre;
    protected String empresa;
    protected List<String> requisitos;
    protected List<String> tecnologias;
    protected int numEstudiantes;
    protected String dificultad;

    public abstract ProjectBuilder setNombre(String nombre);
    public abstract ProjectBuilder setEmpresa(String empresa);
    public abstract ProjectBuilder setRequisitos(List<String> requisitos);
    public abstract ProjectBuilder setTecnologias(List<String> tecnologias);
    public abstract ProjectBuilder setNumEstudiantes(int numEstudiantes);
    public abstract ProjectBuilder setDificultad();
    public abstract Project build();
}
