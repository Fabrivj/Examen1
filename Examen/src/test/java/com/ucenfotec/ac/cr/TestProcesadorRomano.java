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

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibeCuatroIMayuscula() {
        ProcesadorRomano.convierte("IIII");
    }

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibeCincoIMayuscula() {
        ProcesadorRomano.convierte("IIIII");
    }

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibeCuatroXMayuscula() {
        ProcesadorRomano.convierte("XXXX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibeCincoXMayuscula() {
        ProcesadorRomano.convierte("XXXXX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibe2LMayuscula() {
        ProcesadorRomano.convierte("LL");
    }

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibe3LMayuscula() {
        ProcesadorRomano.convierte("LLL");
    }

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibeCuatroCMayuscula() {
        ProcesadorRomano.convierte("CCCC");
    }

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibeCincoCMayuscula() {
        ProcesadorRomano.convierte("CCCCC");
    }

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibe2DIMayuscula() {
        ProcesadorRomano.convierte("DD");
    }

    @Test(expected = IllegalArgumentException.class)
    public void retornaErrorSiRecibe3DIMayuscula() {
        ProcesadorRomano.convierte("DDD");
    }

    @Test
    public void retornaElValorEsperadoSiLasLetrasSonEnValorDescendente() {
        assertEquals(ProcesadorRomano.convierte("LXX"), 70);
    }

    @Test
    public void retornaLosValoresEsperados() {
        assertEquals(ProcesadorRomano.convierte("LX"), 60);
        assertEquals(ProcesadorRomano.convierte("XVI"), 16);
        assertEquals(ProcesadorRomano.convierte("VIII"), 8);
        assertEquals(ProcesadorRomano.convierte("XXI"), 21);
        assertEquals(ProcesadorRomano.convierte("CI"), 101);
        assertEquals(ProcesadorRomano.convierte("CLXI"), 161);
    }

}
