# the loop below finds the factor of a number by brute force
# first it checks to see if the number is divisible by 2
# if yes, it stops. otherwise it checks 3, then 4 and so on

n = 91
div = 2 # find second factor of n (1 is the first factor of every number)
while n % div != 0:
    print(div, end = " ")
    div += 1
print("\n" + str(div))


# this program can be modified to find all factors by stopping at n
# or sqrt(n)
