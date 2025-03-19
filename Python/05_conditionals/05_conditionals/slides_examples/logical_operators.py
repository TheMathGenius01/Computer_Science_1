a = 4
print(a > 0 and a < 10) # outs True

a = 20
print(a > 0 and 10) # outs True b/c 20 > 0 and 10 is not zero
print(bool(10))     # outs True
print()

n = 111201
print(n % 2 == 0 or n % 3 == 0)  # outs True - sum of digits is divible by 3 is a shortcut 1+1+1+2+0+1 = 6 and 6%2==0

weather = "sunny"
temp = 33
if temp < 50 or weather == "rain":
    print("Wear a jacket")

# the if statement above is equivalent to the one below

if not(temp >= 50 and weather != "rain"):
    print("Wear a jacket")

# demo of short-circuit evaluation
print(True or 3/0)  # the division by zero never happens or a runtime error would occur

day = input("Enter day of week: ")
is_weekend = day == "Saturday" or day == "Sunday"
is_weekday = not is_weekend
if is_weekday:
    print("Can't play golf")

print(is_weekend == (not (day != "Saturday" and day != "Sunday"))) # always outs True

"""
DeMorgan's law
not(A and B) is equivalent to not A or not B
not(A or B) is equivalent to not A and not B

notice how the operator switched from and to or and or to and
this should make sense as to why but can be proven easily with a truth table
not(A and B) has the same output as not A or not B

A | B | A and B | not(A and B) | not A | not B | not A or not B
1   1      1            0          0        0           0
1   0      0            1          0        1           1
0   1      0            1          1        0           1
0   0      0            1          1        1           1

"""


    
    
