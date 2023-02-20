/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 19/02/2023
 * Clase de una lista simplemente encadena que utiliza los metodos de la clase abstracta lista
 */

public class SingleLinkedList<T> extends Lista<T>{

    protected int count;
    protected Nodo<T> inicio;
    protected Nodo<T> fin;

    /**
     * @param count variable que almacena la cantidad de elementos en la lista
     * @param inicio nodo de inicio
     * @param fin nodo de fin
     */

    // Metodo que inserta un valor al inicio de la lista
    @Override
	public void InsertAtStart(T value) {
		Nodo<T> nuevo = new Nodo<T>(value);

        if (IsEmpty())
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else
        {
            nuevo.setNext(inicio);
            inicio = nuevo;
        }
        count++;
	}

    // Metodo que elimina el elemento al inicio de la lista
    @Override
	public T DeleteAtStart() {
		
		if (!IsEmpty()) 
        {
            Nodo<T> temp = inicio;
            inicio = inicio.getNext();
            count--;
            return temp.getValue();
        }

        return null;
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
                Nodo<T> temp = inicio;
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
		// TODO Auto-generated method stub
		return count;
    }

}