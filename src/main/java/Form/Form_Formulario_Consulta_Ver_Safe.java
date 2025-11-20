package Form;

import java.awt.BorderLayout;

/**
 * Wrapper ligero seguro que reusa el formulario principal y solicita la carga
 * de la consulta por id al propio formulario delegado.
 */
public class Form_Formulario_Consulta_Ver_Safe extends javax.swing.JPanel {

    private final Form_Formulario_Consulta delegate;

    public Form_Formulario_Consulta_Ver_Safe(String pacienteId, String empleadoId, String consultaId) {
        int p = parseIntSafe(pacienteId);
        int e = parseIntSafe(empleadoId);
        int c = parseIntSafe(consultaId);

        delegate = new Form_Formulario_Consulta(p, e);
        setLayout(new BorderLayout());
        add(delegate, BorderLayout.CENTER);

        if (c > 0) {
            delegate.cargarConsultaPorId(c);
        }
    }

    public void setNavigator(java.util.function.Consumer<javax.swing.JComponent> nav) {
        delegate.setNavigator(nav);
    }

    private int parseIntSafe(String s) {
        try {
            return Integer.parseInt(String.valueOf(s));
        } catch (Exception ex) {
            return -1;
        }
    }
}
