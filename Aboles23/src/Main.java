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

        Arbol23<String> a = new Arbol23<String>();
        a.insertar(new Elemento("1"));
        a.insertar(new Elemento("2"));
        a.insertar(new Elemento("3"));
        a.insertar(new Elemento("4"));
        a.insertar(new Elemento("5"));
        a.insertar(new Elemento("6"));
        a.insertar(new Elemento("7"));
        a.insertar(new Elemento("8"));
        a.insertar(new Elemento("9"));
        a.insertar(new Elemento("0"));

        while(!salir) {

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
                    ingreso = lector.next();
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
        }

        /*

        a.insertar(new Elemento("1"));
        a.insertar(new Elemento("2"));
        a.insertar(new Elemento("3"));
        a.insertar(new Elemento("4"));
        a.insertar(new Elemento("5"));
        //a.insertar(new Elemento("WSD"));
        System.out.println(a.buscar(5, a.getRaiz()).getDato());

        
        while(true) {
            System.out.println("Primera palabra de ");
            System.out.println("Mostrar, Insertar, Buscar: ");
            char choice = lector.next().charAt(0);
            switch(choice) {
                case 'm':
                    a.despliegar();
                break;

                case 'i':
                    System.out.println("Ingresar valor");
                    valor = lector.next();
                    a.insertar(new Elemento(valor));
                break;

                case 'b':
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
         * */
     
    }



}
