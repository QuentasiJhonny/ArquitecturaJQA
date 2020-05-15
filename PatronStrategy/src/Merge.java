/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Merge extends OrdenarMerge {
    int[] numeros;

    public Merge(int[] numeros) {
        this.numeros = numeros;
    }
    
    
    @Override
    public void OrdenMerge() {
        int []arreglo=numeros;
		int size = arreglo.length;
		if(size> 1){
			if(size % 2 == 0){
				int[] izq = new int[size/2];
				int[] der = new int[size/2];
				depurador(arreglo, izq, 0, size/2);
				depurador(arreglo, der, size/2, size);
				arreglo=izq;
				arreglo=der;
				mezclador(arreglo, izq, der);
			}else {
				int[] izq = new int[size/2];
				int[] der = new int[(size/2) + 1];
				depurador(arreglo, izq, 0, size/2);
				depurador(arreglo, der, size/2 + 1, size);
				arreglo=izq;
				arreglo=der;
				mezclador(arreglo, izq, der);
			}
		}
	
                for (int i = 0; i < arreglo.length; i++) {
        
            
            System.out.print(arreglo[i]+"-");
        
         }
         System.out.println("Se ordeno con el metodo Merge");
	}
	
	static void depurador(int[] arreglo, int[] arreglo2, int inicio, int fin){
		int contador = 0;
		for(int i=inicio; i<fin; i++){
			arreglo2[contador] = arreglo[i];
			contador++;
		}
			
	}
	
	static void mezclador(int[] arreglo, int[] izq, int[] der){
		int contadorIzq = 0;
		int contadorDer = 0;
		int contadorArr = 0;
		
		while(contadorArr < arreglo.length){
			if(contadorIzq >= izq.length){
				arreglo[contadorArr] = der[contadorDer];
				contadorDer++;
			}
			else if(contadorDer >= der.length){
				arreglo[contadorArr] = izq[contadorIzq];
				contadorIzq++;
			}
			else if(izq[contadorIzq] > der[contadorDer]){
				arreglo[contadorArr] = der[contadorDer];
				contadorDer++;
			}
			else{
				arreglo[contadorArr] = izq[contadorIzq];
				contadorIzq++;
			}
			contadorArr++;
		}
             
	}
        
       
        
    
        
    }

    
   
    

