# single line comments start with a hashtag

# any sequence of character inside double quotes(or single) is  a String object

print("Welcome to CS I K")
print()

"""
Strings are a sequence of characters enclosed in quotations -  "this is a string"

Escape sequences are only applicable inside of Strings!

An escape sequence is a special sequence of characters starting with
a backslash(\) and has a different meaning than the literal characters.
"""

# you must know \t for tab
# default amount is either 4 or 8 depending on IDE and OS
print("Tabs Example")
print()
print("a\tTab1")
print("ab\tTab2")
print("abc\tTab3")
print("abcd\tTab4")
print("a\tb\tc")
print("10\t11\t12")

print()

# you must know \n for new line
print("New Line Example\n")
print("Backslash n moves the cursor\nto the next line")
print("It can be used(skip 2 lines)\n\n\nas many times as you want\n")

# quotations signify the start and end of a String
# to output double quotes and not end a String, use the escape sequence \"
print("Outputting Quotes Example\n")
#print(""Quotes"")   # this is an error "" is the start and end then you have Quotes thrown next to it which is an illegal expression
print("\"Quotes\"")  # outs "Quotes"
print("To ouput quotes, add a backslash")
print("\"Make each day your masterpiece.\" - by John Wooden\n")

# Since backslash(\) indicates the start of an escape sequence, it can't be used literally
# Uncomment the error below. The issue is that we have an unclosed String literal - remember \" prints a " and now the String isn't closed 
#print("\")
print("Backslash Example\n")
print("Outputting a backslash requires 2 backslashes(\\\\)")
print("This file is in the following directory (notice the double backslashes):")
print("E:\\HULETT\\1.introCS_preap\\4_python_pygame\\2020_2021\\slides\\01 intro\n\n")


# practice writing these prior to uncommenting
#print("1\t12\t123\t1234\t12345\t123456\t1234567\t12345678\t12345678")
#print("abcde\tabc\t")
#print("\\hello\nhow\tare \"you\"?\\\\")
#print("\"\\\"")
