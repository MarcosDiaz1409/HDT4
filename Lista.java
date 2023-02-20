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

	// Metodo que inserta un valor al inicio de la lista
	@Override
	public abstract void InsertAtStart(T value);

	// Metodo que elimina el elemento al inicio de la lista
	@Override
	public abstract T DeleteAtStart();

	// Metodo que obtiene un valor en una posicion especifica
	@Override
	public abstract T Get(int index);

	// Metodo que verifica si la lista esta vacia
    @Override
	public boolean IsEmpty() {
		return Count() == 0;	
	}

	// Metodo que cuenta la cantidad de elementos que tiene una lista 
	@Override
	public abstract int Count();
	    
}