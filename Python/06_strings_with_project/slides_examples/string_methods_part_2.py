my_str = "HeLlO"
print(my_str)          # outs HeLlO
print(my_str.lower())  # outs hello -> returns a new my_string
print(my_str)          # outs HeLlO -> my_str was never binded to a new my_string
print()

my_str = "\t   \tHELLO"
print(my_str)          # outs HELLO -> w/ 16 spaces in front
my_str = my_str.lstrip()  # binds my_str to a new my_string w/ leading whitespace removed
print(my_str)          # outs HELLO
print()

letters = "aaaaabcdef"
print(letters.lstrip("a"))  # outs bcdef
print(letters)              # outs aaaaabcdef -> letters was never binded to a new my_string


rightmy_strip = "dogmaaaaaaa"
print(rightmy_strip.rstrip("a"))    # outs dogm
word = "abcde1234!"
print(word.upper())                 # outs ABCDE1234!
print(word)                         # outs abcde1234!
word = word.upper()
print(word)                         # outs ABCDE1234!
print()

word = "CoMpUtEr PrOgRamMiNg"
print(word.swapcase())              # outs cOmPuTeR pRoGrAMmInG
print("Hello World".swapcase())     # outs hELLO wORLD
print("learn python".capitalize())  # outs Learn python
print("Hello Wolrd".count("l"))     # outs 3
print("aabaac aa zzaa".count("aa")) # outs 4
print("aabaac aa zzaa".count("Aa")) # outs 0



