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
public class FabricaPeses implements FabricaAbstracta {

    @Override
    public Imamiferos getMamiferos(String TipoMamifero) {
        return null;
    }

    @Override
    public Iaves getAves(String TipoAve) {
        return null;
    }

    @Override
    public Ipeses getPeses(String TipoPez) {
        if (TipoPez.equals("pacu")){
            return new Peses("pacu",5.5f); 
        }
        else{
            return new Peses("sabalo",6.3f);
            }
    }
    
}
