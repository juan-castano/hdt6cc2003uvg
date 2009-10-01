
public class Arbol23<E> {
    private Nodo<E> raiz = new Nodo<E>();


    public int buscar(Elemento elemento) {
        int hijo;
        Nodo actual = raiz;
        while(true) {
            if((hijo = actual.buscar(elemento)) != -1)
                return hijo;
            else if(actual.esHoja())
                return -1;
            else
                actual = sigHijo(actual, elemento);
        }
    

     
    }

    public void insertar(Elemento elemento) {
        Nodo actual = raiz;
        Elemento elementoTemp = elemento;
        
        while(true) {
            if(actual.lleno()) {
                
                partir(actual);
                
                
                actual = actual.getPadre();
                
                actual = sigHijo(actual, elemento);
                
            }
            else if(actual.esHoja()) {
                
                break;
            }
            else {
                actual = sigHijo(actual, elemento);
                
            }
        }
        
        actual.insertar(elementoTemp);
        
    }

    public void partir(Nodo nodo) {
        Elemento elemento1, elemento2;
        Nodo padre, hijo1, hijo2;
        int index;

        elemento2 = (Elemento) nodo.remover();
        elemento1 = (Elemento) nodo.remover();
        hijo1 = nodo.quitarHijo(1);
        hijo2 = nodo.quitarHijo(2);
        Nodo nuevo = new Nodo();

        if(nodo == raiz) {
            raiz = new Nodo();
            padre = raiz;
            raiz.nuevoHijo(0, nodo);

        }
        else
            padre = nodo.getPadre();

        index = padre.insertar(elemento1);

        int n = padre.getCantidad();

        for(int i = n; i > index; i--) {
            Nodo temp = padre.quitarHijo(i);
            padre.nuevoHijo(i, temp);
        }

        padre.nuevoHijo(index+1, nuevo);

        nuevo.insertar(elemento2);
        nuevo.nuevoHijo(0, hijo1);
        nuevo.nuevoHijo(1, hijo2);
    }

    public Nodo sigHijo(Nodo nodo, Elemento elemento) {
        int i;
        
        int cantidad = nodo.getCantidad();
        for(i = 0; i < cantidad; i++) {
            if(elemento.compareTo(nodo.getDato(i)) < 0)
                return nodo.getHijo(i);
        }

        return nodo.getHijo(i);
    }

    public void despliegar() {
        despInOrder(raiz, 0, 0);
    }

    public void despInOrder(Nodo nodo, int nivel, int hijo) {
        System.out.print("nivel="+nivel+ " hijo="+hijo+" ");
        nodo.despliegar();

        int cantidad = nodo.getCantidad();

        for(int i = 0; i < cantidad+1; i++) {
            Nodo sigNodo = nodo.getHijo(i);
            if(nodo != null)            
                despInOrder(sigNodo, nivel+1, i);
            else
                return;
        }
    }
}
