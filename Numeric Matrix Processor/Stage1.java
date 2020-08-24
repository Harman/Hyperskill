package processor;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Ai = in.nextInt();
        int Aj = in.nextInt();
        int[][] A = new int[Ai][Aj];
        for(int i = 0; i < Ai; i++) {
            for(int j = 0; j < Aj; j++) {
                A[i][j] = in.nextInt();
            }
        }
        int Bi = in.nextInt();
        int Bj = in.nextInt();
        int[][] B = new int[Bi][Bj];
        for(int i = 0; i < Bi; i++) {
            for(int j = 0; j < Bj; j++) {
                B[i][j] = in.nextInt();
            }
        }
        if(!(Ai == Bi && Aj == Bj)) {
            System.out.println("ERROR");
        } else {
            for(int i = 0; i < Ai; i++) {
            for(int j = 0; j < Aj; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
}
