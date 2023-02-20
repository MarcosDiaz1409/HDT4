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

    // Metodo que devuelve la cantidad de elementos de un stack
    public abstract int count();

    // Metodo que verifica si el stack esta vacio
    public boolean isEmpty(){
        return count() == 0;
    }

    // Metodo que introduce un elemento al stack
    public abstract void push(T value);

    // Metodo que extrate un elemento del stack
    public abstract T pull();

    // Metodo que devuelve el primer elemento del stack
    public abstract T peek();

}