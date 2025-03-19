# basic demonstration of the str.format() method
 
# using format option in a simple string
print("{} {} {}".format("A","B","C"))
 
str = "Coding in Python is {}"
print(str.format("fun"))
 
# formatting a string using a numeric literal
print ("Python {}".format(3.9))

# values are replaced in order of their entry
# different types my be used
print("Count to {} {} {}".format("one", 2, "three"))

# passing variables
a = 100
b = 90
c = 80
print("{} {} {}".format(a,b,c))

