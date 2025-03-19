'''
This program was created by Parth Zanwar
This program will calculate the area of a trapezoid
Sometimes, it will also ask you for input
It will then output the area
'''
def calc_area(h=1, base_1=1, base_2=1):
    area = 0.5*(float(base_1) + float(base_2))*float(h)
    return print("Area is: " + str(round(area, 2)))

def ask_user_for_data():
    h = float(input("\nEnter the height of the trapezoid: "))
    base_1 = float(input("Enter the length of the bottom base: "))
    base_2 = float(input("Enter the length of the top base: "))

    calc_area(h, base_1, base_2)

def main():
    calc_area(10.3, 20.9, 3.056)
    calc_area(4, 6, 3)
    calc_area(1.99, 2.7, 3.4)
    calc_area()

    ask_user_for_data()
    ask_user_for_data()

if __name__ == "__main__":
    main()
    
    
