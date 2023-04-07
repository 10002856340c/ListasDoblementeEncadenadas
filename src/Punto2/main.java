
package Punto2;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        nodo cabeza = new nodo();
        cabeza.info = "Cabeza";
        nodo recorrido = cabeza;

        for (int i = 1; i <= 3; i++) {
            nodo nuevoNodo = new nodo();

            System.out.println("Celular " + i);
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Número: ");
            String numero = scanner.nextLine();
            System.out.print("Dueño: ");
            String dueno = scanner.nextLine();
            System.out.print("C.C. Dueño: ");
            String ccDueno = scanner.nextLine();

            nuevoNodo.info = "Marca: " + marca + ", Modelo: " + modelo + ", Número: " + numero + ", Dueño: " + dueno + ", C.C. Dueño: " + ccDueno;

            recorrido.sig = nuevoNodo;
            nuevoNodo.ant = recorrido;
            recorrido = nuevoNodo;
        }

        recorrido = cabeza.sig;
        int i = 1;
        while (recorrido != null) {
            System.out.println("Nodo " + i + ": " + recorrido.info);
            recorrido = recorrido.sig;
            i++;
        }
    }
}

