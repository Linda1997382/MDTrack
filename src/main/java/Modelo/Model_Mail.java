package Modelo;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Model_Mail {

    private static final String CORREO_ENVIA = "antonioehr4@gmail.com";
    private static final String CONTRASENA = "eyxhmfpxguwgayis";
    private static final String SMTP_HOST = "smtp.gmail.com";
    private static final int SMTP_PORT = 587;

    public static boolean transfer_to_email(String correoDestino, String password) {

        if (correoDestino == null || correoDestino.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El correo destino no puede estar vacío");
            return false;
        }

        Properties props = new Properties();
        props.put("mail.smtp.host", SMTP_HOST);
        props.put("mail.smtp.port", SMTP_PORT);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", SMTP_HOST);

        try {
            Session sesion = Session.getInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(CORREO_ENVIA, CONTRASENA);
                }
            });

            sesion.setDebug(false);

            MimeMessage mail = new MimeMessage(sesion);
            mail.setFrom(new InternetAddress(CORREO_ENVIA));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino.trim()));
            mail.setSubject("Creación de usuario - Sistema Médico");

            String mensaje = String.format(
                "Se ha creado su usuario en el sistema médico:\n\n"
              + "Usuario: %s\n"
              + "Contraseña: %s\n\n"
              + "Por seguridad, se recomienda cambiar la contraseña en su primer acceso.",
                correoDestino, password
            );

            mail.setText(mensaje);
            Transport.send(mail);

            JOptionPane.showMessageDialog(null, "Correo enviado correctamente a: " + correoDestino);
            return true;

        } catch (AddressException e) {
            JOptionPane.showMessageDialog(null, "Dirección de correo inválida: " + e.getMessage());
            return false;

        } catch (MessagingException e) {
            System.err.println("Error enviando correo: " + e.getMessage());
            JOptionPane.showMessageDialog(null, 
                "Error al enviar el correo. Verifique:\n"
              + "1. Conexión a internet\n"
              + "2. Credenciales del correo emisor\n"
              + "3. Dirección del destinatario\n\n"
              + "Detalle: " + e.getMessage()
            );
            return false;

        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            return false;
        }
    }
}
