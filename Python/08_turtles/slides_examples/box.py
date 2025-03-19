import turtle   # import the module


# set screen and color
window = turtle.Screen()
window.setup(1050,550)
window.bgcolor("blue")

# create the turtle
tortuga = turtle.Turtle()

# set the speed
tortuga.speed(1)

# set the pen size
tortuga.pensize(7)

# set the color
tortuga.color("red")

# set the shape
tortuga.shape('turtle')

# set the location -default is (0,0)
tortuga.penup()
tortuga.setpos(-100,-100)
tortuga.pendown()

# invoke turtle methods
for i in range(4):
    tortuga.forward(200)
    tortuga.left(90)
    
turtle.done()







