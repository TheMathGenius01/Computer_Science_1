'''
This program was created by Parth Zanwar
This program will take the number of hours, minutes, and seconds
It will then output how many totals seconds are there
After that, this program will take a total number of seconds
It will then output how many hours, minutes, and seconds there are in the total number of seconds
'''
def total_seconds(hours, minutes, seconds):
    total_seconds = (int(hours) * 3600) + (int(minutes) * 60) + int(seconds)
    print("{:>2} hours, {:>2} minutes, and {:>2} seconds totals to {:>5} seconds".format(hours, minutes, seconds, total_seconds))
    return total_seconds

def elapsed_time(total_seconds):
    hours = total_seconds // 3600
    minutes = (total_seconds % 3600) // 60
    seconds = (total_seconds % 3600) % 60
    return "{:>5} total seconds is {:>2} hours, {:>2} minutes, and {:>2} seconds".format(total_seconds, hours, minutes, seconds)

def main():
    total1 = total_seconds(6, 19, 27)
    total2 = total_seconds(12, 1, 4)
    total3 = total_seconds(3, 0, 2)
    total4 = total_seconds(22, 33, 44)
    total5 = total_seconds(0, 0, 8)
    print()
    print(elapsed_time(total1))
    print(elapsed_time(total2))
    print(elapsed_time(total3))
    print(elapsed_time(total4))
    print(elapsed_time(total5))

if __name__ == "__main__":
    main()
