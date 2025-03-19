#examples from slides

for i in range(6):
    for j in range(6):      # range(stop) starts at zero and ends just prior to stop -> stop is exclusive
        print("*", end=" ")
    print()

for i in range(6):
    for j in range(6):
        print("(", i, ",", j,")", end="", sep="")
    print()

for i in range(1,6):        # range(start, stop) iteration begins at start and ends just prior to stop(ie stop is exclusive)
    for j in range(i):
        print("$", end="")
    print()

print()

for i in range(5,0,-1):     # range(start, stop, step) where stop is exclusive
    for j in range(i):
        print("$", end="")
    print()
    
print()
for i in range(5):
    if i==3:
        continue            # continue goes straight to the next iteration
    print(i, end = " ")
print("\n")

print()
for i in range(5):
    if i==3:
        break               # break exits out of the loop
    print(i, end = " ")
print()

