from Operaciones import MetodoaFactorial
from Fibonacci import MetodoFibonacci
from Fibonacci import Mostrar
if __name__ == "__main__":
    while True:
        opcion=int(input(" 1)Calcular Factorial \n 2)Calcular Fibonacci\n 3)Salir\n" ))

        if opcion==1:  
             n=int(input("ingrese un numero:"))

             MetodoaFactorial(n)
             print("El factorial de " +str(n)+ " es " +str(MetodoaFactorial(n)))
        if opcion==2:
                num=int(input("ingrese un numero:"))

                MetodoFibonacci(num)
                Mostrar(num)
        if opcion==3:
                    break
        else:
             print("")


