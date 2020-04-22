/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstracPlantas;

/**
 *
 * @author Jhonny
 */
public class Perro implements IAnimales {
     float altura;
     String Raza;
    
    

    public Perro(float altura, String Raza) {
        this.altura=altura;
        this.Raza=Raza;
    }
    @Override
    public String Comer() {
        return "El perro esta comiendo";
    }

    @Override
    public String Dormir() {
        return "El perro esta Durmiendo";
    }

    @Override
    public String Despertar() {
        return "el perro esta despertando";
    }

    @Override
    public String MostarCaracteristicas() {
       return "El perro tiene una altura de"+this.altura+" ybes de raza"+this.Raza;
    }
    
}
