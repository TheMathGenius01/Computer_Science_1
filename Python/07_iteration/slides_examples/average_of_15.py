# Creates a look up table for scores out of 15

print("\nScores out of 15 with half points\n")
n = 15

while n > 0:
    print("  {:4.1f} == {:.2f}".format(n, n / 15))
    n -= .5
