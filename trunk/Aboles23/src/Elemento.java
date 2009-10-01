
public class Elemento<E> implements Comparable {

    private E dato;

    public Elemento(E dato) {
        this.dato = dato;
    }

    public void despliegar() {
        System.out.println(dato);
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public int compareTo(Object o) {
        return ((String)dato).compareTo(((Elemento)(o)).toString()) ;
    }

    //public String toString() {
     //   return (String)dato;
   // }

}
