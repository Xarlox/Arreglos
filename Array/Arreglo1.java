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
 * @author Carlos Saca
 */
public class Arreglo1 {

    public static void main(String[] args) throws IOException {

        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese limite de la lista: ");
        int limite = Integer.parseInt(lectura.readLine());
        int lista[] = new int[limite];
        {
            for (int x = 0; x < lista.length; x++) {
                System.out.println("ingrese numero" + x + ":");
                lista[x] = Integer.parseInt(lectura.readLine());
                int mod = lista[x] % 2;
                if (mod == 0) {
                    System.out.println("El numero " + x + " es:" + lista[x] + "y es par ");

                } else {
                    System.out.println("El numero " + x + " es:" + lista[x] + "y es impar ");
                }
            }

        }
    }
}