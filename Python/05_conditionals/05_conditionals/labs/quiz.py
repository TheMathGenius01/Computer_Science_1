'''
This program was created by Parth Zanwar
This program will ask the user 5 questions
After asking each question, this program will then tell you if
you are correct or not
If you are not correct, then this program will tell you the correct answer
After you have finished, it will tell you your score based on how many points you have
'''
x=0

print("Quiz time!\nPlease input the answer in full lowercase letters or a number, no spaces\n")

first_q = input("I speak without a mouth and hear without ears.\n\
I have no body, but I come alive with wind.\n\
What am I? ")

if first_q == "echo":
    print("Correctamundo\n")
    x+=1
else:
    print("You are an big L, do better.\n\
The answer was an echo.\n")

second_q = int(input("One brother says of his younger brother:\n\
'Two years ago, I was three times as old as my brother was.\n\
In three years’ time, I will be twice as old as my brother.'\n\
How old is the younger brother now? "))

if second_q == 7:
    print("Bruh, stop cheating\n")
    x+=1
else:
    print("Come on now, get the w for the kids\nThe correct answer was 7\n")

third_q = int(input("Answer the following math equation:\n\
1(2(3(4(5(6(7(8(9(0))))))))): "))

if third_q == 0:
    print("Good job!\n")
    x+=1
else:
    print(str(x*20) + " failed.\n\
You can only get a little worse than that\nCorrect answer was 0\n")

fourth_q = input("When do the spindle fibers form in mitosis: ")

if fourth_q == "prophase":
    print("One left, can you clutch up now?\n")
    x+=1
else:
    print("Man, the last question will eat you up alive.\n\
The correct answer was prophase.\n")

fifth_q = input('''"My coat keeps me the warmest during this January freeze," bragged Tracy.\n\
If the above sentence equals ZEBRA, then what does the following sentence equal?\n\
The pain in Matthew's elbow lingered through the month of March? ''')

if fifth_q == "bowling":
    print("Are you mastery?")
    x+=1
else:
    print("Seriously? It's in front of your eyes.\n\
The answer is bowling")

print("\nYour score is: " + str(x*20))


    
    
    

               
