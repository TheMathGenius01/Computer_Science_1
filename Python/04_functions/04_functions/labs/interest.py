'''
This program was created by Parth Zanwar
This program will calculate the compound interest
This program will output the future value of the money
'''
def compound_interest(p = 1, r = 1, y = 1):
    future_value = round(float(p)*(1+0.01*float(r))**float(y), 2)
    return print("The future value of $" + str(p) + " in " + str(y) + " years at an annual rate of \
" + str(r) + "% is $" + str(future_value), end=".\n")

def main():
    compound_interest(1000, 7, 10)
    compound_interest(200, 4, 5)
    compound_interest(1000, 3, 20)

if __name__ == "__main__":
    main()
