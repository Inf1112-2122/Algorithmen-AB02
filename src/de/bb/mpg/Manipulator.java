package de.bb.mpg;

import java.util.List;

public class Manipulator {

    public void vertauscheZweiInArray(int[] array, int indexA, int indexB) {
        int elementA = array[indexA];

        array[indexA] = array[indexB];
        array[indexB] = elementA;
    }

    public void vertauscheZweiInListe(List<Integer> liste, int indexA, int indexB) {
        int elementA = liste.get(indexA);

        liste.set(indexA, liste.get(indexB));
        liste.set(indexB, elementA);
    }

}
