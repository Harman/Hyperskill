package processor;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        while(true) {
            System.out.println("1. Add matrices\n2. Multiply matrix to a constant\n3. Multiply matrices\n0. Exit\nYour choice: ");
            choice = in.nextInt();
            if (choice == 0) {
                break;
            } else if (choice == 1) {
                matsum();
            } else if (choice == 2) {
                cnstmul();
            } else if (choice == 3) {
                matmul();
            }
        }
    }
    public static void matsum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of first matrix: ");
        int Ai = in.nextInt();
        int Aj = in.nextInt();
        System.out.println("Enter first matrix:");
        float[][] A = new float[Ai][Aj];
        for(int i = 0; i < Ai; i++) {
            for(int j = 0; j < Aj; j++) {
                A[i][j] = in.nextFloat();
            }
        }
        System.out.println("Enter size of second matrix: ");
        int Bi = in.nextInt();
        int Bj = in.nextInt();
        System.out.println("Enter second matrix:");
        float[][] B = new float[Bi][Bj];
        for(int i = 0; i < Bi; i++) {
            for(int j = 0; j < Bj; j++) {
                B[i][j] = in.nextFloat();
            }
        }
        if(!(Ai == Bi && Aj == Bj)) {
            System.out.println("ERROR");
        } else {
            System.out.println("The addition result is:");
            for(int i = 0; i < Ai; i++) {
            for(int j = 0; j < Aj; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
                }
            System.out.println();
            }
        }
    }
    public static void cnstmul() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int Ai = in.nextInt();
        int Aj = in.nextInt();
        System.out.println("Enter matrix:");
        float[][] A = new float[Ai][Aj];
        for(int i = 0; i < Ai; i++) {
            for(int j = 0; j < Aj; j++) {
                A[i][j] = in.nextFloat();
            }
        }
        System.out.println("Enter constant for multilication: ");
        int s = in.nextInt();
        for(int i = 0; i < Ai; i++) {
            for(int j = 0; j < Aj; j++) {
                System.out.print((double)A[i][j] * s + " ");
            }
            System.out.println();
        }
    }
    public static void matmul() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of first matrix: ");
        int Ai = in.nextInt();
        int Aj = in.nextInt();
        System.out.println("Enter first matrix:");
        float[][] A = new float[Ai][Aj];
        for(int i = 0; i < Ai; i++) {
            for(int j = 0; j < Aj; j++) {
                A[i][j] = in.nextFloat();
            }
        }
        System.out.println("Enter size of second matrix: ");
        int Bi = in.nextInt();
        int Bj = in.nextInt();
        System.out.println("Enter second matrix:");
        float[][] B = new float[Bi][Bj];
        for(int i = 0; i < Bi; i++) {
            for(int j = 0; j < Bj; j++) {
                B[i][j] = in.nextFloat();
            }
        }
        if(!(Aj == Bi)) {
            System.out.println("ERROR");
        } else {
            float C[][] = new float[Ai][Bj];
            System.out.println("The multiplication result is:");
            for (int i = 0; i < Ai; i++) { 
                for (int j = 0; j < Bj; j++) { 
                    for (int k = 0; k < Bi; k++) {
                    C[i][j] += A[i][k] * B[k][j]; 
                    } 
                }
            }
            for(int i = 0; i < Ai; i++) {
                for(int j = 0; j < Bj; j++) {
                    System.out.println(C[i][j] + " ");
                    }
                    System.out.println();
                }
        }
    }
}
