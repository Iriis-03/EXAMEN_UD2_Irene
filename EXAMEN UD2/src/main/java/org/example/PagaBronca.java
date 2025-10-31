    package org.example;

    import java.util.Scanner;

    public class PagaBronca {

        static void main() {

            Scanner read = new Scanner(System.in);

            boolean S = true;
            String bronca1 = "";
            String Profes = "";
            String Padre = "";
            String Madre = "";
            String Monitor = "";
            String Suegra = "";
            String Otros = "";
            final int PUNTUACION = 50;


            System.out.println("*** BIENVENIDO A LA APP DE BRONCAS ***");

            System.out.println("-----------------------------------------------");
            System.out.println("Datos de la bronca 1:");
            System.out.println(" ");
            System.out.println("Selecciona la persona encargada de la bronca: ");
            System.out.println("[-]. Profes");
            System.out.println("[-]. Padre");
            System.out.println("[-]. Madre");
            System.out.println("[-]. Monitor (extraescolares)");
            System.out.println("[-]. Suegra");
            System.out.println("Otros");
            System.out.println("-----------------------------------------------");

            if (S) {

                switch (bronca1) {
                    case Profes:
                        System.out.println("Elige una opción --> ");
                        Profes = read.next();

                        if () {
                            int RESULTADO = PUNTUACION * 10;
                            System.out.println("Puntación de la bronca 1: " + RESULTADO);
                        } else {
                            System.out.println("ERROR DE FORMATO");
                            return;
                        }
                        break;

                    case Padre:

                        System.out.println("Elige una opción --> ");
                        Padre = read.next();

                        if () {
                            int RESULTADO = PUNTUACION * 100;
                            System.out.println("Puntación de la bronca 1: " + RESULTADO);
                        } else {
                            System.out.println("ERROR DE FORMATO");
                            return;
                        }
                        break;

                    case Madre:
                        System.out.println("Elige una opción --> ");
                        Madre = read.next();

                        if () {
                            int RESULTADO = PUNTUACION * 100;
                            System.out.println("Puntación de la bronca 1: " + RESULTADO);
                        } else {
                            System.out.println("ERROR DE FORMATO");
                            return;
                        }
                        break;

                    case Monitor:
                        System.out.println("Elige una opción --> ");
                        Monitor = read.next();

                        if () {
                            int RESULTADO = PUNTUACION * 5;
                            System.out.println("Puntación de la bronca 1: " + RESULTADO);
                        } else {
                            System.out.println("ERROR DE FORMATO");
                            return;
                        }
                        break;

                    case Suegra:
                        System.out.println("Elige una opción --> ");
                        Suegra = read.next();

                        if () {
                            int RESULTADO = PUNTUACION * 1000;
                            System.out.println("Puntación de la bronca 1: " + RESULTADO);
                        } else {
                            System.out.println("ERROR DE FORMATO");
                            return;
                        }
                        break;

                    case Otros:
                        System.out.println("Elige una opción --> ");
                        Otros = read.next();
                        break;
                }
            }else{
                    System.out.println();
        }
    }
}