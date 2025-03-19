'''
This program was created by Parth Zanwar
This program will calculate the number of buses needed for n amount of people
THis program will output that number back to the user
'''
def num_buses(n):
    if n >= 0:   
        n = int(n)
        buses_needed = n // 50
    
        if n % 50 != 0:
            buses_needed += 1
    
        return buses_needed
    
    else:
        return print("No people need buses")
