/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patroncreacional;

import java.util.List;

/**
 *
 * @author jhons
 */
public class PatronCreacional {

    public static void main(String[] args) {
        ProjectDirector director = new ProjectDirector();

        // Construcción de proyectos
        ProjectBuilder softwareBuilder = new SoftwareProjectBuilder();
        director.setBuilder(softwareBuilder);
        Project softwareProject = director.buildProject("Sistema de Gestión de Inventarios", "TechCorp", 
                List.of("Gestión de productos", "Manejo de stock", "Generación de reportes"), 
                List.of("Java", "Spring Boot", "PostgreSQL"), 4);
        System.out.println(softwareProject);

        ProjectBuilder dataScienceBuilder = new DataScienceProjectBuilder();
        director.setBuilder(dataScienceBuilder);
        Project dataScienceProject = director.buildProject("Análisis Predictivo de Ventas", "DataCorp", 
                List.of("Análisis de tendencias", "Predicción de demanda", "Optimización de inventarios"), 
                List.of("Python", "Pandas", "TensorFlow"), 3);
        System.out.println(dataScienceProject);

        ProjectBuilder embeddedBuilder = new EmbeddedSystemsProjectBuilder();
        director.setBuilder(embeddedBuilder);
        Project embeddedProject = director.buildProject("Sistema de Monitoreo de Temperatura", "IoT Solutions", 
                List.of("Sensor de temperatura", "Comunicación Bluetooth", "Interfaz Web"), 
                List.of("C", "Arduino", "ESP32"), 5);
        System.out.println(embeddedProject);
    }    }

