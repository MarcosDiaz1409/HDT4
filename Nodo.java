/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 19/02/2023
 * Clase nodo que es utilizada en la clase de una lista simplemente encadenada
 */
public class Nodo<T>{

    private T value;
	private Nodo<T> next;
	
	public Nodo(T value) {
		this.setValue(value);
	}

	/**
	 * @return value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value 
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * @return next
	 */
	public Nodo<T> getNext() {
		return next;
	}

	/**
	 * @param next
	 */
	public void setNext(Nodo<T> next) {
		this.next = next;
	}

}