'''
Program created by Parth Zanwar on 9/4/23
This program takes the input from the user for two numbers
This program will output those two numbers added, subtracted,
multiplied, divison, integer division, and modulus of those two numbers
'''

first_number = int(float(input("Enter a float value:")))
last_number = int(float(input("Enter a float value:")))

if (last_number == 0):
    print("\nResult of addition: " + str(first_number + last_number))
    print("Result of subtraction: " + str(first_number - last_number))
    print("Result of multiplication: " + str(first_number * last_number))
    print("Result of division: 0")
    print("Result of integer division: 0")
    print("Result of modulus: 0")

else:
    print("\nResult of addition: " + str(first_number + last_number))
    print("Result of subtraction: " + str(first_number - last_number))
    print("Result of multiplication: " + str(first_number * last_number))
    print("Result of division: " + str(first_number / last_number))
    print("Result of integer division: " + str(first_number // last_number))
    print("Result of modulus: " + str(first_number % last_number))
