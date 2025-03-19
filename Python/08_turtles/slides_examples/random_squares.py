import turtle
import time
import random

def make_square(bob, x, y, steps, fill=True):
    bob.penup()
    bob.setpos(x, y)
    bob.pendown()
    
    if fill:
        bob.begin_fill()   # used before drawing a shape
    for i in range(4):
        bob.forward(steps)
        bob.right(90)
    if fill:
        bob.end_fill()     # fills the shape drawn if possible

# set screen and color
wn = turtle.Screen()
wn.setup(1050,550)
wn.bgcolor("green")
wn.title("Random Colored Squares!")

# create the turtle
torta = turtle.Turtle()

# set the speed 1 - 10 w/ 0 turning off animation
torta.speed(0)

# set the pen size
torta.pensize(4)

# wait 2 seconds to start
time.sleep(2)

# set the color mode to use integers from 0 to 255 for Red, Green and Blue
turtle.colormode(255)

# invoke make_square a bunch of times
for i in range(100):
    x_pos = random.randrange(-500, 400)
    y_pos = random.randrange(-150, 200)
    length = random.randrange(100)
    fill = bool(random.getrandbits(1))  # 50/50 for True/False
    torta.color(random.randrange(256), random.randrange(256), random.randrange(256))
    make_square(torta, x_pos, y_pos, length, fill)
    

turtle.done()



    

