package factory;

import model.Senha;
import strategy.Base64Criptografia;
import strategy.CriptografiaStrategy;
import strategy.Sha256Criptografia;

public class SenhaFactory {
    // Factory - cria senha com criptografia escolhida
    public Senha criarSenha(String servico, String senhaOriginal, int tipo) {
        CriptografiaStrategy estrategia;

        if (tipo == 1) {
            estrategia = new Base64Criptografia();
        } else {
            estrategia = new Sha256Criptografia();
        }

        String senhaCriptografada = estrategia.criptografar(senhaOriginal);
        return new Senha(servico, senhaCriptografada);
    }
}
