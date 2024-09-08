/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Tarea2_20206156.model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar A. Díaz Barriga
 */

public class BaseDAO {

    public Connection conn;

    public BaseDAO() {
        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/hr?serverTimezone=UTC&useSSL=false&publicKeyRetrieval=true";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, "Driver de MySQL no encontrado", ex);
        }

        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión establecida correctamente.");
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, "Error al conectar con la base de datos", ex);
        }
    }
}
