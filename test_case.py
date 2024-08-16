import random


if __name__ == "__main__":
    if __debug__:
        print("Run 'python.exe' in __debug__ mode: You're not running 'python -O'.")
    random_number = random.randint(0, 2)
    if random_number == 0:
        raise Exception("This test case fails!")
    print("This is a test case.")
