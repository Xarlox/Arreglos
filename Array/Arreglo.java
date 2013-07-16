/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Arreglo {

    public static void main(String[] args) throws IOException {
        String lista[] = new String[3];
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        for (int x = 0; x < lista.length; x++) {
            System.out.println("Ingrese el estudiante" + x + ":");
            lista[x] = lectura.readLine();
        }
        for (int x = 0; x < lista.length; x++) {

            System.out.println("El estudiante:" + x + "es:" + lista[x]);
        }
    }
}
