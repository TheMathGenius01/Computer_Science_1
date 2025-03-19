# demonstration of format_spec using alignment
# the grammer is
# format_spec     ::=  [[fill]align][sign][#][0][width][grouping_option][.precision][type]

print("{:<12}".format("left"), end = "!\n")
print("{:>12}".format("right"), end = "!\n")
print("{:^12}".format("center"), end = "!\n")
print("{:*^12}".format("center"), end = "!\n\n")

print("{:^30}\n".format("__________"*3))
print("{:^10}{:^10}{:^10}".format("CS_1k", "CS_2k", "CS_3k"))
print("{:^30}\n".format("__________"*3))
print("{:^10}{:^10}{:^10}".format("4th", "1st", "2nd"))
print("{:^10}{:^10}".format("6th", "4th"))
print("{:^10}".format("7th"))

