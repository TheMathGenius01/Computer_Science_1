list = ["raf", "leo", "don", "mike"]
for name in list:
    print(name)

for name in list:
    name = "joe"    #changing a copy doesn't change the item in the list
print(list)

for ch in "paradigm":
    print(ch, end = " ")
