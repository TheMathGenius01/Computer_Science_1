# Name:    letter_grade.py
# Date: 9/29/23
# Author: Parth Zanwar 
# Purpose: Practice making decisions in a program.

def letter_grade(n):
    if n < 0 or n > 100:
        return "Invalid Grade"
    else:
        if n > 89 and n < 101:
            return "A"
        elif n > 79 and n < 91:
            return "B"
        elif n > 69 and n < 81:
            return "C"
        elif n > 59 and n < 71:
            return "D"
        else:
            return "F"
    

def main():
    print(-30, "==", letter_grade(-30))
    print(-1, "==", letter_grade(-1))
    print(0, "==", letter_grade(0))
    print(44, "==", letter_grade(44))
    print(59, "==", letter_grade(59))
    print(60, "==", letter_grade(60))
    print(69, "==", letter_grade(69))
    print(70, "==", letter_grade(70))
    print(79, "==", letter_grade(79))
    print(80, "==", letter_grade(80))
    print(89, "==", letter_grade(89))
    print(90, "==", letter_grade(90))
    print(100, "==", letter_grade(100))
    print(101, "==", letter_grade(101))

if __name__ == "__main__":
    main()
