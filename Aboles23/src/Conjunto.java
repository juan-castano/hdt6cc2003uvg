
public class Conjunto<E> implements InterfazConjunto {

    Arbol23<E> arbol;

    public Conjunto() {
         arbol = new Arbol23<E>();
    }

    public Arbol23 getArbol() {
        return arbol;
    }

    public void insertar(Object dato) {
        arbol.insertar(new Elemento(dato));
    }

    public E retirar(Object dato) {
        int index = arbol.buscar(new Elemento(dato));
        if(index != -1)
            return (E) dato;
        else
            return null;
    }

    public Conjunto union(Conjunto B) {
        Conjunto C = new Conjunto();
        for(int i=0; i<arbol.getCantidad(); i++) {
            C.insertar(arbol.buscar(i, arbol.getRaiz()));

        }
        for(int i=0; i<B.getArbol().getCantidad(); i++) {
            if(C.getArbol().buscar(B.getArbol().buscar(i, arbol.getRaiz())) != -1);
                C.insertar(B.getArbol().buscar(i, arbol.getRaiz()));
  
        }
                              
        return C;

    }

    public Conjunto interseccion(Conjunto B) {
        Conjunto C = new Conjunto();
        for(int i=0; i<arbol.getCantidad(); i++) {
            if(B.getArbol().buscar(arbol.buscar(i, arbol.getRaiz())) != -1)
                C.insertar(arbol.buscar(i, arbol.getRaiz()));

        }


        return C;
    }

    public void mostrar() {
        
        arbol.mostrar(arbol.getRaiz());
    }

}
