'''
This program takes the first name, last name, and age of the user
then returns it back to them, with how old they will be in two years
'''

first_name = input("Please input your first name:")
last_name = input("Please input your last name:")
age = int(input("Please input your age:"))

print("\nYour name is " + last_name + ", " + first_name + ".")
print("You are " + str(age) + " years old.")
print("In 2 years, you'll be " + str(age+2) + " years old.")
print(type(first_name))
print(type(last_name))
print(type(age))
