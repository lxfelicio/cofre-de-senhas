package singleton;

import model.Senha;

import java.util.ArrayList;
import java.util.List;

public class PasswordManager {
    private static PasswordManager instancia;
    private List<Senha> senhas;

    private PasswordManager() {
        senhas = new ArrayList<>();
    }

    // Singleton - garante uma única instância
    public static PasswordManager getInstance() {
        if (instancia == null) {
            instancia = new PasswordManager();
        }
        return instancia;
    }

    public void adicionarSenha(Senha senha) {
        senhas.add(senha);
    }

    public void exibirSenhas() {
        for (Senha s : senhas) {
            System.out.println("- " + s.getServico() + ": " + s.getSenhaCriptografada());
        }
    }
}
