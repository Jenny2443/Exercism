"""
Instructions
Given a year, report if it is a leap year.

The tricky thing here is that a leap year in the Gregorian calendar occurs:

on every year that is evenly divisible by 4
  except every year that is evenly divisible by 100
    unless the year is also evenly divisible by 400
For example, 1997 is not a leap year, but 1996 is. 1900 is not a leap year, but 2000 is.
"""
#Comprobaciones para ver si divisible
def divBy4(number):
    return number % 4 == 0

def divBy100(number):
    return number % 100 == 0

def divBy400(number):
    return number % 400 == 0

#Tiene q ser div en 4 -> O no div 100 o div 400
def leap_year(year):
    return divBy4(year) and (not divBy100(year)) or divBy400(year)
   



print(leap_year(1997))
print(leap_year(1996))
print(leap_year(2000))