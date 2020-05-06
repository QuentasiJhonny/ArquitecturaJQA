
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Pila  implements IEstructura{
    private int tope=0;
    
    private Stack<String> pila= new Stack<String>();

    @Override
    public void insertar(String valor) {
        pila.push(valor);
        tope++;
        System.out.println("Se inserto un valor a la pila");
    }

    @Override
    public String Eliminar() {
        String cadena="";
        if(tope==0){
        cadena= "la pila esta vacia";
        }
        else
        {
          cadena=pila.pop();
                tope--;
                cadena="Se elimino un valor de la pila";
                        }
        return cadena;
    }

    @Override
    public void Mostrar() {
        int i=0;
        if(pila.empty()){
            System.out.println("La pila esta vacia");
            
        }
        else{
            System.out.println("La pila contiene los siguientes valores");
            for(Object numero: pila){
                System.out.println(numero);
            }
        }
    }
    
    
    
}
