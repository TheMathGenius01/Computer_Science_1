import turtle
import time     # time module

def make_star(emma):
    emma.begin_fill()   # used before drawing a shape
    for i in range(5):
        emma.forward(250)
        emma.left(144)
    emma.end_fill()     # fills the shape drawn if possible

# set screen and color
wn = turtle.Screen()
wn.setup(1050,550)
wn.bgcolor("green")
wn.title("Star!")

# create the turtle
torta = turtle.Turtle()

# set the location -default is (0,0)
torta.penup()
torta.setpos(-150,-50)
torta.pendown()

# set the speed
torta.speed(2)

# set the pen size
torta.pensize(5)

# wait 2 seconds to start
time.sleep(2)

# invoke the star function
make_star(torta)

# basically keeps the window open if not using IDLE
turtle.done()

