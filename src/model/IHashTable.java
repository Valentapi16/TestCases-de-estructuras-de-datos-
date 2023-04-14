package model;

public interface IHashTable<K,V> {
    /**
     * Agrega un nuevo par clave-valor a la tabla.
     * @param key la clave del par clave-valor
     * @param value el valor del par clave-valor
     * @throws IllegalArgumentException si la clave es nula
     */
    void put(K key, V value);

    /**
     * Obtiene el valor asociado a una clave en la tabla.
     * @param key la clave a buscar en la tabla
     * @return el valor asociado a la clave, o null si la clave no está en la tabla
     */
    V get(K key);

    /**
     * Verifica si la tabla contiene una clave dada.
     * @param key la clave a buscar en la tabla
     * @return true si la clave está en la tabla, false en caso contrario
     */
    boolean containsKey(K key);

    /**
     * Elimina un par clave-valor de la tabla.
     * @param key la clave del par clave-valor a eliminar
     * @return el valor asociado a la clave, o null si la clave no está en la tabla
     */
    V remove(K key);

    /**
     * Retorna la cantidad de pares clave-valor almacenados en la tabla.
     * @return la cantidad de pares clave-valor almacenados en la tabla
     */
    int size();

    /**
     * Verifica si la tabla no contiene ningún par clave-valor.
     * @return true si la tabla está vacía, false en caso contrario
     */
    boolean isEmpty();

    /**
     * Elimina todos los pares clave-valor de la tabla.
     */
    void clear();
}






