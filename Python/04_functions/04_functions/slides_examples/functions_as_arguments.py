def a():
    print("inside of a")
def c(z):
    print("inside of c")
    z()

a()
c(a)    #function a is passed as a parameter to function c

