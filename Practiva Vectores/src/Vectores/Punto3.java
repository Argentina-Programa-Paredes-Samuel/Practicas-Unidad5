package Vectores;

import java.util.Scanner;

public class Punto3 {
    Scanner sc = new Scanner(System.in);
    public void principal() {
        int tam=sc.nextInt();
        int[] dni = new int[tam];
        String[] nombre = new String[tam];
        String[] apellido = new String[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese DNI " + i++);
            dni[i] = sc.nextInt();
            System.out.println("Ingrese Nombre " + i++);
            nombre[i] = sc.next();
            System.out.println("Ingrese Apellido " + i++);
            apellido[i] = sc.next();
        }
        for (int i = 0; i < tam; i++) {
            System.out.println("DNI " + i++ + ": " + dni[i]);
            System.out.println("Nombre " + i++ + ": " + nombre[i]);
            System.out.println("Apellido " + i++ + ": " + apellido[i]);
        }
        sc.close();
    }
}
