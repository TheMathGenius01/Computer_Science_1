"""
Flag variable is used as a signal in programming to let the
program know that a certain condition has met. It usually acts
as a boolean variable indicating a condition to be either true or false.
"""

flag = False
let_grade = "F"

grade = int(input("Enter your test grade: "))
if grade >= 90:
    flag = True
    let_grade = "A"
elif grade >= 80:
    flag = True
    let_grade = "B"
elif grade >= 70:
    flag = True
    let_grade = "C"
elif grade >= 60:
    flag = True
    let_grade = "D"

if flag:
    print("Passing with a", let_grade)
else:
    print("Failing with a", let_grade)

print()

flag = True
num = int(input("Enter a number: "))

# code to check if a positive number is prime
for i in range(2, num):
    if num % i == 0:
        flag = False
        break
if flag:
    print(num, "is prime")
else:
    print(num, "is not prime")

