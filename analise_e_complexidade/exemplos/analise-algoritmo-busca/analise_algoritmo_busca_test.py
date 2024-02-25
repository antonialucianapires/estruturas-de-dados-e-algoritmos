import unittest
import time
from analise_algoritmo_busca import buscar_linear_nao_ordenada, buscar_linear_ordenada, buscar_binaria

class TestBuscaAlgoritmo(unittest.TestCase):
    def setUp(self):
        caminho_arquivo = '/workspaces/estruturas-de-dados-e-algoritmos/analise_e_complexidade/exemplos/analise-algoritmo-busca/numeros.txt'
        with open(caminho_arquivo, 'r') as file:
            self.lista_nao_ordenada = [int(line.strip()) for line in file]
            self.lista_ordenada = sorted(self.lista_nao_ordenada)

    def medir_tempo_de_execucao(self, funcao, lista, elemento):
        inicio = time.perf_counter()
        resultado = funcao(lista, elemento)
        fim = time.perf_counter()
        tempo_execucao = (fim - inicio) * 1000
        return resultado, tempo_execucao

    def test_busca_linear_nao_ordenada(self):
        resultado, tempo = self.medir_tempo_de_execucao(buscar_linear_nao_ordenada, self.lista_nao_ordenada, 242472)
        self.assertEqual(resultado, 7)
        print(f"Busca Linear Não Ordenada: {tempo:.6f} ms")

        resultado, tempo = self.medir_tempo_de_execucao(buscar_linear_nao_ordenada, self.lista_nao_ordenada, -10)
        self.assertEqual(resultado, -1)
        print(f"Busca Linear Não Ordenada (elemento ausente): {tempo:.6f} ms")

    def test_busca_linear_ordenada(self):
        resultado, tempo = self.medir_tempo_de_execucao(buscar_linear_ordenada, self.lista_ordenada, 23)
        self.assertEqual(resultado, self.lista_ordenada.index(23))
        print(f"Busca Linear Ordenada: {tempo:.6f} ms")

        resultado, tempo = self.medir_tempo_de_execucao(buscar_linear_ordenada, self.lista_ordenada, -10)
        self.assertEqual(resultado, -1)
        print(f"Busca Linear Ordenada (elemento ausente): {tempo:.6f} ms")

    def test_busca_binaria(self):
        resultado, tempo = self.medir_tempo_de_execucao(buscar_binaria, self.lista_ordenada, 23)
        self.assertEqual(resultado, self.lista_ordenada.index(23))
        print(f"Busca Binária: {tempo:.6f} ms")

        resultado, tempo = self.medir_tempo_de_execucao(buscar_binaria, self.lista_ordenada, -10)
        self.assertEqual(resultado, -1)
        print(f"Busca Binária (elemento ausente): {tempo:.6f} ms")

if __name__ == '__main__':
    unittest.main()