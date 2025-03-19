'''
This program was created by Parth Zanwar on 9/12/23
This will take input from the user for time when the event started
and how long event took
Program will return what was the endtime of the event
'''

x=0
print("If you want to quit this code, please enter quit three times where you would put your numbers")

while (x<1):
    hours = input("\nEnter hours(0-23): ")
    minutes = input("Enter minutes(0-59): ")
    duration = input("Enter duration in minutes: ")

    #End for code
    if (hours == "quit" and minutes == "quit" and duration == "quit"):
        print("Thank you for using this code")
        break

    #Calculations
    if int(duration) + int(minutes) >= 60:
        hours = int(hours) + (int(minutes) + int(duration))//60
        minutes = (int(minutes) + int(duration))%60
        hours = int(hours) % 24
        print("The event ended at " + str(hours) + ":" + str(minutes))
    else:
        print("The event ended at " + str(hours) + ":" + str(int(minutes) + int(duration)))
                  
