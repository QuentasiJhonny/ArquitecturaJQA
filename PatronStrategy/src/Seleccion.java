/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Seleccion extends OrdenarSeleccion{
    int[] numeros;

    public Seleccion(int[] numeros) {
        this.numeros = numeros;
    }
    
    @Override
    public void OrdenSeleccion() {
      
       int []a=numeros;
       for (int i = 0; i < a.length - 1; i++)
       {
               int min = i;
               for (int j = i + 1; j < a.length; j++)
               {
                       if (a[j] < a[min])
                       {
                               min = j;
                       }
               }
               if (i != min) 
               {
                       int aux= a[i];
                       a[i] = a[min];
                       a[min] = aux;
               }
       }
         for (int i = 0; i < a.length; i++) {
        
            
            System.out.print(a[i]+"-");
        
         }
         System.out.println("Se ordeno con el metodo Seleccion");
         
    }
    
}
