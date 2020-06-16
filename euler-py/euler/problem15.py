# Lattice paths
#
# Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
# there are exactly 6 routes to the bottom right corner.
#
#
# How many such routes are there through a 20×20 grid?

def main(n: int) -> int:
    return combo(n, n)

def combo(x: int, y: int) -> int:
    if x < 0 or y < 0:
        return 0


    return

if __name__ == '__main__':
    print(main(2))