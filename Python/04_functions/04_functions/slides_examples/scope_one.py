def fun(x):
    x += 1   # binds the parameter to 4 -> has no effect of global var x below
    print("in fun(x): x =", x)
    return x

def can_not_modify(x):
    x = 4   # binds the parameter to 4 -> has no effect on global var x below

def a():
    x = 8   # this declares a local variable and binds it to 8

def example():
    print(x)    # x is a global variable which can be accessed anywhere in your program


"""
The method below shows you how to modify a global variable inside a function.
Generally it is considered poor practice so please use caution when doing so.
Modifying global variables inside a function can cause unexpected results in
other parts of your program and can be difficult to debug. It's better practice
to take all the necessary data as parameters.
"""
def example_2():
    global x  # this step is required if you want to modify a global variable
    x = 55

x = 3       # global variable
z = fun(x)
print("out of fun(x): x =", x)
print("out of fun(x): z =", z)
print()


x = 2   # global variable
can_not_modify(x)
print("x is not changed", x)

a()
print(x)


example()
example_2()
print(x)
