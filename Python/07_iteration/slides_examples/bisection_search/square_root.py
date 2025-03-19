import math

def square_root(x, epsilon):
    """ brute force algorithm to find the square root of a number"""
    iterations = 0
    value = 0
    while value**2 < x:
        value += epsilon
        iterations += 1
    print("# of iterations:", iterations)
    return value

def square_root_bisection(x, epsilon):
    iterations = 0
    low = 0
    high = x
    mid = (high + low)/2.0
    while abs(mid**2 - x) >= epsilon:
        if mid**2 < x:
            low = mid
        else:
            high = mid
        mid = (high + low)/2.0
        iterations += 1
    print("# of iterations:", iterations)
    return mid

print(square_root(100, .01), " == ", math.sqrt(100))
print(square_root(100, .001), " == ", math.sqrt(100))
print()

print(square_root_bisection(100, .01), " == ", math.sqrt(100))
print(square_root_bisection(100, .001), " == ", math.sqrt(100))
print(square_root_bisection(100, .0001), " == ", math.sqrt(100))
