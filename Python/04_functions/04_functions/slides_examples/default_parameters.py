# This illustrates using default vaules in method declaration

def print_many(str, n = 1):
    print(str * n)

# invoke print_many using default value of 1
print_many("Astros!")
print()

# invoke print_many passing a string and int argument
print_many("Astros!", 4)
print()

# invoke print_many by specifying a default value
print_many(str = "Astros win!", n = 2)
print()

# illustating the order doesn't matter when specifying default values
print_many(n = 6, str = "Astros win!")
print()
