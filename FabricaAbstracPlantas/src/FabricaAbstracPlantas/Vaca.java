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
public class Vaca implements IAnimales{
    float Peso;
    String Raza;

    public Vaca(float Peso, String Raza) {
        this.Peso = Peso;
        this.Raza = Raza;
    }

    @Override
    public String Comer() {
        return "LA vaca esta comiendo";
    }

    @Override
    public String Dormir() {
       return "La vaca esta Durmiendo";
    }

    @Override
    public String Despertar() {
        return "Ls vaca esta Despertando ";
    }

    @Override
    public String MostarCaracteristicas() {
        return "La vaca tiene un peso de "+this.Peso+" y es de raza "+this.Raza;
    }
    
}
