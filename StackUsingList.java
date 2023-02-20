/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 20/02/2023
 * Clase que implementa un stack utilizando una lista
 */

public class StackUsingList<T> extends Stack<T>{

    private FactoryList<T> factoryLista = new FactoryList<T>();
    private Lista<T> miLista;

    // Constructor de la clase
    public StackUsingList(String tipo){
        miLista = factoryLista.getLista(tipo);
    }

    // Metodo que devuelve la cantidad de elementos de un stack
    @Override
	public int count() {
		return miLista.Count();
	}

    // Metodo que verifica si el stack esta vacio
	@Override
	public boolean isEmpty() {
		return miLista.IsEmpty();
	}

    // Metodo que introduce un elemento al stack
	@Override
	public void push(T value) {
		miLista.InsertAtStart(value);
	}

    // Metodo que extrate un elemento del stack
	@Override
	public T pull() {
		return miLista.DeleteAtStart();
	}

    // Metodo que devuelve el primer elemento del stack
	@Override
	public T peek() {
		return miLista.Get(0);
	}

}