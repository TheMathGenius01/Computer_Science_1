# Name:    numbers_project.py
# Date:    11/30/23
# Author:  Parth Zanwar
# Purpose: Practice using iteration to implement basic algorithms solve various mathematical functions.


def digits(num=212):
    """
    Takes a positive integer(num) and returns a string representing
    the number with 1 space between each digit.

    Keyword arguments:
    n -- positive int (default 212)

    Returns:
    str -- the string representation of the digits

    hint:
    use a while loop
    get the rightmost digit with mod 10
    chop off the rightmost digit by dividing by 10

    digits(12345) -> returns '1 2 3 4 5'
    """
    #todo
    result = ""
    while num > 0:
        right_d = num % 10
        result = str(right_d) + " " + result
        num //= 10

    return result


def gcd(a, b):
    """
    The greatest common divisor (GCD) of two positive integers is the
    largest positive integer that divides each of the integers. For
    example, the GCD of 8 and 12 is 4.

    Keyword arguments:
    a -- int
    b -- int

    Returns:
    int -- the gcd of a and b

    Start at the smaller of the two numbers.
    Are they both divisible by that number?
    If yes, you're done and return the value.
    Otherwise, try one less and repeat.
    """
    #todo
    while b != 0:
        a, b = b, a % b
    if a < 0:
        a = a * -1
    return a
        

def lcm(a, b):
    """
    Calculate the least common multiple.
    The lcm(a,b) is the smallest positive integer that is
    divible by both a and b. This method is undefined and
    returns None if a or b is equal to zero.

    Keyword arguments:
    a -- int
    b -- int

    Returns:
    int -- the lcm of a and b
    None -- if a or b is equal to zero
    """
    #todo
    if a == 0 or b == 0:
        return None
    top = (a*b)
    if top < 0:
        top = top * -1
    bottom = gcd(a, b)

    return top // bottom
    

def is_prime(num):
    """
    A prime number is a whole number greater than one and is only divisible by 1 and itself.
    Returns True if num is prime and False otherwise.

    Keyword arguments:
    num -- int

    Returns:
    bool -- true if prime and false otherwise
    
    """
    #todo
    if num == 1:
        return False
    for i in range(2, 100):
        if num % i == 0 and i != 1 and i != num:
            return False
    return True

def prime_factorization(num):
    """

    Every integer can be expressed as a product of primes.
    Prime factorization is the process of factoring a number
    in terms of prime numbers.

    Prime factorization is an important component of
    cryptography and data encryption.

    Keyword arguments:
    num -- positive int

    Returns:
    str -- the prime factorization formatted correctly

    13 -> returns '13' as 13 is already prime
    10 -> returns '2*5' as 2*5 == 10
    20 -> returns '2^2*5' as 2*2*5 == 20
    75 -> returns '3*5^2' as 3*5*5 == 75

    hint:
    keep dividing num by prime factors(start w/ 2) until it becomes 1

    *this is the most challenging problem
    """
    #todo
    result = ""
    divisor = 2
    while num > 1:
        count = 0
        while num % divisor == 0:
            count += 1
            num //= divisor
        if count > 0:
            if result:
                result += "*"
            if count == 1:
                result += str(divisor)
            else:
                result += f"{divisor}^{count}"
        divisor += 1
    return result


    
def is_perfect(num):
    """
    A perfect number is a positive integer that is equal to the sum of its proper divisors.
    The smallest perfect number is 6, which is the sum of 1, 2, and 3.
    Other perfect numbers are 28, 496, and 8,128.
    Returns True if num is perfect and False otherwise.

    Keyword arguments:
    num -- int

    Returns:
    bool -- true if perfect and false otherwise
    
    """
    #todo
    comp = 0
    for i in range(1, num):
        if num % i == 0:
            comp += i
    return comp == num
    
def first_4_perfect_numbers():
    """
    Returns the first 4 perfect numbers(6 is the first one) as a string.
    Place 1 space between each number.
    """
    #todo
    strn = ""
    for i in range(6, 8196):
        if is_perfect(i):
            strn += str(i) + " "
    return strn

def is_odious(num):
    """
    -- NOT ALLOWED TO USE COUNT - MUST USE A LOOP
    In number theory, an odious number is a non-negative integer that has an odd number of 1s in its binary expansion.
    The bin() function will convert from a decimal value to its corresponding binary value as a string.

    110 which is the number 6 is not odious
    1010 which is the number 10 is not odious
    111 which is the number 7 is is odious

    Keyword arguments:
    num -- int

    Returns:
    bool -- True if odious and False otherwise
    """
    #todo
    binned = bin(num)
    one = 0
    for i in binned:
        if i == "1":
            one += 1
    return one % 2 == 1


def is_evil(num):
    """
    -- NOT ALLOWED TO USE COUNT
    In number theory, an evil number is a non-negative integer that has an even number of 1s in its binary expansion.
    The bin() function will convert from a decimal value to its corresponding binary value.

    Keyword arguments:
    num -- int

    Returns:
    bool -- True if evil and False otherwise
    """
    #todo
    binned = bin(num)
    one = 0
    for i in binned:
        if i == "1":
            one += 1
    return one % 2 == 0


def power(base, exponent):
    """
    --DO NOT USE ** OR THE MATH MODULE - MUST USE A LOOP
    The power (or exponent) of a number says how many times to use the number in a multiplication.
    power(3, 5) is 3 * 3 * 3 * 3
    Code this with a loop and an accumulator.
    Returns the base to the power of the exponent.

    Keyword arguments:
    base -- real
    exponent -- int
    """
    #todo
    new_num = 1      
    for i in range(abs(exponent)):
        if exponent < 0:
            new_num /= base
        else:
            new_num *= base
    return new_num

dash = 75 * "-"
def test_digits():
    print(dash)
    print("Testing digits(num) function!\n")
    print(digits(123456789))
    print()
    print(digits(246810))
    print()
    print(digits(111122233344455566677788999))
    print("\n")

def test_gcd():
    print(dash)
    str = "{:13}{}{}"
    print("Testing gcd(a, b) function!\n")
    print(str.format("gcd(10, 5)"," = ", gcd(10, 5)))
    print(str.format("gcd(128, 96)"," = ", gcd(128, 96)))
    print(str.format("gcd(90, 20)"," = ", gcd(90, 20)))
    print(str.format("gcd(1203, 18)"," = ", gcd(1203, 18)))
    print(str.format("gcd(-13, 48)"," = ", gcd(-13, 48)))
    print(str.format("gcd(50, 75)"," = ", gcd(50, 75)))
    print()

def test_lcm():
    print(dash)
    str = "{:13}{}{}"
    print("Testing lcm(a, b) function!\n")
    print(str.format("lcm(10, 5)"," = ", lcm(10, 5)))
    print(str.format("lcm(128, 96)"," = ", lcm(128, 96)))
    print(str.format("lcm(90, 20)"," = ", lcm(90, 20)))
    print(str.format("lcm(1203, 18)"," = ", lcm(1203, 18)))
    print(str.format("lcm(-13, 48)"," = ", lcm(-13, 48)))
    print(str.format("lcm(50, 75)"," = ", lcm(50, 75)))
    print()

def test_is_prime():
    print(dash)
    print("Testing is_prime(num) function!\n")
    loop(100, is_prime)
    print("\n")

def test_first_4_perfect_numbers():
    print(dash)
    print("Testing first_4_perfect_numbers() function!\n")
    print(first_4_perfect_numbers())
    print("\n")

def test_is_odious():
    print(dash)
    print("Testing is_odious(num) function!\n")
    loop(40, is_odious)
    print("\n")

def test_is_evil():
    print(dash)
    print("Testing is_evil(num) function!\n")
    loop(40, is_evil)
    print("\n")

def test_power():
    print(dash)
    print("Testing power(base, exp) function!\n")
    print("power(3, 5)  =", power(3, 5))
    print("power(2, 10) =", power(2, 10))
    print("power(4, -3) =", power(4, -3))
    print("power(7, -2) =", power(7, -2))
    print("power(8, 5)  =", power(8, 5))
    print("power(10, 9) =", power(10, 9))
    print("power(2, 32) =", power(2, 32))
    print("power(2, 64) =", power(2, 64))

def test_prime_factorization():
    print(dash)
    print("Testing prime_factorization(num) function!\n")
    for i in range(2, 50):
        print("{:2d} ==".format(i), prime_factorization(i))
    google = 10**100
    print("google ==", prime_factorization(google))  

def loop(n, f):
    for i in range(n):
        if f(i):
            print(i, end = " ")


def main():
    # uncomment to test
    test_digits()
    test_gcd()
    test_lcm()
    test_is_prime()
    test_first_4_perfect_numbers()
    test_is_odious()
    test_is_evil()
    test_power()
    test_prime_factorization()
    pass  # just a placeholder
    

main()


