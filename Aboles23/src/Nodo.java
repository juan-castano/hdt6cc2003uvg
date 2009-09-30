
import java.util.ArrayList;

/*
 *  Universidad del Valle de Guatemala
 *  Algoritmos y Estructura de Datos - CC2003
 *  Hoja de Trabajo #6 - Implementación de Árboles 2-3
 *  David Ytzen Hsieh Lo #08225
 */

public class Nodo<E> implements Comparable{

    final int LIMITE = 2;
    ArrayList<E> datos = new ArrayList<E>(LIMITE);
    ArrayList<Nodo> hijos = new ArrayList<Nodo>(LIMITE+1);
    int cantidad;
    Nodo padre;


    public void nuevoHijo(int index, Nodo hijo) {
        hijos.add(index, hijo);
        if(hijo != null)
                hijo.padre = this;
    }

    public Nodo quitarHijo(int index) {
        Nodo temp = hijos.get(index);
        hijos.set(index, null);
        return temp;
    }

    public Nodo getHijo(int index) {
        return hijos.get(index);

    }

    public Nodo getPadre() {
        return padre;
    }

    public boolean esHoja() {
        return hijos.isEmpty();
    }

    public int getCantidad() {
        return cantidad;
    }

    public E getDato(int index) {
        return datos.get(index);
    }

    public boolean lleno() {
        if(cantidad >= LIMITE)
            return true;
        return false;
    }

    public int buscar(E dato) {
        if (datos.contains(dato))
            return datos.indexOf(dato);
        return -1;
    }

    public int insertar(E dato) {
        cantidad ++;

        if(!datos.isEmpty()) {
            if(datos.get(0) )
        }
    }

    public E remover() {
        E temp = datos.get(cantidad - 1);
        datos.set(cantidad-1, null);
        cantidad --;
        return temp;
    }

    public void despliegar()
    {
        for(int i =0; i<cantidad; i++)
            datos.get(i).despliegar();
        System.out.prinltn("/");
    }

    public int compareTo(Object o) {
        

        return 0;
    }

}
