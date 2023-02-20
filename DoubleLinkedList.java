/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 19/02/2023
 * Clase de una lista doblemente encadenada que utiliza los metodos de la clase abstracta lista
 */

public class DoubleLinkedList<T> extends Lista<T>{

    private DoubleNodo<T> inicio;
	private DoubleNodo<T> fin;
	private int count;

    /**
     * @param count variable que almacena la cantidad de elementos en la lista
     * @param inicio nodo de inicio
     * @param fin nodo de fin
     */
	
    // Se instancia la clase de una lista doblemente encadenada
	public DoubleLinkedList() {
		inicio = null;
		fin = null;
		count = 0;
	}

    // Metodo que inserta un valor al inicio de la lista
    @Override
	public void InsertAtStart(T value) {
		DoubleNodo<T> nuevo = new DoubleNodo<T>(value);
		
		if (IsEmpty()) {
		
			inicio = nuevo;
			nuevo = nuevo;
			inicio.setNext(inicio);
			inicio.setPrevious(inicio);

		} else {
			
			nuevo.setNext(inicio);
			inicio.setPrevious(nuevo);
			nuevo.setPrevious(fin);
			fin.setNext(nuevo);
			inicio = nuevo;
		}
		
		count++;
	}

     // Metodo que elimina el elemento al inicio de la lista
    @Override
	public T DeleteAtStart() {
		if (!IsEmpty()) {
			
			if (Count() == 1) {
				DoubleNodo<T> temp = inicio;
				inicio = null;
			    fin = null;
				count--;
				return temp.getValue();
			} else {
				DoubleNodo<T> temp = inicio;
				fin.setNext(temp.getNext());
				temp.getNext().setPrevious(fin);
				inicio = temp.getNext();
				count--;
				return temp.getValue();
			}
			
		} else {
			return null;
		}
		
		
	}

    // Metodo que obtiene un valor en una posicion especifica
    @Override
	public T Get(int index) {
	    if (!IsEmpty())
        {
            if (index == 0)
            {
                return inicio.getValue();
            }
            else if (index == (Count() - 1))
            {
                return fin.getValue();
            }
            else if ((index > 0) && (index < (Count() - 1)))
            {
                DoubleNodo<T> temp = inicio;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                {
                    return temp.getValue();
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }

        return null;

	}

    // Metodo que verifica si la lista esta vacia
    @Override
	public boolean IsEmpty() {
		return count == 0;
	}

    // Metodo que cuenta la cantidad de elementos que tiene una lista 
	@Override
	public int Count() {
		return count;
	}
    
}