def print_sum(one, two):
    total = one + two
    print(total)

def print_sum2(one, two):
    total = one + two
    print(total)
    return

def calc_sum(one, two):
    total = one + two
    return total

def f_to_c(temp):
     return 5.0 / 9.0 * (temp - 32)


def main():
    print_sum(7, 11)
    print_sum("a", "b")
    print_sum(1.5, 2.5)
    num = 5
    print_sum(num, 3)
    #print(total) # this line will cause the program to crash

    print_sum2(5, 8)

    # test calc sum
    print("\n", calc_sum(3,4), sep = "")
    num = calc_sum(4,5)
    print(num)

    # test f_to_c
    print("\n" + str(f_to_c(98.6)))
    print(f_to_c(32))
    boiling_centigrade = f_to_c(212)
    print(boiling_centigrade)

if __name__ == "__main__":
    main()




