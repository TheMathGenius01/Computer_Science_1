'''
This program was created by Parth Zanwar
This program will take 2 arguments, n and s
N is for number of sides, while s is for the side length
This program will return the polysum of a polygon
'''
import math

def area(n=4, s=1):
    n = int(n)
    s = float(s)
    area = (.25*n*s*s)/math.tan(math.pi/n)
    return area

def perimeter(n, s):
    n = int(n)
    perimeter = n * s
    return perimeter

def polysum(n, s):
    n = int(n)
    s = float(s)
    polygon_area = area(n, s)
    polygon_perimeter = perimeter(n, s)
    polysum = round(polygon_area + polygon_perimeter * polygon_perimeter, 4)
    return print("The polysum of this polygon is " + str(polysum))

def main():
    polysum(49, 79)
    polysum(56, 48)
    polysum(76, 51)
    polysum(26, 56)
    polysum(17, 49)
    polysum(46, 89)
    polysum(55, 84)
    polysum(5, 22)
    polysum(47, 83)
    polysum(28, 5)

if __name__ == "__main__":
    main()
