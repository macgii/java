package vetorEMatriz;

import java.util.Scanner;

public class Ex3VetorMenorIgualDez {
	static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {

        Double[] A = new Double[100];
        double x;
         
        for (int i = 0; i < A.length; i++) {
            x = entrada.nextDouble();
            A[i] = x;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10) {
                System.out.println("A[" + i + "]" + " = " + A[i]);
            }
        }
    }
}