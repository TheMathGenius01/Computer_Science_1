"""
Program makes a stamp of a turtle where the user clicks.
's' key - makes the turtle smaller
'l' key - makes the turtle larger
'r' key - clears the stamps and resets the turtle
'c' key - clears the stamps

"""

import turtle
from random import random # importing the random() function allows invoking random() as opposed to random.random()

bob = turtle.Turtle() # global variable


def stamp(x, y):
    """moves bob to the location(x,y) and stamps his image as a random color on the screen"""
    bob.penup()
    bob.goto(x,y)
    bob.color(random(), random(), random())
    bob.stamp()

def clear():
    """ clears all of bob's stamps from the screen"""
    bob.clearstamps()

def reset():
    """ clears all of bob's stamps from the screen and resets size"""
    bob.home()
    bob.clearstamps()
    bob.shapesize(1, 1, 2)

def larger():
    """ increase the turtles width and length stretch factor by 1 """
    data = bob.shapesize() # returns a tuple(stretch_wid, stretch_len, outline ex (1.0, 1.0, 2)
    bob.shapesize(data[0] + 1, data[1] + 1, 2)

def smaller():
    """ decrease the turtles width and length stretch factor by 1 if possible """
    data = bob.shapesize() # returns a tuple(stretch_wid, stretch_len, outline ex (1.0, 1.0, 2)
    if data[0] > 1:
        bob.shapesize(data[0] - 1, data[1] - 1, 2)
    

def main():
    """add the event listeners and set up bob"""
    
    wn = turtle.Screen()
    wn.title('Event Listener Demo: Turtle Stamp with Increase and Decrease Size')
    
    """
    To respond to mouse clicks we must invoke a function
    with two parameters(x and y). goto would work as it
    has two parameters for x and y. Below we are passing the
    stamp function to the screens onlclick method. The stamp
    function will be called each time the mouse is clicked
    and the mouses coordinates are passed as arguments.
    """
    wn.onclick(stamp)

    # the clear function will be called when the c key is pressed
    wn.onkey(clear, 'c')

    # the larger function will be called when the l(el) key is pressed
    wn.onkey(larger, 'l')

    # the smaller function will be called when the s key is pressed
    wn.onkey(smaller, 's')

    # the reset function will be called when the r key is pressed
    wn.onkey(reset, 'r')

    # in order to register key events the screen must have focus which is done by invoking listen()
    wn.listen() 

    bob.shape('turtle')
    bob.speed(0)
    bob.resizemode('user')

    turtle.done()

if __name__ == '__main__':
    main()
