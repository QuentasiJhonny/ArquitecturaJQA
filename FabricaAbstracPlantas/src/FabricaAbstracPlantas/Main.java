/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstracPlantas;

import java.util.Scanner;

/**
 *
 * @author Jhonny
 */
public class Main {
    public static void main(String [] args){
    
   //Fabrica Animales
       FabricaAbstracta fabricaAnimales = FabricaProductor.getFabrica("Animales");
            IAnimales Animal = fabricaAnimales.getAnimales("Perro");
            
        System.out.println(Animal.Comer());
        System.out.println(Animal.Dormir());
        System.out.println(Animal.Despertar());
        System.out.println(Animal.MostarCaracteristicas());
      FabricaAbstracta fabricaAnimales2= FabricaProductor.getFabrica("Animales");
            IAnimales Animal1 = fabricaAnimales2.getAnimales("Gato");  
        System.out.println(Animal1.Comer());
        System.out.println(Animal1.Dormir());
        System.out.println(Animal1.Despertar());
        System.out.println(Animal1.MostarCaracteristicas());
       FabricaAbstracta fabricaAnimales3= FabricaProductor.getFabrica("Animales");
            IAnimales Animal2 = fabricaAnimales3.getAnimales("Vaca");  
        System.out.println(Animal2.Comer());
        System.out.println(Animal2.Dormir());
        System.out.println(Animal2.Despertar());
        System.out.println(Animal2.MostarCaracteristicas());
            
     //Fabricar Plantas
     FabricaAbstracta fabricaPlantas = FabricaProductor.getFabrica("Plantas");
            IPlantas Planta = fabricaPlantas.getPlantas("Rosa"); 
        
        System.out.println(Planta.Crecer());
        System.out.println(Planta.Florecer());
        System.out.println(Planta.Morir());
        System.out.println(Planta.ObtenerValores());
        FabricaAbstracta fabricaPlantas1 = FabricaProductor.getFabrica("Plantas");
            IPlantas Planta1 = fabricaPlantas1.getPlantas("Rosa"); 
        
        System.out.println(Planta1.Crecer());
        System.out.println(Planta1.Florecer());
        System.out.println(Planta1.Morir());
        System.out.println(Planta1.ObtenerValores());
        
        FabricaAbstracta fabricaPlantas2 = FabricaProductor.getFabrica("Plantas");
            IPlantas Planta2 = fabricaPlantas2.getPlantas("Durazno"); 
        
        System.out.println(Planta2.Crecer());
        System.out.println(Planta2.Florecer());
        System.out.println(Planta2.Morir());
        System.out.println(Planta2.ObtenerValores());
        
        FabricaAbstracta fabricaPlantas3 = FabricaProductor.getFabrica("Plantas");
            IPlantas Planta3 = fabricaPlantas3.getPlantas("Durazno"); 
        
        System.out.println(Planta3.Crecer());
        System.out.println(Planta3.Florecer());
        System.out.println(Planta3.Morir());
        System.out.println(Planta3.ObtenerValores());
           FabricaAbstracta fabricaPlantas4 = FabricaProductor.getFabrica("Plantas");
            IPlantas Planta4 = fabricaPlantas4.getPlantas("Durazno"); 
        
        System.out.println(Planta4.Crecer());
        System.out.println(Planta4.Florecer());
        System.out.println(Planta4.Morir());
        System.out.println(Planta4.ObtenerValores());
        
        
    }
}

