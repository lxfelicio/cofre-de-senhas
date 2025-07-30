import factory.SenhaFactory;
import singleton.PasswordManager;
import strategy.Base64Criptografia;
import strategy.Sha256Criptografia;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Geração do código de acesso aleatório
        Random random = new Random();
        int codigoAcesso = 1000 + random.nextInt(9000);

        System.out.println("🔐 Bem-vindo ao Gerenciador de Senhas");
        System.out.println("👉 Seu código de acesso: " + codigoAcesso);

        // Definir senha mestre
        System.out.print("Defina sua senha do cofre: ");
        String senhaMestre = scanner.nextLine();

        // Autenticação
        System.out.println("\n🔐 Acesso ao Cofre");
        System.out.print("Digite sua senha do cofre: ");
        String senhaInput = scanner.nextLine();
        System.out.print("Digite o código de acesso: ");
        int codigoInput = scanner.nextInt();
        scanner.nextLine(); // Limpa buffer

        if (!senhaInput.equals(senhaMestre) || codigoInput != codigoAcesso) {
            System.out.println("❌ Acesso negado!");
            return;
        }

        System.out.println("✅ Acesso liberado ao cofre!");

        PasswordManager manager = PasswordManager.getInstance();

        // Loop principal
        while (true) {
            System.out.print("\nNome do serviço (ou 'sair' para encerrar): ");
            String servico = scanner.nextLine();
            if (servico.equalsIgnoreCase("sair")) break;

            System.out.print("Senha para esse serviço: ");
            String senha = scanner.nextLine();

            System.out.print("Criptografar com (1) Base64 ou (2) SHA-256? ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            SenhaFactory factory = new SenhaFactory();

            // Cria senha usando a estratégia selecionada
            manager.adicionarSenha(
                factory.criarSenha(servico, senha, tipo)
            );

            System.out.println("🔐 Senha para " + servico + " salva com sucesso.");
        }

        // Exibir cofre
        System.out.println("\n📁 Cofre de Senhas:");
        manager.exibirSenhas();
    }
          }
