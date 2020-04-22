/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstracPlantas;

/**
 *
 * @author Jhonny
 */
public class FabricaProductor {
    
public static FabricaAbstracta getFabrica(String tipoFabrica){

    if(tipoFabrica.equals("Animales")){
         return (FabricaAbstracta) new FabricaAnimales();
         
        }
    else
        return (FabricaAbstracta) new FabricaPlantas();
    }    
}
