
import java.util.ArrayList;
import java.util.Vector;

/*
 *  Universidad del Valle de Guatemala
 *  Algoritmos y Estructura de Datos - CC2003
 *  Hoja de Trabajo #6 - Implementación de Árboles 2-3
 *  David Ytzen Hsieh Lo #08225
 */

public class Nodo<E>{

    final int LIMITE = 2;
    Vector<Elemento<E>> datos = new Vector<Elemento<E>>(LIMITE);
    ArrayList<Nodo> hijos = new ArrayList<Nodo>(LIMITE+1);
    int cantidad;
    Nodo padre;



    public void nuevoHijo(int index, Nodo hijo) {
        hijos.add(index, hijo);
        if(hijo != null)
                hijo.padre = this;
    }

    public Nodo quitarHijo(int index) {
        
        //Nodo temp = hijos.get(index);
        Nodo temp = null;
        if(index < hijos.size() )
            temp = hijos.remove(index);
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
        //return cantidad;
        return datos.size();
    }

    public int getCantidadHijos() {
        return hijos.size();
    }

    public Elemento getDato(int index) {
        return datos.get(index);
    }

    public boolean lleno() {
        if(cantidad >= LIMITE)
            return true;
        return false;
    }

    public int buscar(Elemento elemento) {
        if (datos.contains(elemento))
            return datos.indexOf(elemento);
        return -1;
    }

    public int insertar(Elemento nuevo) {

        Elemento actual;
        cantidad ++;

        if(!datos.isEmpty())
        for(int i=datos.size(); i>=0; i--) {
            if(datos.size() <= i)
                continue;
            else {
                actual =  datos.get(i);
                if(nuevo.compareTo(actual)< 0)
                    datos.add(i+1,datos.get(i));
                else {
                    datos.add(i+1, nuevo);
                    return i+1;
                }

            }
        }

        datos.add(nuevo);
        return 0;
    }

    public Elemento remover() {
        //Elemento temp = datos.get(cantidad - 1);
        //datos.set(cantidad-1, null);
        Elemento temp = datos.remove(cantidad-1);
        cantidad --;
        return temp;
    }

    public void despliegar()
    {
        for(int i =0; i<cantidad; i++)
            datos.get(i).despliegar();
        System.out.println("/");
    }



}
