# demonstration of the str.format() with key=values

s = "Hello {name}"
print(s.format(name="Bob"))

# you can choose values, key=value pairs or a mix of both
s = "My name is {f_name}, I'm {age}"
output = s.format(f_name = "Bryce", age = 42)
print(output)

# key=values must be last (positional arguments can't follow key=values)
s = "My name is {}, I'm {age}"
print(s.format("Bryce", age = 42))

print("The year is {year}".format(year=2021))


# keys may be binded to values that are variables
curr_year = 2021
print("The year is {year}".format(year=curr_year))

