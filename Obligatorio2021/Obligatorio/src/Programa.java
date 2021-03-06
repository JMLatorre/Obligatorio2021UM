import CSVReader.CSVReader;
import Clases.CastMember;
import TADs.ArbolB.ABB;
import TADs.ClosedHash.ClosedHash;
import TADs.LinkedList.Lista;
import TADs.LinkedList.ListaEnlazada;

import java.io.File;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
                    long tiempo_inicio = System.nanoTime();

                    CSVReader reader = new CSVReader(new File("C:\\Users\\Juan Manuel\\Desktop\\IMDb names.csv"));
                    Iterator<String[]> readerIterator = reader.iterator();

                    ClosedHash cast_member_hash = new ClosedHash(315000, 1);


                    boolean header = true;

                    while (readerIterator.hasNext()) {

                        String[] headers = readerIterator.next();
                        if(header){
                            header = false;
                        }
                        else {

                            CastMember newCastMember = new CastMember();
                            newCastMember.setImdbNameId(headers[0]);
                            newCastMember.setName(headers[1]);
                            newCastMember.setBirthName(headers[2]);
                            try {
                                newCastMember.setHeight(Integer.parseInt(headers[3]));
                            }catch(NumberFormatException ex)
                            {

                            }
                            newCastMember.setBio(headers[4]);
                            SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd");
                            try {
                            if( headers[5]!="")
                                newCastMember.setBirthDate(formato.parse(headers[5].toString()));
                            } catch (ParseException e) {
                              //e.printStackTrace();
                            }
                            newCastMember.setBirthCity(headers[6]);
                            newCastMember.setBirthState(headers[7]);
                            try{
                            if(headers[8]!="")
                                newCastMember.setDeathDate(formato.parse(headers[8]));
                        } catch (ParseException e) {
                           // e.printStackTrace();
                        }
                            newCastMember.setDeathState(headers[9]);
                            newCastMember.setDeathCountry(headers[10]);
                            newCastMember.setDeathCity(headers[11]);
                            newCastMember.setSpousesString(headers[12]);
                            newCastMember.setSpouses(Integer.parseInt(headers[13]));
                            newCastMember.setDivorces(Integer.parseInt(headers[14]));
                            newCastMember.setSpousesWithChildren(Integer.parseInt(headers[15]));

                            cast_member_hash.put(Integer.parseInt(newCastMember.getImdbNameId().substring(2)), newCastMember);



                        }
                    }
                    long ejecucion =  (System.nanoTime() - tiempo_inicio)/1000000;
                    System.out.println("Carga de datos exitosa, tiempo de ejecución de la carga: "+ ejecucion);

                    break;

                case 2:
                    subMenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
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
                    top5_Apariciones();
                    break;
                case 2:
                    top5_Muertes();
                    break;
                case 3:
                    Weighted_y_Altura();
                    break;
                case 4:
                    Anio_nacimiento_habitual();
                    break;
                case 5:
                    top10_generos_y_2hijos();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (numero_opcion2 != 6);
    }




    private static void top5_Apariciones() {
        long tiempo_inicio = System.nanoTime();

        long ejecucion = (System.nanoTime() - tiempo_inicio)/1000000;
        System.out.println("Tiempo de ejecución de la consulta: "+ ejecucion);
    }
    private static void top5_Muertes() {
        long tiempo_inicio = System.nanoTime();

        long ejecucion = (System.nanoTime() - tiempo_inicio)/1000000;
        System.out.println("Tiempo de ejecución de la consulta: "+ ejecucion);
    }
    private static void Weighted_y_Altura() {
        long tiempo_inicio = System.nanoTime();

        long ejecucion = (System.nanoTime() - tiempo_inicio)/1000000;
        System.out.println("Tiempo de ejecución de la consulta: "+ ejecucion);
    }
    private static void Anio_nacimiento_habitual() {
        long tiempo_inicio = System.nanoTime();

        long ejecucion = (System.nanoTime() - tiempo_inicio)/1000000;
        System.out.println("Tiempo de ejecución de la consulta: "+ ejecucion);
    }
    private static void top10_generos_y_2hijos() {
        long tiempo_inicio = System.nanoTime();

        long ejecucion = (System.nanoTime() - tiempo_inicio)/1000000;
        System.out.println("Tiempo de ejecución de la consulta: "+ ejecucion);
    }
}