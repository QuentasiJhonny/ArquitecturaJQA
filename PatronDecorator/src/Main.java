/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Main {

    public static void main(String [] args){
    
           IPersona persona = new Alumno("jhonny","quentasi",10340652,"soltero");
           persona = new CobrarBono(persona);
           persona.getNombreCompleto();
            
         
            
        }
   
}
