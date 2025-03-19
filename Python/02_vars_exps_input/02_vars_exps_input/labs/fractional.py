import math

'''
This program was created by Parth Zanwar on 9/4/23
This program take input and only display the decimal portion of the number
'''

x=0
while x<1:
    original_number = input("Enter a number:")
    if (original_number == "quit"):
        print("Thank you for using this program")
        break
    else:
        absolute_value = math.fabs(float(original_number))
        numbers_before_decimal = absolute_value//1
        decimal_portion = absolute_value - numbers_before_decimal
        print(decimal_portion)
