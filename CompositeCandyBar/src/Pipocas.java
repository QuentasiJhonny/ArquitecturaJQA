/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Pipocas extends AbstracCombo{
     String tamaño;

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.tamaño = Tamaño;
    }
    
    public Pipocas(String Tamaño) {
        this.tamaño = Tamaño;
    }
 
   

  
   
    
   

    @Override
    public double getCosto() {
       if(tamaño=="pequeño"){
           
           costo=5;
           return costo;
       }
           else{
           if(tamaño=="mediano")
           {
               costo=8;
                   return costo;
           }
           else{
               costo=10;
              
                return costo ;
           }
       }
       
    }
   
    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
