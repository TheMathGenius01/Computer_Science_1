while True:
    start = input("Enter start (or q to quit): ")
    if start == "q":
        break
    start = int(start)
        
    end = int(input("Enter end: "))
    print("{0:>10}".format("Decimal"), end = " ")
    print("{0:>15}".format("Binary"), end = " ")
    print("{0:>20}".format("Octal"), end = " ")
    print("{0:>25}".format("Hex"), end = " ")
    print("{0:>30}".format("ASCII"))
    step = 1 if start < end else -1 
    for i in range(start, end+step, step):
        print("{0:>12}".format(i), end = " ")
        print("{0:>17}".format(bin(i)[2:]), end = " ")
        print("{0:>20}".format(oct(i)[2:]), end = " ")
        print("{0:>25}".format(hex(i)[2:]), end = " ")
        print("{0:>30}".format(chr(i)))
    
              
