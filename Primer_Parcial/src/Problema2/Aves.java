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
public class Aves implements Iaves{
    String nombreA;
   String Peso;
    float TamañoAlas;

    public Aves(String nombreA, String Peso, float TamañoAlas) {
        this.nombreA = nombreA;
        this.Peso = Peso;
        this.TamañoAlas = TamañoAlas;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public float getTamañoAlas() {
        return TamañoAlas;
    }

    public void setTamañoAlas(float TamañoAlas) {
        this.TamañoAlas = TamañoAlas;
    }

    @Override
    public String Volar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
