/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dvdhl89
 */
public interface InterfazConjunto<E> {

    public void insertar(E dato);

    public E retirar(E dato);

    public Conjunto union(Conjunto B);
    
    public Conjunto interseccion(Conjunto B);

    public E[] mostrar();
}
