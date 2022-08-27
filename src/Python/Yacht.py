"""
Instructions
The dice game Yacht is from the same family as Poker Dice, Generala and particularly Yahtzee, of which it is a precursor. In the game, five dice are rolled and the result can be entered in any of twelve categories. The score of a throw of the dice depends on category chosen.

Scores in Yacht
Category	Score	Description	Example
Ones	1 × number of ones	Any combination	1 1 1 4 5 scores 3
Twos	2 × number of twos	Any combination	2 2 3 4 5 scores 4
Threes	3 × number of threes	Any combination	3 3 3 3 3 scores 15
Fours	4 × number of fours	Any combination	1 2 3 3 5 scores 0
Fives	5 × number of fives	Any combination	5 1 5 2 5 scores 15
Sixes	6 × number of sixes	Any combination	2 3 4 5 6 scores 6
Full House	Total of the dice	Three of one number and two of another	3 3 3 5 5 scores 19
Four of a Kind	Total of the four dice	At least four dice showing the same face	4 4 4 4 6 scores 16
Little Straight	30 points	1-2-3-4-5	1 2 3 4 5 scores 30
Big Straight	30 points	2-3-4-5-6	2 3 4 5 6 scores 30
Choice	Sum of the dice	Any combination	2 3 3 4 6 scores 18
Yacht	50 points	All five dice showing the same face	4 4 4 4 4 scores 50
If the dice do not satisfy the requirements of a category, the score is zero. If, for example, Four Of A Kind is entered in the Yacht category, zero points are scored. A Yacht scores zero if entered in the Full House category.

Task
Given a list of values for five dice and a category, 
your solution should return the score of the dice for that category. 
If the dice do not satisfy the requirements of the category your solution should return 0. 
You can assume that five values will always be presented, and the value of each will be between one and six inclusively. 
You should not assume that the dice are ordered.
"""

# Score categories.
# Change the values as you see fit.
YACHT = 0
ONES = 1
TWOS = 2
THREES = 3
FOURS = 4
FIVES = 5
SIXES = 6
FULL_HOUSE = 7
FOUR_OF_A_KIND = 8
LITTLE_STRAIGHT = 9
BIG_STRAIGHT = 10
CHOICE = 11

SCORE_YACHT = 50
SCORE_LITTLE_STRAIGHT = 30
SCORE_BIG_STRAIGHT = 30

#CONTEO DE NUMEROS
def count(dice, number):
    res = sorted(dice)
    cont = 0
    for i in range(0,len(res)):
        if res[i] == number:
            cont += 1
    return cont

#PUNTOS PARA 1,2,3,4,5,6
def numberScores(dice, number):
    return count(dice,number) * number
"""
def ScoreFourOfKind2(dice):
    dice = sorted(dice)
    number = dice[0]
    cont = 1
    for i in range(1,len(dice)):
        if dice[i] == number:
            cont += 1
        number = dice[i]
    return number * 4 if cont == 4 else 0
"""
#CALCULO DE SCORES DE 4 OF KIND USANDO COUNT()
def ScoreFourOfKind(dice):
    for i in range(0,len(dice)):
        number = dice[i]
        cont = count(dice,number)
    return number * 4 if cont >= 4 else 0 #Ternary operator para q solo de punto si se cumple, se permite 4 o +

#CALCULO DE SCORES DE FULL HOUSE 
def ScoreFullHouse(dice):
    res = 0
    cont1 = 0
    cont2 = 0
    number1 = dice[0]
    cont1 = count(dice,number1) #conteo de numero1
    if(cont1 == 3): #Depende de si hay 3 o 2 contamos el numero 2
        number = dice[3]
        cont2 = count(dice,number)
        res = (cont1 * number1) + (cont2 * number)
    elif(cont1 == 2):
        number = dice[2]
        cont2 = count(dice,number)
        res = (cont1 * number1) + (cont2 * number)
    return res if (cont1 == 3 and cont2 == 2) or (cont1 == 2 and cont2 == 3) else 0 #Si se cumplen las condiciones da puntos, sino 0


#CALCULO DE SCORE LITTLE STRAIGHT
def ScoreLittleStraight(dice):
    isLittleStraigth = True #Variable bool para saber si se cumple o no
    dice = sorted(dice) #Colocar ascendente
    for i in range(0,len(dice)):
        if i+1 != dice[i]: #Coincida i+1 con el numero del dice
            isLittleStraigth = False # distinto por lo q no se cumple
    return SCORE_LITTLE_STRAIGHT if isLittleStraigth else 0

#CALCULO DE SCORE BIG STRAIGHT
def ScoreBigStraight(dice):
    isBigStraight = True 
    dice = sorted(dice)
    for i in range(0,len(dice)):
        if i+2 != dice[i]: #Coincida i+2 con el numero del dice porq tiene q empezar en 2
            isBigStraight = False #Cortocircuito
    return SCORE_BIG_STRAIGHT if isBigStraight else 0

#CALCULO DE SCORE YACHT
def ScoreYacht(dice):
    cont = count(dice,dice[0]) 
    return SCORE_YACHT if cont == 5 else 0 #El conteo tiene q ser de 5

#CALCULO DE SCORE CHOICE
def ScoreChoice(dice):
    dice = sorted(dice) #ordenados
    res = 0
    for i in range(0, len(dice)):
        res += dice[i] #suma de valores
    return res

#SCORE SEGUN CATEGORIA
def score(dice, category):
    if category == ONES:
        return numberScores(dice,1)
    elif category == TWOS:
        return numberScores(dice,2)
    elif category == THREES:
        return numberScores(dice,3)
    elif category == FOURS:
        return numberScores(dice,4)
    elif category == FIVES:
        return numberScores(dice,5)
    elif category == SIXES:
        return numberScores(dice,6)
    elif category == FULL_HOUSE:
        return ScoreFullHouse(dice)
    elif category == FOUR_OF_A_KIND:
        return ScoreFourOfKind(dice)
    elif category == LITTLE_STRAIGHT:
        return ScoreLittleStraight(dice)
    elif category == BIG_STRAIGHT:
        return ScoreBigStraight(dice)
    elif category == CHOICE:
        return ScoreChoice(dice)
    elif category == YACHT:
        return ScoreYacht(dice)

#TEST
dice = [1,2,7,1,3]
dice2 = [2,2,3,4,5]
dice3 = [1,2,2,2,2]
dice4 = [3,3,3,5,5]
dice5 = [1,4,2,3,5]
dice6 = [2,6,3,4,5]
dice7 = [4,4,4,4,4]
"""
print(numberScores(dice,1))
print(numberScores(dice,2))
print(numberScores(dice2,2))
"""

#print(ScoreFourOfKind2(dice))
#print(ScoreFullHouse(dice))
#print(ScoreFullHouse(dice4))

#print(ScoreLittleStraight(dice))
#print(ScoreLittleStraight(dice5))

#print(ScoreBigStraight(dice))
#print(ScoreBigStraight(dice6))

#print(ScoreYacht(dice2))
#print(ScoreYacht(dice7))

#print(ScoreChoice(dice))
#print(ScoreChoice(dice6))

print("ONES: ",score(dice,ONES))
print("TWOS:",score(dice2,TWOS))
print("FOUR OF A KIND:",score(dice3,FOUR_OF_A_KIND))
print("FULL HOUSE:",score(dice4,FULL_HOUSE))
print("LITTLE STRAIGHT:",score(dice5,LITTLE_STRAIGHT))
print("BIG STRAIGHT",score(dice6,BIG_STRAIGHT))
print("YACHT",score(dice7,YACHT))