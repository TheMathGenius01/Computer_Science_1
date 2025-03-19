done = False
while not done:
    answer = input("Please enter your age: ")
    if answer.isdigit():
        done = True
    else:
        print("Invalid response. Must be a number.")
age = int(answer)

# same thing with a slightly different structure

answer = input("Please enter your weight: ")
while not answer.isdigit():
    print("Invalid response. Must be a whole number.")
    answer = input("Please enter your weight: ")
wt = int(answer)
