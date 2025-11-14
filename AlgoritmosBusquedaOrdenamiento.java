public class AlgoritmosBusquedaOrdenamiento {
    // Atributos para la lista
    private Nodo primerNodo;

    // Constructor para la lista
    public AlgoritmosBusquedaOrdenamiento() {
        this.primerNodo = null;
    }

    // Algoritmos de Busqueda

    // Busqueda Secuencial en lista 
    public int busquedaSecuencialLista(int valorABuscar) { 
        Nodo nodoActual = this.primerNodo;
        int indiceValorEncontrado = 0;
        int valorEncontrado = 0;
        while (nodoActual != null) {
            if (nodoActual.getNumero() == valorABuscar) {
                valorEncontrado = indiceValorEncontrado;
            }
            nodoActual = nodoActual.getNext();
            indiceValorEncontrado++;
        }
        return valorEncontrado;
    }

    // Busqueda Secuencial en array
    public int busquedaSecuencial(int[] arreglo, int valorABuscar) {
        int indiceValorEncontrado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorABuscar) {
                i = indiceValorEncontrado;
            }
        }
        return indiceValorEncontrado;
    }

    // Metodo que ejecuta la busqueda binaria
    public int busquedaBinaria(int[] numeros, int numeroABuscar) {
        return buscar(numeros, numeroABuscar, 0, numeros.length);
    }

    // Busqueda Binaria 
    private int buscar(int[] numeros, int numeroABuscar, int inicio, int fin) {
        int centroDelArray = (inicio + fin) / 2;
        int numeroBuscado = 0;
        if (numeroABuscar < numeros[centroDelArray]) {
            numeroBuscado = buscar(numeros, numeroABuscar, inicio, centroDelArray - 1);
        } else if (numeroABuscar > numeros[centroDelArray]) {
            numeroBuscado = buscar(numeros, numeroABuscar, centroDelArray + 1, fin);
        } else {
            numeroBuscado = centroDelArray;
        }
        return numeroBuscado;
    }

    // Algoritmos de Ordenamiento

    // Algoritmo Burbuja
    public int[] bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
        return arreglo;
    }

    // Algoritmo Bubble Sort en listas
    // No lo logre hacer    

    // Algoritmo Insertion Sort
    public int[] insertionSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; ++i) {
            int numeroAInsertar = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > numeroAInsertar) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = numeroAInsertar;
        }
        return arreglo;
    }

    // Algoritmo Insertion Sort en listas
    // No lo logre hacer

    // Algoritmo Selection Sort
    public int[] selectionSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temporal = arreglo[indiceMenor];
            arreglo[indiceMenor] = arreglo[i];
            arreglo[i] = temporal;
        }
        return arreglo;
    }

    // Algoritmo Selection Sort en listas
    // No lo logre hacer
}
