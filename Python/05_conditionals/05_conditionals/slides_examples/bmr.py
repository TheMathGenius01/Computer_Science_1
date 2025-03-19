# This program finds the basal metabolic rate (BMR) for two
# individuals. This variation includes several functions
# other than main.

# Introduces the program to the user.
def give_intro():
    print("This program reads data for two")
    print("people and computes their basal")
    print("metabolic rate and burn rate.")
    print()

# Reads input and calculates BMR for one person.
# Returns the BMR.
def read_information(person):
    print("Enter person", person, "information:")
    height = float(input("height (in inches)? "))
    weight = float(input("weight (in pounds)? "))
    age = float(input("age (in years)? "))
    sex = input("sex (male or female)? ")
    print()
    bmr = compute_bmr(height, weight, age, sex)
    return bmr

# This function contains the basal metabolic rate formula for
# converting the given height (in inches), weight
# (in pounds), age (in years) and sex (male or female) into a BMR
def compute_bmr(height, weight, age, sex):
    bmr = 4.54545 * weight + 15.875 * height - 5 * age
    if sex.lower() == "male":
        bmr += 5
    else:
        bmr -= 161
    return bmr

# Reports the overall BMR values and status for two people.
def report_results(bmr1, bmr2):
    print("Person #1 basal metabolic rate =", round(bmr1, 1))
    report_status(bmr1)
    print("Person #2 basal metabolic rate =", round(bmr2, 1))
    report_status(bmr2)

# Reports the burn rate for the given BMR value.
def report_status(bmr):
    if bmr < 1200:
        print("low resting burn rate");
    elif bmr <= 2000:
        print("moderate resting burn rate")
    else: # bmr > 2000
        print("high resting burn rate")

def main():
    give_intro()
    bmr1 = read_information(1)
    bmr2 = read_information(2)
    report_results(bmr1, bmr2)

main()
