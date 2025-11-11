public class AlgoritmosBusquedaOrdenamiento {

    // Algoritmos de Busqueda

    // Busqueda Secuencial
    public int busquedaSecuencial(int[] arreglo, int valorABuscar) {
        int indiceValorEncontrado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorABuscar) {
                i = indiceValorEncontrado;
            }
        }
        return indiceValorEncontrado;
    }

    // Busqueda Binaria
    public int busquedaBinaria(int[] numeros, int numeroABuscar) {
        return buscar(numeros, numeroABuscar, 0, numeros.length);
    }

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

    public static void main(String[] args) {
        AlgoritmosBusquedaOrdenamiento algoritmos = new AlgoritmosBusquedaOrdenamiento();
        int[] arreglo = {5, 2, 9, 1, 5, 6};

        // Prueba de Bubble Sort
        int[] arregloOrdenadoBurbuja = algoritmos.bubbleSort(arreglo.clone());
        System.out.println("Bubble Sort: ");
        for (int num : arregloOrdenadoBurbuja) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Prueba de Insertion Sort
        int[] arregloOrdenadoInsercion = algoritmos.insertionSort(arreglo.clone());
        System.out.println("Insertion Sort: ");
        for (int num : arregloOrdenadoInsercion) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Prueba de Selection Sort
        int[] arregloOrdenadoSeleccion = algoritmos.selectionSort(arreglo.clone());
        System.out.println("Selection Sort: ");
        for (int num : arregloOrdenadoSeleccion) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
