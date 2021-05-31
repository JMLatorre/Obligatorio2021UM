//PRUEBA para hacerme una idea no se si esta bien

import java.util.Scanner;
public class Menu {

    public static Object main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Seleccione la opción que desee:\n" +
                        "Programación 2\n" +
                        "1. Carga de datos\n" +
                        "2. Ejecutar consultas\n" +
                        "3. Salir");

        int numero_opcion = input.nextInt();
        System.out.println("Ingrese");
        String id = input.nextLine();

        if (numero_opcion == 1) {
            System.out.println("Carga de datos exitosa, tiempo de ejecución de la carga:"); // ?
            return null;
        }

        if (numero_opcion == 2) {
            int numero_opcion2 = input.nextInt();
            System.out.println(
                    "1. Indicar el Top 5 de actores/actrices que más apariciones han tenido a\n" +
                            "lo largo de los años.\n" +
                            "2. Indicar el Top 5 de las causas de muerte más frecuentes en directores\n" +
                            "y productores nacidos en Italia, Estados Unidos, Francia y UK.\n" +
                            "3. Mostrar de las 14 películas con más weightedAverage, el promedio de\n" +
                            "altura de sus actores/actrices si su valor es distinto de nulo.\n" +
                            "4. Indicar el año más habitual en el que nacen los actores y las actrices.\n" +
                            "5. Indicar el Top 10 de géneros de películas más populares, en las\n" +
                            "cuales al menos un actor/actriz tiene 2 o más hijos.\n" +
                            "6. Salir.");

            if (numero_opcion2 == 1) {
                return null;
            }
            if (numero_opcion2 == 1) {
                return null;
            }
            if (numero_opcion2 == 1) {
                return null;
            }
            if (numero_opcion2 == 1) {
                return null;
            }
            if (numero_opcion2 == 1) {
                return null;
            }
            if (numero_opcion2 == 6) {
                exit();
            }

        }

        if (numero_opcion == 3) {
            exit();
        }
        return null;
    }

    private static void exit() {
    }
}