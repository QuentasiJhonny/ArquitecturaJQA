/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

import java.util.Scanner;

/**
 *
 * @author Jhonny
 */
public class Main {
    
    public static void main(String [] args){
     
        System.out.println("1Añadir_Mamifero");
        System.out.println("2Añadir_Ave");
        System.out.println("3Añadir_Pez");
        System.out.println("4Mostrar_MAmifero");
        System.out.println("5Mostar_Ave");
        System.out.println("6Mostar_Pez");
        System.out.println("7Mostar_zoologico");
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Introducir opcion");
        int  opcion=sc.nextInt();
        
        if (opcion==1){
              FabricaAbstracta fabricaAnimales = FabricaProductor.getFabrica("Animales");
                Imamiferos mamifero = fabricaAnimales.getMamiferos("Oso");
            
            }
         
        else{
            if(opcion==2)
                    {
                        FabricaAbstracta fabricaAnimales2 = FabricaProductor.getFabrica("Aves");
                        Iaves aves = fabricaAnimales2.getAves("Loro");
                    }
             else
                {
                    if(opcion==3)
                    {
                        FabricaAbstracta fabricaAnimales3 = FabricaProductor.getFabrica("peses");
                        Ipeses peses= fabricaAnimales3.getPeses("pacu");
                    }
                    else
                {
                    if(opcion==4)
                    {
                        FabricaAbstracta fabricaAnimales = FabricaProductor.getFabrica("Animales");
                       
                    }
                }
                }
        }
        
        
      //  FabricaAbstracta fabricaAnimales = FabricaProductor.getFabrica("Animales");
       //    Imamiferos mamifero = fabricaAnimales.getMamiferos("Oso");
            
        //System.out.println(mamifero.Temperatura());
        
        
       // FabricaAbstracta fabricaAnimales2 = FabricaProductor.getFabrica("Animales");
         //   Imamiferos mamifero2 = fabricaAnimales2.getMamiferos("Leon");
            
        //System.out.println(mamifero2.Temperatura());
        
        //FabricaAbstracta fabricaAnimales3 = FabricaProductor.getFabrica("Animales");
          //  Imamiferos mamifero3 = fabricaAnimales3.getMamiferos("Mono");
            
        //System.out.println(mamifero2.Temperatura());//
        
    }
}
