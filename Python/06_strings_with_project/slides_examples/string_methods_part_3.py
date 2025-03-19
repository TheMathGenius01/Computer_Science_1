s = "123456789"
print(s.endswith("98"))     # outs False
print(s.endswith("89"))     # outs True
print(s.endswith(" 9"))     # outs False
print()

print(s.startswith(""))     # outs True
print(s.startswith("12345678910")) # outs False -> argument length too long
print()

print(s.find("ab"))         # outs -1
print(s.find("3"))          # outs 2
print(s.find("54"))         # outs -1
print(s.find("12"))         # outs 0
print("bcabcdaaaa".find("a")) # outs 2 -> returns location of first occurence
print()

s = "comp_sci"
index = s.find("mp")
print(index)                # outs 2
print(s.find('c'))          # outs 0
print(s.find('x'))          # outs -1
print(s.find('c', 1))       # outs 6
print(s.find('c', 1, 5))    # outs -1
print(s.rfind('c'))         # outs 6
print(s.rfind('cs'))        # outs -1
print()

s = "OOPs"
s.replace("O", "--")
print(s)                        # outs OOPSs -> s was never binded to a new string
s = s.replace("O", "--")
print(s)                        # outs ----Ps
print(s.replace("-", "b", 3))   # outs bbb-Ps
print(s)                        # outs ----Ps
print()

my_str = "This is an example of how to use find"
space = my_str.find(" ")
if space != -1:
    print(my_str[:space])

second_space = my_str.find(" ", space + 1)
if space != -1 and second_space != -1:
    print(my_str[space + 1:second_space])

print(my_str.find("not in sentence"))
print()


# The ‘in’ operator is used to check if a value exists in a sequence or not.

my_str = "Best of both worlds"
word = "both"
print(word in my_str)
print("Best" in my_str)
print("Bests" in my_str)
print("of" not in my_str)
print()

name = input("Enter your name: ")
if name.lower()[0] in "aeiou":
    print("Your name starts with a vowel")

# alternatively
if "aeiou".find(name.lower()[0]) != -1:
    print("Your name starts with a vowel")


