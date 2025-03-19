# read 2 names from the user
name_1 = input("Enter first name: ")
name_2 = input("Enter second name: ")

# read 2 scores from user
earnings_1 = int(input("Enter " + name_1 + "'s earnings: "))
earnings_2 = int(input("Enter " + name_2 + "'s earnings: "))

# display data 
print("\n\tEarnings")
print(name_1 + " = $" + str(earnings_1) + " million")
print(name_2 + " = $" + str(earnings_2) + " million")
