"""
Instructions
Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.

The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.

The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.

Hence the difference between the square of the sum of the first ten natural numbers and the sum of the squares of the first ten natural numbers is 3025 - 385 = 2640.

You are not expected to discover an efficient solution to this yourself from first principles; 
research is allowed, indeed, encouraged. Finding the best algorithm for the problem is a key skill in software engineering.
"""
def square_of_sum(number):
    res = 0
    for i in range(1,number + 1): #number + 1 para q se incluya
        res += i
    return pow(res,2)

def sum_of_squares(number):
    res = 0
    for i in range(1,number + 1):
        res += pow(i,2)
    return res


def difference_of_squares(number):
    return square_of_sum(number) - sum_of_squares(number)

#TEST
print(square_of_sum(10))
print(sum_of_squares(10))
print(difference_of_squares(10))
