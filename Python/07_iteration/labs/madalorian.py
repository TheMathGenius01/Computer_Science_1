import random

miles_traveled = 0
thirst = 0
dog_tired = 0
drinks_in_canteen = 10
roman_distance = -20
wood_for_fire = 0

print("Brutus,")
print("You have have just helped in killing Julies Caesar")
print("The Roman Legionaries are chasing you down to drink your blood")
print("Survive the run for 300 miles and make sure to farm resources to start your fires")
print("Above all, keep the dog alive and kicking!\n")

while True:
    add_roman_distance = random.randint(7, 13)
    add_miles_traveled_min = random.randint(5, 12)
    add_miles_traveled_max = random.randint(10, 20)
    distance_between_parties = abs(miles_traveled - roman_distance)

    print("\nA. Drink from your canteen.")
    print("B. Ahead moderate speed.")
    print("C. Ahead full speed.")
    print("D. Stop for the night.")
    print("E. Status check.")
    print("F. Get resources")
    print("Q. Quit.\n")
    choice = input("Your choice(A-F or Q): ")
    choice = choice.lower()

    if choice == "a":
        if drinks_in_canteen == 0:
            print("\nError! No drinks available")
        thirst = 0
        if (dog_tired > 0):
            dog_tired -= 1
        drinks_in_canteen -= 1
        roman_distance += add_roman_distance

    elif choice == "b":
        roman_distance += add_roman_distance
        miles_traveled += add_miles_traveled_min
        thirst += 1
        dog_tired += 1
        print(f"\nMiles just traveled: {add_miles_traveled_min}.")

    elif choice == "c":
        roman_distance += add_roman_distance
        miles_traveled += add_miles_traveled_max
        dog_tired += random.randint(1, 3)
        thirst += 1
        print(f"\nMiles just traveled: {add_miles_traveled_max}.")

    elif choice == "d":
        roman_distance += add_roman_distance
        dog_tired = 0
        print("\nYour dog is happy for now, but do you have enough wood?")
        n = random.randint(2, 4)
        if wood_for_fire >= 4:
            print(f"You have used {wood_for_fire} pieces of wood to start a fire")
            wood_for_fire -= n
        else:
            print("Not enough wood\nYour dog is dying because of the cold")
            dog_tired+=2

    elif choice == "e":
        print(f"\nMiles traveled: {miles_traveled}.")
        print(f"Drinks in canteen: {drinks_in_canteen}.")
        print(f"The Romans are {distance_between_parties} miles behind you.")
        print(f"You have {wood_for_fire} pieces of wood.")

    elif choice == "f":
        n = random.randint(0, 6)
        print(f"\nYou have gathered {n} pieces of wood")
        wood_for_fire += n

    elif choice == "q":
        break

    else:
        continue

    if miles_traveled >= 300:
        print("\nYou have made it and get to live another day.")
        break

    if random.randint(1, 20) == 10:
        print("\nYou stumbled along an oasis.")
        thirst = 0
        drinks_in_canteen = 10

    if dog_tired > 8:
        print("\nYou died of grief because your dog just died.")
        break

    elif dog_tired > 5:
        print("\nYour dog is dying.")

    if thirst > 6:
        print("\nYou died of thirst.")
        break

    elif thirst > 4:
        print("\nYou are getting thirsty.")

    if miles_traveled <= roman_distance:
        print("\nThe Roman Legionaries have caught you and have drunk your blood. You died!")
        break

    elif distance_between_parties <= 20:
        print("\nThe Romans are getting close.")
