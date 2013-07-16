/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class ArreglosS {

    public static void main(String[] args) {
        String lista[] = new String[9];
        lista[0] = "Marco";
        lista[1] = "Alex";
        lista[2] = "Jhoy";
        lista[3] = "claudio";
        lista[4] = "Jhon";
        lista[5] = "Angel";
        lista[6] = "Stalin";
        lista[7] = "carlos";
        lista[8] = "Luis";
        for (int x = 0; x < lista.length; x++) {
            System.out.println("El estudiante de la lista:" + x + "es:" + lista[x]);
        }
    }
}