/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Burbuja  extends OrdenarBurbuja{
    int [] numeros;
    
   

    public Burbuja(int[] numeros) {
        this.numeros = numeros;
    }

    @Override
    
    public void OrdenaBurbuja() {
    int n[]=numeros;
    int temp;
    int t = n.length;
    
    
    for (int i = 1; i < t; i++) 
    {
         for (int k = t- 1; k >= i; k--) 
         {
                if(n[k] < n[k-1])
                {
                    temp = n[k];
                    n[k] = n[k-1];
                    n[k-1]=  temp;
                }
         }
      }
    
        for (int i = 0; i < n.length; i++) {
        
            
            System.out.print(n[i]+"-");
        }
    System.out.println("el arreglo fue ordenado con el metodo burbuja");    
    }
    
   
   
    

   
          
        
   

}