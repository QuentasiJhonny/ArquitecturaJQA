
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
    public static void main (String args[] ){
        boolean aux=true;
   Scanner sc =new Scanner(System.in);
  
   while(aux){
        System.out.println("*********MENU PRINCIPAL*********");
        System.out.println("1:Crear");    
        System.out.println("2:MostarPrecio");
        System.out.println("3:Salir");
        System.out.println("********************************");
        int op=sc.nextInt();
        int n;
        
        switch(op){
            
            case 1:
                
                System.out.println("Introducir Nombre");
                String Nombre= sc.next();
                System.out.println("Introducir Descripcion");
                String Descripcion = sc.next();
                System.out.println("Introducir PrecioBase");
                double Precio= sc.nextDouble();
                
                Alimento  ali =new Alimento(new EstadoMuyEscaso(Precio));
                ali.NombreAlimentos(Nombre, Descripcion);
                ali.CalcularPrecios(Precio);
                ali.setEstado(new EstadoEscaso(Precio));
                ali.NombreAlimentos(Nombre, Descripcion);
                ali.CalcularPrecios(Precio);
   
                ali.setEstado(new EstadoNormal(Precio));
                ali.NombreAlimentos(Nombre, Descripcion);
                ali.CalcularPrecios(Precio);

                ali.setEstado(new EstadoAbundante(Precio));
                ali.NombreAlimentos(Nombre, Descripcion);
                ali.CalcularPrecios(Precio);

                break;
            case 2:
                 
                break;
            case 3: aux=false;
                    break;
            default: System.out.println("opcion incorrecta"); 
        }
               
        }
    }
}
