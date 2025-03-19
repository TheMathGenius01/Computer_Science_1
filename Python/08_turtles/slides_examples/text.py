# display text

import turtle
turtle.setup(500,300)


text = turtle.Turtle()
text.color('blue')
text.fd(205)
text.fd(-410)
text.write('Hello World', font = ('Courier', 46, 'bold'))

turtle.done()
