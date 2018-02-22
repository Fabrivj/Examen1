package com.ucenfotec.ac.cr;

import com.ucenfote.ac.cr.ProcesadorRomano;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestProcesadorRomano {

    @Test
    public void retorna0SiRecibeStringVacio() {
        assertEquals(ProcesadorRomano.convierte(""), 0);
    }

    @Test
    public void retorna1SiRecibeUnaIMayuscula() {
        assertEquals(ProcesadorRomano.convierte("I"), 1);
    }

    @Test
    public void retorna2SiRecibeDosIMayuscula() {
        assertEquals(ProcesadorRomano.convierte("II"), 2);
    }

    @Test
    public void retorna3SiRecibeTresIMayuscula() {
        assertEquals(ProcesadorRomano.convierte("III"), 3);
    }

    @Test
    public void retorna5SiRecibeUnaVMayuscula() {
        assertEquals(ProcesadorRomano.convierte("V"), 5);
    }

    @Test
    public void retorna10SiRecibeUnaXMayuscula() {
        assertEquals(ProcesadorRomano.convierte("X"), 10);
    }

    @Test
    public void retorna50SiRecibeUnaLMayuscula() {
        assertEquals(ProcesadorRomano.convierte("L"), 50);
    }

    @Test
    public void retorna100SiRecibeUnaCMayuscula() {
        assertEquals(ProcesadorRomano.convierte("C"), 100);
    }

    @Test
    public void retorna500SiRecibeUnaDMayuscula() {
        assertEquals(ProcesadorRomano.convierte("D"), 500);
    }

    @Test
    public void retorna1000SiRecibeUnaMMayuscula() {
        assertEquals(ProcesadorRomano.convierte("M"), 1000);
    }

}
