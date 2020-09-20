/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Sodas extends AbstracCombo{
String tamaño;

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Sodas(String tamaño) {
        this.tamaño = tamaño;
    }

  
    

    @Override
    public double getCosto() {
        if(tamaño=="pequeño"){
           
           costo=4;
           return costo;
       }
           else{
           if(tamaño=="mediano")
           {
               costo=6;
                   return costo;
           }
           else{
               costo=8;
           return costo;
           }
       }
    }
    
     public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
