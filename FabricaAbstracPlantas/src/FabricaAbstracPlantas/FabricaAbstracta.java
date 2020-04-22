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
public interface FabricaAbstracta {
    IAnimales getAnimales(String TipoAnimal);
    IPlantas getPlantas(String TipoPlanta);
    
}
