
import java.util.Scanner;

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

    public static void main (String [] args){
        
        boolean aux=true;
        Scanner sc = new Scanner(System.in);
   
        Factorial fac= new Factorial();
        Fibonacci fibo=new Fibonacci();
        
        while(aux){
        System.out.println("*********MENU PRINCIPAL*********");
        System.out.println("1:Calcular el Factorial");    
        System.out.println("2:Calcular el Fibonacci");
        System.out.println("3:Salir");
        System.out.println("********************************");
        int op=sc.nextInt();
        int n;
        
        switch(op){
            
            case 1:
                System.out.println("Introducir un numero para calcular el Factorial");
                n=sc.nextInt();
                fac.MetodoFactorial(n);
                fac.mostrarSerie(n);
                break;
            case 2:
                System.out.println("Introducir un numero para calcular el Fibonacci");
                n=sc.nextInt();
                fibo.Fibonacci(n);
                fibo.mostrarSerie(n);
                break;
            case 3: aux=false;
                    break;
            default: System.out.println("opcion incorrecta"); 
        }
               
        }
    }
}
