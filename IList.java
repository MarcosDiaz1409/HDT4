/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 19/02/2023
 * Interfaz IList que contiene todos los metodos que utiliza una lista
 */

public interface IList<T>{

    // Metodo que inserta un valor al inicio de la lista
    void InsertAtStart(T value);

    // Metodo que obtiene un valor en una posicion especifica
    T Get(int index);

    // Metodo que verifica si la lista esta vacia
    boolean IsEmpty();

    // Metodo que cuenta la cantidad de elementos que tiene una lista 
    int Count();

    // Metodo que elimina el elemento al inicio de la lista
    T DeleteAtStart();


}