# Problem 4 - Largest palindrome product
# ======================================
#
# A palindromic number reads the same both ways.
# The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 ? 99.
#
# Find the largest palindrome made from the product of two 3-digit numbers.
import time
import math


def potential_palindromes():

    num_str = '999999'
    yield int(num_str)

    while True:
        first3 = int(num_str[:3])
        first3 -= 1
        num_str = str(first3) + ''.join(str(first3)[::-1])
        yield int(num_str)


def viable(p):
    for x in range(998, 100, -1):
        y, rem = divmod(p,x)
        if rem == 0 and x > 99 and y < 1000:
            print(f"{x} * {y} = {p}")
            return True
    return False


def main():
    for p in potential_palindromes():
        if viable(p):
            return p
    return 0

if __name__ == '__main__':
    print("Start")
    start = time.process_time()
    print(f"Answer {main()}")
    print(f"Ended {time.process_time() - start}")