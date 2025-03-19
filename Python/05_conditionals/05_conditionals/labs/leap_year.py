# Name:    leap_year.py
# Date:   10/4/23 
# Author:  Parth Zanwar
# Purpose: Practice reading data from a user, processing the data via function calls and printing the results.
#          Computes whether the given year is a leap year.

###################################################
def is_leap_year(year):
    """
    Returns whether the given Gregorian year is a leap year.

    Using the following criteria:
    if (year is not divisible by 4) then (it is a common year)
    else if (year is not divisible by 100) then (it is a leap year)
    else if (year is not divisible by 400) then (it is a common year)
    else (it is a leap year)
    """
    #todo
    if year % 4 != 0:
        return False
    elif year % 100 != 0:
        return True
    elif year % 400 != 0:
        return False
    else:
        return True

###################################################
# Tests
# You should not change this code.

def test(year):
    """Tests the is_leapyear function."""
    if is_leap_year(year):
        print (year, "is a leap year.")
    else:
        print (year, "is not a leap year.")

def main():
    test(2000)
    test(1996)
    test(1800)
    test(2013)
    test(3144)
    test(20453)

if __name__ == "__main__":
    main()
