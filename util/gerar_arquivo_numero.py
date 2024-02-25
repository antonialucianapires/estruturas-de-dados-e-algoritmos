import random

num_numeros = 100000

with open('numeros.txt', 'w') as f:
    for _ in range(num_numeros):
        num = random.randint(-500000, 500000)
        f.write(f"{num}\n")
