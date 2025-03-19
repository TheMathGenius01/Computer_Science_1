"""
Demo to show how to pass mutliple arguments to the print function,
how to change the default behavior of the sep and end parameters,
and how to use the line contiuation character (\).
"""

# notice each argument is separated by a space on the output
print("This","prints","on","one","line.")
print()


# this is legal but not recommended
print("And", "so", "does",
      "this", "even", "though", "it's",
      "on", "three", "lines.")
print()

# this is also legal but not recommended
print("This will continue \
on the same line even though \
it is not.")
print()

# this is preferred
print("This is on ", end = "")
print("the same line ", end = "")
print("by setting then \"end\" ", end = "")
print("parameter to the empty String(\"\").", end = "\n\n")


# you can change end to any sequence of characters
print("Hi", end = '!')

print("There", end = '.\n')

print()


# the sep parameter by default is a space
# you can set sep to any sequence of characters
print("Y","O","L","O\n",  sep = '-')


# long statement - don't worry about the variable x and the expression
x = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
print(x, end = "\n\n")

# using the continuation character \
x = 1 + 2 + 3 + 4 + \
    5 + 6 + 7 + 8 + 9 + 10
print(x, "\n")
print(1,2,3,4)
print(1,2,3,4, sep = "--")
print("The","Python","print","function","is","really versatile", end = "!\n")
