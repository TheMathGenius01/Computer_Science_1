temp = float(input("What is the temperature? "))
print(temp, end = " degrees -> its ")
if temp >90:
    print("hot outside")
elif temp > 80:
    print("nice outside")
elif temp > 70:
    print("really nice outside")
else:
    print("below 70")
print()


num = float(input("enter a number "))
if num > 0:
    print("positive")
elif num == 0:
    print("zero")
else:
    print("negative")

print()

if num >= -10 and num <= 10:
    print("Success")

grade = int(input("Enter your test grade: "))
if grade >= 90:
    print("A")
elif grade >= 80:
    print("B")
elif grade >= 70:
    print("C")
elif grade >= 60:
    print("D")
else:
    print("F")



