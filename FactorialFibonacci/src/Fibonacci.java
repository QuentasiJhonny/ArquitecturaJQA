/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Fibonacci {
    int n;
    public int Fibonacci(int n){
     
        if (n>1){
          
       return Fibonacci(n-1) + Fibonacci(n-2);  //función recursiva
    }
    else if (n==1) {  // caso base
        return 1;
    }
    else if (n==0){  // caso base
        return 0;
    }
    else{ //error
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1; 
        }
    }
    
    public void mostrarSerie(int n){
    System.out.println("La serie de Fibonacci es:");
    for (int i = 0; i < n; i++) {
       
        System.out.print(Fibonacci(i)+" ");
    }
    System.out.println();
}
}
