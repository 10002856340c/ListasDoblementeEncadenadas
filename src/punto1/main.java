
package punto1;





public class main {
    public static void main(String[] args) {
        Nodo cabeza = new Nodo();
        cabeza.info = 2;
        cabeza.sig = new Nodo();
        cabeza.sig.ant = cabeza;
        cabeza.sig.info = 3;
        cabeza.sig.sig = new Nodo();
        cabeza.sig.sig.ant = cabeza.sig;
        cabeza.sig.sig.info = 4;
        cabeza.sig.sig.sig = new Nodo();
        cabeza.sig.sig.sig.ant = cabeza.sig.sig;
        cabeza.sig.sig.sig.info = 5;
        cabeza.sig.sig.sig.sig = new Nodo();
        cabeza.sig.sig.sig.sig.ant = cabeza.sig.sig.sig;
        cabeza.sig.sig.sig.sig.info = 6;
        cabeza.sig.sig.sig.sig.sig = new Nodo();
        cabeza.sig.sig.sig.sig.sig.ant = cabeza.sig.sig.sig.sig;
        cabeza.sig.sig.sig.sig.sig.info = 7;
        cabeza.sig.sig.sig.sig.sig.sig = new Nodo();
        cabeza.sig.sig.sig.sig.sig.sig.ant = cabeza.sig.sig.sig.sig.sig;
        cabeza.sig.sig.sig.sig.sig.sig.info = 8;
        cabeza.sig.sig.sig.sig.sig.sig.sig = new Nodo();
        cabeza.sig.sig.sig.sig.sig.sig.sig.ant = cabeza.sig.sig.sig.sig.sig.sig;
        cabeza.sig.sig.sig.sig.sig.sig.sig.info = 9;
        cabeza.sig.sig.sig.sig.sig.sig.sig.sig = new Nodo();
        cabeza.sig.sig.sig.sig.sig.sig.sig.sig.ant = cabeza.sig.sig.sig.sig.sig.sig.sig;
        cabeza.sig.sig.sig.sig.sig.sig.sig.sig.info = 10;
        cabeza.sig.sig.sig.sig.sig.sig.sig.sig.sig = new Nodo();
        cabeza.sig.sig.sig.sig.sig.sig.sig.sig.sig.ant = cabeza.sig.sig.sig.sig.sig.sig.sig.sig;
        cabeza.sig.sig.sig.sig.sig.sig.sig.sig.sig.info = 11;

        Nodo recorrido = cabeza;
        while (recorrido != null) {
            if (recorrido.info % 2 != 0) {
                System.out.println(recorrido.info);
            }
            recorrido = recorrido.sig;
        }
    }
}

