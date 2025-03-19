'''
This program was created by Parth Zanwar on 9/4/23.
This program will take five daily grades, one summative
assessment, and one relevant application
'''

daily_grade1 = int(input("Enter daily grade: "))
daily_grade2 = int(input("Enter daily grade: "))
daily_grade3 = int(input("Enter daily grade: "))
daily_grade4 = int(input("Enter daily grade: "))
daily_grade5 = int(input("Enter daily grade: "))
sa_avg = int(input("Enter summative assessment grade: "))
ra_avg = int(input("Enter relevant application grade: "))

daily_grade_avg = (daily_grade1 + daily_grade2 + daily_grade3 + daily_grade4 + daily_grade5) / 5
grade = (daily_grade_avg * .2) + (sa_avg * .4) + (ra_avg * .4)

print("\nYour current garde is " + str(grade), end=".")

