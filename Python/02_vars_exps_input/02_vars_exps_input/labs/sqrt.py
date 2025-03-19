import math

'''
This program was made by Parth Zanwar to calculate the square root
of the absolute value of the number. As a bonus, I have included a
piece of code that will terminate the program when a person types in
quit, stop, or break
'''

x=0
while x<1:
    number = input("Enter a number:")
    if (number == "quit" or number == "stop" or number == "break"):
        break
    else:
        print(math.sqrt(math.fabs(int(number))))

    
    
