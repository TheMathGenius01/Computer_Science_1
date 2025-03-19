# demonstration of the str.format() method using positional arguments

# the positions of the values are zero-index based
# you will get an error if you access an index that is out of range

s = "{0}/{1}/{2}"
print(s.format("a","b","c"))
 
s = "{2}/{1}/{0}"
print(s.format("a","b","c"))
 
# not all values have to be used
s = "{0}/{0}/{0}"
print(s.format("a","b","c"))

# you have to choose one way and can't mix
# cannot switch from manual field specification to automatic field numbering
# uncomment to see the error
# print("{0}{}{2}".format(1,2,3))


