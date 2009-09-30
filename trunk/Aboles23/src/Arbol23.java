
public class Arbol23<E> {
    private Nodo raiz = new Nodo();


    public int buscar(E dato) {
        int hijo;
        Nodo actual = raiz;
        while(true) {
            if((hijo = actual.buscar(dato)) != -1) 
                return hijo;
            else if(actual.esHoja())
                return -1;
            else
                actual = sigHijo(actual, dato);
        }
    

     
    }

    public void insertar(E dato) {
        Nodo actual = raiz;
        E datoTemp = dato;

        while(true) {
            if(actual.lleno()) {
                split(actual);
                actual = actual.getPadre();
                actual = sigHijo(actual, dato);
                
            }
            else if(actual.esHoja())
                break;
            else
                actual = sigHijo(actual, dato);
        }

        actual.insertar(datoTemp);
    }

    public void partir(Nodo nodo) {
        E dato2, dato3;
        Nodo padre, hijo2, hijo3;
        int index;

        dato3 = (E) nodo.remover();
        dato2 = (E) nodo.remover();
        hijo2 = nodo.quitarHijo(2);
        hijo3 = nodo.quitarHijo(3);
        Nodo nuevo = new Nodo();

        if(nodo == raiz) {
            raiz = new Nodo();
            padre = raiz;
            raiz.nuevoHijo(0, nodo);

        }
        else
            padre = nodo.getPadre();

        index = padre.insertar(dato2);

        int n = padre.getCantidad();

        for(int i = n; i > index; i--) {
            Nodo temp = padre.quitarHijo(i);
            padre.nuevoHijo(i+1, temp);
        }

        padre.nuevoHijo(index+1, nuevo);

        nuevo.insertar(dato3);
        nuevo.nuevoHijo(0, hijo2);
        nuevo.nuevoHijo(1, hijo3);
    }

    public Nodo sigHijo(Nodo nodo, E dato) {
        int i;
        
        int cantidad = nodo.getCantidad();
        for(i = 0; i < cantidad; i++) {
            if(dato.compareTo)
        }

        return nodo.getHijo(i);
    }

    public void despliegar() {
        
    }
}
s