# Name:    rpsls.py
# Date:    10/9/23
# Author:  Parth Zanwar
# Purpose: Practice using decision structures to play a game.
#          This is a program to play the game of rock-paper-scissors-lizard-Spock against the computer.
# Note:    Solution must not include lists since students have not yet been introduced to lists.

import random
import math

def name_to_number(str):
    """
    Converts a string in the form of rock, paper, scissors, lizard or Spock
    to its corresponding number from zero to four respectively

    Input:
    arg1 (str): str contains either a valid choice rock, paper, scissors, lizard, Spock
    or an invalid choice

    Returns:
    int: zero to four corresponding to the choices above respectively
    None: if input is invalid
    """
    if str == "rock":
        str = 0
    elif str == "spock":
        str = 1
    elif str == "paper":
        str = 2
    elif str == "lizard":
        str = 3
    elif str == "scissors":
        str = 4
    elif str == "i hate this":
        print("L")
        return None
    else:
        print("You lose skill issue")
        return None

    computer_choice = random.randrange(0, 5)

    if computer_choice - str == 1 or computer_choice - str == 2 or computer_choice - str == -3 or computer_choice - str == -4:
        print("Computer chooses", number_to_name(computer_choice))
        print("You lose sucka!!!")
    elif computer_choice - str == 3 or computer_choice - str == 4 or computer_choice - str ==  -1 or computer_choice - str == -2:
        print("Computer chooses", number_to_name(computer_choice))
        print("You win you lucky ducky!!!")
    elif computer_choice == str:
        print("Computer chooses", number_to_name(computer_choice))
        print("It's a tie!")
        
        
        
def number_to_name(num):
    """
    Converts an integer(0-4) to the corresponding rpsls choice

    Input:
    arg1 (int): an integer from zero to four

    Returns:
    str: rock, paper, scissors, lizard, Spock based on num
    """
    if num == 0:
        num = "rock"
    elif num == 1:
        num = "Spock"
    elif num == 2:
        num = "paper"
    elif num == 3:
        num = "lizard"
    elif num == 4:
        num = "scissors"

    return num
    
    
    
    
    
    
def main():        
    done = False
    while not done:
        print()
        players_choice = input("Enter your choice of rock, paper, scissors, lizard, Spock: ")
        if players_choice == "q":
            done = True
        else:
            name_to_number(players_choice)
            
main()
