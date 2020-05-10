/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Alumno implements IPersona{
    String Nombre;
    String Apellido;
    int CI;
    String Complemento;
    public Alumno(String Nombre, String Apellido, int CI, String Complemento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.CI = CI;
        this.Complemento = Complemento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getCI() {
        return CI;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

   

    @Override
    public void getNombreCompleto() {
        System.out.println("El Alumno "+Nombre +" "+Apellido+" "+ "con CI "+CI+" "+Complemento);
    }

    
    
}
