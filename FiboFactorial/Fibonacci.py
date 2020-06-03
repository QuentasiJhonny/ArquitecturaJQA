class fibonacci:
    def MetodoFibonacci(self,n):
        if n<2:
            return n
        else:
            return self.MetodoFibonacci(n-1)+self.MetodoFibonacci(n-2)

    def Mostrar(self,n):
        for x in range(n):
            print(self.MetodoFibonacci(x))
    

  

            