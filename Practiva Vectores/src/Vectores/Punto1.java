package Vectores;

import java.util.Scanner;

public class Punto1 {
    Scanner sc = new Scanner(System.in);
    public void principal() {
        int[] vec = new int[10];
        int num;
        for (int i = 0; i < vec.length; i++) {
            num = sc.nextInt();
            if (num < 1 || num > 100) {
                System.out.println("Numero invalido, ingrese nuevamente");
                i--;
            } else
                vec[i] = num;
        }
        System.out.println("Vector:");
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
        sc.close();
    }
}
