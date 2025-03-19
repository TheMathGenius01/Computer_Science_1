import math

def is_freezing(c):
    return c <= 0

def is_small(n):
    return n >= -1 and n <= 1

def is_large(n):
    return n > (2**30)

def is_lucky(n):
    return (abs(n) % 10 == 7) or ((abs(n) // 10) % 10 == 7) or ((abs(n) // 100) % 10 == 7) or (abs(n) // 1000 == 7)

def is_primary_color(color):
    return color == "red" or color == "blue" or color == "yellow"

def round_up(n):
    return math.ceil(n)

def power(x, y):
    return x**y

def volume_of_a_cylinder(r, h):
    return round(math.pi * r * r * h, 2)

def volume_of_a_cone(r, h):
    return round(math.pi * r * r * (h/3), 2)

def volume_of_a_sphere(r):
    return round((4/3) * (math.pi) * r * r * r, 2)

def diagonal_of_a_square(side=1):
    return round((2 * (side**2)) ** 0.5, 2)

def perimeter_of_a_triangle(a=3, b=4, c=5):
    return a + b + c

def area_of_a_triangle(a=3, b=4, c=5):
    s = (perimeter_of_a_triangle(a, b, c) * 1/2)
    return round(math.sqrt(s * (s - a) * (s - b) * (s - c)), 2)
    
