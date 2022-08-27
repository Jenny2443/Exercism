"""
Instructions
Calculate the number of grains of wheat on a chessboard given that the number on each square doubles.

There once was a wise servant who saved the life of a prince. The king promised to pay whatever the servant could dream up. Knowing that the king loved chess, the servant told the king he would like to have grains of wheat. One grain on the first square of a chess board, with the number of grains doubling on each successive square.

There are 64 squares on a chessboard (where square 1 has one grain, square 2 has two grains, and so on).

Write code that shows:

how many grains were on a given square, and
the total number of grains on the chessboard

Calculo-> como multiplo de 2 -> uso de potencias
El exponente será el numberodecasilla-1
"""

def square(number):
    if number < 1 or number > 64: #Restriccion de numeros , raise error
        raise ValueError("square must be between 1 and 64")
    else:
        return pow(2,number-1) 


def total():
    i = 0
    res = 0
    while i < 64: 
        res += pow(2,i) #res = la suma de potencias hasta la ultima casilla
        i += 1
    return res 

#TEST

print(square(2))
print(square(3))
print(square(64))


print(total())


