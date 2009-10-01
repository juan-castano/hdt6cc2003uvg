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
        String valor;
        Arbol23<String> a = new Arbol23<String>();

        a.insertar(new Elemento("A"));
        a.insertar(new Elemento("B"));
        a.insertar(new Elemento("C"));
        //a.insertar(new Elemento("WSD"));

        while(true) {
            System.out.println("Primera palabra de ");
            System.out.println("Show, Insert, Find: ");
            char choice = lector.next().charAt(0);
            switch(choice) {
                case 's':
                    a.despliegar();
                break;

                case 'i':
                    System.out.println("Ingresar valor");
                    valor = lector.next();
                    a.insertar(new Elemento(valor));
                break;

                case 'f':
                    System.out.println("Ingresar valor a buscar");
                    valor = lector.next();
                    int encontrado = a.buscar(new Elemento(valor));
                    if(encontrado != -1)
                        System.out.println("Encontrado" + valor);
                    else
                        System.out.println("NOP");
                break;

                default:
                    System.out.println("Invalida");
                break;
            }
        }
    }



}
