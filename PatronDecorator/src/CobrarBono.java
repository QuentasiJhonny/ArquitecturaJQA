/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class CobrarBono extends AlumnoDecorador {

    public CobrarBono(IPersona persona) {
        super(persona);
    }

   
  
    @Override
    public void getNombreCompleto() {
        getPersona().getNombreCompleto();  
        System.out.println("Cobro un bono de 500bs");
       
        
      
    }
    
    
}
