import turtle
import random as r

turtle.colormode(255)
wn = turtle.Screen()
wn.setup(640, 440)
wn.bgcolor("yellow")
wn.title("Python Trutle Graphics: Kaleidoscope")

raf = turtle.Turtle()
raf.shape('turtle')
raf.color('green')
raf.speed(0)

for i in range(400):
    raf.fd(i)
    raf.lt(i)
    raf.pencolor(r.randrange(256), r.randrange(256), r.randrange(256))
