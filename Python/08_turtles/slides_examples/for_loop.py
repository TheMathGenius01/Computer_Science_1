import turtle
from random import random # importing the random() function allows invoking random() as opposed to random.random()

# demo of a for loop that fills 20 circles

turtle.delay(0)     # sets the drawing delay in milliseconds

turkey = turtle.Turtle()
turkey.speed(1)
turkey.shape('classic')
turkey.penup()
turkey.goto(0,-200)
turkey.pendown()

for radius in range(200, 0, -10):   # draw circles with radii of 200, 190,..., 10
    turkey.begin_fill()
    turkey.color(random(), random(), random())  # sets a random color
    turkey.circle(radius)
    turkey.end_fill()

turtle.done()
