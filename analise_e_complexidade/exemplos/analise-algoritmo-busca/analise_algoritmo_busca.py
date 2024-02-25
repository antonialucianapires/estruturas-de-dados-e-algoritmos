def buscar_linear_nao_ordenada(lista: list, elemento: int) -> int:
    for indice, valor in enumerate(lista):
        if valor == elemento:
            return indice
    return -1

def buscar_linear_ordenada(lista: list, elemento: int) -> int:
    for indice, valor in enumerate(lista):
        if valor == elemento:
            return indice
        elif valor > elemento:
            break
    return -1

def buscar_binaria(lista: list, elemento: int) -> int:
    esquerda, direita = 0, len(lista) - 1
    
    while esquerda <= direita:
        meio = (esquerda + direita) // 2
        valor_meio = lista[meio]
        
        if valor_meio == elemento:
            return meio
        elif valor_meio < elemento:
            esquerda = meio + 1
        else:
            direita = meio - 1
    
    return -1
