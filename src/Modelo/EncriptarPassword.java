
package Modelo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//Encriptar la contraseña usando el algoritmo SHA-256,devuelve el resultado como una cadena hexadecimal.
public class EncriptarPassword {
       public static String encriptarContraseña(String contraseña) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(contraseña.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
}
