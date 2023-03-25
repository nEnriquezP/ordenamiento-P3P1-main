/*package gt.edu.umg.progra3.parcial1;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        //inserte codigo aqui
        return null;
    }

    public List<T> ordenarInversa(){
        //inserte codigo aqui
        return values;
    }

}*/

package gt.edu.umg.progra3.parcial1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager<T extends Comparable<T>> {

    List<T> values;

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar() {
        // Ordenar la lista utilizando el método sort de Collections
        Collections.sort(values);
        return values;
    }

    public List<T> ordenarInversa() {
        // Ordenar la lista en orden ascendente
        ordenar();

        // Invertir el orden de la lista utilizando el método reverse de Collections
        Collections.reverse(values);
        return values;
    }

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(-1, 10, 8, 3, 1));
        DinamicStructuresManager<Integer> manager = new DinamicStructuresManager<>(values);

        // Ordenar la lista en orden ascendente
        List<Integer> sortedValues = manager.ordenar();
        System.out.println("Lista ordenada:");
        for (Integer value : sortedValues) {
            System.out.print(value + " ");
        }

        System.out.println();

        // Ordenar la lista en orden descendente
        List<Integer> sortedValuesInversa = manager.ordenarInversa();
        System.out.println("Lista ordenada en orden inverso:");
        for (Integer value : sortedValuesInversa) {
            System.out.print(value + " ");
        }
    }
}

