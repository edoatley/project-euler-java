import time
import math


def main():
    i = 2
    target = 500
    num_divisors = 0
    while num_divisors < target:
        num_divisors = len(divisors_of(get_triangle_num(i)))
        if i % 500 == 0:
            print(f"For triangle number {get_triangle_num(i)} we get {num_divisors} divisors")
        i += 1
    else:
        print(f"Answer is n={i} - {get_triangle_num(i)} with {num_divisors} divisors")
        print(f"Time taken = {time.time() - startTime}")

# returns the nth triangle number
def get_triangle_num(n):
    return (n * (n + 1)) / 2


# returns the list of the divisors
def divisors_of(n):
    divisors = [n]
    for a in range(1, int(math.sqrt(n) + 1)):
        b, rem = divmod(n, a)
        if rem == 0:
            divisors.append(a)
            if b not in divisors:
                divisors.append(b)
    return divisors


startTime = time.time()
main()
