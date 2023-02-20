import java.util.ArrayList;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 20/02/2023
 * Clase que implementa un stack utilizando un arraylist
 */

public class StackUsingArrayList<T> extends Stack<T>{

    private ArrayList<T> miLista;

	/**
	 * @param miLista arraylist que almacena todos los valores
	 */

	// Constructor de la clase
    public StackUsingArrayList(){
        miLista = new ArrayList<T>();
    }

	// Metodo que devuelve la cantidad de elementos de un stack
    @Override
	public int count() {
		return miLista.size();
	}

	// Metodo que verifica si el stack esta vacio
	@Override
	public boolean isEmpty() {
		return miLista.isEmpty();
	}

	// Metodo que introduce un elemento al stack
	@Override
	public void push(T value) {
		miLista.add(0, value);
	}

	// Metodo que extrate un elemento del stack
	@Override
	public T pull() {
		return miLista.remove(0);
	}

	// Metodo que devuelve el primer elemento del stack
	@Override
	public T peek() {		
		return miLista.get(0);
	}

}