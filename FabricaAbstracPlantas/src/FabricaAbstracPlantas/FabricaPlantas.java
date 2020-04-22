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
public class FabricaPlantas implements FabricaAbstracta {


    @Override
    public IAnimales getAnimales(String TipoAnimal) {
        return null;
    }

    @Override
    public IPlantas getPlantas(String TipoPlanta) {
       if (TipoPlanta.equals("Rosa")){
            return new Rosa("regular",55); 
        }
        else{
            if (TipoPlanta.equals("Margarita")){
            return new Margarita(20,0.50f,"Grueso");
            }
            else
                return new Durazno(50);
            }
    }
}
