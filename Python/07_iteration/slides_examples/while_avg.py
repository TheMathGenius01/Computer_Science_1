def print_average():
    total, cnt = 0, 0
    done = False
    while not done:
        val = int(input("Type a number: "))
        if val >= 0:
            total += val
            cnt += 1
        else:
            done = True
    if cnt > 0:
        print("Average is", total/cnt)

print_average()
