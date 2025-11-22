package com.mycompany.mdtrack;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    private static final String CONFIG_FILE = "/config.properties";

    /**
     * Crea y devuelve una nueva conexión para cada llamada. Evita reusar una
     * única Connection compartida que puede provocar errores intermitentes
     * cuando varias threads ejecutan queries al mismo tiempo.
     */
    public static synchronized Connection conectar() {
        try {
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
            
            Connection conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(true);
            System.out.println(" Conexión exitosa a MySQL (nueva instancia)");
            return conn;
        } catch (SQLException e) {
            System.err.println(" Error al conectar a MySQL: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("No se pudo conectar a la BD", e);
        } catch (Exception e) {
            System.err.println(" Error cargando configuración: " + e.getMessage());
            throw new RuntimeException("Error de configuración", e);
        }
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

    /** Cerrar conexión: ya no mantiene una conexión global, por lo que esto queda como no-op. */
    public static synchronized void cerrar() {
        // Mantener compatibilidad con llamadas existentes; no hay conexión global para cerrar.
    }
}