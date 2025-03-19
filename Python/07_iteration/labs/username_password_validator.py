# Name: Parth zanwar
# Date: 11/10/23

def is_valid_username(name):
    """
    Indicates to user via print if the name is an invalid length and
    whether it has invalid characters.

    Returns True if name is valid and False otherwise

    """
    if len(name) < 6 or len(name) > 12:
        print("Invalid length; Username must be 6-12 characters long.")        
    for i in range(len(name)):
        if name[i] in "!@#$%^&* ":
            print("Invalid characters: Username must be lowercase a-z and/or underscores.")
            return False
        if name[i].isupper():
            print("Invalid characters: Username must be lowercase a-z and/or underscores.")
            return False
        if name[i].isdigit():
            print("Invalid characters: Username must be lowercase a-z and/or underscores.")
            return False
    return len(name) >= 6 and len(name) <= 12

def is_valid_password(pwd):
    """
    Indicates to user via print if the pwd is an invalid by length and
    whether is is missing a number, letter or special symbol.
    
    Returns True if pwd is valid and False otherwise.
    
    """
    #todo
    # Check the length of the password
    count = 0
    if len(pwd) < 8 or len(pwd) > 12:
        print("Invalid length; Password must be 8-12 characters long.")
    else:
        count+=1
        
    valid_characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*"
    has_letter = False
    has_number = False
    has_special_char = False

    for char in pwd:
        if char.isalpha():  # Check for letters
            has_letter = True
        elif char.isdigit():  # Check for numbers
            has_number = True
        elif char in "!@#$%^&*":  # Check for special characters
            has_special_char = True


        if has_letter and has_number and has_special_char:
            count+=1
            break

    if not has_letter or not has_number or not has_special_char:
        print("Password must have at least one umber, letter a-z and special symbols")

    var = 0
    for char in pwd:
        if char not in valid_characters:
            print("Invalid characters: Password must be letters, digits, and special symbols")
        else:
            var+=1
    if var == len(pwd):
        count +=1

    if count == 3:
        return True
    return False
    
        
        
def get_username():
    """
    Repeatedly prompts the user until a valid username is provided
    Returns (str): the valid username
    """
    #todo
    usna = input("Please enter a username: ")
    while True:
        if not is_valid_username(usna):
                usna = input("\nPlease enter a username: ")
        else:
            break
    return usna
def get_password():
    """
    Repeatedly prompts the user until a valid password is provided
    Returns (str): the valid password
    """
    #todo
    pwd = input("\nPlease enter a password: ")
    while True:
        if not is_valid_password(pwd):
            pwd = input("\nPlease enter a password: ")
        else:
            break
    return pwd
if __name__ == "__main__":
    username = get_username()
    print()
    password = get_password()
    print()
    print("Username:", username)
    print("Password:", password)
