import turtle
import random as r

screen = turtle.Screen()
screen.title("Python Turtle Graphics: Turtle-A-Sketch")

shelly = turtle.Turtle()
shelly.shape('turtle')

movement = 5       # predefined speed to move

def up():
    if shelly.heading() != 90:
        shelly.setheading(90)
    shelly.forward(movement)

screen.onkeypress(up, "Up") # up is the function and "Up" refers to the up arrow

# add functions and corresponding listeners for down, left, right, red('r'), blue('b'), green('g') and random_color
def down():
    if shelly.heading() != 270:
        shelly.setheading(270)
    shelly.forward(movement)
screen.onkeypress(down, "Down")

def right():
    if shelly.heading() != 360:
        shelly.setheading(360)
    shelly.forward(movement)
screen.onkeypress(right, "Right")

def left():
    if shelly.heading() != 180:
        shelly.setheading(180)
    shelly.forward(movement)
screen.onkeypress(left, "Left")

def red():
    if shelly.color != "red":
        shelly.color("red")
screen.onkeypress(red, "r")

def blue():
    if shelly.color != "blue":
        shelly.color("blue")
screen.onkeypress(blue, "b")

def green():
    if shelly.color != "green":
        shelly.color("green")
screen.onkeypress(green, "g")

def random_color():
    turtle.colormode(255)
    shelly.color(r.randrange(256), r.randrange(256), r.randrange(256))
screen.onkeypress(random_color, "c")
# add a function for when the space bar is pressed('space'). If the pen is down, pick up the turtle's pen.
def space1():
    if shelly.isdown():
        shelly.penup()
screen.onkeypress(space1, "space")
# add a function for when the space bar is released which sets the pen down. The listener is onkeyrelease.
def space2():
    if not shelly.isdown():
        shelly.pendown()
screen.onkeyrelease(space2, "space")


screen.listen() # the screen must be in focus to fire/trigger events
