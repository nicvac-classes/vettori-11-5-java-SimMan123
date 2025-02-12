import java.util.*;
import java.lang.Math;

class Program {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j, coppie, lunghezza;
        boolean t;

        coppie = 0;
        t = true;
        n = input.nextInt();
        int[] v = new int[n];

        for (i = 0; i <= n - 1; i++) {
            v[i] = random.nextInt(7) - 4;
        }
        for (i = 0; i <= n - 1; i++) {
            lunghezza = lunghezza + v[i];
        }
        System.out.println("liunghezza di tutti i listini : " + lunghezza);
        i = 0;
        while (n >= 2 && t == false) {
            while (i <= n - 1) {
                j = i + 1;
                while (j <= n - 2) {
                    if (v[j] == v[i]) {
                        coppie = coppie + 1;
                        System.out.println("le coppie sono" + v[i] + v[j]);
                        t = true;
                        n = elimina(v, n, i);
                        n = elimina(v, n, j);
                        i = 0;
                        j = 0;
                    } else {
                        t = false;
                    }
                }
                i = i + 1;
            }
        }
    }
    
    public static int elimina(int[] v, int n, int e) {
        int i;

        for (i = e; i <= n - 1; i++) {
            v[i] = v[i + 1];
        }
        
        return n-1;
    }
}
