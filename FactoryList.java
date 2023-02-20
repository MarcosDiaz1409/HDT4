/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 19/02/2023
 * Clase Factory de lista que crea una lista dependiendo del tipo de lista que se necesita
 */

public class FactoryList<T>{

    // Metodo que obtiene una lista segun se haya indicado
    public Lista<T> getLista(String tipoLista){
        if (tipoLista == null){
            return null;
        }
        if(tipoLista.equalsIgnoreCase("Simplemente encadenada")){
            return new SingleLinkedList<T>();
        }
        if(tipoLista.equalsIgnoreCase("Doblemente encadenada")){
            return new DoubleLinkedList<T>();
        }

        return null;

    }
    
}