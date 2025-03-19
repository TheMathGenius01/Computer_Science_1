# demonstration of format_spec with width
# the grammer is
# format_spec     ::=  [[fill]align][sign][#][0][width][grouping_option][.precision][type]

# sets the width to a minimum of 5 and is left aligned by default for most objects but right aligned for numbers
s = "{:5}{:5}{:5}"
print(s.format(1, 2, 3), end ="|\n")
print(s.format("a","b","c"), end ="|\n")

# width won't truncate longer strings
print(s.format("abcdefg","b","c"), end ="|\n")

# add a dot . to set the maximum
s = "{:5.5}{:5}{:5}"
print(s.format("abcdefg","b","c"), end ="|\n")

# same as above but specifying position
s = "{1:5.5}{1:5}{2:5}"
print(s.format("abcdefg","b","c"), end ="|\n")




