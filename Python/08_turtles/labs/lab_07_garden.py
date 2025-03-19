import turtle
import random

not_done = False # guarantees the flower is completely drawn and won't be affected by subsequent button clicks

def set_up():
    """ sets up the screen with a title and adds the mouse listener"""
    wn = turtle.Screen()
    wn.bgcolor("light yellow")
    wn.title("Python Turtle Graphics: Flower Garden")

    turtle.delay(0)
    turtle.penup()
    turtle.setpos(-200, 250)    # write a large title
    turtle.color('pink')
    turtle.write('Flower Garden', font = ('Courier', 40, 'bold'))
    turtle.onscreenclick(draw_flower)
    turtle.hideturtle()

def draw_leaf(fill):
    """ draws 1 leaf and fills it if fill is true"""
    inside = (random.random(), random.random(), random.random())
    outside = (random.random(), random.random(), random.random())
    turtle.color(outside, inside)
    # todo
    turtle.speed(0)
    turtle.pensize(3)
    if fill:
        turtle.begin_fill()
    for i in range(2):
        for i in range(45):
            turtle.fd(1)
            turtle.rt(2)
        turtle.rt(90)
    if fill:
        turtle.end_fill()
    turtle.rt(45)

def draw_flower(x, y):
    """ draws a flower at (x,y)"""
    global not_done
    if not_done:    # function does not execute if still drawing
        return
    not_done = True
    # todo
    turtle.penup()
    turtle.goto(x,y)
    turtle.pendown()
    turtle.pensize(5)
    if turtle.heading != 270:
        turtle.setheading(270)
    turtle.color("green")
    turtle.fd(100)
    turtle.lt(180)
    turtle.fd(100)
    fill = random.randint(0, 1)
    for i in range(8):
        draw_leaf(bool(fill))



     
    not_done = False # finished drawing the flower - don't add any code below

def main():
    set_up()
    turtle.shape('turtle')
    turtle.speed(0)
    

main()

