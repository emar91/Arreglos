/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estructuraDatos;

import java.util.Arrays;

import org.apache.log4j.Logger;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioVectores;

/**
 *
 * @author wcordova
 */
public class EstructuraDeDatos2025 {
	
	private static Logger logjava = Logger.getLogger(EstructuraDeDatos2025.class);
	

    public static void main(String[] args) {
        
    }
    
    public static void testTribonacci() {  
        EjercicioVectores ejercicio1 = new EjercicioVectores();
        int[] signature = {0, 0, 1};
        int n = 9;
        System.out.println(Arrays.toString(ejercicio1.tribonacci(signature, n)));
    }
    
    public static void testFindTotal() { 
        EjercicioVectores ejercicio1 = new EjercicioVectores();
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {17, 19, 21};
        int[] numbers3 = {5, 5, 5};
        
        logjava.debug("Puntuación: " + ejercicio1.findTotal(numbers1));
        logjava.info("Puntuación: " + ejercicio1.findTotal(numbers2));
        logjava.warn("Puntuación: " + ejercicio1.findTotal(numbers3));
    }
}
