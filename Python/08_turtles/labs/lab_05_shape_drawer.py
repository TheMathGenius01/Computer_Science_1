# Name Parth Zanwar
# Date 12/7/23
# Shape Drawer Lab

import turtle
import time
import random as r

def triangle(steps, tortuga):
    """ draw an equilateral triangle with side length of steps"""
    #todo
    tortuga.speed(0)
    for i in range(3):
        tortuga.fd(steps)
        tortuga.lt(120)
        
def square(steps, tortuga):
    """ draw a square with side length of steps"""
    #todo
    tortuga.speed(0)
    for i in range(4):
        tortuga.fd(steps)
        tortuga.lt(90)
        
def pentagon(steps, tortuga):
    """ draw a regular pentagon with side length of steps"""
    tortuga.speed(0)
    for i in range(5):
        tortuga.fd(steps)
        tortuga.lt(72)

def hexagon(steps, tortuga):
    """ draw a regular hexagon with side length of steps"""
    #todo
    tortuga.speed(0)
    for i in range(6):
        tortuga.fd(steps)
        tortuga.lt(60)

def regular_polygon(N, steps, tortuga):
    """
    This method draws a regular polygon with N sides and a side length of steps.
    If N = 3; steps = 50; then the method draws and equilateral triangle with side length of 50.
    If N = 4; then this method draws a square to the screen.
    This method should work for any N >= 3 but large values of N will look like circles.
    Input:
    N <int>: represents the # of sides of a regular polygon
    steps <int>: the number of steps to move
    tortuga <class 'turtle.Turtle'>: instance of a turtle
    Returns None
    """
    #todo
    tortuga.speed(0)
    for i in range(N):
        tortuga.fd(steps)
        tortuga.lt(360/N)
        
def test_regular_polygon():
    """ Repeatedly tests 3, 4,..., 10-sided regular polygons"""
    leo = turtle.Turtle()
    leo.speed(0)
    leo.color('red')
    leo.pensize(4)
    for i in range(3, 11):
        regular_polygon(i, 100, leo)
        leo.clear()
    regular_polygon(50, 10, leo) # should draw a circle
    leo.clear()
    leo.hideturtle()

def spiro(N, num_shapes, size):
    """
    Draws an image similar to a spirograph. Invoke regular_polygon(size), turn and repeat num_shapes times.
    Turn a total of 360 degrees  so the angle should be 360/num_shapes
    Input:
    N <int>: the type of regular polygon (ie if n == 6 then a hexagon)
    num_shapes <int>: the number of regular polygons to draw
    size <int>: the size of the regular polygon
    """
    turtle.delay(0)
    # required to speed up the animation

    joe = turtle.Turtle()
    joe.speed(0)        # the fastest turtle speed
    joe.color("blue")
    #todo
    for i in range(num_shapes):
        regular_polygon(N, size, joe)
        joe.lt(360/num_shapes)

    

    time.sleep(2)       # paused the program for 2 seconds
    joe.clear()         # clears this turtles markings

def main():
    wn = turtle.Screen()    # creates the screen
    wn.title('Python Turtle Graphics: Shape Drawer')
    wn.bgcolor('bisque')
    
    # uncomment the function calls below when you are ready
    '''
    shelly = turtle.Turtle()
    shelly.pensize(4)
    turtle.colormode(255)
    shelly.speed(0)
    
    triangle(100, shelly)
    shelly.clear()

    square(100, shelly)
    shelly.clear()

    pentagon(100, shelly)
    shelly.clear()

    hexagon(100, shelly)
    shelly.clear()
    shelly.hideturtle()
    
    test_regular_polygon()            # tests shape with 8 regular polygons
    '''
    spiro(10, 100, 80)
    spiro(3, 20, 170)
    spiro(5, 50, 160)
    # add more calls to spiro here!
    spiro(10, 1000, 300)
    
    wn.exitonclick()        # closes window if user clicks on it

main()
