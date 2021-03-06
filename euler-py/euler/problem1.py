# If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
# The sum of these multiples is 23.
#
# Find the sum of all the multiples of 3 or 5 below 1000.

def main():
    result =  sum([x if x %3 == 0 or x %5 == 0 else 0 for x in range(3, 1000)])
    print(f"Total is {result}")

main()