
public class Arbol23<E> {
    private Nodo<E> raiz = new Nodo<E>();
    private Elemento elem =null;
    private int cont = 0;
    private int cantidad = 0;

    public Nodo<E> getRaiz() {
        return raiz;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int buscar(Elemento elemento) {
        int hijo;
        Nodo actual = raiz;
        while(true) {
            hijo = actual.buscar(elemento);
            //System.out.println(hijo);
            if(hijo != -1)
                return hijo;
            else if(actual.esHoja())
                return -1;
            else
                actual = sigHijo(actual, elemento);
        }

    }

    public void reiniciarCont() {
        cont = 0;
    }

    public Elemento buscar(int limite, Nodo raiz) {
        if(raiz != null) {
            elem =buscar(limite,(Nodo) raiz.hijos.get(0));
            if(raiz.getDato(0) != null) {
                elem = raiz.getDato(0);
                cont++;
                if(limite == cont)
                    return elem;
            }
            elem =buscar(limite, (Nodo) raiz.hijos.get(1));
            if(raiz.getDato(1) != null) {
                elem = raiz.getDato(1);
                cont++;
                if(limite == cont)
                    return elem;
            }
            elem =buscar(limite, (Nodo) raiz.hijos.get(2));
            
        }
        return null;
            


    }

    

    public void insertar(Elemento elemento) {
        cantidad ++;
        Nodo actual = raiz;
        Elemento elementoTemp = elemento;

        while(true) {

            if(actual.esHoja()) {
                break;
            }
            else {
                actual = sigHijo(actual, elemento);
            }
        }

        actual.insertar(elementoTemp);
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
        //actual.insertar(elementoTemp);
        
        
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

        int n = padre.getCantidad()-1;

        for(int i = n; i > index; i--) {
            System.out.println(i);
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
        
        int cantElementos = nodo.getCantidad();
        for(i = 0; i < cantElementos; i++) {
            if(elemento.compareTo(nodo.getDato(i)) < 0)
                return nodo.getHijo(i);
        }

        return nodo.getHijo(i);
    }

    public void despliegar() {
        recorrer(raiz, 0, 0);
    }

    public void recorrer(Nodo nodo, int nivel, int hijo) {
        System.out.print("nivel="+nivel+ " hijo="+hijo+" ");
        nodo.despliegar();

        int cantElementos = nodo.getCantidad();

        for(int i = 0; i < cantElementos+1; i++) {
            Nodo sigNodo = nodo.getHijo(i);
            if(sigNodo != null) {
                recorrer(sigNodo, nivel+1, i);
            }
            else {                
                return;
            }

        }
    }

    public void mostrar(Nodo raiz) {
        if(raiz != null) {
            mostrar((Nodo) raiz.hijos.get(0));
            if(raiz.getDato(0) != null) 
                System.out.print(raiz.getDato(0).getDato() + " ");
            mostrar((Nodo) raiz.hijos.get(1));
            if(raiz.getDato(1) != null) 
                System.out.print(raiz.getDato(1).getDato()+ " ");
            mostrar((Nodo) raiz.hijos.get(2));
        }
    }

    
}
