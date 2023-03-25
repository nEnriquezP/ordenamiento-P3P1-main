package gt.edu.umg.progra3.parcial1;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;

public class StaticStructureManager<T extends Comparable<T>> {

    T[] values;

    public StaticStructureManager(T[] values) {
        this.values = values;
    }

    public T[] ordenar() {
        // Convertir el arreglo estático en un ArrayList
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(values));

        // Ordenar el ArrayList utilizando el método sort de Collections
        Collections.sort(arrayList);

        // Convertir el ArrayList ordenado de nuevo en un arreglo estático
        values = arrayList.toArray(values);
        return values;
    }

    public T[] ordenarInversa() {
        // Ordenar el arreglo en orden ascendente
        ordenar();

        // Invertir el orden del arreglo utilizando el método reverse de Collections
        List<T> tempList = Arrays.asList(values);
        Collections.reverse(tempList);
        values = tempList.toArray(values);
        return values;
    }

    public static void main(String[] args) {
        Integer[] values = {5, 2, 8, 3, 1};
        StaticStructureManager<Integer> manager = new StaticStructureManager<>(values);

        // Ordenar el arreglo en orden ascendente
        Integer[] sortedValues = manager.ordenar();
        System.out.println("Arreglo ordenado:");
        for (Integer value : sortedValues) {
            System.out.print(value + " ");
        }

        System.out.println();

        // Ordenar el arreglo en orden descendente
        Integer[] sortedValuesInversa = manager.ordenarInversa();
        System.out.println("Arreglo ordenado en orden inverso:");
        for (Integer value : sortedValuesInversa) {
            System.out.print(value + " ");
        }
    }
}

