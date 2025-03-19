def f():
    x = 1
    x = x + 5       # x is re-defined  in scope of f
    print(x)        # outs 6

x = 3
f()
print(x)            # outs 3


def g():
    print(x)        # outs 3
    print(x + 1)    # outs 4

x = 3
g()
print(x)            # outs 3

def h():
    x = x + 1       # UnboundLocalError: local variable 'x' referenced before assignment

x = 3
h()
print(x)
