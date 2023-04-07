/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto4;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generar la lista de N números
        int N = 10;
        Nodo cabeza = new Nodo();
        cabeza.info = "Cabeza";
        Nodo recorrido = cabeza;

        for (int i = 1; i <= N; i++) {
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.info = Integer.toString(i);

            recorrido.sig = nuevoNodo;
            nuevoNodo.ant = recorrido;
            recorrido = nuevoNodo;
        }

        // Capturar un valor y buscar en la lista
        System.out.print("Ingrese un valor a buscar: ");
        String valorBuscado = scanner.nextLine();

        boolean encontrado = false;
        recorrido = cabeza.sig;
        while (recorrido != null) {
            if (recorrido.info.equals(valorBuscado)) {
                encontrado = true;
                break;
            }
            recorrido = recorrido.sig;
        }

        if (encontrado) {
            System.out.println("El valor " + valorBuscado + " está en la lista.");
        } else {
            System.out.println("El valor " + valorBuscado + " no está en la lista.");
        }
    }
}
