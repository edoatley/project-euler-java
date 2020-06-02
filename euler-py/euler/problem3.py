import time
import math


def prime_factors(n):
    factors = []
    rem = n
    primes = get_primes(n)

    while True:
        for p in primes:
            if rem % p == 0:
                factors.append(p)
                rem /= p
                break
        if rem == 1:
            break

    return factors


def get_primes(n):
    primes = []
    for a in range(2, int(math.sqrt(n) + 1)):
        b, rem = divmod(n, a)
        if rem == 0:
            if is_prime(a):
                primes.append(a)
            if b not in primes and is_prime(b):
                primes.append(b)
    return primes


def is_prime(n):

    if n == 2:
        return True
    elif n % 2 == 0:
        return False
    else:
        for i in range(2, int(math.sqrt(n) + 1)):
            if n % i == 0:
                return False
        else:
            return True


def main():
    n = 600851475143
    print(f"Starting prime factorisation of {n}")
    start_time = time.time()
    result = prime_factors(n)
    end_time = time.time()
    print(f"Found the following prime factors ({result}) for {n} in with max factor: {max(result)}")

main()