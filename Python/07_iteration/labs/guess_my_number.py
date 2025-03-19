
print("Please think of a integer between 0 and 100!")
print("I will guess it in 7 choices or less.")
print("Enter 'h' to indicate the guess is too high.")
print("Enter 'l' to indicate the guess is too low.")
print("Enter 'c' to indicate I guessed correctly.\n\n")
print("Is your secret number 50?")
gc = 0
high = 100
low = 0
gv = input("Enter h, l, or c: ")


if gv == "l":
    low = 51
    while gc < 8:
        if low > high:
            print("You cheater, I hate you!")
            break
        num = (low+high)//2
        print(f"Is your secret number {num}?")
        gv = input("Enter h, l, or c: ")
        if gv == "h":
            high = num - 1
            gc += 1
        elif gv == "l":
            low = num + 1
            gc+=1
        elif gv == "c":
            print(f"Game over. Your secret number was {num}")
            break
            

elif gv == "h":
    high = 49
    while gc < 8:
        if low > high:
            print("You cheater, I hate you!")
            break
        num = (low+high)//2
        print(f"Is your secret number {num}?")
        gv = input("Enter h, l, or c: ")
        if gv == "h":
            high = num - 1
            gc += 1
        elif gv == "l":
            low = num + 1
            gc+=1
        elif gv == "c":
            print(f"Game over. Your secret number was {num}")
            break

if gc > 8:
    print("You cheater, I hate you!")


    
        
    
    
