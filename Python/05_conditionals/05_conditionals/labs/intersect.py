# Name:    intersect.py
# Date:    10/4/23
# Author:  Parth Zanwar
# Purpose: Practice using Boolean logic to solve a problem.
#          Determines whether two intervals intersect.

###################################################
# Interval intersection formula
def interval_intersect(a, b, c, d):
    """Returns whether the intervals [a,b] and [c,d] intersect."""
    #return (b >= d and a <= c) or (b <= d and a >= c) or (a >= d and b <= c) or (a <= d and b >= c)
    return not (b<c or d<a)

    
###################################################
# Tests - don't change this code.

def test(a, b, c, d):
    """Tests the interval_intersect function."""
    print ("Intervals [" + str(a) + ", " + str(b) + "] and [" + str(c) + ", " + str(d) + "]", end ="")
    if interval_intersect(a, b, c, d):
        print( "intersect.")
    else:
        print( "do not intersect.")

def main():
    test(0, 1, 1, 2)    # tests first before second and intersects
    test(1, 2, 0, 1)    # tests second before first and intersects
    test(0, 1, 2, 3)    # tests first before second and doesn't intersect
    test(2, 3, 0, 1)    # test second before first and doesn't intersect
    test(0, 3, 1, 2)    # tests second inside first
    test(5, 6, 3, 8)    # tests first inside second


if __name__ == "__main__":
    main()
