package de.bb.mpg;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    public int[] generiereAufsteigendesArray(int anzahl) {
        int[] array = new int[anzahl];

        for (int i = 0; i < anzahl; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public int[] generiereAbwechselndesArray() {
        int[] array = new int[10];

        for (int i = 0; i < 5; i++) {
            array[2 * i] = i + 1;
            array[2 * i + 1] = -(i + 1);
        }

        return array;
    }

    public List<Integer> generiereFibonacciZahlen(int anzahl) {
        List<Integer> fiboZahlen = new ArrayList<>();

        for (int i = 0; i < anzahl; i++) {
            if (i == 0 || i == 1) {
                fiboZahlen.add(1);
            } else {
                fiboZahlen.add(fiboZahlen.get(i - 2) + fiboZahlen.get(i - 1));
            }
        }

        return fiboZahlen;
    }

}
