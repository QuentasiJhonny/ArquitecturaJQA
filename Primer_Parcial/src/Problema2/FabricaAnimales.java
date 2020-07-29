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
public class FabricaAnimales  implements FabricaAbstracta{
    
   
       

    @Override
    public Imamiferos getMamiferos(String TipoMamifero) {
       if (TipoMamifero.equals("Oso")){
            return new Mamiferos("Oso","12F",4,"negro"); 
        }
        else{
            if (TipoMamifero.equals("Leon")){
            return new Mamiferos("Leon","12F",4,"negro");
            }
            else
                return new Mamiferos("Mono","12F",4,"cafe");
            } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iaves getAves(String TipoAve) {
 return null;    }

    @Override
    public Ipeses getPeses(String TipoPez) {
        return null;
    }
        }
    

