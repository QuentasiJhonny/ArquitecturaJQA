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
public class FabricaAnimales implements FabricaAbstracta {
   
    public IAnimales getAnimales(String TipoAnimal){
    
        if (TipoAnimal.equals("Perro")){
            return new Perro(1.20f,"pitbull"); 
        }
        else{
            if (TipoAnimal.equals("Gato")){
            return new Gato("asd",7,1.2f);
            }
            else
                return new Vaca(12.2f,"Toro");
            }
        }

    @Override
    public IPlantas getPlantas(String Tipoplanta) {
        return null;
    }
    
}
