# Array

Vetores e matrizes são estruturas homogêneas de dados em computação, ambos conhecidos como arrays.

#### Semelhanças

- **Homogeneidade:** Cada array armazena elementos de um único tipo de dado.

- **Armazenamento Contíguo:** Eles mantêm os elementos sequencialmente na memória.

- **Índices:** Os elementos são acessíveis via índices numéricos.
- **Tamanho Fixo:** A capacidade de um array é definida na criação e não muda.

#### Diferenças

- **Dimensões:** Vetores são unidimensionais (linha única de elementos), enquanto matrizes podem ser bidimensionais ou mais (tabelas de linhas e colunas).

- **Índices de Acesso:** Um índice é suficiente para localizar um elemento em um vetor, mas matrizes requerem dois ou mais índices.

#### Observações

A imutabilidade do tamanho de vetores e matrizes, assim como sua homogeneidade, são aspectos importantes que contribuem para a eficiência da alocação de memória. No entanto, essas características podem também ser limitações quando se precisa de coleções de dados dinâmicas ou de tipos mistos, situações em que outras estruturas de dados, como listas ligadas, arrays dinâmicos ou coleções genéricas, podem ser mais apropriadas.

## Terminologia

### Vetor
![vetor](/util/imagens/vetor-terminologia.png)

- **elemento:** dado armazenado em uma posição do vetor.
- **tamanho:** total de elementos que o vetor pode ser capaz de armazenar.
- **índice:** número de uma das posições que o vetor pode ter.

Na imagem acima, temos o exemplo de um vetor de tamanho 10 o qual tem suas posições de 0 a 9. Existem 4 elementos, `["A", "B", "C", "D"]` e eles ocupam respectivamente as posições `0, 1, 2, 3`.

### Matriz
Na Matriz, os conceitos de elemento, tamanho e índice, são os mesmos do Vetor. No entanto. a forma de atribuição e localizar um elemento é diferente, pois temos uma estrutura bidimensional ou multidimensional.

![matriz](/util/imagens/matriz-terminologia.png)

Na imagem acima, temos uma matriz de tamanho 4x2. Nela existem 5 elementos, `["A", "B", "D", "E",  "F"]` e eles ocupam respectivamente as posições `[0,0], [0,1], [0,3], [1,1], [1,2]`.

### Referências

[Geeks for Geeks](https://www.geeksforgeeks.org/)

[Estruturas de Dados - Thiago Leite e Carvalho](https://www.casadocodigo.com.br/products/livro-estruturas-de-dados)

[Listas Baseadas em Arrays (Array List)](https://joaoarthurbm.github.io/eda/posts/arraylist/)

Deitel, P. J., & Deitel, H. M. (2018). Java Como Programar (10ª ed.). Pearson.