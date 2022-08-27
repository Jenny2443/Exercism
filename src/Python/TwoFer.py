"""
Instructions
Two-fer or 2-fer is short for two for one. One for you and one for me.

Given a name, return a string with the message:

One for name, one for me.
Where "name" is the given name.

However, if the name is missing, return the string:

One for you, one for me.
Here are some examples:

Name	String to return
Alice	One for Alice, one for me.
Bob	One for Bob, one for me.
One for you, one for me.
Zaphod	One for Zaphod, one for me.
"""

missing = "One for you, one for me."

def two_fer(name = ""): #Se tiene q poner el valor de name = "", para los casos en los que no se mete ningun parametro, para q el default sea el string vacio
    if name == "":
        return missing
    else:
        return "One for " + name + ", one for me."

#TEST
print(two_fer(""))
print(two_fer("Jenny"))
print(two_fer("Julio"))