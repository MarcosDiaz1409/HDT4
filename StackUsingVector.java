import java.util.Vector;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 20/02/2023
 * Clase que implementa un stack utilizando un vector
 */

public class StackUsingVector<T> extends Stack<T>{

    private Vector<T> vector = new Vector<T>();

    // Metodo que devuelve la cantidad de elementos de un stack
    @Override
	public int count() {
		return vector.size();
	}

	// Metodo que verifica si el stack esta vacio
	@Override
	public boolean isEmpty() {
		return vector.isEmpty();
	}

	// Metodo que introduce un elemento al stack
	@Override
	public void push(T value) {
		vector.add(0, value);
	}

	// Metodo que extrate un elemento del stack
	@Override
	public T pull() {
		return vector.remove(0);
	}

	// Metodo que devuelve el primer elemento del stack
	@Override
	public T peek() {		
		return vector.get(0);
	}


}