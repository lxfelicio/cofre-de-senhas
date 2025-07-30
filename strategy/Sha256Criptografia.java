package strategy;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Implementação de hash irreversível (SHA-256)
public class Sha256Criptografia implements CriptografiaStrategy {
    @Override
    public String criptografar(String texto) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(texto.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao aplicar SHA-256", e);
        }
    }
}
