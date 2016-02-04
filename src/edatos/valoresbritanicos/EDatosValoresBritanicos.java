package edatos.valoresbritanicos;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class EDatosValoresBritanicos {

    public static void main(String[] args) {

        //26 31 41 59 57";
        Scanner sl;
        String[] v = new String[5];
        int[] v2 = new int[5];
        String linea;
        boolean verdadero = true;

        do {

            System.out.println("\n\n**(SEPARANDO POR ESPACIO).**");
            System.out.println("Tazas|Galones|Cuartas|Pinzas|Onzas");
            System.out.print("Ingresa: ");

            Scanner leer = new Scanner(System.in);
            linea = leer.nextLine();

            sl = new Scanner(linea);
            sl.useDelimiter("\\s* \\s*"); //delimita el espacio en blanco

            //v[0] = sl.next();
            for (int i = 0; i < v.length; i++) { //asigno el siguiente valor delimitado a un vector string
                v[i] = sl.next();
            }

            for (int i = 0; i < v.length; i++) { //convierto string to int y lo guardo en otro vector
                v2[i] = Integer.parseInt(v[i]);

                if (v2[i] <= 0 || v2[i] >= 1000) {
                    verdadero = false;
                    System.out.println("El valor " + v2[i] + " no esta permitido.");
                }
            }

        } while (!verdadero);

        /**
         * v2[0] = tazas v2[1] = galones v2[2] = cuartas v2[3] = pinzas v2[4] =
         * onzas
         *
         */
        System.out.println("** Resultados **");

        int var = 1280; // ^10

        for (int i = 0; i < v2.length; i++) {

            var = var / v2[i] + 1;
            System.out.print(var + " ");

        }

    }

}
