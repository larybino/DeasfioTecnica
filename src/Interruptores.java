import java.util.Scanner;

public class Interruptores {
    public static void main(String[] args) {
        boolean lampadaA = false; // Representa a lâmpada conectada ao interruptor A
        boolean lampadaB = false; // Representa a lâmpada conectada ao interruptor B
        boolean lampadaC = false; // Representa a lâmpada conectada ao interruptor C
        boolean lampadaAEsquentou = false; // Indica se a lâmpada A esquentou

        Scanner scanner = new Scanner(System.in);

        // Passo 1: Ligue o interruptor A
        System.out.println("Ligando o interruptor A...");
        lampadaA = true;
        System.out.println("Aguarde alguns minutos para a lâmpada esquentar...");
        lampadaAEsquentou = true; // Após aguardar, a lâmpada esquenta

        // Passo 2: Desligue o interruptor A e ligue o interruptor B
        System.out.println("Desligando o interruptor A...");
        lampadaA = false; // Desliga a lâmpada A
        System.out.println("Ligando o interruptor B...");
        lampadaB = true; // Liga a lâmpada B

        // Passo 3: Vá até a sala das lâmpadas
        System.out.println("\nVá até a sala das lâmpadas para verificar o estado:");
        System.out.println("Escolha uma opção para verificação:");
        System.out.println("1 - Verificar lâmpada acesa");
        System.out.println("2 - Verificar lâmpada apagada e quente");
        System.out.println("3 - Verificar lâmpada apagada e fria");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                if (lampadaB) {
                    System.out.println("A lâmpada acesa é controlada pelo interruptor B.");
                }
                break;
            case 2:
                if (!lampadaA && lampadaAEsquentou) {
                    System.out.println("A lâmpada apagada e quente é controlada pelo interruptor A.");
                }
                break;
            case 3:
                if (!lampadaC) {
                    System.out.println("A lâmpada apagada e fria é controlada pelo interruptor C.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
