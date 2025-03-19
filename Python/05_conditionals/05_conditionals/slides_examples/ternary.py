"""
Conditional expressions or ternary operators allow the if else
construct to be all on one line. This is very useful and typically makes
your code easier to read.
"""

# format
# [value_on_true] if [expression] else [value_on_false]

age = 50
discount = 5 if age < 55 else 10
print(discount)


a, b = 80, 90
max_score = a if a > b else b
print(max_score)

# can be nested as well but can be difficult to read if taken too far
check = "is equal to" if a == b else "is greater than" if a > b else "is less than"
print(a, check, b)


day = "Sat"
print("Weekend" if day == "Sat" or day == "Sun" else "Weekday")
