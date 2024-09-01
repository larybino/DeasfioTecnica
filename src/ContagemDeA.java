import java.util.Scanner;

public class ContagemDeA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String palavra = scanner.nextLine();
        
        int count = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        
        if (count > 0) {
            System.out.println("A letra 'a' ocorre " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }
        scanner.close();
    }
}
