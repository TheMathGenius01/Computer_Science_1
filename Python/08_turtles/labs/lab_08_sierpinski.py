""" Program draws the Sierpinski Triangle recursively"""
import turtle
from random import random

tri = turtle.Turtle()
tri.speed(0)

"""
Triangle ABC where A is the bottom left, B is the middle and C is the bottom
right.
Point A -> x1, y1
Point B -> x2, y2
Point C -> x3, y3

Calculate the midpoints D, E, F using the midpoint formula.
Call make triangle 3 times:
Triangle ADF, DBE and FEC
"""


def draw_fractal(x1, y1, x2, y2, x3, y3):
    # sets to a random color
    tri.color(random(), random(), random())

    # pick up the pen and go to x1, y1
    tri.penup()
    tri.goto(x1, y1)
    tri.pendown()
    # start tracking the points to fill
    tri.begin_fill()

    # draw line (x1, y1) - (x2, y2)
    tri.goto(x2, y2)
    # draw line (x2, y3) - (x3, y3)
    tri.goto(x3, y3)
    # draw line (x3, y3) - (x1, y1)
    tri.goto(x1, y1)

    # stop tracking the points and fill the triangle
    tri.end_fill()

    # recursive cases
    if x3 - x1 > 10:
        # calculate midpoints
        xD = (x1 + x2) / 2
        yD = (y1 + y2) / 2
        xE = (x2 + x3) / 2
        yE = (y2 + y3) / 2
        xF = (x3 + x1) / 2
        yF = (y3 + y1) / 2

        # recursive call with Triangle ADF
        draw_fractal(x1, y1, xD, yD, xF, yF)

        # recursive call with Triangle DBE
        draw_fractal(xD, yD, x2, y2, xE, yE)

        # recursive call with Triangle FEC
        draw_fractal(xF, yF, xE, yE, x3, y3)


def main():
    wn = turtle.Screen()
    wn.bgcolor('blue')
    wn.title('Turtle Graphics: Sierpinski Triangle')
    wn.delay(0)
    draw_fractal(-300, -300, 0, 300, 300, -300)


main()
