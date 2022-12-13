package Vectores;

import java.util.Scanner;

public class Punto5 {
    Scanner sc = new Scanner(System.in);
    public void principal() {
        String[] animales = new String[10];
        for (int i = 0; i < animales.length; i++)
            animales[i] = sc.next();
        mostrar(cargarInverso(animales));
        sc.close();
    }
    
    private String[] cargarInverso(String[] vec) {
        String[] inverso = new String[vec.length];
        for (int i = vec.length - 1; i > 0; i--)
            inverso[vec.length-1-i]=vec[i];
        return inverso;
    }

    private void mostrar(String[] vec) {
        for(int i = 0 ; i<vec.length ; i++)
            System.out.println(vec[i]);
    }
}
