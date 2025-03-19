# Name:    number.py
# Date:    10/4/23
# Author:  Parth Zanwar
# Purpose: Practice using decision structures.
#          Computes and print tens and ones digit of an integer in [0,100).

###################################################
# Digits function
def print_digits(number):
    """Prints the tens and ones digit of an integer in [0,100)."""
    if number >= 100 or number < 0:
        return print("Error: Input is an invalid number")
    tens_digit = (number//10)
    ones_digit = number - (tens_digit*10)
    return print("The tens digit is {0}, and the ones digit is {1}.".format(tens_digit, ones_digit))

    
###################################################
# Tests - should not change this code.

def main():   
    print_digits(32)
    print_digits(4)
    print_digits(99)
    print_digits(17)
    print_digits(551)
    print_digits(-33)
    print_digits(0)
    print_digits(100)


if __name__ == "__main__":
    main()
