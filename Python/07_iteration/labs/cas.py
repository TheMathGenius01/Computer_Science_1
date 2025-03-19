def check_sum(cas):
    cas = cas.replace("-", "")
    check = int(cas[-1])
    cas = cas[:len(cas)-1]
    checking = 0
    x = len(cas)

    for i in cas:
        checking += x * int(i)
        x -= 1
        
    return "valid" if (checking % 10) == check else "invalid"
            
def main():
    print("Water, 7732-18-5: " + check_sum("7732-18-5"))
    print("Sodium chloride, 7647-14-5: " + check_sum("7647-14-5"))
    print("Sucrose, 57-50-1: " + check_sum("57-50-1"))
    print("Baking soda, 144-55-8: " + check_sum("144-55-8"))
    print("Gold, 7440-57-5: " + check_sum("7440-57-5"))
    print("Silver tetrachloroaluminate, 27039-77-6: " + check_sum("27039-77-6"))

if __name__ == "__main__":
    main()
