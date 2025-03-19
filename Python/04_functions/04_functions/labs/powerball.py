'''
This program was created by Parth Zanwar
This program wil use the random module to generate random numbers
It will output these random numbers
'''

###################################################
# Powerball function
import random
def powerball():
    """Prints Powerball lottery numbers."""
    num1 = random.randrange(1, 60)
    num2 = random.randrange(1, 60)
    num3 = random.randrange(1, 60)
    num4 = random.randrange(1, 60)
    num5 = random.randrange(1, 60)
    powerball_number = random.randrange(1, 36)
    return print("Today's numbers are " + str(num1), str(num2), str(num3), str(num4), "and " +  str(num5) + "." + "\nThe Powerball number is \
" + str(powerball_number) + ".", sep = ", ", end = "\n\n")

    
###################################################
# Tests
# Student should not change this code.

random.seed(20) # setting the seed allows us to get the same answers

powerball()
powerball()
powerball()
