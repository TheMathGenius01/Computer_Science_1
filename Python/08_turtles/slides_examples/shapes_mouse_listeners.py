"""
Event-driven program that draws shapes based on where the user clicks.
Left click anywhere on the screen and the turtle will move there.
Center click starts the process of filling a shape formed by subsequent
left clicks. The center click ends the shape and calls fill.
Right click changes the turtle's color to a random color.
"""

import turtle
from random import random

shelly = turtle.Turtle()  # global variable

def random_color(x, y):
    """ sets shelly to a random color and disregards x and y"""
    shelly.color(random(), random(), random())

def toggle(x, y):
    """toggles between filling the shape and starting a new one and disregards the x and y"""
    if not shelly.isdown():
        shelly.pendown()
        shelly.begin_fill()
    else:
        shelly.end_fill()
        shelly.penup()

def main():
    """add the event listeners and set up shelly"""
    
    wn = turtle.Screen()
    wn.title('Event Listener Demo: Make Shapes')
    wn.setup(1050,550)    
    
    """
    To respond to mouse clicks we must use a function
    with two parameters(x and y). goto would work as it
    has two parameters for x and y which is being used for
    mouse button 1. Mouse button 3 is changing the turtle's
    color to a random color. Mouse button 2 is toggling
    between connecting lines to form a shape and staring
    a new shape.
    """
    wn.onclick(random_color, 3) # mouse button 3
    wn.onclick(shelly.goto, 1)  # mouse button 1
    wn.onclick(toggle, 2)       # mouse button 2
    

    shelly.shape('turtle')
    shelly.speed(0)
    shelly.penup()

    turtle.done()

if __name__ == '__main__':
    main()
