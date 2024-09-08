/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Tarea2_20206156.model.bean;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Oscar A. Díaz Barriga
 */

@Getter
@Setter
public class Department {

    private int departmentId;

    private String departName;
    private Location location; // Relacion x Location

    // Añadir los atributos necesarios
    // No olvidar el encapsulamiento

    @Override
    public String toString() {
        return departName;
    }


}
