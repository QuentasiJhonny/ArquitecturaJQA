/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Contexto {
    private IEstrategia estrategia;

    public Contexto(IEstrategia estrategia) {
        this.estrategia = estrategia;
    }
	
	
	public void ejecutar() {
		this.estrategia.ordenar();
	}
}
