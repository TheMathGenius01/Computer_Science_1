# import package
import turtle


sc=turtle.Screen()
trtl=turtle.Turtle()    # global variable
sc.delay(2)             # in milliseconds
SIZE = 300              # screen will be 600 by 600
SPACING = 10            # spacing will be 10 pixels between lines

# function to fill the 4 colors of the plane
def fill_colors():
    for col in ['yellow', 'yellow green', 'deep pink', 'light sky blue']:
        square(trtl, SIZE, col)
        trtl.lt(90)
                

# function to fill a square
def square(t, steps, col):
    t.color(col)
    t.begin_fill()
    for i in range(4):
        t.fd(steps)
        t.lt(90)
    t.end_fill()

# function to draw y axis lines
def draw_y_axis(x, y):
    # set position to top left
    trtl.penup()
    trtl.goto(x, y)
    trtl.pendown()

    for i in range(SIZE // SPACING):
        trtl.fd(SIZE * 2)
        trtl.penup()
        trtl.sety(trtl.ycor() - SPACING)
        trtl.pendown()
        trtl.fd(-SIZE * 2)
        trtl.penup()
        trtl.sety(trtl.ycor() - SPACING)
        trtl.pendown()
    trtl.fd(SIZE * 2)

# function to draw y axis lines
def draw_x_axis(x, y):
    # set position to top left
    trtl.penup()
    trtl.goto(x, y)
    trtl.pendown()

    for i in range(SIZE // SPACING):
        trtl.fd(SIZE * 2)
        trtl.penup()
        trtl.setx(trtl.xcor() + SPACING)
        trtl.pendown()
        trtl.fd(-SIZE * 2)
        trtl.penup()
        trtl.setx(trtl.xcor() + SPACING)
        trtl.pendown()
    trtl.fd(SIZE * 2)
	
# function to label the graph grid
def label():
    # make a dot at (0,0)
    trtl.pensize(5)
    trtl.penup()
    trtl.home()
    trtl.pendown()
    trtl.dot()
    trtl.pensize(1)

    # set position again and write (0,0)
    trtl.penup()
    trtl.setpos(3,3)
    trtl.pendown()

    # set font
    f = ("Courier", 20, "bold")
	
    # write 0
    trtl.write("(0,0)", font=f)
	
    # set position again and write + X coordinates
    trtl.penup()
    trtl.setpos(SIZE - 50,30)
    trtl.pendown()
    trtl.write("X",font=f)
	
    # set position again and write - X coordinates
    trtl.penup()
    trtl.setpos(30,SIZE - 50)
    trtl.pendown()
    trtl.write("Y",font=f)

    # set the x,y axis to be thicker and add arrow
    trtl.penup()
    trtl.home()
    trtl.pendown()
    trtl.pensize(5)
    for i in range(4):
        trtl.fd(SIZE-8)
        trtl.stamp()
        trtl.goto(0,0)
        trtl.lt(90)
	
def main():
    # set screen
    sc.setup(SIZE * 2, SIZE * 2)
    sc.title('Python Turtle Graphics: Cartesian Plane')

    # set turtle features
    trtl.speed(0)
    trtl.color('black')
    trtl.resizemode('user')
    trtl.shapesize(4,4,2)


    # fill 4 quadrants with colors
    fill_colors()
    trtl.color('slate gray')

    # y axis lines then x axis lines
    draw_y_axis(-SIZE, SIZE)  # top left
    trtl.setheading(270)      # point down
    draw_x_axis(-SIZE, SIZE)  # top left


    # label the graph
    trtl.color('black')
    label()

    # hide the turtle
    trtl.hideturtle()

    # exit when the use clicks the screen
    turtle.exitonclick()

main()
