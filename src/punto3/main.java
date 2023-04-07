
package punto3;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Nodo cabeza = new Nodo();
        cabeza.info = "Cabeza";
        Nodo recorrido = cabeza;

        for (int i = 1; i <= 5; i++) {
            Nodo nuevoNodo = new Nodo();

            System.out.println("País " + i);
            System.out.print("Nombre: ");
            String nombrePais = scanner.nextLine();
            System.out.print("Capital: ");
            String capitalPais = scanner.nextLine();

            nuevoNodo.info = "País: " + nombrePais + ", Capital: " + capitalPais;

            recorrido.sig = nuevoNodo;
            nuevoNodo.ant = recorrido;
            recorrido = nuevoNodo;
        }

        // Imprime el primer nodo
        System.out.println("Primer nodo: " + cabeza.sig.info);

        // Recorre la lista hasta el último nodo
        while (recorrido.sig != null) {
            recorrido = recorrido.sig;
        }

        // Imprime el último nodo
        System.out.println("Último nodo: " + recorrido.info);
    }
}
