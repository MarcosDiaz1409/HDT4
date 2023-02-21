/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 19/02/2023
 * Clase abstracta de una lista que contiene todo los metodos de una lista y los hereda a una lista simplemente encadenada y doblemente encadenada
 */

public abstract class Lista<T> implements IList<T>{

	// Instancia la clase de lista
	public Lista(){

	}

	/**
	 *  Metodo que inserta un valor al inicio de la lista
	 *  @post el elemento es añadido al inicio de la lista
	 */ 
	@Override
	public abstract void InsertAtStart(T value);

	/**
	 * Metodo que elimina el elemento al inicio de la lista
	 * @pre la lista no esta vacia
	 * @post remueve el primer valor de la lista
	 */
	@Override
	public abstract T DeleteAtStart();

	/**
	 * Metodo que obtiene el elemento al final de la lista
	 * @pre la lista tiene al menos un elemento
	 * @post retorna el ultimo valor encontrado en la lista
	 */ 
	@Override
	public abstract T Get(int index);

	/**
	 * Metodo que verifica si la lista esta vacia
	 * @post devuelve true si la lista no contiene elementos
	 */ 
    @Override
	public boolean IsEmpty() {
		return Count() == 0;	
	}

	/**
	 * Metodo que cuenta la cantidad de elementos que tiene una lista 
	 * @post devuelve la cantidad de elementos en la lista
	 */ 
	@Override
	public abstract int Count();
	    
}