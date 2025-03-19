my_str = "name"
print(my_str)                  # outs name
print(my_str.isalnum())        # outs True
print(my_str.isalpha())        # outs True
print(my_str.isdigit())        # outs False
print(my_str.islower())        # outs True
print(my_str.isspace())        # outs False
print(my_str.isupper())        # outs False
print()

my_str = "1234"
print(my_str.isalnum())        # outs True
print(my_str.isalpha())        # outs False
print(my_str.isdigit())        # outs True
print(my_str.islower())        # outs False -> contains no letters
print(my_str.isspace())        # outs False
print(my_str.isupper())        # outs False -> contains no letters
print()

my_str = "A123"
print(my_str.isalnum())        # outs True
print(my_str.isalpha())        # outs False
print(my_str.isdigit())        # outs False
print(my_str.islower())        # outs False
print(my_str.isspace())        # outs False
print(my_str.isupper())        # outs True
print()

whitespace = "\n\t   \n"
print(whitespace.isspace()) # outs True
print("A \T".isspace())     # outs False
