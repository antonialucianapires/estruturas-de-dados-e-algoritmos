class Elemento:
    def __init__(self, valor):
        self.valor = valor
        self.proximo = None

class ListaLigada:
    def __init__(self):
        self.primeiro = None
        self.ultimo = None
        self.tamanho = 0

    # Inserção: O(1) para adicionar no final da lista
    def adicionar(self, valor):
        novo_elemento = Elemento(valor)
        if self.primeiro is None:
            self.primeiro = novo_elemento
            self.ultimo = novo_elemento
        else:
            self.ultimo.proximo = novo_elemento
            self.ultimo = novo_elemento
        self.tamanho += 1

    # Remoção: O(n) devido à necessidade de buscar o elemento e ajustar as referências
    def remover(self, valor_procurado):
        atual = self.primeiro
        anterior = None

        # Busca pelo elemento: O(n)
        while atual is not None and atual.valor != valor_procurado:
            anterior = atual
            atual = atual.proximo

        if atual is not None:
            # Ajuste das referências: O(1)
            if anterior is None:
                self.primeiro = atual.proximo
            else:
                anterior.proximo = atual.proximo
            if atual == self.ultimo:
                self.ultimo = anterior
            self.tamanho -= 1

    # Busca: O(n) para acessar o elemento na posição especificada
    def get(self, posicao):
        atual = self.primeiro
        for i in range(posicao):
            if atual is not None:
                atual = atual.proximo
        return atual

    def get_tamanho(self):
        return self.tamanho


def print_status(lista, mensagem):
    print(f"ListaLigadaSimples: {mensagem}: {lista.get_tamanho()}")

def print_elemento(lista, posicao, mensagem):
    elemento = lista.get(posicao)
    if elemento:
        print(f"ListaLigadaSimples: {mensagem}: {elemento.valor}")

def print_lista_completa(lista):
    atual = lista.primeiro
    posicao = 0
    while atual is not None:
        print(f"ListaLigadaSimples: item posição {posicao}: {atual.valor}")
        atual = atual.proximo
        posicao += 1


if __name__ == "__main__":
    lista = ListaLigada()
    print_status(lista, "tamanho inicial")

    lista.adicionar("AC")
    lista.adicionar("BA")
    lista.adicionar("CE")
    lista.adicionar("DF")

    print_status(lista, "tamanho após adicionar")
    print_elemento(lista, 0, "primeiro item")
    print_elemento(lista, lista.get_tamanho() - 1, "último item")

    lista.remover("AC")

    print_lista_completa(lista)
    print_status(lista, "tamanho final")
