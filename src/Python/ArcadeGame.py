"""Functions for implementing the rules of the classic arcade game Pac-Man."""

"""Verify that Pac-Man can eat a ghost if he is empowered by a power pellet.

    :param power_pellet_active: bool - does the player have an active power pellet?
    :param touching_ghost: bool - is the player touching a ghost?
    :return: bool - can the ghost be eaten?
"""
def eat_ghost(power_pellet_active, touching_ghost):
    return power_pellet_active and touching_ghost

"""Verify that Pac-Man has scored when a power pellet or dot has been eaten.

    :param touching_power_pellet: bool - is the player touching a power pellet?
    :param touching_dot: bool - is the player touching a dot?
    :return: bool - has the player scored or not?
"""
def score(touching_power_pellet, touching_dot):
    return touching_dot or touching_power_pellet

"""
Define the lose() function that takes 
two parameters (if Pac-Man has a power pellet active and if Pac-Man is touching a ghost) and 
returns a Boolean value if Pac-Man loses. 
The function should return True if Pac-Man is touching a ghost and does not have a power pellet active.
"""
def lose(power_pellet_active,touching_ghost):
    return touching_ghost and not(power_pellet_active) 

"""
Define the win() function that takes 
three parameters (if Pac-Man has eaten all of the dots, if Pac-Man has a power pellet active, and if Pac-Man is touching a ghost) 
and returns a Boolean value if Pac-Man wins. 
The function should return True if Pac-Man has eaten all of the dots and has not lost based on the parameters defined in part 3.
"""

def win(eaten_all_dots,power_pellet_active,touching_ghost):
    return eaten_all_dots and not(lose(power_pellet_active,touching_ghost))