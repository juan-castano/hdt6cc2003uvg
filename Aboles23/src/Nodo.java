
import java.util.ArrayList;
import java.util.Vector;

/*
 *  Universidad del Valle de Guatemala
 *  Algoritmos y Estructura de Datos - CC2003
 *  Hoja de Trabajo #6 - Implementación de Árboles 2-3
 *  David Ytzen Hsieh Lo #08225
 */

public class Nodo<E>{

    final int LIMITE =3;
    Vector<Elemento<E>> datos = new Vector<Elemento<E>>(LIMITE);    
    ArrayList<Nodo> hijos = new ArrayList<Nodo>(LIMITE);          
    int cantidad;
    Nodo padre;

    public Nodo() {
        datos.add(null);       
        datos.add(null);
        datos.add(null);

        hijos.add(null);
        hijos.add(null);        
        hijos.add(null);
    }



    public void nuevoHijo(int index, Nodo hijo) {
        hijos.set(index, hijo);
        if(hijo != null)
            hijo.padre = this;
    }

    public Nodo quitarHijo(int index) {
        
        //Nodo temp = hijos.get(index);
        //Nodo temp = null;
        //if(index < cantidad)
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
        return hijos.get(0) == null;
    }

    public int getCantidad() {
        return cantidad;
        //return datos.size();
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
        for(int i = 0; i < cantidad; i++) {
            if(elemento.compareTo(datos.get(i)) == 0)
                return i;
            
        }
        return -1;
    }

    public int insertar(Elemento nuevo) {

        Elemento actual;
        cantidad ++;

        for(int i = LIMITE-2; i>=0; i--) {
            if(datos.get(i) == null)
                continue;
            else {
                actual =  datos.get(i);
                if(nuevo.compareTo(actual)< 0)
                    datos.set(i+1,datos.get(i));
                else {
                    datos.set(i+1, nuevo);
                    return i+1;
                }

            }
        }

        datos.set(0, nuevo);
        return 0;
    }

    public Elemento remover() {
        Elemento temp = datos.get(cantidad - 1);
        datos.set(cantidad-1, null);
        //Elemento temp = datos.remove(cantidad-1);
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
