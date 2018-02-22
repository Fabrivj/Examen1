package com.ucenfote.ac.cr;

import java.util.HashMap;

public class ProcesadorRomano {

    public static int convierte(String valor) {

        int result = 0;

        HashMap<Integer, Integer> counters = new HashMap<Integer, Integer>();
        counters.put(1, 3);
        counters.put(5, Integer.MAX_VALUE);
        counters.put(10, 3);
        counters.put(50, 1);
        counters.put(100, 3);
        counters.put(500, 1);
        counters.put(1000, Integer.MAX_VALUE);

        int lastAdded = Integer.MAX_VALUE;
        ;

        for (char letter : valor.toCharArray()) {
            int value = assing(letter);
            if (value > lastAdded) {
                throw new IllegalArgumentException();
            }
            if (counters.get(value) > 0) {
                counters.put(value, counters.get(value) - 1);
            } else {
                throw new IllegalArgumentException();
            }
            result += value;
            lastAdded = value;
        }

        return result;
    }
    
    private static int assing(char letter) {
		switch (letter) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			throw new IllegalArgumentException();
		}
	}

}
