import java.util.ArrayList;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #4 
 * 20/02/2023
 * Clase Calculadora que contiene los metodos para convertir infix a postfix y evaluar la expresion postfix
 */

public class Calculator{

    private static boolean instance_flag = false;
	private static Calculator _theOnlyCalculator;

    private Calculator(){
        instance_flag = true;
    }

    // Patron singleton para que se cree una unica instancia de Calculator
    public static Calculator getInstance(){
        if (instance_flag) {
			return _theOnlyCalculator;
		} else {
			_theOnlyCalculator = new Calculator();
			return _theOnlyCalculator;
		}
    }

    private boolean verify(String elemento){
        try {
            Integer.parseInt(elemento);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    int preced(String c) {
        if(c.equals("+") || c.equals("-")) {
           return 1;              
        }else if(c.equals("*") || c.equals("/")){
           return 2;            
        }else {
           return 0;
        }
     }

    public ArrayList ConvertToPostfix(ArrayList infix, String tipo, String tipoLista){
        
        FactoryStack factoryStack = new FactoryStack();
        Stack miStack = factoryStack.getStack(tipo, tipoLista);

        ArrayList<String> postfix_expression = new ArrayList<String>();

        String cr = "#";
        String pr = "";
        String a = "(";
        String ch = "";

        miStack.push(cr);

        ArrayList<String> elementos = infix;
        for(String elemento: elementos){
            if(verify(elemento)){
                postfix_expression.add(elemento);
            }
            else if(verify(elemento) == false){
                if(elemento.equals("(")){
                    pr = "(";
                    miStack.push(pr);
                }
                else if(elemento.equals("+")){
                    pr = "+";
                    miStack.push(pr);
                }
                else if(elemento.equals("-")){
                    pr = "-";
                    miStack.push(pr);
                }
                else if(elemento.equals("*")){
                    pr = "*";
                    miStack.push(pr);
                }
                else if(elemento.equals("/")){
                    pr = "/";
                    miStack.push(pr);
                }
                else if(elemento.equals(")")){
                    
                    while(miStack.isEmpty() == false && miStack.peek() != a){
                        ch = String.valueOf(miStack.pull());
                        postfix_expression.add(ch);
                    }
                    miStack.pull();

                }else{

                    ch = String.valueOf(miStack.peek());
                    if(preced(elemento) > preced(ch)){
                        miStack.push(elemento);
                    }else{
                        while(miStack.peek() != a && preced(elemento) <= preced(ch)){
                            ch = String.valueOf(miStack.pull());
                            postfix_expression.add(ch);
                        }
                    }

                }
                
            }
        }
        return postfix_expression;
    }



}