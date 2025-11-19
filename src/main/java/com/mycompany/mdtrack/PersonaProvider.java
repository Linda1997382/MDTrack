package com.mycompany.mdtrack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class PersonaProvider {

    /**
     * Guarda un registro en una tabla SQL usando un ID definido por el usuario.
     * Equivale al: db.collection().document(id).set(data)
     */
    public static boolean guardarPersona(String tabla, String idColumna, String idValor,
                                         Map<String, Object> data) {

        Connection conn = Conexion.conectar();

        // Construimos el SQL dinámicamente
        StringBuilder columnas = new StringBuilder();
        StringBuilder valores = new StringBuilder();

        for (String key : data.keySet()) {
            columnas.append(key).append(", ");
            valores.append("?, ");
        }

        columnas.append(idColumna);
        valores.append("?");

        String sql = "INSERT INTO " + tabla + " (" + columnas + ") VALUES (" + valores + ")";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            int index = 1;

            // Insertamos valores del Map
            for (String key : data.keySet()) {
                stmt.setObject(index++, data.get(key));
            }

            // Insertamos el ID
            stmt.setObject(index, idValor);

            stmt.executeUpdate();
            System.out.println("Guardado correctamente en SQL");
            return true;

        } catch (SQLException e) {
            System.err.println("Error SQL al guardar persona: " + e.getMessage());
            return false;
        }
    }

    /**
     * Guarda un registro en una tabla SQL AUTOINCREMENT (sin ID manual).
     * Equivale a: db.collection().add(data)
     */
    public static boolean guardarPersonaAuto(String tabla, Map<String, Object> data) {

        Connection conn = Conexion.conectar();

        StringBuilder columnas = new StringBuilder();
        StringBuilder valores = new StringBuilder();

        for (String key : data.keySet()) {
            columnas.append(key).append(", ");
            valores.append("?, ");
        }

        // Quitamos coma final
        columnas.setLength(columnas.length() - 2);
        valores.setLength(valores.length() - 2);

        String sql = "INSERT INTO " + tabla + " (" + columnas + ") VALUES (" + valores + ")";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            int index = 1;
            for (String key : data.keySet()) {
                stmt.setObject(index++, data.get(key));
            }

            stmt.executeUpdate();
            System.out.println("Registro insertado correctamente (AUTO)");
            return true;

        } catch (SQLException e) {
            System.err.println("Error SQL al insertar registro AUTO: " + e.getMessage());
            return false;
        }
    }
}
