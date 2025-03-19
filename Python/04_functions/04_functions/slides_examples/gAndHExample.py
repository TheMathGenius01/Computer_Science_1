def g(x):
    def h():
        x = 'abc'
    x = x + 1
    print('in g(x): x =', x)
    h()
    return x

x = 8
z = g(x)

print(x)    # global variable is binded to 8
print(z)    # outs 9
