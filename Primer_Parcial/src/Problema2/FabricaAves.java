/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

/**
 *
 * @author Jhonny
 */
public class FabricaAves  implements FabricaAbstracta{

    @Override
    public Imamiferos getMamiferos(String TipoMamifero) {
        return null;
    }

    @Override
    public Iaves getAves(String TipoAve) {
     if (TipoAve.equals("Loro")){
            return new Aves("Loro","4kg",12.5f); 
        }
        else{
            if (TipoAve.equals("aguila")){
            return new Aves("aguila","4kg",12.5f); 
            }
            else
                return new Aves("condor","10kg",15.3f);
            } //To change body of ge   
    }

    @Override
    public Ipeses getPeses(String TipoPez) {
        return null;
    }
    
}
