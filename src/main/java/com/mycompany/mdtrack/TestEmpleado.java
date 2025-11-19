// Archivo: src/main/java/com/mycompany/mdtrack/TestEmpleado.java
package com.mycompany.mdtrack;

import Modelo.Model_Empleado;

public class TestEmpleado {
    public static void main(String[] args) {
        System.out.println("🧪 INICIANDO TEST DE EMPLEADO...");
        
        try {
            // Test con el empleado ID 1 (Admin)
            Model_Empleado.Empleado emp = Model_Empleado.obtenerEmpleadoPorId(1);
            
            if (emp != null) {
                System.out.println("✅ TEST EXITOSO");
                System.out.println("   ID: " + emp.getId());
                System.out.println("   Nombre: " + emp.getNombres());
                System.out.println("   Apellido: " + emp.getApellidoPaterno());
                System.out.println("   Puesto: " + emp.getPuesto());
            } else {
                System.out.println("❌ TEST FALLIDO - Empleado no encontrado");
            }
            
        } catch (Exception e) {
            System.err.println("❌ TEST FALLIDO CON ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}