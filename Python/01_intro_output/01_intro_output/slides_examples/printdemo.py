# Short demo of the print function

print("a","b",'c', 1, 2, 3, 4, end = ', ')

print(5,6,7, sep = ', ')    # by default sep is binded to " " (a str containing a single space)

print("\thi")               # tab is set to groups of 8

print("abc\thi")            # prints abc then tab produces 5 spaces(3+5 is 8)

print("\"quotes\"")         # \" is an escape sequence to tell the interpreter that
                            # you don't want to end the string but include the quote
                            
print("'quotes'")           # since the quotes are different you don't need an escape sequence
                            # but you could still use it

print()
print('Python lets you declare Strings with single or double quotes.')
print("I recommend always using double quotes.")
print("Either way, you should be consistent and not mix them in your code.")

"""
this is
a
multiline comment
the interpreter skips everything betweeen
the triple quotes
"""
