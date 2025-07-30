package strategy;

import java.util.Base64;

// Implementação de codificação reversível (Base64)
public class Base64Criptografia implements CriptografiaStrategy {
    @Override
    public String criptografar(String texto) {
        return Base64.getEncoder().encodeToString(texto.getBytes());
    }
}
