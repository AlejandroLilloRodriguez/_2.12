package aplicacion;

import dominio.Ejercicio12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el numero del que quiera calcular su fibonacci: ");
        int numero= sc.nextInt();
        System.out.println("El fibonacci de " + numero + " es: " + Ejercicio12.fibonacci(numero));
    }
}
