'''
This program was created by Parth Zanwar on 9/12/23
This program will take a name, 2 adjectives, an adverb,
2 foods, a noun, a place, and a verb, and output them
into three silly chunks.
'''
print("Let's play Silly Sentences!\n")

name = input("Enter a name: ")
adjective1 = input("Enter an adjective: ")
adjective2 = input("Enter an adjective: ")
adverb = input("Enter an adverb: ")
food1 = input("Enter a food: ")
food2 = input("Enter another food: ")
noun = input("Enter a noun: ")
place = input("Enter a place: ")
verb = input("Enter a verb: ")

print("\n" + name, "was planning a dream vaction to", place + ".")
print(name, "was especially looking forward to trying the local")
print("cuisine, including", adjective1, food1, "and", food2, end=".\n\n")
print(name, "will have to practice the language" , adverb, "to")
print("make it easier to", verb, "with people.", end="\n\n")
print(name, "has a long list of sights to see, including the")
print(noun, "museum and the", adjective2, "park.")
