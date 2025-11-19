package com.mycompany.mdtrack;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    private static final String CONFIG_FILE = "/config.properties";
    private static Connection conn = null;

    public static synchronized Connection conectar() {
        try {
            if (conn == null || conn.isClosed()) {
                // Cargar configuración desde archivo externo
                Properties props = cargarConfiguracion();
                
                String url = props.getProperty("database.url", 
                    "jdbc:mysql://localhost:3306/medtrack?" +
                    "useUnicode=true&" +
                    "characterEncoding=UTF-8&" +
                    "useSSL=false&" +
                    "allowPublicKeyRetrieval=true&" +
                    "useJDBCCompliantTimezoneShift=true&" +
                    "useLegacyDatetimeCode=false&" +
                    "serverTimezone=UTC&" +
                    "nullNamePatternMatchesAll=true");
                
                String user = props.getProperty("database.user", "medtrack_dev");
                String password = props.getProperty("database.password", "password_segura_123");
                
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                
                System.out.println(" Conexión exitosa a MySQL");
            }
        } catch (SQLException e) {
            System.err.println(" Error al conectar a MySQL: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("No se pudo conectar a la BD", e);
        } catch (Exception e) {
            System.err.println(" Error cargando configuración: " + e.getMessage());
            throw new RuntimeException("Error de configuración", e);
        }
        return conn;
    }

    /** Cargar configuración desde archivo properties */
    private static Properties cargarConfiguracion() throws IOException {
        Properties props = new Properties();
        
        try (InputStream input = Conexion.class.getResourceAsStream(CONFIG_FILE)) {
            if (input != null) {
                props.load(input);
                System.out.println(" Configuración cargada desde: " + CONFIG_FILE);
            } else {
                System.out.println("  Archivo config.properties no encontrado, usando valores por defecto");
                // Valores por defecto SEGUROS para desarrollo
                props.setProperty("database.user", "medtrack_dev");
                props.setProperty("database.password", "password_segura_123");
            }
        }
        return props;
    }

    /** Cerrar conexión */
    public static synchronized void cerrar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                conn = null;
                System.out.println(" Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println(" Error al cerrar conexión: " + e.getMessage());
        }
    }
}