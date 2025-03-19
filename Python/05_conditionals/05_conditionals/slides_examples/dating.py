# This program decides whether to date someone
# based on their various attributes.

def main():
    # prompt for information about the person
    print("Tell me about the person you may want to date.")
    looks  = int(input("How good looking are they (1-10)? "))
    IQ     = int(input("What is their IQ? "))
    income = float(input("How much $ do they make per year? "))
    single = input("Are they single (y/n)? ")
    
    # use bool variables to perform tests about them
    cute = looks >= 9
    smart = IQ > 125
    rich = income > 300000.00
    available = single.lower().startswith("y")

    if cute and smart and rich and available:
        print("Let's go out!")
    else:
        print("It's not you, it's me...")

main()
