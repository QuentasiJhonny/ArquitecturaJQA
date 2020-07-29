/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

/**
 *
 * @author Jhonny
 */
public class Mamiferos implements Imamiferos {
    String nombre;
    String temperatura;
    int NroPatas;
    String Color;

    public Mamiferos(String nombre, String temperatura, int NroPatas, String Color) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.NroPatas = NroPatas;
        this.Color = Color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public int getNroPatas() {
        return NroPatas;
    }

    public void setNroPatas(int NroPatas) {
        this.NroPatas = NroPatas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String Temperatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
