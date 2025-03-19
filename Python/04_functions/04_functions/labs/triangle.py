'''
This program was created by Parth Zanwar
This program will take the length of one side of a equilateral triangle
This program will output the area of that equilateral triangle
'''
import math


def area(side=1):
    area = (side**2)*math.sqrt(3)
    area /= 4
    area = round(area, 2)
    return print("An equilateral triangle with side length " + str(side) + " has an area of " + str(area) + ".")

def main():
    area(5)    
    area(3)
    area(6)
    area(4)
    area(13)
    area()
    area(37)

if __name__ == "__main__":
    main()
