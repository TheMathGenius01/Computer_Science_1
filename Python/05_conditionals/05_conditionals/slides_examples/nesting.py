grade = int(input("Enter grade: "))
absences = int(input("Enter absences: "))

if grade >= 80:
    if absences <= 3:
        print("Exempt from final.")
    else:
        print("Must have 3 or less absences to exempt the final.")
else:
    print("Must have a B at minimum to exempt the final.")



# code using a logical operator is easier to read and understand.

if grade >= 80 and absences <= 3:
    print("Exempt from final.")
elif grade < 80 and absences > 3:
    print("Too many absences and grade too low to exempt the final.")
elif grade < 80:
    print("Must have a B at minimum to exempt the final.")
else:
    print("Must have 3 or less absences to exempt the final.")
