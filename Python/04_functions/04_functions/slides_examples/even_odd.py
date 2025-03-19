def is_even(num):
    """
    Input: num, a positive int
    Returns True if num is even and False otherwise
    """
    return num % 2 == 0

# calling is_even() function and passing positive integers
print(5, "is even is", is_even(5))
print(510, "is even is", is_even(510))
print(101, "is even is", is_even(101))
print(13, "is even is", is_even(13))

# calling is_even() function to check if a number is odd by using not operator
print()
print(7, "is odd is", not is_even(7))
print(14, "is odd is", not is_even(14))
print(21, "is odd is", not is_even(21))
