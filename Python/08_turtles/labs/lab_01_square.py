# Name Parth Zanwar
# Date 12/6/23
# Square Lab

import turtle

wn = turtle.Screen()
wn.setup(640, 440)                          # sets the canvas/screen size
wn.bgpic("lab_01_square.png")               # loads a background image
wn.title("Python Turtle Graphics: Square")  # set the title bar

donatello = turtle.Turtle()                 # create a turtle and bind to variable
donatello.shape("turtle")                   # set the shape of the turtle
donatello.color("green")                    # set the color of the turtle

#todo
donatello.ht()
donatello.speed(0)
donatello.penup()
donatello.goto(-270, 155)
donatello.pendown()
x = 0
for i in range(4):
    if x % 2 == 0:
        donatello.fd(540)
        donatello.rt(90)
    else:
        donatello.fd(310)
        donatello.rt(90)
    x+=1
donatello.st()

