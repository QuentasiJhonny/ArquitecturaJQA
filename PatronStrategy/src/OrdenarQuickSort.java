/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public abstract class OrdenarQuickSort implements IEstrategia {
    
    public abstract  void OrdenQuick();

    @Override
    public void ordenar() {
            
        OrdenQuick();
    }
    
    
    
}
