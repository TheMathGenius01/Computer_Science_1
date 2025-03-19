"""
An example of inheritance which makes a new turtle class called FatTurtle.
All attributes and behaviors are carried over. All turtles created will be
a little bit bigger.


All Fat Turtles will have:

size of 4,4,2
shape of turtle
and a new attribute age

"""

import turtle

class FatTurtle(turtle.Turtle):

     def __init__(self,age):
        super(FatTurtle,self).__init__()
        self.age = age
        self.shape('turtle')
        self.resizemode('user')
        self.shapesize(4,4,2)

def main():
    leatherback = FatTurtle(22)
    leatherback.fd(100)
    leatherback.write(leatherback.age, font = ('Courier', 22, 'bold'))
    leatherback.fd(100)

    mudturtle = FatTurtle(40)
    mudturtle.color('red')
    mudturtle.rt(-90)
    mudturtle.fd(100)
    mudturtle.write(mudturtle.age, font = ('Courier', 22, 'bold'))
    mudturtle.fd(100)

    # add more code here



    turtle.done()
     
main()
