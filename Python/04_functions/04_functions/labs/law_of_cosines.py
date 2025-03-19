'''
This program was created by Parth Zanwar
This program will accept the input of two sides and a angle in degrees
This program will then output the area and the length of the third side of the triangle
'''
import math

def area(a, b, C):
    area = 0.5*(int(a) * int(b)) * math.sin(math.radians(int(C)))
    area = round(area, 5)
    return print("Area == {}\n".format(area))

def side_c(a, b, C):
    c = (int(a)**2 + int(b)**2) - 2*int(a)*int(b) * math.cos(math.radians(int(C)))
    c = round(math.sqrt(c))
    return print("\n{0} {1} {2}".format(a, b, c))

def main():
    a1 = input("Enter side a :: ")
    b1 = input("Enter side b :: ")
    angle1 = input("Enter angle C in degrees :: ")
    side_c(a1, b1, angle1)
    area(a1, b1, angle1)
    a2 = input("Enter side a :: ")
    b2 = input("Enter side b :: ")
    angle2 = input("Enter angle C in degrees :: ")
    side_c(a2, b2, angle2)
    area(a2, b2, angle2)
    a3 = input("Enter side a :: ")
    b3 = input("Enter side b :: ")
    angle3 = input("Enter angle C in degrees :: ")
    side_c(a3, b3, angle3)
    area(a3, b3, angle3)

if __name__ == "__main__":
    main()
