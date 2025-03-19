import turtle
from random import randrange

joe = turtle.Turtle()

# set screen and color
def set_up():
    wn = turtle.Screen()
    wn.setup(1050,550)
    wn.bgcolor("pink")
    wn.title("Random Colored Circles!")

    joe.speed(0)
    joe.pensize(10)
    turtle.colormode(255)
    
def main():

    set_up()
    
    for i in range(100):
        # random color for RGB
        r = randrange(256)
        g = randrange(256)
        b = randrange(256)
        joe.color(r, g, b)

        # go to a random location
        joe.penup()
        joe.goto(randrange(-500, 501), randrange(-250, 251))
        joe.pendown()

        # fill the circle with color
        joe.begin_fill()
            
        # generate a circle
        joe.circle(randrange(10,40))
            
        # end to fill color
        joe.end_fill()

    # close the screen when the user clicks on it
    turtle.exitonclick()
	
main()




