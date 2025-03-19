import turtle
import random

width = 680
height = 480

def change_color(t):
    if t.gender == 'female':
        t.color('red')
    else:
        t.color('aquamarine')

def line(turt, start_x, start_y, end_x, end_y):
    col = turt.color()          # capture the color
    change_color(turt)          # change the color based on gender
    turt.penup()                # Raise the pen
    turt.goto(start_x, start_y) # Move to the starting point
    turt.pendown()              # Lower the pen
    turt.goto(end_x, end_y)     # Draw a line
    turt.color(col[0])          # restore the original color

def line_with_dots(turt, start_x, start_y, end_x, end_y, color):
    turt.penup()                
    turt.goto(start_x, start_y) 
    turt.pendown()              
    turt.pencolor(color)        
    turt.setheading(turt.towards(end_x, end_y)) # towards does the trig for you and returns the degrees towards this coordinate

    n = 10
    steps = turt.distance(end_x, end_y) / n     # distance performs the distance formula for you
    for i in range(n):
        turt.forward(steps)
        turt.dot()                              # places a dot

def line_with_dashes(turt, start_x, start_y, end_x, end_y, color):
    turt.penup()                
    turt.goto(start_x, start_y) 
    turt.pendown()              
    turt.pencolor(color)        
    turt.setheading(turt.towards(end_x, end_y))

    n = 20
    steps = turt.distance(end_x, end_y) / n
    for i in range(n // 2):
        turt.forward(steps)
        turt.penup()
        turt.forward(steps)
        turt.pendown()
    

wn = turtle.Screen()
wn.setup(width,height)
wn.bgcolor("pink")
wn.title("Objects Demo")

sally = turtle.Turtle()  # first turtle
sally.shape("turtle")    # 'arrow', 'circle', 'square', 'triangle', and 'classic'
sally.color('orange')
sally.speed(2)
sally.gender = 'female'
line(sally, 0, -220, 0, 220)

bob = turtle.Turtle()    # second turtle
bob.shape("turtle")
bob.color("white")
bob.speed(2)
bob.gender = 'male'
line_with_dots(bob, 40, -220, 40, 220, 'white')

joe = turtle.Turtle()    # third turtle
joe.shape("turtle")
joe.color("green")
joe.speed(2)
joe.gender = 'male'
change_color(joe)
line_with_dashes(joe, -40, -220, -40, 220, 'purple')

turtle.done()

    











