/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public abstract class OrdenarBurbuja implements IEstrategia {
    
    
     public  abstract void OrdenaBurbuja();

    
    @Override
    public void ordenar() {
        
       OrdenaBurbuja();
        }

}
