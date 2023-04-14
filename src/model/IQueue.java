package model;

public interface IQueue<E> {
    /**
     * Agrega un elemento al final de la cola.
     *
     * @param element el elemento que se agregará a la cola.
     */
    void enqueue(E element);

    /**
     * Elimina el elemento al frente de la cola y lo devuelve.
     *
     * @return el elemento al frente de la cola, o null si la cola está vacía.
     */
    E dequeue();

    /**
     * Devuelve el elemento al frente de la cola sin eliminarlo.
     *
     * @return el elemento al frente de la cola, o null si la cola está vacía.
     */
    E peek();

    /**
     * Verifica si la cola está vacía o no.
     *
     * @return true si la cola está vacía, false en caso contrario.
     */
    boolean isEmpty();

    /**
     * Devuelve la cantidad de elementos en la cola.
     *
     * @return la cantidad de elementos en la cola.
     */
    int size();
}

