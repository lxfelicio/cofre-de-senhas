package model;

public class Senha {
    private String servico;
    private String senhaCriptografada;

    public Senha(String servico, String senhaCriptografada) {
        this.servico = servico;
        this.senhaCriptografada = senhaCriptografada;
    }

    public String getServico() {
        return servico;
    }

    public String getSenhaCriptografada() {
        return senhaCriptografada;
    }
}
