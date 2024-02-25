# Estudo sobre o Problema da Busca

Neste exemplo pude aprender sobre o problema da busca que envolve a localização de um elemento dentro de uma estrutura de dados. Explorei diferentes algoritmos de busca para avaliar suas eficiências em termos de complexidade de tempo e espaço.

## Algoritmos implementados

- **Busca Linear em Lista Não Ordenada:** Percorre cada elemento da lista sequencialmente até encontrar o elemento desejado.
- **Busca Linear em Lista Ordenada:** Semelhante à busca linear, mas aproveita a ordenação da lista para encerrar a busca assim que encontra um elemento maior que o desejado.
- **Busca Binária:** Um algoritmo eficiente para listas ordenadas, dividindo o espaço de busca pela metade a cada iteração.

Cada algoritmo foi implementado em Python, e os códigos-fonte podem ser encontrados neste mesmo diretório nos arquivos `analise_algoritmo_busca.py` e seu respectivo teste `analise_algoritmo_busca_test.py`.

## Análise de Desempenho

Gerei uma lista de 100.00 números (numeros.txt) e em uma das execuções dos testes fiz o seguinte print:

![Alt text](image.png)

### Busca binária

```
Busca Binária (elemento presente): 0.008907 ms
Busca Binária (elemento ausente): 0.006822 ms
```

A busca binária mostra os menores tempos de execução entre os três métodos, tanto para encontrar um elemento presente quanto para determinar a ausência de um elemento. Isso é esperado, pois a busca binária é um algoritmo eficiente para vetores ordenados, com complexidade de tempo O(log n). Ela rapidamente descarta metade dos elementos possíveis a cada etapa, resultando em um desempenho muito rápido.

### Busca Linear Não Ordenada

```
Busca Linear Não Ordenada (elemento presente): 0.009948 ms
Busca Linear Não Ordenada (elemento ausente): 4.326443 ms
``````

A busca linear em uma lista não ordenada tem um tempo de execução rápido quando o elemento está presente, especialmente se o elemento for encontrado no início da lista. No entanto, o tempo de execução dispara quando o elemento está ausente, pois o algoritmo precisa percorrer toda a lista para concluir que o elemento não está presente. Este é o pior caso para a busca linear em listas não ordenadas, com complexidade O(n).

### Busca Linear Ordenada

```
Busca Linear Ordenada: 2.805105 ms
Busca Linear Ordenada (elemento ausente): 3.035725 ms
```

A busca linear em uma lista ordenada tem um desempenho intermediário. Quando o elemento está presente, ela tende a ser mais lenta que a busca binária devido à sua natureza linear, mas pode ser mais rápida que a busca linear em listas não ordenadas dependendo da posição do elemento. Quando o elemento está ausente, o tempo é similar ao caso de um elemento presente, pois o algoritmo pode parar assim que encontra um valor maior que o elemento buscado, evitando a necessidade de percorrer toda a lista.

## Conclusão

- A busca binária é muito rápida em listas ordenadas, funcionando bem tanto quando o elemento buscado está na lista quanto quando não está.
- A busca linear pode demorar mais, especialmente se a lista não estiver ordenada e o elemento buscado não estiver presente, porque precisa olhar item por item.
- Ter a lista ordenada faz a busca linear ser mais rápida, mostrando como organizar os dados antes da busca pode ajudar muito.