
def MetodoFibonacci(n):
    if n<2:
        return n
    else:
        return MetodoFibonacci(n-1)+MetodoFibonacci(n-2)

def Mostrar(n):
    for x in range(n):
        print(MetodoFibonacci(x))
    

  

            