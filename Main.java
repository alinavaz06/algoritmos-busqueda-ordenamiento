public class Main {
    public static void main(String[] args) {
        AlgoritmosBusquedaOrdenamiento algoritmos = new AlgoritmosBusquedaOrdenamiento();
        int[] arreglo = {5, 2, 9, 1, 5, 6};

        System.out.println("Arreglo original: ");
        System.out.println();

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
