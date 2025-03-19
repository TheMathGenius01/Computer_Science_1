# Parth Zanwar
# 10/30/23
import math


def count_let(my_string, letter):
    """ (string, string) -> int

    Given a string, return the number of times a letter occurs in that string.

    >>> count_let("Augusta Longbottom","o")
    3
    >>> count_let("Rodolphus Lestrange","e")
    2
    >>> count_let("supercalifragilisticexpialidocious","i")
    7
    """
    return my_string.count(letter)


def length_of_5(string_a, string_b):
    """ (string, string) -> boolean

    Return True if the length of each of 2 the strings is 5 or more. 

    >>> length_of_5("Peter", "Pettigrew")
    True
    >>> length_of_5("Draco","Malfoy")
    True
    >>> length_of_5("Terry", "Boot")
    False
    """
    return len(string_a) >= 5 and len(string_b) >= 5


def middle_three(s):
    """ (string) -> string
    Precondition: the string length will be at least 3 and the length will be odd

    Return the middle 3 characters.
    
    >>> middle_three("candy")
    'and'
    >>> middle_three("and")
    'and'
    >>> middle_three("solving")
    'lvi'
    >>> middle_three("schadenfreude")
    'enf'
    """
    middle = math.floor(len(s) / 2)
    return s[middle - 1:middle + 2]


def has_bad(some_string):
    """ (string) -> boolean
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx"
    but not "xxbadxx". The string may be any length, including 0.
    
    >>> has_bad("badxx")
    True
    >>> has_bad("xbadxx")
    True
    >>> has_bad("xxbadxx")
    False
    >>> has_bad("")
    False
    """
    return (some_string.find("bad", 0, 3)) == 0 or (some_string.find("bad", 0, 4)) == 1


def last_occur(string_a, string_b):
    """ (string, string) -> int

    Given a string, return the location of the last occurrence of a particular
    character, so the string "Goodbye" looking for "o" would return 2. Return -1
    if no occurrence is found.

    >>> last_occur("Aberforth Dumbledore", "o")
    17
    >>> last_occur("Dudley Dursley", "d")
    2
    >>> last_occur("Nicholas Flamel","a")
    11
    """
    return string_a.rfind(string_b)


def last_chars(a_string, b_string):
    """ (string, string) -> string

    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

    >>> last_chars("last","chars")
    'ls'
    >>> last_chars("yo","java")
    'ya'
    >>> last_chars("hi","")
    'h@'
    >>> last_chars("","yo")
    '@o'
    >>> last_chars("","")
    '@@'
    """
    if len(a_string) <= 0:
        a_string = "@"
    if len(b_string) <= 0:
        b_string = "@"
    return a_string[:1] + b_string[-1:]


def last_two(the_str):
    """ (string) -> string

    Given a string of any length, return a new string where the last 2 chars,
    if present, are swapped, so "coding" yields "codign".
    
    >>> last_two("coding")
    'codign'
    >>> last_two("cat")
    'cta'
    >>> last_two("ab")
    'ba'
    >>> last_two("j")
    'j'
    >>> last_two("")
    ''
    """
    if len(the_str) <= 1:
        return the_str
    last_char = the_str[len(the_str) - 1]
    second_last_char = the_str[len(the_str) - 2]
    return the_str[:len(the_str) - 2] + last_char + second_last_char


def sub_string(the_string):
    """ (string) -> string

    Given a string, return a string made of its 4th through 10th characters if present.
    
    >>> sub_string("Phineas Nigellus Black")
    'neas Ni'
    >>> sub_string("Cedric Diggory")
    'ric Dig'
    >>> sub_string("Albus Dumbledore")
    'us Dumb'
    >>> sub_string("DD")
    ''
    >>> sub_string("Seamus")
    'mus'
    """
    if len(the_string) >= 4:
        return the_string[3:10]
    return ""


def see_color(my_string):
    """ (string) -> string

    Given a string, if the string begins with "red" or "blue" or ends with black
    return that color string, otherwise return the empty string.
    
    >>> see_color("redxx")
    'red'
    >>> see_color("xxred")
    ''
    >>> see_color("blueTimes")
    'blue'
    >>> see_color("")
    ''
    >>> see_color("xxxblack")
    'black'
    >>> see_color("xblackx")
    ''
    """
    if my_string.find("red") == 0 or my_string.find("red") == 1:
        return "red"
    if my_string.find("blue") == 0 or my_string.find("blue") == 1:
        return 'blue'
    if my_string.find("black") == len(my_string) - 5:
        return "black"
    return ""


def switch(s):
    """ (string) -> string

    Given a string return the string if in lowercase change to uppercase and if
    in uppercase change to lowercase.

    >>> switch("wILHELMINA gRUBBLY pLANK")
    'Wilhelmina Grubbly Plank'
    >>> switch("bELLATRIX lESTRANGE")
    'Bellatrix Lestrange'
    >>> switch("gILDEROY lOCKHART")
    'Gilderoy Lockhart'
    """
    return s.swapcase()


def second_occur(string_a, string_b):
    """ (string, string) -> int
    Given a string, return the location of the second occurrence of a particular
    character(case insensitive), so the string "Goodbye" looking for "o" would return 2.
    
    >>> second_occur("Aberforth Dumbledore", "o")
    17
    >>> second_occur("Aberforth Dumbledore", "D")
    16
    >>> second_occur("Dudley Dursley", "d")
    2
    >>> second_occur("Nicholas Flamel","a")
    11
    >>> second_occur("Nicholas Flamel","F")
    -1
    >>> second_occur("Nicholas Flamel","z")
    -1
    """
    string_a = string_a.lower()
    string_b = string_b.lower()
    idx = string_a.find(string_b)
    return (string_a.find(string_b, idx + 1))


def big_small(string_one, string_two):
    """ (string, string) -> string

    Given two strings, return the concatenation of the two with the larger
    one (alphabetically/lexicographically) first
    
    >>> big_small("coding", "python")
    'pythoncoding'
    >>> big_small("cat", "dog")
    'dogcat'
    >>> big_small("b", "a")
    'ba'
    >>> big_small("j", "z")
    'zj'
    >>> big_small("python", "java")
    'pythonjava'
    """
    con = sorted([string_one, string_two])
    return con[1] + con[0]


def has_bad2(some_string, start, end):
    """ (string, int, int) -> boolean
    Given a string, return true if "bad" appears somewhere from start(inclusive)
    to end(exclusive). The string may be any length, including 0 and the indices
    could be out of range.

    >>> has_bad2("badxx", 1, 5)
    False
    >>> has_bad2("xbadxx", 1, 5)
    True
    >>> has_bad2("xxxxxbadxx", 2, 7)
    False
    >>> has_bad2("", 4, 7)
    False
    >>> has_bad2("xxxxxxbaxxxbadxx", 8, 15)
    True
    """
    if some_string.find("bad", start, end) != -1:
        return True
    return False


def last_2(the_str):
    """ (string) -> string

    Given a string, return the string made of its last two chars, so the
    String "Hello" yields "lo". If the string is shorter than length 2,
    return whatever there is, so "X" yields "X", and the empty string ""
    yields the empty string "".

    >>> last_2("dog")
    'og'
    >>> last_2("Mississippi")
    'pi'
    >>> last_2("p")
    'p'
  
    """
    if len(the_str) < 2:
        return the_str
    return the_str[-2:]


def first_name(name):
    """ (string) -> string

    Given a string representing a persons full name in the the format
    "first M last", return the first name.

    >>> first_name("Alan M Turing")
    'Alan'
    >>> first_name("Grace B Hopper")
    'Grace'
    >>> first_name("James A Gosling")
    'James'
  
    """
    idx = name.find(" ")
    return name[:idx]


def middle_initial(name):
    """ (string) -> string

    Given a string representing a persons full name in the the format
    "first M last", return the middle initial.

    >>> middle_initial("Alan M Turing")
    'M'
    >>> middle_initial("Grace B Hopper")
    'B'
    >>> middle_initial("James A Gosling")
    'A'
  
    """
    idx1 = name.find(" ")
    idx2 = name.find(" ", idx1 + 1)
    return name[idx1 + 1:idx2]


def last_name(name):
    """ (string) -> string

    Given a string representing a persons full name in the the format
    "first M last", return the last name.

    >>> last_name("Alan M Turing")
    'Turing'
    >>> last_name("Grace B Hopper")
    'Hopper'
    >>> last_name("James A Gosling")
    'Gosling'
  
    """
    idx1 = name.find(" ")
    idx2 = name.find(" ", idx1 + 1)
    return name[idx2 + 1:]


def every_other(some_str):
    """ (string) -> string

    Given a string representing any sequence of characters, return a
    string composed of every other letter.

    >>> every_other("Alan M Turing")
    'Aa  uig'
    >>> every_other("Grace B Hopper")
    'GaeBHpe'
    >>> every_other("James A Gosling")
    'JmsAGsig'
  
    """
    return some_str[::2]


def format_bday(date_str):
    """ (string) -> string

    Given a string representing a date int "mm/dd/yyyy" format, return the date
    as a string in month day, year when month is converted from numeric to the word.

    >>> format_bday("06/23/1912")
    'June 23, 1912'
    >>> format_bday("01/08/1935")
    'January 08, 1935'
    >>> format_bday("02/06/1895")
    'February 06, 1895'
  
    """
    month = int(date_str[:2])
    day = int(date_str[3:5])
    year = int(date_str[6:])
    if month == 1:
        month = "January"
    elif month == 2:
        month = "February"
    elif month == 3:
        month = "March"
    elif month == 4:
        month = "April"
    elif month == 5:
        month = "May"
    elif month == 6:
        month = "June"
    elif month == 7:
        month = "July"
    elif month == 8:
        month = "August"
    elif month == 9:
        month = "September"
    elif month == 10:
        month = "October"
    elif month == 11:
        month = "November"
    elif month == 12:
        month == "December"

    if day < 10:
        day = "0" + str(day)
    else:
        day = str(day)

    return str(month) + " " + str(day) + ", " + str(year)


if __name__ == '__main__':
    import doctest

    doctest.testmod()
