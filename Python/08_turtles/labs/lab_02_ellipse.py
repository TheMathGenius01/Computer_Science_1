# Name Parth Zanwar
# Date 12/6/23
# Ellipse Lab

import turtle

wn = turtle.Screen()
wn.setup(640, 440)                          # sets the canvas/screen size
wn.bgpic("lab_02_ellipse.png")               # loads a background image
wn.title("Python Turtle Graphics: Square")  # set the title bar

donatello = turtle.Turtle()                 # create a turtle and bind to variable
donatello.shape("turtle")                   # set the shape of the turtle
donatello.color("green")                    # set the color of the turtle

#todo
donatello.speed(0)
donatello.ht()
donatello.penup()
donatello.pensize(5)
donatello.goto(0, -160)
donatello.pendown()
donatello.circle(160)
donatello.st()
