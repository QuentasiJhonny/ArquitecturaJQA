/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Factorial 
{
    
    int n;
   
    
    public int  MetodoFactorial(int n){
        int aux=0;
         if (n==0 || n==1) {
	     
             aux=1;
             return aux;
	} else {
             aux=n*MetodoFactorial(n-1);
	    return aux;
            
             }
        }
        
      public void mostrarSerie(int n){
    System.out.println("La serie factorial es:");
    for (int i = 0; i < n; i++) {
       
        System.out.print(MetodoFactorial(i)+" ");
        
    }
    System.out.println(" ");
   
      }
}
