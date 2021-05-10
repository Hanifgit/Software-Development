
n = int(input("Enter a number: "))

fact = 1

if n < 0:
   print("Negative numbers")
else:
   for i in range(1,n+1):
       fact = fact*i
   print("The factorial of",n,"is",fact)