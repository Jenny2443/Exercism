"""
Instructions
The Collatz Conjecture or 3x+1 problem can be summarized as follows:

Take any positive integer n. 
If n is even, divide n by 2 to get n / 2. 
If n is odd, multiply n by 3 and add 1 to get 3n + 1. 
Repeat the process indefinitely. 
The conjecture states that no matter which number you start with, you will always reach 1 eventually.

Given a number n, return the number of steps required to reach 1.

# example when argument is zero or a negative integer
raise ValueError("Only positive integers are allowed")
"""
def even(number):
    return number % 2 == 0

def steps(number):
    if number <= 0: #Excepcion porq solo funciona con numeros positivos
        raise ValueError("Only positive integers are allowed")
    else:
        cont = 0
        while number != 1:
            if even(number):
                number = number / 2
                cont += 1
            else:
                number = (number * 3) + 1
                cont += 1
    return cont

#TEST
print(steps(12)) #9
print(steps(5)) #5
print(steps(40)) #8
print(steps(0)) #Error