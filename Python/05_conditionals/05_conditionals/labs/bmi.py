def input_cal_bmi(num):
    """
    Prints the persons number, asks for the height
    and weight from the user and then calculates
    the users body mass index. The bmi is printed
    to one decimal point of precision and the bmi
    is returned.
    BMI = weight / height^2 * 703
    Parameters:
    arg1 (int): Person number
    Returns:
    float: the calculated bmi
    """
    print("Person", num, "information:")
    height = float(input("height (in inches)? "))
    weight = float(input("weight (in pounds)? "))
    bmi = weight / (height**2) * 703
    print("BMI = " + str(round(bmi, 1)))
    category(bmi)

def category(bmi):
    """
    Prints the class/category of an individuals
    bmi based on a predefined chart.
    Parameters:
    arg1 (float): a bmi
    """
    bmi = float(bmi)
    if bmi < 18.5:
        print("class 1\n")
    elif bmi >= 18.5 and bmi <= 24.9:
        print("class 2\n")
    elif bmi >= 25.0 and bmi <= 29.9:
        print("class 3\n")
    elif bmi >= 30.0:
        print("class 4\n")

def main():
    # print the first 2 lines
    # invoke input_calc_bmi passing the argument 1
    # and capture the value returned
    # invoke category passing the captured value
    # repeat the process above for Person 2.
    print("This program reads data for two people\n\
and computes their body mass index (BMI).\n")
    input_cal_bmi(1)
    input_cal_bmi(2)
    print("Have a nice day!")
    
if __name__ == "__main__":
    main()
