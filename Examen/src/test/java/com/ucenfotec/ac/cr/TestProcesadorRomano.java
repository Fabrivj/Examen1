package com.ucenfotec.ac.cr;

import com.ucenfote.ac.cr.ProcesadorRomano;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestProcesadorRomano {

    @Test
    public void retorna0SiRecibeStringVacio() {
        assertEquals(ProcesadorRomano.convierte(""), 0);
    }

}
