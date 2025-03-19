def a(x):
    def b():
        x = "inside b"
    x = x + 5
    print("in a(x): x =", x)
    b()
    return x

x = 2
y = a(x)
