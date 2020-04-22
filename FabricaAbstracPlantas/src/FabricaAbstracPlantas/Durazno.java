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
public class Durazno implements IPlantas {

     int NroFrutos;    

    public Durazno(int NroFrutos) {
        this.NroFrutos = NroFrutos;
    }
    
    @Override
    public String Crecer() {
       return "El durazno esta Creciendo";
    }

    @Override
    public String Florecer() {
        return "El durazno esta Floreciendo";
    }

    @Override
    public String Morir() {
        return "El durazno esta Muriendo";
    }

    @Override
    public String ObtenerValores() {
       return "El durazno tiene "+this.NroFrutos;
    }
    
}
