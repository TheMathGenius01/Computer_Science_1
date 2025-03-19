# demonstration of format_spec with numbers
# the grammer is
# format_spec     ::=  [[fill]align][sign][#][0][width][grouping_option][.precision][type]

print("'d': {:12d}".format(100))
print("'e': {:12.3e}".format(299792458))
print("'f': {:12.3f}".format(3.1415))
print("'f': {:12.4f}".format(3.14159))
print("'g': {:12g}".format(3.14159))
print("'+': {:+12d}".format(1000000))
print("'-': {:-12d}".format(-1000000))
print("',': {:12,}".format(1000000))
print("'%': {:12.1%}".format(3.9 / 4))
