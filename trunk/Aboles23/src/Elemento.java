    
public class Elemento<E> implements Comparable {

    private E dato;

    public Elemento(E dato) {
        this.dato = dato;
    }

    public void despliegar() {
        System.out.print(dato+ " ");
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public int compareTo(Object o) {
        if(o != null)
            return ((String)dato).compareTo((String)((Elemento)(o)).getDato());
        return -1;
    }
    

    //public String toString() {
     //   return (String)dato;
   // }

}
