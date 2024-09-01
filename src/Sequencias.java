public class Sequencias {
    public static void main(String[] args) {
        // a) 1, 3, 5, 7, ____
        int[] seqA = {1, 3, 5, 7};
        System.out.println("Próximo elemento da sequência a: " + (seqA[seqA.length - 1] + 2)); // 9

        // b) 2, 4, 8, 16, 32, 64, ____
        int[] seqB = {2, 4, 8, 16, 32, 64};
        System.out.println("Próximo elemento da sequência b: " + (seqB[seqB.length - 1] * 2)); // 128

        // c) 0, 1, 4, 9, 16, 25, 36, ____
        int[] seqC = {0, 1, 4, 9, 16, 25, 36};
        int nC = (int) Math.sqrt(seqC[seqC.length - 1]) + 1;
        System.out.println("Próximo elemento da sequência c: " + (nC * nC)); // 49

        // d) 4, 16, 36, 64, ____
        int[] seqD = {4, 16, 36, 64};
        int nD = (int) Math.sqrt(seqD[seqD.length - 1]) + 2;
        System.out.println("Próximo elemento da sequência d: " + (nD * nD)); // 100

        // e) 1, 1, 2, 3, 5, 8, ____
        int[] seqE = {1, 1, 2, 3, 5, 8};
        System.out.println("Próximo elemento da sequência e: " + (seqE[seqE.length - 1] + seqE[seqE.length - 2])); // 13

         // f) 2, 10, 12, 16, 17, 18, 19, ____
        System.out.println("Próximo elemento da sequência f: " + 20); // 20
    }
}
