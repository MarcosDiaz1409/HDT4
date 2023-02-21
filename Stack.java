/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 20/02/2023
 * Clase abstracta de un stack que contiene todos los metodos de un stack
 */

public abstract class Stack<T> implements IStack<T>{

    // Constructor de la clase
    public Stack(){

    }

    /**
     * Metodo que devuelve la cantidad de elementos de un stack
     * @post devuelve la cantidad de elementos en la pila
     */
    public abstract int count();

    /**
     * Metodo que verifica si el stack esta vacio
     * @post Devuelve un valor true si la pila esta vacia
     */    
    public boolean isEmpty(){
        return count() == 0;
    }

    /**
     * Metodo que introduce un elemento al stack
     * @post se introduce un elemento al stack
     */
    public abstract void push(T value);

    /**
     * Metodo que extrae un elemento del stack
     * @pre la pila no esta vacia
     * @post el ultimo elemento incorporado es extraido
     */
    public abstract T pull();

    /** 
     * Metodo que muestra el ultimo elemento del stack
     * @pre la pila no esta vacia
     * @post el ultimo elemento incorporado es mostrado
     */ 
    public abstract T peek();

}