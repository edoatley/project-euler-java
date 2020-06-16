# Problem 5 - Smallest multiple
# =============================
#
# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
#
# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


def seq(limit):
    for i in range(limit):
        for d in range(2, int(limit / 2) + 1):
            if i % d != 0:
                continue
        else:
            yield i


def main():
    a = sum(seq(20))
    num = a
    while True:
        for i in range(20):
            if num % 1 != 0:
                break
        else:
            return num
        num += a


if __name__ == '__main__':
    print(main())
