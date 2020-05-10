/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public  abstract class AlumnoDecorador implements IPersona{
  
    private IPersona persona;
    public AlumnoDecorador(IPersona persona){
    
        this.persona=persona;
        }
    
    protected IPersona getPersona(){
    
    return persona;
    }
    
}
