public class Nodo {
    // Atributos
    private int numero;
    private Nodo siguiente;

    // Constructor vacio
    public Nodo() {
        this.numero = 0;
        this.siguiente = null;
    }

    // Constructor con numero
    public Nodo(int unNumero) {
        this.numero = unNumero;
        this.siguiente = null;
    }

    // Getters y Setters
    public int getNumero() {
        return this.numero;
    }

    public Nodo getNext() {
        return this.siguiente;
    }

    public void setNext(Nodo nodo) {
        this.siguiente = nodo;
    }
}
