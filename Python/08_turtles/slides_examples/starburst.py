import turtle

def starburst():
    t = turtle.Turtle()
    t.speed(7)
    t.color('red', 'yellow')
    t.penup()
    t.setx(-250)
    t.pendown()
    t.begin_fill()
    for i in range(36):
        t.fd(200)
        t.lt(170)
    t.end_fill()

def circles():
    t = turtle.Turtle()
    t.speed(0)
    t.color('red', 'yellow')
    t.penup()
    t.setx(100)
    t.pendown()
    t.begin_fill()
    for i in range(36):
        t.circle(50)
        t.lt(10)
    t.end_fill()

def main():
    # set screen and color
    wn = turtle.Screen()
    wn.setup(600,400)
    wn.bgcolor("green")
    wn.title("Star Burst and Circles!")
    starburst()
    circles()

    turtle.done()

main()
