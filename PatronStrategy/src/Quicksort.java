/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Quicksort extends OrdenarQuickSort {
    int [] numeros;

    public Quicksort(int[] numeros) {
        this.numeros = numeros;
    }
    
    
 


    @Override
    public void OrdenQuick() {
   
        int [] vector=numeros;
        int first=0;
        int last=numeros.length;
     int i=first, j=last;
     int pivote=vector[(first + last) / 2];
     int auxiliar;
 
     do
     {
          while(vector[i]<pivote) i++; 
          
          while(vector[j]>pivote) j--;
 
          if (i<=j)
          {
               auxiliar=vector[j];
               vector[j]=vector[i];
               vector[i]=auxiliar;
               i++;
               j--;
          }
     }
     while (i<=j);
 
     if(first<j)
     {
          OrdenQuick();
     }

     if(last>i)
     {
          OrdenQuick();
     }
     
     for (int k = 0; k < vector.length; k++) {
        
            
            System.out.print(vector[k]+"-");
        
         }
         System.out.println("Se ordeno con el metodo QuickShort");
    }

}


    

