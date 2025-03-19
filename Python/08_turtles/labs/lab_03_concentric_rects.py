# Name Parth Zanwar
# Date 12/8/23
# Concentric Rectangles

import turtle

# todo - code the two functions
def make_rectangles(mike, x_pos, y_pos, width, height, spacing, num_rects):
    mike.penup()
    for i in range(num_rects):
        make_rectangle(mike, x_pos, y_pos, width, height)
        width -= spacing*2
        height -= spacing*2
        x_pos += spacing
        y_pos -= spacing
        mike.penup()

def make_rectangle(mike, x, y, width, height):
    mike.goto(x,y)
    mike.pendown()
    for i in range(2):
        mike.fd(width)
        mike.right(90)
        mike.fd(height)
        mike.right(90)


wn = turtle.Screen()
wn.setup(640, 440)                          # sets the canvas/screen size
wn.bgpic("lab_03_concentric.png")           # loads a background image
wn.title("Python Turtle Graphics: Concentric Rectangles")

mike = turtle.Turtle()                 # create a turtle and bind to mike
mike.shape("turtle")                   # set the shape of the turtle
mike.color("green")                    # set the color of the turtle
mike.speed(0)

# uncomment to run
make_rectangles(mike,-260, 150, 520, 300, 10, 12)



