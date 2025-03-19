# Name:    nestedloops_project.py
# Date: 12/1/2023   
# Author:  Parth Zanwar
# Purpose: Practice using nested loops in python.

def rectangle(w, h):
    """returns a string composed of a rectangle of stars/asteriks with h rows and w columns"""
    #todo
    str = ""
    for i in range(h):
        for j in range(w):
            str += "*"
        str += "\n"
    return str

    

def grid_of_numbers(size):
    """
    returns a string of a grid as shown below given a size of 10
    (place 1 space between all numbers)
    
    0 0 0 0 0 0 0 0 0 0
    1 1 1 1 1 1 1 1 1 1
    2 2 2 2 2 2 2 2 2 2
    3 3 3 3 3 3 3 3 3 3
    4 4 4 4 4 4 4 4 4 4
    5 5 5 5 5 5 5 5 5 5
    6 6 6 6 6 6 6 6 6 6
    7 7 7 7 7 7 7 7 7 7
    8 8 8 8 8 8 8 8 8 8
    9 9 9 9 9 9 9 9 9 9
    """
    #todo
    strn = ""
    for i in range(size):
        for j in range(size):
            if i == j:
                    strn += (str(j) + " ") * (size - 1)
                    strn += str(j)
        strn += "\n"
    return strn
    

def staircase(size):
    """
    returns the image below using nested loops given a size(10 below)
    0
    0 1
    0 1 2
    0 1 2 3
    0 1 2 3 4
    0 1 2 3 4 5
    0 1 2 3 4 5 6
    0 1 2 3 4 5 6 7
    0 1 2 3 4 5 6 7 8
    0 1 2 3 4 5 6 7 8 9
    """
    #todo
    strn = ""
    for i in range(size):
        for j in range(i+1):
            if j == i:
                strn += str(j)
                continue
            strn += str(j) + " "
        strn += "\n"
    return strn




def staircase_reflected(size):
    """
    returns the image below using nested loops given a size(10 below)
    0 1 2 3 4 5 6 7 8 9
      0 1 2 3 4 5 6 7 8
        0 1 2 3 4 5 6 7
          0 1 2 3 4 5 6
            0 1 2 3 4 5
              0 1 2 3 4
                0 1 2 3
                  0 1 2
                    0 1
                      0
    """
    #todo
    strn = ""
    space = 0
    for i in range(size):
        for j in range(size - i):
            if j == size - i - 1:
                strn += str(j)
                continue
            strn += str(j) + " "
        strn += "\n"
        space += 2
        if space == size*2:
            continue
        strn += " " * (space)
    return strn

def multiplication_table(size):
    """
    return a multiplication table using nested loops
    "{:4}".format(num) will be helpful for formatting

    Below is an example with size 9(assume 2 <= size <= 31)
    
    1   2   3   4   5   6   7   8   9
    2   4   6   8  10  12  14  16  18
    3   6   9  12  15  18  21  24  27
    4   8  12  16  20  24  28  32  36
    5  10  15  20  25  30  35  40  45
    6  12  18  24  30  36  42  48  54
    7  14  21  28  35  42  49  56  63
    8  16  24  32  40  48  56  64  72
    9  18  27  36  45  54  63  72  81
    """
    #todo
    strn = ""
    for i in range(1, size+1):
        for j in range(i, i*size+1, i):
            strn += "{:4}".format(j)
        strn += "\n"
    return strn
    
def pyramid(rows):
    """
    Returns a pyramid of numbers.
    The image below is invoked with 9 rows.
                      1
                    1 2 1
                  1 2 3 2 1
                1 2 3 4 3 2 1
              1 2 3 4 5 4 3 2 1
            1 2 3 4 5 6 5 4 3 2 1
          1 2 3 4 5 6 7 6 5 4 3 2 1
        1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
      1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
    """
    #todo
    strn = ""
    space = ((rows-1)*2)
    for i in range(1, rows+1):
        strn += (space) * " "
        for j in range(1, i + 1):
            if j == 1 and i == 1:
                strn += str(j)
                continue
            strn += str(j) + " "
        for k in range(i - 1, 0, -1):
            if k == 1:
                strn += str(k)
                continue
            strn += str(k) + " "
        strn += "\n"
        space -= 2
    return strn

def diamond(size):
    """
    returns the diamond below where size = 10
                  1
                1 2 1
              1 2 3 2 1
            1 2 3 4 3 2 1
          1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
          1 2 3 4 5 4 3 2 1
            1 2 3 4 3 2 1
              1 2 3 2 1
                1 2 1
                  1
    """
    #todo
    #Part 1, top of Diamond
    strn = ""
    space = ((size-2)*2)
    for i in range(1, size):
        strn += (space) * " "
        for j in range(1, i + 1):
            if j == 1 and i == 1:
                strn += str(j)
                continue
            strn += str(j) + " "
        for k in range(i - 1, 0, -1):
            if k == 1:
                strn += str(k)
                continue
            strn += str(k) + " "
        strn += "\n"
        space -= 2
    space += 2
    #Part 2, Bottom of Diamond
    for i in range(1, size-1):        
        space += 2
        strn += space * " " 
        for j in range(1, size - i):
            if j == 1 and i == size-2:
                strn += str(j)
                continue
            strn += str(j) + " "
        for k in range(size - i - 2, 0, -1):
            if k == 1:
                strn += str(k)
                continue
            strn += str(k) + " "
        strn += "\n"
    return strn
    
def box(N):
    """
    returns a box that has N rows and 2*N columns (N >= 2)
    XXXXXXXXXXXXXXXX
    X              X
    X              X
    X              X
    X              X
    X              X
    X              X
    XXXXXXXXXXXXXXXX
    """
    #todo
    strn = ""
    for i in range(N):
        if i == 0 or i == N - 1:
            if i == N - 1:
                strn += 'X' * (2 * N)
                continue
            strn += 'X' * (2 * N) + '\n'
        else:
            strn += 'X' + ' ' * (2 * N - 2) + 'X' + '\n'
    return strn



def x_marks_the_spot(N):
    """"
    returns an X with the X's separated by underscores('_'); N will be odd.
    
    Example below is when N == 9

    X_______X
    _X_____X_
    __X___X__
    ___X_X___
    ____X____
    ___X_X___
    __X___X__
    _X_____X_
    X_______X
    """
    #todo
    strn = ""
    for i in range(N):
        for j in range(N):
            if j == i or j == N - 1 - i:
                strn += 'X'
            else:
                strn += '_'
        strn += '\n'
    return strn

def reverse_diamond(N):
    """
    returns the shape as shown below if N == 5
    1 3 5 7 9 9 7 5 3 1
    3 5 7 9     9 7 5 3
    5 7 9         9 7 5
    7 9             9 7
    9                 9
    9                 9
    7 9             9 7
    5 7 9         9 7 5
    3 5 7 9     9 7 5 3
    1 3 5 7 9 9 7 5 3 1
    """
    #todo
    strnt = ""
    strnb = ""
    space = 0
    for i in range(1, N*2, 2):
        for j in range(i, N*2, 2):
            strnt += str(j) + " "
        strnt += space * " "
        for k in range(N*2-1, i-1, -2):
            strnt += str(k) + " "
        strnt = strnt.rstrip()
        strnt += "\n"
        space += 4

    for i in range(N*2-1, 0, -2):
        space -= 4
        for j in range(i, N*2+1, 2):
            strnb += str(j) + " "
        strnb += space * " "
        for k in range(N*2-1, i-1, -2):
            strnb += str(k) + " "
        strnb = strnb.rstrip()
        strnb += "\n"
    strnb = strnb.rstrip()
    return strnt + strnb
        
    


    
if __name__ == "__main__":
    
    print("Rectangle of stars", 9, "X", 6)
    print(rectangle(9, 6), end = '\n\n')

    print("Grid of Numbers w/ size 10:")
    print(grid_of_numbers(7), end = '\n\n')

    print("Staircase of numbers w/ size 10:")
    print(staircase(10), end = '\n\n')

    print("Staircase of numbers w/ size 10 reflected:")
    print(staircase_reflected(10), end = '\n\n')

    print("Multiplication table(size=9):")
    print(multiplication_table(9), end = '\n\n')

    print("Pyramid w/ 9 rows:")
    print(pyramid(9), end = '\n\n')

    print("Diamond:")
    print(diamond(10), end = '\n\n')

    print("Box:", 10, "X", 5)
    print(box(5), end = '\n\n')
    print("Box:", 16, "X", 8)
    print(box(8), end = '\n\n')

    print("X marks the spot:")
    print(x_marks_the_spot(9), end = '\n\n')

    print("Reverse Diamond(3):")
    print(reverse_diamond(3), end = '\n\n')
    print("Reverse Diamond(6):")
    print(reverse_diamond(6), end = '\n\n')
