/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 20/02/2023
 * Clase Factory de un stack que crea un stack dependiendo del tipo de pila que se haya solicitado
 */

public class FactoryStack<T>{

    // Metodo que obtiene un stack segun se haya indicado
    public Stack<T> getStack(String tipo, String tipoLista){

        if (tipo == null){
            return null;
        }
        if(tipo.equalsIgnoreCase("ArrayList")){
            return new StackUsingArrayList<T>();
        }
        if(tipo.equalsIgnoreCase("Vector")){
            return new StackUsingVector<T>();
        }
        if(tipo.equalsIgnoreCase("Lista")){
            return new StackUsingList<T>(tipoLista);
        }

        return null;
    }

}