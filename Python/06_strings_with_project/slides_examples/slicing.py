# illustrates string slicing

#       01234567
#      -8     -1
name = "P. Diddy"
print(name[-1])     # outs y
print(name[3:6])    # outs Did
print(name[3:6])    # outs Did
print(name[3:])     # outs Diddy
print(name[:-2])    # outs Diddy
print(name[-8:-6])  # outs P.
print(name[-2:2])   # invalid range; outs "" -> empty string
print(name[9:6])    # invalid range; outs "" -> empty string
print(name[-5:5])   # outs Di
print("abcdefghijklmnopqrstuvwxyz"[0:26:2]) #increments/steps by 2
print("0123456789"[::3])                    #increments/steps by 3
print("0123456789"[::-3])

print()

s = "Comp Sci"
print(s[-1]) 
print(s[5:20]) 
print(len(s[13:15]))
print(len(s[-10:-12])) # invalid slices return an empty string ''
print(s[0])
print(s[8])   # this will cause the code to crash; Indexing - indexes must be valid

