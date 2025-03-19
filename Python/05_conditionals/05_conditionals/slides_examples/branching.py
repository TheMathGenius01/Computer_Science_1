#branching

grade = int(input("Enter your test grade: "))

# single if with no else or default
if grade < 70:
    print("A " + str(grade) + " is really low.")
    print("You need to study more.")
    print("And retake the test!")

# 2 choices with if/else
if grade < 70:
    print("Failed")
else:
    print("Passed")

gpa = int(input("Enter your overall gpa: "))

# 3 choices with if/elif/else structure
# note the else is not required in this control structure
if gpa > 5.0:
    print("Accepted.")
elif gpa > 2.0:
    print("Perhaps try a community college.")
else:
    print("Denied.")

print()

    
