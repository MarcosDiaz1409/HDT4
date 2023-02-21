import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 20/02/2023
 * Clase principal donde el usuario interactua con el programa
 */

public class Principal{

    public static void main(String[] args){

        // Se crea el ArrayList que almacena todas las lineas del archivo
        ArrayList<String> lineasArchivo = new ArrayList<>();

        // Lee el archivo de texto y agrega todas las lineas al ArrayList anterior
        File file = new File("C:/Ejemplos/ejemplo.txt"); // Poner aqui la direccion del archivo de texto a utilizar
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))){
                while(br.ready()) {
                    lineasArchivo.add(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Separa las lineas del archivo para que se operen correctamente
        for(String linea : lineasArchivo){
            ArrayList<String> cdlinea = new ArrayList<>();
            String[] espacio = linea.split("");
            for(String elemento : espacio){
                cdlinea.add(elemento);
            }
        }

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        String tipo, tipoLista;
        boolean continuar = false;

        while(continuar == false){

            System.out.println(" ..:: Bienvenido al programa ::.. \n");
            System.out.println(" A continuacion se muestran los tipos de pilas que puede utilizar: \n");
            System.out.println(" 1. Utilizando un array    2. Utilizando un vector     3. Utilizando listas     4. Salir \n");
            System.out.println("Porfavor elige una opcion:");
            opcion = Integer.parseInt(teclado.nextLine());

            calc = Calculator.getInstance();

            switch(opcion){
                case 1:
                    tipo = "ArrayList";
                    tipoLista = "";
                    //System.out.println("La expresion postfix es: " + calc.ConvertToPostfix(cdlinea, tipo, tipoLista));
                break;

                case 2:
                    tipo = "Vector";
                    tipoLista = "";
                break;

                case 3:
                    System.out.println("Que tipo de lista deseas usar?\n");
                    System.out.println(" 1. Simplemente encadenada    2. Doblemente encadenada \n");
                    System.out.println("Porfavor elige una opcion:");
                    opcion2 = Integer.parseInt(teclado.nextLine());

                    switch(opcion2){
                        case 1:
                           tipo = "Lista";
                           tipoLista = "Simplemente encadenada"
                           
                        break;

                        case 2:
                            tipo = "Lista";
                            tipoLista = "Doblemente encadenada";
                        break;
                    
                        default:
                            System.out.println("Error, tu numero de opcion ingresado no existe, porfavor vuelve a intentarlo \n");
                        break;
                    }

                break;

                case 4:
                    System.out.println("Muchas gracias por utilizar el programa\n");
                    continuar = true;
                break;

                default:
                    System.out.println("Error, tu numero de opcion ingresado no existe, porfavor vuelve a intentarlo \n");
                break;

            }
        }
        
        
    }

}