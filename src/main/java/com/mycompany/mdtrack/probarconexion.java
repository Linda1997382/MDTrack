package com.mycompany.mdtrack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class probarconexion {
    
    public static void main(String[] args) {
        System.out.println("🔍 Iniciando prueba de conexión...");
        probarConexion();
    }
    
    public static void probarConexion() {
        Connection conn = null;
        try {
            // 1. Usar TU clase Conexion
            System.out.println("📡 Conectando a la base de datos...");
            conn = Conexion.conectar(); // ← ESTA ES LA CLAVE
            
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ Conexión exitosa a MySQL!");
                
                // 2. Verificar tablas
                System.out.println("\n📊 Listando tablas disponibles:");
                String sqlTablas = "SHOW TABLES";
                PreparedStatement stmtTablas = conn.prepareStatement(sqlTablas);
                ResultSet rsTablas = stmtTablas.executeQuery();
                
                while (rsTablas.next()) {
                    System.out.println("   - " + rsTablas.getString(1));
                }
                rsTablas.close();
                stmtTablas.close();
                
                // 3. Probar contar pacientes
                System.out.println("\n👥 Contando pacientes...");
                String sqlPacientes = "SELECT COUNT(*) as total FROM paciente";
                PreparedStatement stmtPac = conn.prepareStatement(sqlPacientes);
                ResultSet rsPac = stmtPac.executeQuery();
                
                if (rsPac.next()) {
                    System.out.println("   Total de pacientes: " + rsPac.getInt("total"));
                }
                rsPac.close();
                stmtPac.close();
                
                // 4. Probar contar empleados
                System.out.println("\n👨‍⚕️ Contando empleados...");
                String sqlEmpleados = "SELECT COUNT(*) as total FROM empleado";
                PreparedStatement stmtEmp = conn.prepareStatement(sqlEmpleados);
                ResultSet rsEmp = stmtEmp.executeQuery();
                
                if (rsEmp.next()) {
                    System.out.println("   Total de empleados: " + rsEmp.getInt("total"));
                }
                rsEmp.close();
                stmtEmp.close();
                
                System.out.println("\n🎉 ¡Todas las pruebas pasaron!");
                
            } else {
                System.out.println("❌ No se pudo establecer conexión");
            }
            
        } catch (SQLException e) {
            System.err.println("❌ Error de SQL: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // NO cierres la conexión aquí - tu clase Conexion la maneja
            // Conexion.cerrar(); ← NO LLAMES ESTO
        }
    }
}