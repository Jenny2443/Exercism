"""
Instructions
An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.

For example:

9 is an Armstrong number, because 9 = 9^1 = 9
10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190
Write some code to determine whether a number is an Armstrong number.
"""


#Conteo del numero de digitos
def number_of_digits(number):
    res = 0
    while number != 0:
        res += 1
        number = number // 10 #division entera
    return res


def is_armstrong_number(number):
    res = 0 #Contador
    initial = number #Guardo el numero inicial para comprobar
    digits = number_of_digits(number)
    for i in range(0,digits):
        res += pow(number % 10,digits)
        number = number // 10 #Reduccion del numero
    return res == initial


#TEST

print(number_of_digits(153))
print(number_of_digits(1))
print(number_of_digits(12))

print(is_armstrong_number(153)) #T
print(is_armstrong_number(10)) #F
print(is_armstrong_number(2)) #T