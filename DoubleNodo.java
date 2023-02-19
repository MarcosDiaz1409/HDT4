public class DoubleNodo<T>{

    private T value;
	private DoubleNodo<T> next;
	private DoubleNodo<T> previous;
	
	public DoubleNodo(T value) {
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
	public DoubleNodo<T> getNext() {
		return next;
	}
	/**
	 * @param next
	 */
	public void setNext(DoubleNodo<T> next) {
		this.next = next;
	}
	/**
	 * @return previous
	 */
	public DoubleNodo<T> getPrevious() {
		return previous;
	}
	/**
	 * @param previous 
	 */
	public void setPrevious(DoubleNodo<T> previous) {
		this.previous = previous;
	}

}