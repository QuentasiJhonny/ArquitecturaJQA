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
public class Gato implements IAnimales{
    String Color;
    int NroVidas;
    float AlturaSalto;

    public Gato(String Color, int NroVidas, float AlturaSalto) {
        this.Color = Color;
        this.NroVidas = NroVidas;
        this.AlturaSalto = AlturaSalto;
    }
   
    @Override
    public String Comer() {
       return "El gato esta Comiendo";
    }

    @Override
    public String Dormir() {
       return "El gato esta Durmiendo";
    }

    @Override
    public String Despertar() {
       return "El gato esta Despertando";
    }

    @Override
    public String MostarCaracteristicas() {
       return "El gato tiene un color"+this.Color+"y tiene "+this.NroVidas+"vidas y su altura de salto es"+this.AlturaSalto;
    }
    
}
