
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhonny
 */
public class Combo extends AbstracCombo {

    int numeroCombo;

    private List<AbstracCombo> ListPipocas;
    private List<AbstracCombo> ListSodas;

    public Combo(int numeroCombo) {
        this.numeroCombo = numeroCombo;

        ListPipocas = new ArrayList<AbstracCombo>();
        ListSodas= new ArrayList<AbstracCombo>();
    }

    public int getNumeroCombo() {
        return numeroCombo;
    }

    public void setNumeroCombo(int numeroCombo) {
        this.numeroCombo = numeroCombo;
    }

    public void addPipocas(AbstracCombo pipocas ) {
        this.ListPipocas.add(pipocas);
    }

    public boolean removePipocas(AbstracCombo pipocas) {
        return this.ListPipocas.remove(pipocas);
    }

    public void addSodas(AbstracCombo sodas) {
            this.ListSodas.add(sodas);
    }

    public boolean removeSodas(AbstracCombo sodas) {
        return this.ListSodas.remove(sodas);
    }

    @Override
    public double getCosto() {

        double costo1 = 0;
        double costo2 = 0;
        if (numeroCombo == 1) {
            for (AbstracCombo pipocas : ListPipocas) {
                costo1 = costo1 + pipocas.getCosto();
            }
            for (AbstracCombo sodas : ListSodas) {
                costo2 = costo2 + sodas.getCosto();
            }

            costo = (costo1 + costo2)-1;

        } else {
            if (numeroCombo == 2) {
                for (AbstracCombo pipocas : ListPipocas) {
                    costo1 = costo1 + pipocas.getCosto();
                }
                for (AbstracCombo sodas : ListSodas) {
                    costo2 = costo2 + sodas.getCosto();
                }
                costo = (costo1 + costo2)-0.5;
            } else {

                for (AbstracCombo pipocas : ListPipocas) {
                    costo1 = costo1 + pipocas.getCosto();
                }
                for (AbstracCombo sodas : ListSodas) {
                    costo2 = costo2 + sodas.getCosto();
                }
                costo = (costo1 + costo2)-2;
            }

        }
        return costo;
    }
    
     public void setCosto(double costo) {
        this.costo = costo;
    }
}
