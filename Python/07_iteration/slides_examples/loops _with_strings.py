s = "I love strings"

# forwards
for i in range(len(s)):
    print(s[i], end = " ")
print("\n")

# alternatively going forward
for ch in s:
    print(ch, end = " ")
print("\n")

# now backwards
for i in range(len(s) -1, -1, -1):
    print(s[i], end = " ")
print("\n")

# to make a new string that is backwards can be done several ways
# 1 approach
backwards_s = ""
for i in range(len(s) -1, -1, -1):
    backwards_s += s[i]
print(backwards_s + "\n")

# 2nd approach
backwards_s = ""
for i in range(len(s)):
    backwards_s = s[i] + backwards_s
print(backwards_s + "\n")

#printing every other character
for i in range(0, len(s),2):
    print(s[i], end = "")
print()

# or with slicing
print(s[::2])

# breaking up a string with split
for word in s.split(" "):
    print(word, end = "--")
print()

# stops after splitting twice
for word in "pears#plums#berries#apples#grapes".split("#", 2):
    print(word, end = " ")

