for i in range(10):
    print(i, end = " ")
print("\n")

for i in range(5,10,2):
    print(i, end = " ")
print("\n")

for i in range(20, 6, -3):
    print(i, end = " ")
print("\n")

for ch in "3 weeks till X-mas":
    print(ch, end = " ")
print("\n")

for val in [1,2,3,4,5]:
    print(val, end = " ")
print("\n")

str = "aieghsdlkfj"
spot = 0
while str[spot] in "aeiou":
    spot += 1
print(str[spot], spot)
print("\n")

done = False
total = 0
while not done:
    num = int(input("Enter a number(0 to quit): "))
    if num != 0:
        total += num
    else:
        done = True
print(total)
    
