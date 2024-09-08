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
public class Employee {

    private int employeeId;

    private String firstName;

    private String lastName;
    private String email;
    private Department department;
    private Job job;
    private Location location;

    // Añadir los atributos necesarios
    // No olvidar el encapsulamiento


}
