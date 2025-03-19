# Name:    quadratic.py
# Date:    
# Author:  
# Purpose: Practice using decision structures to solve a problem.
#          Computes the smaller root of a quadratic equation.

###################################################
# Smaller quadratic root formula
import math

def smaller_root(a, b, c):
    """
    Returns the smaller root of a quadratic equation with the
    given coefficients.
    """
    discriminant = (b**2) - 4*a*c
    if discriminant > 0:
        root1 = ((-1*b) - math.sqrt(discriminant))/(2*a)
        root2 = ((-1*b) + math.sqrt(discriminant))/(2*a)
        return min(root1, root2)     
    elif discriminant == 0:
        root = (-1*b)/2*a
        print("Only one solution")
        return root
    else:
        return print("Error: No real solutions.")


###################################################
# Tests

def test(a, b, c):
    """Tests the smaller_root function."""
    
    print("The smaller root of " + str(a) + "x^2 + " + str(b) + "x + " + str(c) + " is:") 
    print(str(smaller_root(a, b, c)))
    print()
        
def main():
    test(1, 2, 3)
    test(2, 0, -10)
    test(6, -3, 5)
    test(1, 0, 0)

if __name__ == "__main__":
    main()
