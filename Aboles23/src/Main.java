/*
 *  Universidad del Valle de Guatemala
 *  Algoritmos y Estructura de Datos - CC2003
 *  Hoja de Trabajo #6 - Implementación de Árboles 2-3
 *  David Ytzen Hsieh Lo #08225
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Conjunto<String> A = new Conjunto<String>();
        Conjunto<String> B = new Conjunto<String>();
        Conjunto<String> C = new Conjunto<String>();
        String ingreso;
        boolean salir = false;
        String[] elementos;

        

        while(!salir) {

            System.out.print("A = ");
            A.mostrar();
            System.out.println();

            System.out.print("B = ");
            B.mostrar();
            System.out.println();

            System.out.print("C = ");
            C.mostrar();
            System.out.println();

            System.out.println("-----------------------------------------");

            System.out.println("1. Insertar elemento a conjunto A");
            System.out.println("2. Retirar elemento del conjunto A");
            System.out.println("3. Insertar elemento a conjunto B");
            System.out.println("4. Retirar elemento del conjunto B");
            System.out.println("5. Hacer que C = A U B");
            System.out.println("6. Hacer que C = A intersección B");
            System.out.println("7. Mostrar A");
            System.out.println("8. Mostrar B");
            System.out.println("9. Mostrar C");
            System.out.println("Ingrese el # de la opción que desea:");

            char opcion = lector.nextLine().charAt(0);

            switch(opcion) {

                case '1':
                    System.out.println("Ingrese los elementos que desea agregar a A, utilizando la coma "+","+"para separar los elementos" );
                    ingreso = lector.nextLine();
                    elementos = ingreso.split(",");

                    for(int i=0; i<elementos.length;i++)
                        A.insertar(elementos[i]);

                    System.out.println("Elementos insertados satisfactoriamente");

                break;

                case '2':
                    

                break;

                case '3':
                    System.out.println("Ingrese los elementos que desea agregar a B, utilizando la coma "+","+"para separar los elementos" );
                    ingreso = lector.nextLine();
                    elementos = ingreso.split(",");

                    for(int i=0; i<elementos.length;i++)
                        B.insertar(elementos[i]);

                    System.out.println("Elementos insertados satisfactoriamente");
                break;

                case '4':

                break;

                case '5':
                    C = A.union(B);
                break;
                   
                case '6':
                    C = A.interseccion(B);
                break;
                
                case '7':
                    System.out.print("A = ");
                    A.mostrar();
                    System.out.println();
                break;

                case '8':
                    System.out.print("B = ");
                    B.mostrar();
                    System.out.println();

                break;
                
                case '9':
                    System.out.print("C = ");
                    C.mostrar();
                    System.out.println();

                break;

                case '0':
                    salir = true;
                break;

                default:
                    System.out.println("Opción incorrecta");
                break;

            }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        }

     
    }



}
