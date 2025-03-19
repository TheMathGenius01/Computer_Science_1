# the loop below prints 1 digit at a time from right to left
# remember % 10 returns the rightmost digit
# remember // 10 chops off the rightmost digit

n = abs(135798642)
while n != 0:
    digit = n % 10
    print(digit, end = " ")
    n //= 10
print("\n" + str(n))
