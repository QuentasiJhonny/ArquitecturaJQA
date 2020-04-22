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
public class Margarita implements IPlantas {
     int NroHojas;
     float Longitud;

    public Margarita(int NroHojas, float Longitud, String Tallo) {
        this.NroHojas = NroHojas;
        this.Longitud = Longitud;
        this.Tallo = Tallo;
    }
     String Tallo;
    
    @Override
    public String Crecer() {
        return "La margarita esta Creciendo";
    }

    @Override
    public String Florecer() {
       return "LA margarita esta floreciendo";
    }

    @Override
    public String Morir() {
       return "La margarita esta Muerta";
    }

    @Override
    public String ObtenerValores() {
        return "La Margarita tiene"+this.NroHojas+"hojas y tiene una longitud de"+this.Longitud+"metros y su tallo es "+this.Tallo;
    }
    
}
