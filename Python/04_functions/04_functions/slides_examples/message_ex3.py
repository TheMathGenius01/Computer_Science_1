def a():
    print("A is starting")
    b()
    print("A is finished")


def b():
    print("B is starting")
    c()
    print("B is finished")

def c():
    print("C")

def main():
    a()

if __name__ == "__main__":
   main()
