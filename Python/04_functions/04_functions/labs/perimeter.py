'''
This program was created by Parth Zanwar
This program will have a function that takes two arguments
This program will output the perimeter for the two numbers that were given
'''

def rectangle_perimeter(length=1, width=2):
    perimeter = (2 * int(length)) + (2 * int(width))
    return "The perimeter is :: " + str(perimeter)

def main():
    print(rectangle_perimeter(2, 6))
    print(rectangle_perimeter(12, 5))
    print(rectangle_perimeter(131, 75))
    print(rectangle_perimeter(20, 25))
    print(rectangle_perimeter(9, 256))
    print(rectangle_perimeter())
    print(rectangle_perimeter(36, 72))

if __name__ == "__main__":
    main()
