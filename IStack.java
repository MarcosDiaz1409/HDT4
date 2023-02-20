/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 20/02/2023
 * Interfaz IStack que contiene todos los metodos que utiliza una stack
 */

public interface IStack<T>{

	// Metodo que devuelve la cantidad de elementos de un stack
    int count();
	
	// Metodo que verifica si el stack esta vacio
	boolean isEmpty();
	
	// Metodo que introduce un elemento al stack
	void push(T value);
	
	// Metodo que extrate un elemento del stack
	T pull();
	
	// Metodo que devuelve el primer elemento del stack
	T peek();

}