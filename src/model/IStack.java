package model;

public interface IStack<E> {
    /**
     * Agrega un elemento en la parte superior de la pila.
     *
     * @param element el elemento que se agregará a la pila.
     */
    void push(E element);

    /**
     * Elimina el elemento en la parte superior de la pila y lo devuelve.
     *
     * @return el elemento en la parte superior de la pila, o null si la pila está vacía.
     */
    E pop();

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return el elemento en la parte superior de la pila, o null si la pila está vacía.
     */
    E peek();

    /**
     * Verifica si la pila está vacía o no.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    boolean isEmpty();

    /**
     * Devuelve la cantidad de elementos en la pila.
     *
     * @return la cantidad de elementos en la pila.
     */
    int size();
}

