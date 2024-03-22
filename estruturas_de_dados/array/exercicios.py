# 1) Crie um vetor de inteiros (int) de 10 posições. Preencha-o com os valores 10, 20, 30, 40, 50, 60, 70, 80, 90, 100. Use um for para
# exibir os valores.

vetor_a = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
for item in vetor_a:
    print(item)

# 2) Crie uma matriz de caracteres (char) de 16 posições (4x4). Preencha com os valores a, b, c, d, e, f, g, h, i, j, k, l, m,
# n, o e p. Use dois for`s para exibir os elementos dessa matriz.

matriz_a = [
    ["a", "b", "c", "d"],
    ["e", "f", "g", "h"],
    ["i", "j", "k", "l"],
    ["m", "n", "o", "p"],
]

for linha in matriz_a:
    for valor in linha:
        print(valor)

# 3) Faça um programa com um vetor com 10 elementos inteiros positivos (aleatórios e de sua escolha). Permita que seja solicitado um
# determinado valor inteiro e positivo para ser procurado neste vetor. Caso exista, o programa deve exibir o índice no qual o valor
# está posicionado. Caso contrário, o programa deve informar que o elemento não existe no vetor.

vetor_b = [2, 72, 90, 99, 65, 7, 99, 23, 65, 35]


def buscar(elemento: int) -> int:
    for indice, valor in enumerate(vetor_b):
        if valor == elemento:
            print(f"O índice do elemento {valor} é {indice}")
            return indice
    print(f"Elemento {elemento} não encontrado")
    return -1


## buscar elemento não existente
buscar(1)

## buscar elemento existente
buscar(2)


# 4) Faça um programa com uma matriz com 9 elementos (3x3) reais positivos. Calcule e exiba a soma dos elementos de cada linha
# desta matriz.

matriz_b = [
    [6.8, 8.5, 3.2],
    [9.15, 1.0, 7.3],
    [4.5, 5.7, 2.1],
]

for indice, linha in enumerate(matriz_b):
    soma = sum(linha)
    print(f"A soma dos elementos da linha {indice} da matriz_b é {soma}")

# 5) Faça uma matriz com 5x5 de inteiros positivos ou negativos e encontre e exiba o maior elemento desta matriz.

matriz_c = [
    [-7, 9, 3, -9, -3],
    [4, 0, -10, 1, 7],
    [-5, 2, 8, -1, 10],
    [6, -4, 5, -2, -8],
    [0, 3, -6, 9, -5],
]

maior_valor = matriz_c[0][0]

for linha in matriz_c:
    for elemento in linha:
        if elemento > maior_valor:
            maior_valor = elemento

print("O maior valor na matriz matriz_c é:", maior_valor)
