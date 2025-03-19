def message1():
    print("This is message 1.")


def message2():
    print("This is message 2.")
    message1()
    print("Done with message 2.")

def main():
    message1()
    message2()
    print("Done.")

if __name__ == "__main__":
   main()
