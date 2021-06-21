import CSVReader.CSVReader;
import Clases.CastMember;
import TADs.ArbolB.ABB;
import TADs.ClosedHash.ClosedHash;
import TADs.LinkedList.Lista;
import TADs.LinkedList.ListaEnlazada;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;
public class Programa {

    public static void main(String[] args) {
        ABB castMemberABB=new ABB();
        Lista listaMovie=new ListaEnlazada();
        Lista listaDirectores=new ListaEnlazada();
        int[] actorAnio=new int[120];
        int[] actrizAnio=new int[120];

        Scanner input = new Scanner(System.in);
        int numero_opcion;
        do {
            System.out.println(
                    "Seleccione la opción que desee:\n" +
                            "Programación 2\n" +
                            "1. Carga de datos\n" +
                            "2. Ejecutar consultas\n" +
                            "3. Salir");

            numero_opcion = input.nextInt();
            switch(numero_opcion) {
                case 1:


                    CSVReader reader = new CSVReader(new File("C:\\Users\\Usuario\\OneDrive\\Desktop\\Obligatorio Programacion\\IMDb names.csv"));
                    Iterator<String[]> readerIterator = reader.iterator();

                    ClosedHash cast_member_hash = new ClosedHash(315000, 1);


                    boolean header = true;

                    while (readerIterator.hasNext()) {

                        if(header){
                            String[] headers = readerIterator.next();
                            header = false;
                        }
                        else {
                            String[] data = readerIterator.next();
                            CastMember newCastMember = new CastMember();
                            newCastMember.setImdbNameId(data[0]);
                            newCastMember.setName(data[1]);
                            newCastMember.setBirthName(data[2]);
                            newCastMember.setHeight(data[3]);
                            newCastMember.setBio(data[4]);
                            newCastMember.setBirthDate(data[5]);
                            newCastMember.setBirthCity(data[6]);
                            newCastMember.setBirthState(data[7]);
                            newCastMember.setDeathDate(data[8]);
                            newCastMember.setDeathState(data[9]);
                            newCastMember.setDeathCountry(data[10]);
                            newCastMember.setDeathCity(data[11]);
                            newCastMember.setSpousesString(data[12]);
                            newCastMember.setSpouses(data[13]);
                            newCastMember.setDivorces(data[14]);
                            newCastMember.setSpousesWithChildren(data[15]);

                            cast_member_hash.put(Integer.parseInt(newCastMember.getImdbNameId().substring(2)), newCastMember);
                        }
                    }

                    System.out.println("Carga de datos exitosa, tiempo de ejecución de la carga:"); // ?

                    break;

                case 2:
                    subMenu();

                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion desconocida");
            }
           
        }while(numero_opcion!=3);
    }

    private static void subMenu() {
        int numero_opcion2;
        Scanner input = new Scanner(System.in);
        do {
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

            numero_opcion2 = input.nextInt();
            switch (numero_opcion2) {
                case 1:
                    top5();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion desconocida");
            }

        } while (numero_opcion2 != 6);
    }

    private static void top5() {
    }

}