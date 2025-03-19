# Name:    triangle_type.py
# Date:   10/2/23 
# Author:  Parth Zanwar
# Purpose: Practice making decisions in a program.

import random

def print_triangle_type(a, b, c):
    """
    Prints the type of a triangle given the length of the sides.

    Parameters:
      a (int or float) Side a (value > 0)
      b (int or float) Side b (value > 0)
      c (int or float) Side c (value > 0)    
    """

    if is_triangle(a, b, c) == True:
        if a == b == c:
            return print("Equilateral")
        elif a == b or a == c or b == c:
            return print("Isosceles")
        else:
            return print("Scalene")
    else:
        return print("Invalid Triangle")  

def is_triangle(a, b, c):
    """
    Determines if the 3 given sides make up a triangle
    using the Triangle Inequality Theorem. The sum of the 
    lengths of any two sides must be greater than (or equal
    to if we include degenerate triangles - which we are not)
    the length of the third side (must check all 3 sets).
    
    Parameters:
      a (int or float) Side a (value > 0)
      b (int or float) Side b (value > 0)
      c (int or float) Side c (value > 0)    

    Returns:
    bool  True for valid triangle and False otherwise
    """
    if a + b > c and a + c > b and b + c > a:
        return True
    else:
        return False
  
def max_side(a, b, c):
    """ returns the largest side - do not use python's built-in function max"""

    if a == b and b == c and a == c:
        return a
    elif a >= b and a >= c:
        return a
    elif b >= a and b >= c:
        return b
    elif c >= a and c >= b:
        return c


def test_max_side():
    """ returns true if max_side function works and false otherwise"""
    if max_side(4,4,4) != 4:
        return False
    if max_side(5,4,6) != 6:
        return False
    if max_side(2,2,4) != 4:
        return False
    if max_side(3,3,1) != 3:
        return False
    if max_side(3,3,8) != 8:
        return False
    if max_side(1,2,3) != 3:
        return False
    if max_side(3,2,1) != 3:
        return False
    if max_side(4,11,5) != 11:
        return False
    for i in range(1000):
        one = random.randrange(10000)
        two = random.randrange(10000)
        three = random.randrange(10000)
        if max_side(one,two,three) != max(one,two,three):
            return False
    return True

def test_is_triangle():
    if is_triangle(1, 1, 2):
        return False
    if is_triangle(1, 10, 12):
        return False
    if is_triangle(17, 6, 11):
        return False
    if is_triangle(5, 10, 5):
        return False
    if not is_triangle(3, 3, 3):
        return False
    if not is_triangle(3, 4, 5):
        return False
    if not is_triangle(8, 1, 8):
        return False
    return True

def main():
    
    print("Passes" if test_max_side() else "Fails", "'max side' function")
    print("Passes" if test_is_triangle() else "Fails", "'is triangle' function\n")
    
    print_triangle_type(2,2,2)
    print_triangle_type(9,9,9)
    print_triangle_type(1,1,1.5)
    print_triangle_type(7,9,7)
    print_triangle_type(2,20,20)
    print_triangle_type(3,4,5)
    print_triangle_type(7,8,9)
    print_triangle_type(41,9,40)
    print_triangle_type(65,72,97)
    print_triangle_type(65,65,131)
    print_triangle_type(5,5,10)
    

if __name__ == "__main__":
    main()





    
