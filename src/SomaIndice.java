public class SomaIndice {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;
        
        while (K <= INDICE) { 
            SOMA = SOMA + K;
            K = K + 1;
        }
        
        System.out.println("SOMA: " + SOMA);  
    }
}
