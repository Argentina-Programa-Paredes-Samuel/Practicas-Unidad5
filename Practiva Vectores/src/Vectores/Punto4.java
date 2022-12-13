package Vectores;

import java.util.Scanner;

public class Punto4 {
    Scanner sc = new Scanner(System.in);
    public void principal() {
        float[] temp = new float[23];
        float[] top = new float[5];
        System.out.println("Ingrese las temperaturas de las proviencias: ");
        for (int i = 0; i < 23; i++)
            temp[i] = sc.nextFloat();
        //* vector ordenado
        temp = ordenar(temp);
        //* top
        top = cargarTop(temp);
        System.out.println("Las temperaturas mas altas del pais son:");
        for (int i = 0; i < top.length; i++)
            System.out.println(i++ + ": " + top[i]);
        sc.close();
    }
    
    private float[] ordenar(float[] vec) {
        for (int k = 0; k < vec.length; k++)
            for (int i = 0; i < vec.length - k; i++)
                if (vec[i] > vec[i + 1]) {
                    float aux;
                    aux = vec[i];
                    vec[i] = vec[i + 1];
                    vec[i + 1] = aux;
                }
        return vec;
    }

    private float[] cargarTop(float[] vec) {
        float[] top = new float[5];
        for (int i = 0; i <top.length; i++)
            top[i] = vec[vec.length - 1 - i];
        return top;
    }
}
