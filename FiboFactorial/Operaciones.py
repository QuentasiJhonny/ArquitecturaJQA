class factorial:
   def MetodoaFactorial(self,n):
        if n==0:
            return 1
        else:
            return n*self.MetodoaFactorial(n-1)