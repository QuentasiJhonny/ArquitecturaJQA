
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
public class Proxy implements IEstructura {
    IEstructura pila;
    List<String > vitacora;

    public Proxy() {
    pila =new Pila();
    vitacora= new ArrayList<String>();
    }
   
    

    @Override
    public void insertar(String valor) {
        vitacora.add("se inserto un valor" + valor);
        pila.insertar(valor);
        
    }

    @Override
    public String Eliminar() {
        String aux=pila.Eliminar();
        vitacora.add("se elimino un valor"+aux );
       
        return aux;
    }

    @Override
    public void Mostrar() {
        vitacora.add("Se mostro los valores que contiene la pila");
        pila.Mostrar();
    }
    public void getVitacora(){
        System.out.println(vitacora.toString());
    }
    
    
}
