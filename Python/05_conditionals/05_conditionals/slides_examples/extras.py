def is_a_bigger_than_b_wrong_way(a, b):
    if a > b:
        return True
    else:
        return False

def is_a_bigger_than_b(a, b):
    return a > b

print(is_a_bigger_than_b_wrong_way(4,2))
print(is_a_bigger_than_b(4,2))

flag = True
if flag == True:
    print("wrong way")
if flag:
    print("right way")
flag = False
if flag == False:
    print("wrong way")
if not flag:
    print("right way")

day = "Monday"
hour = 9

# and has higher precedence so use parentheses when grouping or's
# you may use parentheses to break a long expression into multiple lines
if ((day == "Monday" or day == "Wednesday"
  or day == "Saturday" or day == "Sunday")
  and hour >= 8 and hour <= 20):
    print("Pool open!")
