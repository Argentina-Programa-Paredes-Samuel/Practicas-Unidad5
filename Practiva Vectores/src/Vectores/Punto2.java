package Vectores;

import java.util.Scanner;

public class Punto2 {
    Scanner sc = new Scanner(System.in);

    public void principal() {
        int[] edades = new int[15];
        for (int i = 0; i < edades.length; i++) {
            edades[i] = sc.nextInt();
        }
        System.out.println("El estudianto con menor edad es: " + determinarMayorMenor(edades, true));
        System.out.println("El estudianto con mayor edad es: " + determinarMayorMenor(edades, false));
        sc.close();
    }

    private int determinarMayorMenor(int[] vec, boolean modo) {
        int valor = modo?0:vec[0];
        for (int i = 0; i < vec.length; i++) {
            if(modo?valor>vec[i]:valor<vec[i])
                valor = vec[i];
        }
        return valor;
    }
}
