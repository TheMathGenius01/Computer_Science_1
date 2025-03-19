def cleaner(user_input):
    user_input = user_input.replace(" ", "").replace("\n", "").replace("\t", "")
    user_input = user_input.lower()

    # Remove non-alphanumeric characters
    cleaned_input = ""
    for char in user_input:
        if char.isalnum():
            cleaned_input += char
    return cleaned_input

stop = True
while stop:
    user_input = input("Enter word (quit to stop): ")
    if user_input == "quit":
        break
    cleaned_input = cleaner(user_input)

    print("Palindrome!\n" if cleaned_input[::-1] == cleaned_input else "NOT a palindrome!\n")
