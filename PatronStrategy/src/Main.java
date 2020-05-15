/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Main {
    
        public static void main(String [] args){
             //generar numeros aleatorios 
                int [] numeros= new int[10];
                for (int i = 0; i < numeros.length ; i++) {
               
                    numeros[i] = (int) (Math.random()*100+1);    
                    
                }
        
            
                Contexto contexto = new Contexto(new Burbuja(numeros) );
		contexto.ejecutar();
                 System.out.println("************************************");   
                Contexto contexto2 = new Contexto(new Seleccion(numeros) );
		contexto2.ejecutar();
                System.out.println("************************************");   
                   Contexto contexto3 = new Contexto(new Merge(numeros) );
		contexto3.ejecutar();
                System.out.println("************************************");  
                
            }
           
           
   }
    

