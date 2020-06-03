from Operaciones import factorial
from Fibonacci import fibonacci
if __name__ == "__main__":
    while True:
        opcion=int(input(" 1)Calcular Factorial \n 2)Calcular Fibonacci\n 3)Salir\n" ))

        if opcion==1:  
             num=int(input("ingrese un numero:"))
             ope=factorial()
             aux=ope.MetodoaFactorial(num)
             print("El factorial de " +str(num)+ " es " +str(aux))
        if opcion==2:
                num=int(input("ingrese un numero:"))
                fib=fibonacci()
                fib.MetodoFibonacci(num)
                fib.Mostrar(num)
        if opcion==3:
                    break
        else:
             print("opcion incorrecta")


