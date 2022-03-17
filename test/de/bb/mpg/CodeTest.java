package de.bb.mpg;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeTest {

    @Test
    void vertauscheZweiInListe() {
        List<Integer> liste = Arrays.asList(12, 23, -4, 123, 0);
        Manipulator manipulator = new Manipulator();

        manipulator.vertauscheZweiInListe(liste, 0, 2);
        assertEquals(Arrays.asList(-4, 23, 12, 123, 0),
                     liste,
                     "Die Elemente wurden nicht korrekt vertauscht");
    }

    @Test
    void vertauscheZweiInArray() {
        int[] array = {23, -7, -12, 142, 12, 19};
        int[] erwartet = {23, 19, -12, 142, 12, -7};
        Manipulator manipulator = new Manipulator();

        manipulator.vertauscheZweiInArray(array, 1, 5);
        assertArrayEquals(erwartet, array, "Die Elemente wurden nicht korrekt vertauscht.");
    }

    @Test
    void testeErsteFiboZahl() {
        List<Integer> fiboZahlen = Arrays.asList(1);

        assertEquals(fiboZahlen,
                     new ListenGenerator().generiereFibonacciZahlen(1),
                     "Erinnerung: Die erste Fibonacci-Zahl soll 1 sein.");
    }

    @Test
    void generiereZweiFiboZahlen() {
        List<Integer> fiboZahlen = Arrays.asList(1, 1);

        assertEquals(fiboZahlen,
                     new ListenGenerator().generiereFibonacciZahlen(2),
                     "Die generierten Fibonacci Zahlen sind nicht korrekt.");
    }

    @Test
    void generiereZehnFiboZahlen() {
        List<Integer> fiboZahlen = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);

        assertEquals(fiboZahlen,
                     new ListenGenerator().generiereFibonacciZahlen(10),
                     "Die generierten Fibonacci Zahlen sind nicht korrekt.");
    }
}
