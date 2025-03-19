# import the random module and bind to a local name (r) for brevity
import random as r

"""
random() returns a pseudorandom number from 0 inclusive to 1 exclusive
(0, 1]
"""
def using_random():
    print(r.random())               # [0, 1)
    print(r.random() * 10)          # [0, 10)

    """
    multiply by the range of numbers and cast to an int
    add or subtract to the starting point
    """
    print(int(r.random() * 10))     # 0,1,2,3,4,5,6,7,8,or 9
    print(int(r.random() * 5) + 10) # 10,11,12,13,or 14
    print()

"""
useful for returning a range of integers
random.randrange(stop) -> from 0 to stop or [0, stop) inclusive, exclusive
random.randrange(start, stop[, step]) -> [start, stop)
"""
def using_rand_range():
    print(r.randrange(10))          # 0,1,2,3,4,5,6,7,8,or 9
    print(r.randrange(5, 10))       # 5,6,7,8,or 9
    print(r.randrange(20, 30, 2))   # 20,22,24,26,or 28
    print()

# random.randint(a, b)
# return a random integer N such that a <= N <= b or [a, b].
# alias for randrange(a, b+1).
def using_randint():
    print(r.randint(5, 14))     #5,6,7,8,9,10,11,12,13,14
    print(r.randint(1, 10))     #1,2,3,4,5,6,7,8,9,10
    print()

"""
random.choice(seq)
return a random element from the non-empty sequence seq.
if seq is empty, raises IndexError.
"""
def using_choice():
    print(r.choice("aeiou"))    # returns a random letter from the sequence
    my_tuple = (4,5,6,7)        # tuple is just an immutable list
    print(r.choice(my_tuple))   # 4,5,6,or 7
    my_list = ["one", "two", "three"]
    print(r.choice(my_list))    # one, two or three
    
#r.seed(10) # uncomment this line to generate the same results
using_random()
using_rand_range()
using_randint()
using_choice()

    
